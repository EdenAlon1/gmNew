package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ogi implements mw {
    public final oko a;
    public final oko b;
    public final mw c;
    public int d;
    public int e;
    public int f;
    private int g = 1;
    private int h = 1;

    public ogi(oko okoVar, oko okoVar2, mw mwVar) {
        this.a = okoVar;
        this.b = okoVar2;
        this.c = mwVar;
        this.d = okoVar.e();
        this.e = okoVar.d();
        this.f = okoVar.a();
    }

    @Override // defpackage.mw
    public final void a(int i, int i2, Object obj) {
        this.c.a(i + this.d, i2, obj);
    }

    @Override // defpackage.mw
    public final void b(int i, int i2) {
        if (i >= this.f && this.h != 2) {
            int min = Math.min(i2, this.e);
            if (min > 0) {
                this.h = 3;
                this.c.a(this.d + i, min, odz.b);
                this.e -= min;
            }
            int i3 = i2 - min;
            if (i3 > 0) {
                this.c.b(i + min + this.d, i3);
            }
        } else if (i <= 0 && this.g != 2) {
            int min2 = Math.min(i2, this.d);
            if (min2 > 0) {
                this.g = 3;
                this.c.a((-min2) + this.d, min2, odz.b);
                this.d -= min2;
            }
            int i4 = i2 - min2;
            if (i4 > 0) {
                this.c.b(this.d, i4);
            }
        } else {
            this.c.b(i + this.d, i2);
        }
        this.f += i2;
    }

    @Override // defpackage.mw
    public final void c(int i, int i2) {
        int i3 = this.d;
        this.c.c(i + i3, i2 + i3);
    }

    @Override // defpackage.mw
    public final void d(int i, int i2) {
        if (i + i2 >= this.f && this.h != 3) {
            int f = ffmk.f(Math.min(this.b.d() - this.e, i2), 0);
            int i3 = i2 - f;
            if (f > 0) {
                this.h = 2;
                this.c.a(this.d + i, f, odz.a);
                this.e += f;
            }
            if (i3 > 0) {
                this.c.d(i + f + this.d, i3);
            }
        } else if (i <= 0 && this.g != 3) {
            int f2 = ffmk.f(Math.min(this.b.e() - this.d, i2), 0);
            int i4 = i2 - f2;
            if (i4 > 0) {
                this.c.d(this.d, i4);
            }
            if (f2 > 0) {
                this.g = 2;
                this.c.a(this.d, f2, odz.a);
                this.d += f2;
            }
        } else {
            this.c.d(i + this.d, i2);
        }
        this.f -= i2;
    }
}
