public class Main {
    public static void main(String[] args) {
        Fish show_identity = new Fish ("paus","plankton");
        System.out.println("saya ikan dengan detail,jenis :"+show_identity.getType()+",makanan :"+show_identity.getFeed());
        show_identity.setType("Cupang");
        show_identity.setFeed("Cacing");
        System.out.println("saya ikan dengan detail,jenis :"+show_identity.getType()+",makanan :"+show_identity.getFeed());
        show_identity.setType("Arwana");
        show_identity.setFeed("Jangkrik");
        System.out.println("saya ikan dengan detail,jenis :"+show_identity.getType()+",makanan :"+show_identity.getFeed());
        show_identity.setType("Sapu-sapu");
        show_identity.setFeed("Pelet");
        System.out.println("saya ikan dengan detail,jenis :"+show_identity.getType()+",makanan :"+show_identity.getFeed());
    }
}
