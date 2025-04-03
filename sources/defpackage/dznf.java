package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dznf extends dzqa {
    private byte[] a;
    private int b;
    private int c;
    private emxc d = emux.a;
    private String e;
    private byte f;

    @Override // defpackage.dzqa
    public final dzqb a() {
        if (this.f == 3 && this.a != null && this.e != null) {
            return new dzng(this.a, this.b, this.c, this.d, this.e);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" icon");
        }
        if ((this.f & 1) == 0) {
            sb.append(" width");
        }
        if ((this.f & 2) == 0) {
            sb.append(" height");
        }
        if (this.e == null) {
            sb.append(" talkBackDescription");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.dzqa
    public final void b(int i) {
        this.d = emxc.j(Integer.valueOf(i));
    }

    @Override // defpackage.dzqa
    public final void c(int i) {
        this.c = i;
        this.f = (byte) (this.f | 2);
    }

    @Override // defpackage.dzqa
    public final void d(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("Null icon");
        }
        this.a = bArr;
    }

    @Override // defpackage.dzqa
    public final void e(String str) {
        if (str == null) {
            throw new NullPointerException("Null talkBackDescription");
        }
        this.e = str;
    }

    @Override // defpackage.dzqa
    public final void f(int i) {
        this.b = i;
        this.f = (byte) (this.f | 1);
    }
}
