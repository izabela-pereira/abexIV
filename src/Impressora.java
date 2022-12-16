    public class Impressora {
        private String nome;
        private float nuserie;

        public Impressora (String nome, float nuserie){
            this.nome = nome;
            this.nuserie = nuserie;
        }

        public String getNome() {
            return nome;
        }


        public void setNome(String nome) {
            this.nome = nome;
        }


        public float getNuserie() {
            return nuserie;
        }

        public void setNuserie(float nuserie) {
            this.nuserie = nuserie;
        }
}
