package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djgn extends djhd {
    public int a;
    private dkkj b;

    @Override // defpackage.djhd
    public final djhe a() {
        dkkj dkkjVar;
        int i = this.a;
        if (i != 0 && (dkkjVar = this.b) != null) {
            return new djgo(i, dkkjVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == 0) {
            sb.append(" action");
        }
        if (this.b == null) {
            sb.append(" session");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.djhd
    public final void b(dkkj dkkjVar) {
        if (dkkjVar == null) {
            throw new NullPointerException("Null session");
        }
        this.b = dkkjVar;
    }
}
