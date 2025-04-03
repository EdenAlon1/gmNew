package defpackage;

import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class evcc {
    public abstract evcd a();

    public abstract void b(enip enipVar);

    public final evcd c() {
        evcd a = a();
        evbz evbzVar = (evbz) a;
        if (evbzVar.a.g()) {
            emxf.m(!((enip) evbzVar.a.c()).isEmpty(), "Cannot get token for empty scope set");
        }
        HashSet hashSet = new HashSet();
        enqu listIterator = evbzVar.b.listIterator();
        while (listIterator.hasNext()) {
            emxc emxcVar = (emxc) listIterator.next();
            if (emxcVar.g()) {
                enqu listIterator2 = ((evcb) emxcVar.c()).a.listIterator();
                while (listIterator2.hasNext()) {
                    String str = (String) listIterator2.next();
                    emxf.p(hashSet.add(str), "Cannot map account type (%s) to more than one fallback provider", str);
                }
            }
        }
        return a;
    }
}
