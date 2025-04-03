package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffmj extends ffmh implements ffmg {
    public static final ffmj d = new ffmj(1, 0);

    public ffmj(int i, int i2) {
        super(i, i2, 1);
    }

    @Override // defpackage.ffmh, defpackage.ffmg
    public final boolean a() {
        return this.a > this.b;
    }

    public final Integer c() {
        return Integer.valueOf(this.b);
    }

    public final Integer d() {
        return Integer.valueOf(this.a);
    }

    public final boolean e(int i) {
        return this.a <= i && i <= this.b;
    }

    @Override // defpackage.ffmh
    public final boolean equals(Object obj) {
        if (obj instanceof ffmj) {
            if (a() && ((ffmj) obj).a()) {
                return true;
            }
            ffmj ffmjVar = (ffmj) obj;
            return this.a == ffmjVar.a && this.b == ffmjVar.b;
        }
        return false;
    }

    @Override // defpackage.ffmh
    public final int hashCode() {
        if (a()) {
            return -1;
        }
        return (this.a * 31) + this.b;
    }

    @Override // defpackage.ffmh
    public final String toString() {
        return this.a + ".." + this.b;
    }
}
