package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dreh {
    private final dren a;

    public dreh(dren drenVar) {
        this.a = drenVar;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Iterable, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Iterable, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Iterable, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Iterable, java.util.Collection] */
    public final boolean equals(Object obj) {
        if (!(obj instanceof dreh)) {
            return false;
        }
        dren drenVar = this.a;
        dren drenVar2 = ((dreh) obj).a;
        if (ffkj.e(drenVar.e(), drenVar2.e()) || ffkj.e(drenVar.f(), drenVar2.f())) {
            return true;
        }
        ?? c = drenVar2.c();
        if (!c.isEmpty()) {
            Iterator it = c.iterator();
            while (it.hasNext()) {
                if (ffkj.e(((drem) it.next()).b, drenVar.f())) {
                    return true;
                }
            }
        }
        ?? c2 = drenVar.c();
        if (!c2.isEmpty()) {
            Iterator it2 = c2.iterator();
            while (it2.hasNext()) {
                if (ffkj.e(((drem) it2.next()).b, drenVar2.f())) {
                    return true;
                }
            }
        }
        if (!ffpc.J(drenVar.e()) && !ffpc.J(drenVar2.e())) {
            return false;
        }
        ?? c3 = drenVar2.c();
        if (c3.isEmpty()) {
            return false;
        }
        for (drem dremVar : c3) {
            ?? c4 = drenVar.c();
            if (!c4.isEmpty()) {
                Iterator it3 = c4.iterator();
                while (it3.hasNext()) {
                    if (ffkj.e(((drem) it3.next()).b, dremVar.b)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
