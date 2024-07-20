public class PlatinumMember extends Member {
    @Override
    public float discount(float amount) {
        return amount * .5f;
//        return super.discount(amount);
    }
}
