package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dznb extends dzpv {
    public dzqo a;
    private String b;

    @Override // defpackage.dzpv
    public final dzpw a() {
        String str;
        dzqo dzqoVar = this.a;
        if (dzqoVar != null && (str = this.b) != null) {
            return new dznc(dzqoVar, str);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" webViewHeader");
        }
        if (this.b == null) {
            sb.append(" url");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.dzpv
    public final void b(String str) {
        if (str == null) {
            throw new NullPointerException("Null url");
        }
        this.b = str;
    }
}
