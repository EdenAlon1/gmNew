package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ctuq extends ctuz {
    private String a;
    private boolean b;
    private boolean c;
    private byte d;

    @Override // defpackage.ctuz
    public final ctva a() {
        String str;
        if (this.d == 3 && (str = this.a) != null) {
            return new ctur(str, this.b, this.c);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" formatToNormalizedResult");
        }
        if ((this.d & 1) == 0) {
            sb.append(" isRbmOrE164");
        }
        if ((this.d & 2) == 0) {
            sb.append(" isPossibleE164Number");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.ctuz
    public final void b(String str) {
        if (str == null) {
            throw new NullPointerException("Null formatToNormalizedResult");
        }
        this.a = str;
    }

    @Override // defpackage.ctuz
    public final void c(boolean z) {
        this.c = z;
        this.d = (byte) (this.d | 2);
    }

    @Override // defpackage.ctuz
    public final void d(boolean z) {
        this.b = z;
        this.d = (byte) (this.d | 1);
    }
}
