package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class apng extends apoi {
    public int a;
    private String b;

    @Override // defpackage.apoi
    public final apoj a() {
        String str;
        int i = this.a;
        if (i != 0 && (str = this.b) != null) {
            return new apnh(i, str);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == 0) {
            sb.append(" type");
        }
        if (this.b == null) {
            sb.append(" text");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.apoi
    public final void b(String str) {
        if (str == null) {
            throw new NullPointerException("Null text");
        }
        this.b = str;
    }
}
