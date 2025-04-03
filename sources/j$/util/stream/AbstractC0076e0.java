package j$.util.stream;

/* renamed from: j$.util.stream.e0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
abstract class AbstractC0076e0 extends AbstractC0081f0 {
    public final /* synthetic */ int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AbstractC0076e0(AbstractC0060b abstractC0060b, int i, int i2) {
        super(abstractC0060b, i);
        this.l = i2;
    }

    @Override // j$.util.stream.AbstractC0060b
    final boolean L() {
        switch (this.l) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    @Override // j$.util.stream.AbstractC0060b, j$.util.stream.BaseStream, j$.util.stream.DoubleStream
    public final /* bridge */ /* synthetic */ IntStream parallel() {
        switch (this.l) {
            case 0:
                parallel();
                break;
            default:
                parallel();
                break;
        }
        return this;
    }

    @Override // j$.util.stream.AbstractC0060b, j$.util.stream.BaseStream, j$.util.stream.DoubleStream
    public final /* bridge */ /* synthetic */ IntStream sequential() {
        switch (this.l) {
            case 0:
                sequential();
                break;
            default:
                sequential();
                break;
        }
        return this;
    }
}
