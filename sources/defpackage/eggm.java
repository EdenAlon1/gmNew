package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eggm extends egfe {
    public emxc a = emux.a;
    private engw b;
    private engw c;
    private exfw d;

    @Override // defpackage.egfe
    public final egff a() {
        engw engwVar;
        exfw exfwVar;
        engw engwVar2 = this.b;
        if (engwVar2 != null && (engwVar = this.c) != null && (exfwVar = this.d) != null) {
            return new eggn(engwVar2, engwVar, this.a, exfwVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.b == null) {
            sb.append(" images");
        }
        if (this.c == null) {
            sb.append(" collections");
        }
        if (this.d == null) {
            sb.append(" eventLog");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.egfe
    public final void b(Iterable iterable) {
        this.c = engw.j(iterable);
    }

    @Override // defpackage.egfe
    public final void c(exfw exfwVar) {
        if (exfwVar == null) {
            throw new NullPointerException("Null eventLog");
        }
        this.d = exfwVar;
    }

    @Override // defpackage.egfe
    public final void d(Iterable iterable) {
        this.b = engw.j(iterable);
    }
}
