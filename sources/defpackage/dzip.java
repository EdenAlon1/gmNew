package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzip extends dzpm {
    private String a;
    private String b;

    @Override // defpackage.dzpm
    public final dzpn a() {
        String str;
        String str2 = this.a;
        if (str2 != null && (str = this.b) != null) {
            return new dzna(str2, str);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" id");
        }
        if (this.b == null) {
            sb.append(" appName");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.dzpm
    public final void b(String str) {
        if (str == null) {
            throw new NullPointerException("Null appName");
        }
        this.b = str;
    }

    @Override // defpackage.dzpm
    public final void c(String str) {
        if (str == null) {
            throw new NullPointerException("Null id");
        }
        this.a = str;
    }
}
