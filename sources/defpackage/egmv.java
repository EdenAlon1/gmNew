package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class egmv extends egnj {
    public egnl a;
    public engw b;
    private boolean c;
    private byte d;

    @Override // defpackage.egnj
    public final egnm a() {
        egnl egnlVar;
        engw engwVar;
        if (this.d == 1 && (egnlVar = this.a) != null && (engwVar = this.b) != null) {
            return new egmw(egnlVar, this.c, engwVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" content");
        }
        if (this.d == 0) {
            sb.append(" hasMore");
        }
        if (this.b == null) {
            sb.append(" eventLogs");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.egnj
    public final void b(boolean z) {
        this.c = z;
        this.d = (byte) 1;
    }
}
