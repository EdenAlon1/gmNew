package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class echn extends echs {
    public byte a;
    public int b;
    private echu c;

    @Override // defpackage.echs
    public final echt a() {
        int i;
        echu echuVar;
        if (this.a == 1 && (i = this.b) != 0 && (echuVar = this.c) != null) {
            return new echo(i, echuVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.b == 0) {
            sb.append(" enablement");
        }
        if (this.a == 0) {
            sb.append(" chargeCounterEnabled");
        }
        if (this.c == null) {
            sb.append(" metricExtensionProvider");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.echs
    public final echs b(int i) {
        this.b = i;
        return this;
    }

    @Override // defpackage.echs
    public final void c(echu echuVar) {
        if (echuVar == null) {
            throw new NullPointerException("Null metricExtensionProvider");
        }
        this.c = echuVar;
    }
}
