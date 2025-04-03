package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbmk extends cbox {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public byte i;

    @Override // defpackage.cbox
    public final void a(int i) {
        this.a = i;
        this.i = (byte) (this.i | 1);
    }

    @Override // defpackage.cbox
    public final void b(int i) {
        this.h = i;
        this.i = (byte) (this.i | Byte.MIN_VALUE);
    }

    @Override // defpackage.cbox
    public final void c(int i) {
        this.e = i;
        this.i = (byte) (this.i | 16);
    }

    @Override // defpackage.cbox
    public final void d(int i) {
        this.b = i;
        this.i = (byte) (this.i | 2);
    }

    @Override // defpackage.cbox
    public final void e(int i) {
        this.c = i;
        this.i = (byte) (this.i | 4);
    }

    @Override // defpackage.cbox
    public final void f(int i) {
        this.g = i;
        this.i = (byte) (this.i | 64);
    }

    @Override // defpackage.cbox
    public final void g(int i) {
        this.d = i;
        this.i = (byte) (this.i | 8);
    }
}
