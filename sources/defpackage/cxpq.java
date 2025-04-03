package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cxpq extends cxqf {
    private boolean a;
    private int b;
    private boolean c;
    private boolean d;
    private int e;
    private byte f;

    @Override // defpackage.cxqf
    public final cxqg a() {
        if (this.f == 31) {
            return new cxpr(this.a, this.b, this.c, this.d, this.e);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f & 1) == 0) {
            sb.append(" isIncoming");
        }
        if ((this.f & 2) == 0) {
            sb.append(" status");
        }
        if ((this.f & 4) == 0) {
            sb.append(" overrideAsFailure");
        }
        if ((this.f & 8) == 0) {
            sb.append(" isSelected");
        }
        if ((this.f & 16) == 0) {
            sb.append(" protocol");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.cxqf
    public final void b(boolean z) {
        this.a = z;
        this.f = (byte) (this.f | 1);
    }

    @Override // defpackage.cxqf
    public final void c(boolean z) {
        this.d = z;
        this.f = (byte) (this.f | 8);
    }

    @Override // defpackage.cxqf
    public final void d(boolean z) {
        this.c = z;
        this.f = (byte) (this.f | 4);
    }

    @Override // defpackage.cxqf
    public final void e(int i) {
        this.e = i;
        this.f = (byte) (this.f | 16);
    }

    @Override // defpackage.cxqf
    public final void f(int i) {
        this.b = i;
        this.f = (byte) (this.f | 2);
    }
}
