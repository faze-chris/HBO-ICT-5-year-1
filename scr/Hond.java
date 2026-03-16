public class Hond extends Dier implements HulpDier{
  @Override
    public void geluid() {
      System.out.println("Hond geluid");
  }

    @Override
    public void alarm() {
        System.out.println("Hond alarm");
    }
}
