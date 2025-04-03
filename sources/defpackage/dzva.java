package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dzva extends dzwe {
    private dzwf a;
    private int b;
    private int c;
    private int d;
    private int e;
    private boolean f;
    private byte g;

    @Override // defpackage.dzwe
    public final dzwi a() {
        if (this.g == 31 && this.a != null) {
            return new dzvb(this.a, this.b, this.c, this.d, this.e, this.f);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" element");
        }
        if ((this.g & 1) == 0) {
            sb.append(" paddingStart");
        }
        if ((this.g & 2) == 0) {
            sb.append(" paddingTop");
        }
        if ((this.g & 4) == 0) {
            sb.append(" paddingEnd");
        }
        if ((this.g & 8) == 0) {
            sb.append(" paddingBottom");
        }
        if ((this.g & 16) == 0) {
            sb.append(" useIncomingOutgoingColors");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.dzwe
    public final void b(dzwf dzwfVar) {
        this.a = dzwfVar;
    }

    @Override // defpackage.dzwe
    public final void c(int i) {
        this.e = i;
        this.g = (byte) (this.g | 8);
    }

    @Override // defpackage.dzwe
    public final void d(int i) {
        this.d = i;
        this.g = (byte) (this.g | 4);
    }

    @Override // defpackage.dzwe
    public final void e(int i) {
        this.b = i;
        this.g = (byte) (this.g | 1);
    }

    @Override // defpackage.dzwe
    public final void f(int i) {
        this.c = i;
        this.g = (byte) (this.g | 2);
    }

    @Override // defpackage.dzwe
    public final void g(boolean z) {
        this.f = z;
        this.g = (byte) (this.g | 16);
    }
}
