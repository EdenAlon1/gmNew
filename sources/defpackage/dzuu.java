package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzuu extends dzvw {
    public dzvv a;
    private String b;

    @Override // defpackage.dzvw
    public final dzvx a() {
        if (this.b != null && this.a != null) {
            return new dzuv(this.b, this.a);
        }
        StringBuilder sb = new StringBuilder();
        if (this.b == null) {
            sb.append(" jsonSource");
        }
        if (this.a == null) {
            sb.append(" stackCard");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.dzvw
    public final void b(String str) {
        if (str == null) {
            throw new NullPointerException("Null jsonSource");
        }
        this.b = str;
    }
}
