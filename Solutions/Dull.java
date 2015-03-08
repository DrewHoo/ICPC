import java.util.*;
public class Dull {
	private static class DLL {
		char letter;
		int mem;
		public DLL(int mem, char letter) {
			this.mem = mem;
			this.letter = letter;
		}
	}
	private static class Program {
		int mem;
		String dllstr;
		int[] dlls;
		int id;
		public Program(int mem, String dllstr, int id) {
			this.id = id;
			this.mem = mem;
			this.dllstr = dllstr;
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		for (;;) {
			int n = scan.nextInt();
			if (n == 0) {break;}
			int p = scan.nextInt(), s = scan.nextInt();
			DLL[] dlls = new DLL[n];
			char letter = 'A';
			for (int i = 0; i < n; i++, letter++) {
				dlls[i] = new DLL(scan.nextInt(), letter);				
			}
			Program[] programs = new Program[p];
			for (int i = 0; i < p; i++) {
				programs[i] = new Program(scan.nextInt(), scan.nextLine().trim(), i + 1);
			}
			// int[] executionRecord = new int[s];
			// for (int i = 0; i < s; i++) {
			// 	executionRecord[i] = scan.nextInt();
			// }

			//now run the programs
			HashMap<String, LinkedList<Integer>> programsNeedingDLLs = new HashMap<String, LinkedList<Integer>>();
			int maxMem = 0;
			int currentMem = 0;
			for (int i = 0; i < s; i++) {
				int dllMemory = 0;
				int exe = scan.nextInt();
				if (exe > 0) {
					exe = exe - 1;
					//if positive, add the program's memory
					currentMem += programs[exe].mem;
					//add program's dlls to set (no dupes allowed)
					for (int j = 0; j < programs[exe].dllstr.length(); j++) { //for each DLL req'd
						int whichDLL = programs[exe].dllstr.charAt(j) - 65;
						String key = "" + dlls[whichDLL].letter;
						if (programsNeedingDLLs.containsKey(key)) {
							programsNeedingDLLs.get(key).add(exe);	
						} else {
							LinkedList<Integer> ts = new LinkedList<Integer>();
							ts.add(exe);
							programsNeedingDLLs.put(key, ts);
						}
						
					}
					// dllsInMemory.add(dlls[programs[exe].dllstr.charAt(j) - 65]);
					//add program to hm representing programs that need a dll
				} else {	
					exe = Math.abs(exe + 1);	
					//if negative, remove program's mem cost from memory
					currentMem -= programs[exe].mem;
				//remove program from hashmap value for each dll key
					for (int j = 0; j < programs[exe].dllstr.length(); j++) {
						String key = "" + dlls[programs[exe].dllstr.charAt(j) - 65].letter;
						List<Integer> jthDLL = programsNeedingDLLs.get(key);
						if (jthDLL.size() == 1) {
							programsNeedingDLLs.remove(key);
						} else {
							programsNeedingDLLs.get(key).remove((Integer)exe);
						}
					}
				//if any are size == 1 before removal, remove the key
				}
				//get all keys
				//use keys to get dll memory costs
				Set<String> keyset = programsNeedingDLLs.keySet();
				for (String k : keyset) {
					// System.out.println(k);
					dllMemory += dlls[0 + (k.charAt(0) - 65)].mem;
				}
				if (currentMem + dllMemory > maxMem) {
					maxMem = currentMem + dllMemory;
				}
				//add up memory used
				//compare to max mem //update max mem
			}
			System.out.println(maxMem);
		}
	}
}