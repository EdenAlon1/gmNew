package defpackage;

import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lrw {
    public final lrv a;
    public final engw b;

    static {
        lvf.N(0);
        lvf.N(1);
    }

    public lrw(lrv lrvVar, List list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= lrvVar.a)) {
            throw new IndexOutOfBoundsException();
        }
        this.a = lrvVar;
        this.b = engw.n(list);
    }

    public final int a() {
        return this.a.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            lrw lrwVar = (lrw) obj;
            if (this.a.equals(lrwVar.a) && enkr.h(this.b, lrwVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + (this.b.hashCode() * 31);
    }
}
