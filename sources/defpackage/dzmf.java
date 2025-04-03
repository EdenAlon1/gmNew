package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzmf extends dzjl {
    private String a;
    private String b;

    @Override // defpackage.dzjl
    public final dzjm a() {
        String str;
        String str2 = this.a;
        if (str2 != null && (str = this.b) != null) {
            return new dzmg(str2, str);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" text");
        }
        if (this.b == null) {
            sb.append(" messageCallbackPayload");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.dzjl
    public final void b(String str) {
        if (str == null) {
            throw new NullPointerException("Null messageCallbackPayload");
        }
        this.b = str;
    }

    @Override // defpackage.dzjl
    public final void c(String str) {
        if (str == null) {
            throw new NullPointerException("Null text");
        }
        this.a = str;
    }
}
