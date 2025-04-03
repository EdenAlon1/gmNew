package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cwug extends cxes {
    public String a;
    public aoku b;
    public String c;
    private int d;
    private int e;
    private byte f;

    @Override // defpackage.cxes
    public final cxet a() {
        if (this.f == 3) {
            return new cwuh(this.a, this.b, this.c, this.d, this.e);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f & 1) == 0) {
            sb.append(" index");
        }
        if ((this.f & 2) == 0) {
            sb.append(" id");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.cxes
    public final void b(int i) {
        this.e = i;
        this.f = (byte) (this.f | 2);
    }

    @Override // defpackage.cxes
    public final void c(int i) {
        this.d = i;
        this.f = (byte) (this.f | 1);
    }
}
