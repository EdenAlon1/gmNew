package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fcw {
    public final long a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final jpg f;

    public fcw(long j, int i, int i2, int i3, int i4, jpg jpgVar) {
        this.a = j;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = jpgVar;
    }

    public final int a() {
        return d().length();
    }

    public final fcx b(int i) {
        return new fcx(feq.a(this.f, i), i, this.a);
    }

    public final fcy c(int i, int i2) {
        return new fcy(b(i), b(i2), i > i2);
    }

    public final String d() {
        return this.f.a.a.b;
    }

    public final boolean e(fcw fcwVar) {
        return (this.a == fcwVar.a && this.c == fcwVar.c && this.d == fcwVar.d) ? false : true;
    }

    public final int f() {
        int i = this.c;
        int i2 = this.d;
        if (i < i2) {
            return 2;
        }
        return i > i2 ? 1 : 3;
    }

    public final String toString() {
        return "SelectionInfo(id=" + this.a + ", range=(" + this.c + '-' + feq.a(this.f, this.c) + ',' + this.d + '-' + feq.a(this.f, this.d) + "), prevOffset=" + this.e + ')';
    }
}
