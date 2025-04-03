package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eggu extends egfm {
    public emxc a = emux.a;
    private engw b;
    private exfw c;

    @Override // defpackage.egfm
    public final egfn a() {
        exfw exfwVar;
        engw engwVar = this.b;
        if (engwVar != null && (exfwVar = this.c) != null) {
            return new eggv(engwVar, this.a, exfwVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.b == null) {
            sb.append(" interests");
        }
        if (this.c == null) {
            sb.append(" eventLog");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.egfm
    public final void b(exfw exfwVar) {
        if (exfwVar == null) {
            throw new NullPointerException("Null eventLog");
        }
        this.c = exfwVar;
    }

    @Override // defpackage.egfm
    public final void c(Iterable iterable) {
        this.b = engw.j(iterable);
    }
}
