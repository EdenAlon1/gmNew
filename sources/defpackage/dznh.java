package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dznh extends dzqc {
    public dzjn a;
    private String b;
    private emxc c = emux.a;

    @Override // defpackage.dzqc
    public final dzqd a() {
        dzjn dzjnVar;
        String str = this.b;
        if (str != null && (dzjnVar = this.a) != null) {
            return new dzni(str, dzjnVar, this.c);
        }
        StringBuilder sb = new StringBuilder();
        if (this.b == null) {
            sb.append(" menuName");
        }
        if (this.a == null) {
            sb.append(" action");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.dzqc
    public final void b(byte[] bArr) {
        this.c = emxc.j(bArr);
    }

    @Override // defpackage.dzqc
    public final void c(String str) {
        if (str == null) {
            throw new NullPointerException("Null menuName");
        }
        this.b = str;
    }
}
