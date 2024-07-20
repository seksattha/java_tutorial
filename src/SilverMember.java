public class SilverMember extends Member {
    @Override
    public float discount(float amount) {
        if (amount > 2000f) {
            return amount * .3f;
        } else {
            return .0f;
        }
    }
}
