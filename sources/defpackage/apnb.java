package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class apnb extends apoe {
    private String a;
    private engw b;

    @Override // defpackage.apoe
    public final apof a() {
        engw engwVar;
        String str = this.a;
        if (str != null && (engwVar = this.b) != null) {
            return new apnc(str, engwVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" text");
        }
        if (this.b == null) {
            sb.append(" annotations");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.apoe
    public final void b(engw engwVar) {
        if (engwVar == null) {
            throw new NullPointerException("Null annotations");
        }
        this.b = engwVar;
    }

    @Override // defpackage.apoe
    public final void c(String str) {
        if (str == null) {
            throw new NullPointerException("Null text");
        }
        this.a = str;
    }
}
