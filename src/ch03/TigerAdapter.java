package ch03;

// 계획
// 1.타입 일치 시키기
// 2.

// OuterTiger와 Cat,Mouse등과의 이질적인 것을 동일하게 맞추는 역할
public class TigerAdapter extends Animal{

    private OuterTiger outerTiger;

    public TigerAdapter(OuterTiger outerTiger) {
        this.outerTiger = outerTiger;
    }

    @Override
    public String getName() {
        return outerTiger.getFullname();
    }
}
