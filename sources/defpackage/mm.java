package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mm implements mw {
    final mw a;
    int b = 0;
    int c = -1;
    int d = -1;
    Object e = null;

    public mm(mw mwVar) {
        this.a = mwVar;
    }

    @Override // defpackage.mw
    public final void a(int i, int i2, Object obj) {
        int i3;
        int i4;
        int i5;
        if (this.b == 3 && i <= (i4 = this.d + (i3 = this.c)) && (i5 = i + i2) >= i3 && this.e == obj) {
            this.c = Math.min(i, i3);
            this.d = Math.max(i4, i5) - this.c;
            return;
        }
        e();
        this.c = i;
        this.d = i2;
        this.e = obj;
        this.b = 3;
    }

    @Override // defpackage.mw
    public final void b(int i, int i2) {
        int i3;
        if (this.b == 1 && i >= (i3 = this.c)) {
            int i4 = this.d;
            if (i <= i3 + i4) {
                this.d = i4 + i2;
                this.c = Math.min(i, i3);
                return;
            }
        }
        e();
        this.c = i;
        this.d = i2;
        this.b = 1;
    }

    @Override // defpackage.mw
    public final void c(int i, int i2) {
        e();
        this.a.c(i, i2);
    }

    @Override // defpackage.mw
    public final void d(int i, int i2) {
        int i3;
        if (this.b == 2 && (i3 = this.c) >= i && i3 <= i + i2) {
            this.d += i2;
            this.c = i;
        } else {
            e();
            this.c = i;
            this.d = i2;
            this.b = 2;
        }
    }

    public final void e() {
        int i = this.b;
        if (i == 0) {
            return;
        }
        if (i == 1) {
            this.a.b(this.c, this.d);
        } else if (i != 2) {
            this.a.a(this.c, this.d, this.e);
        } else {
            this.a.d(this.c, this.d);
        }
        this.e = null;
        this.b = 0;
    }
}
