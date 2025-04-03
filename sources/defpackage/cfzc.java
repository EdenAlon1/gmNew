package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfzc extends cfzk {
    private String a;
    private String b;

    @Override // defpackage.cfzk
    public final cfzl a() {
        String str;
        String str2 = this.a;
        if (str2 != null && (str = this.b) != null) {
            return new cfzd(str2, str);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" psdKey");
        }
        if (this.b == null) {
            sb.append(" psdValue");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.cfzk
    public final void b(String str) {
        if (str == null) {
            throw new NullPointerException("Null psdKey");
        }
        this.a = str;
    }

    @Override // defpackage.cfzk
    public final void c(String str) {
        if (str == null) {
            throw new NullPointerException("Null psdValue");
        }
        this.b = str;
    }
}
