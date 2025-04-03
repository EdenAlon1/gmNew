package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class ffmh implements Iterable, fflg {
    public final int a;
    public final int b;
    public final int c;

    public ffmh(int i, int i2, int i3) {
        if (i3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        this.a = i;
        this.b = ffib.a(i, i2, i3);
        this.c = i3;
    }

    public boolean a() {
        return this.c > 0 ? this.a > this.b : this.a < this.b;
    }

    @Override // java.lang.Iterable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ffev iterator() {
        return new ffmi(this.a, this.b, this.c);
    }

    public boolean equals(Object obj) {
        if (obj instanceof ffmh) {
            if (a() && ((ffmh) obj).a()) {
                return true;
            }
            ffmh ffmhVar = (ffmh) obj;
            return this.a == ffmhVar.a && this.b == ffmhVar.b && this.c == ffmhVar.c;
        }
        return false;
    }

    public int hashCode() {
        if (a()) {
            return -1;
        }
        return (((this.a * 31) + this.b) * 31) + this.c;
    }

    public String toString() {
        StringBuilder sb;
        String str;
        int i = this.c;
        int i2 = this.a;
        int i3 = this.b;
        if (i > 0) {
            sb = new StringBuilder();
            sb.append(i2);
            str = "..";
        } else {
            i = -i;
            sb = new StringBuilder();
            sb.append(i2);
            str = " downTo ";
        }
        sb.append(str);
        sb.append(i3);
        sb.append(" step ");
        sb.append(i);
        return sb.toString();
    }
}
