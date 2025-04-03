package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class ffmc implements Iterable, fflg {
    public final char a;
    public final char b;
    private final int c = 1;

    public ffmc(char c, char c2) {
        this.a = c;
        this.b = (char) ffib.a(c, c2, 1);
    }

    public boolean a() {
        return ffkj.a(this.a, this.b) > 0;
    }

    public boolean equals(Object obj) {
        if (obj instanceof ffmc) {
            if (a() && ((ffmc) obj).a()) {
                return true;
            }
            ffmc ffmcVar = (ffmc) obj;
            if (this.a != ffmcVar.a || this.b != ffmcVar.b) {
                return false;
            }
            int i = ffmcVar.c;
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (a()) {
            return -1;
        }
        return (((this.a * 31) + this.b) * 31) + 1;
    }

    @Override // java.lang.Iterable
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return new ffmd(this.a, this.b);
    }

    public String toString() {
        return this.a + ".." + this.b + " step 1";
    }
}
