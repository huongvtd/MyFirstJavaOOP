public class ClassPrograming {
        public boolean learningComplete = false;
        public String languageName;

        public ClassPrograming(String language) {
            languageName = language;
            System.out.println(languageName);
        }

        public void learningStatus() {
            if (learningComplete) {
                System.out.println("Mastered " + languageName);
            } else {
                System.out.println("Learning " + languageName);
            }
        }

        public void completeLearning() {
            learningComplete = true;
        }
}
