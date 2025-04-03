package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffme extends ffmc implements ffmg {
    static {
        new ffme((char) 1, (char) 0);
    }

    public ffme(char c, char c2) {
        super(c, c2);
    }

    @Override // defpackage.ffmc, defpackage.ffmg
    public final boolean a() {
        return ffkj.a(this.a, this.b) > 0;
    }

    @Override // defpackage.ffmc
    public final boolean equals(Object obj) {
        if (obj instanceof ffme) {
            if (a() && ((ffme) obj).a()) {
                return true;
            }
            ffme ffmeVar = (ffme) obj;
            return this.a == ffmeVar.a && this.b == ffmeVar.b;
        }
        return false;
    }

    @Override // defpackage.ffmc
    public final int hashCode() {
        if (a()) {
            return -1;
        }
        return (this.a * 31) + this.b;
    }

    @Override // defpackage.ffmc
    public final String toString() {
        return this.a + ".." + this.b;
    }
}
