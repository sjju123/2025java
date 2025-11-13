package exam04;

public class NPCGenerator {
	Person worker = new Person() {
		void Wake() {
			System.out.println("Wkae up at 7!!");
		}
		void Work() {
			System.out.println("Go to work!!");
		}

	};
		
	
	void GeneratorWalker () {
		Person walker = new Person() {
			void Wake() {
				System.out.println("Wkae up at 9!!");
			}
			void Work() {
				System.out.println("Go to work!!");
			}
			
		};
		walker.Wake();
	}
	void GerneratorPerson(Person person) {
		person.Wake();
	}
}
