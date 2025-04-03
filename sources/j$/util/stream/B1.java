package j$.util.stream;

/* loaded from: classes9.dex */
class B1 extends C1 {
    public final /* synthetic */ int c;
    private final Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ B1(K0 k0, Object obj, int i) {
        super(k0);
        this.c = i;
        this.d = obj;
    }

    @Override // j$.util.stream.C1
    final void a() {
        switch (this.c) {
            case 0:
                ((J0) this.a).r(this.b, this.d);
                break;
            default:
                this.a.h((Object[]) this.d, this.b);
                break;
        }
    }

    @Override // j$.util.stream.C1
    final C1 b(int i, int i2) {
        switch (this.c) {
            case 0:
                return new B1(this, ((J0) this.a).a(i), i2);
            default:
                return new B1(this, this.a.a(i), i2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B1(B1 b1, K0 k0, int i) {
        super(b1, k0, i);
        this.c = 1;
        this.d = (Object[]) b1.d;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B1(B1 b1, J0 j0, int i) {
        super(b1, j0, i);
        this.c = 0;
        this.d = b1.d;
    }
}
