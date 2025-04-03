package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class exls extends exmc {
    private int a;
    private int b;
    private byte c;

    @Override // defpackage.exmc
    public final exmd a() {
        if (this.c == 3) {
            return new exlu(this.a, this.b);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.c & 1) == 0) {
            sb.append(" imageFormat");
        }
        if ((this.c & 2) == 0) {
            sb.append(" storageType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.exmc
    public final void b(int i) {
        this.a = i;
        this.c = (byte) (this.c | 1);
    }

    @Override // defpackage.exmc
    public final void c(int i) {
        this.b = i;
        this.c = (byte) (this.c | 2);
    }
}
