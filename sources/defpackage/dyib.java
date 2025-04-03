package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyib extends dyih {
    private String a;
    private engw b;

    @Override // defpackage.dyih
    public final dyii a() {
        engw engwVar;
        String str = this.a;
        if (str != null && (engwVar = this.b) != null) {
            return new dyic(str, engwVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" nextPageToken");
        }
        if (this.b == null) {
            sb.append(" conversationIds");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.dyih
    public final void b(engw engwVar) {
        if (engwVar == null) {
            throw new NullPointerException("Null conversationIds");
        }
        this.b = engwVar;
    }

    @Override // defpackage.dyih
    public final void c(String str) {
        if (str == null) {
            throw new NullPointerException("Null nextPageToken");
        }
        this.a = str;
    }
}
