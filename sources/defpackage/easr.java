package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class easr {
    public byte a;
    private String b;
    private int c;
    private int d;

    public final east a() {
        if (this.a == 15 && this.b != null) {
            return new eass(this.b, this.c, this.d);
        }
        StringBuilder sb = new StringBuilder();
        if (this.b == null) {
            sb.append(" url");
        }
        if ((this.a & 1) == 0) {
            sb.append(" width");
        }
        if ((this.a & 2) == 0) {
            sb.append(" height");
        }
        if ((this.a & 4) == 0) {
            sb.append(" shouldAuthenticateFifeUrls");
        }
        if ((this.a & 8) == 0) {
            sb.append(" shouldApplyFifeOptions");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(int i) {
        this.d = i;
        this.a = (byte) (this.a | 2);
    }

    public final void c(String str) {
        if (str == null) {
            throw new NullPointerException("Null url");
        }
        this.b = str;
    }

    public final void d(int i) {
        this.c = i;
        this.a = (byte) (this.a | 1);
    }
}
