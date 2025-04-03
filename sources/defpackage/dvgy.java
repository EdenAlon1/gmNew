package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvgy {
    public static final evwj a(evwj evwjVar) {
        String a = evuq.a(evwjVar.e);
        evwi evwiVar = (evwi) evwjVar.toBuilder();
        evwiVar.copyOnWrite();
        evwj evwjVar2 = (evwj) evwiVar.instance;
        a.getClass();
        evwjVar2.b |= 4;
        evwjVar2.e = a;
        return (evwj) evwiVar.build();
    }

    public static final boolean b(List list, ewan ewanVar) {
        int i = 0;
        int i2 = 0;
        while (i < list.size()) {
            if (ewanVar.c.d(i2) == ((Integer) list.get(i)).intValue() && (i2 = i2 + 1) == ewanVar.c.size()) {
                return i == list.size() + (-1);
            }
            i++;
        }
        return false;
    }
}
