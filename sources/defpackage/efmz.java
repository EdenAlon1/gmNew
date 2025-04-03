package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efmz extends efnb {
    private String a;
    private String b;
    private efnm c;

    @Override // defpackage.efnb
    public final efnc a() {
        String str;
        efnm efnmVar;
        String str2 = this.a;
        if (str2 != null && (str = this.b) != null && (efnmVar = this.c) != null) {
            return new efna(str2, str, efnmVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" sessionId");
        }
        if (this.b == null) {
            sb.append(" triggerId");
        }
        if (this.c == null) {
            sb.append(" surveyStyle");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.efnb
    public final void b(String str) {
        if (str == null) {
            throw new NullPointerException("Null sessionId");
        }
        this.a = str;
    }

    @Override // defpackage.efnb
    public final void c(efnm efnmVar) {
        if (efnmVar == null) {
            throw new NullPointerException("Null surveyStyle");
        }
        this.c = efnmVar;
    }

    @Override // defpackage.efnb
    public final void d(String str) {
        if (str == null) {
            throw new NullPointerException("Null triggerId");
        }
        this.b = str;
    }
}
