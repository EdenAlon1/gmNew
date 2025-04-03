package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eggy extends egfy {
    public emxc a = emux.a;
    private engw b;
    private exfw c;

    @Override // defpackage.egfy
    public final egfz a() {
        exfw exfwVar;
        engw engwVar = this.b;
        if (engwVar != null && (exfwVar = this.c) != null) {
            return new eggz(engwVar, this.a, exfwVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.b == null) {
            sb.append(" suggestions");
        }
        if (this.c == null) {
            sb.append(" eventLog");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.egfy
    public final void b(exfw exfwVar) {
        if (exfwVar == null) {
            throw new NullPointerException("Null eventLog");
        }
        this.c = exfwVar;
    }

    @Override // defpackage.egfy
    public final void c(Iterable iterable) {
        this.b = engw.j(iterable);
    }
}
