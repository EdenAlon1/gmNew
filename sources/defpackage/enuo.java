package defpackage;

import java.util.Collections;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enuo {
    public static final Set a;
    public static final entm b;

    static {
        Set singleton = Collections.singleton(enrz.a);
        a = singleton;
        b = new enun(singleton);
    }

    public static String a(entl entlVar) {
        return entq.b(entlVar.k());
    }

    public static boolean b(entl entlVar, enuj enujVar, Set set) {
        return (entlVar.j() == null && enujVar.a() <= set.size() && set.containsAll(enujVar.c())) ? false : true;
    }

    public static void c(enuj enujVar, entz entzVar, StringBuilder sb) {
        entk entkVar = new entk(sb);
        enujVar.d(entzVar, entkVar);
        if (entkVar.c) {
            entkVar.b.append(entkVar.a);
        }
    }
}
