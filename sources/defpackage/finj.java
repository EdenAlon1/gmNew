package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class finj {
    public final List a;
    public final char b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public finj f;
    public finj g;

    public finj(List list, char c, boolean z, boolean z2, finj finjVar) {
        this.a = list;
        this.b = c;
        this.d = z;
        this.e = z2;
        this.f = finjVar;
        this.c = list.size();
    }

    public final int a() {
        return this.a.size();
    }

    public final Iterable b(int i) {
        if (i > 0 && i <= a()) {
            return this.a.subList(0, i);
        }
        throw new IllegalArgumentException("length must be between 1 and " + a() + ", was " + i);
    }

    public final Iterable c(int i) {
        if (i > 0 && i <= a()) {
            List list = this.a;
            return list.subList(list.size() - i, this.a.size());
        }
        throw new IllegalArgumentException("length must be between 1 and " + a() + ", was " + i);
    }

    public final fiqi d() {
        return (fiqi) this.a.get(0);
    }

    public final fiqi e() {
        return (fiqi) this.a.get(this.a.size() - 1);
    }
}
