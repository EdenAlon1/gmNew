package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzno extends dzqi {
    public String a;
    private byte[] b;

    @Override // defpackage.dzqi
    public final dzqj a() {
        byte[] bArr;
        String str = this.a;
        if (str != null && (bArr = this.b) != null) {
            return new dznp(str, bArr);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" type");
        }
        if (this.b == null) {
            sb.append(" content");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.dzqi
    public final void b(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("Null content");
        }
        this.b = bArr;
    }
}
