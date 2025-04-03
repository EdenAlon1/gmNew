package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzok extends dzsd {
    private String a;
    private engw b;

    @Override // defpackage.dzsd
    public final dzsg a() {
        engw engwVar;
        String str = this.a;
        if (str != null && (engwVar = this.b) != null) {
            return new dzol(str, engwVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" url");
        }
        if (this.b == null) {
            sb.append(" replacements");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.dzsd
    public final void b(engw engwVar) {
        if (engwVar == null) {
            throw new NullPointerException("Null replacements");
        }
        this.b = engwVar;
    }

    @Override // defpackage.dzsd
    public final void c(String str) {
        if (str == null) {
            throw new NullPointerException("Null url");
        }
        this.a = str;
    }
}
