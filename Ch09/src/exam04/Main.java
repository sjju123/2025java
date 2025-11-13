package exam04;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Person worker = new Person() {
//			void Wake() {
//				System.out.println("Wake up at 7!!");
//				Work();
//			}
//			
//			void Work() {
//				System.out.println("Go to work!!");
//			}
//		};
//		
//		worker.Wake();
//		//worker.Work();
		
		NPCGenerator npc = new NPCGenerator();

		
		//npc.worker.Wake();
		npc.GeneratorWalker();{
			new Person() {
				void Wake() {
					System.out.println("Wkae up at 8!!");
				}
				void Work() {
					System.out.println("Go to school!!");
				}
			};
		};

	}

}
