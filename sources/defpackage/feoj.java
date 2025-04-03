package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class feoj {
    public static final Logger a = Logger.getLogger(feoj.class.getName());

    private feoj() {
    }

    public static Object a(evpl evplVar) {
        emxf.m(evplVar.r(), "unexpected end of JSON");
        int t = evplVar.t() - 1;
        if (t == 0) {
            evplVar.l();
            ArrayList arrayList = new ArrayList();
            while (evplVar.r()) {
                arrayList.add(a(evplVar));
            }
            emxf.m(evplVar.t() == 2, "Bad token: ".concat(evplVar.e()));
            evplVar.n();
            return DesugarCollections.unmodifiableList(arrayList);
        }
        if (t == 2) {
            evplVar.m();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (evplVar.r()) {
                String h = evplVar.h();
                emxf.f(!linkedHashMap.containsKey(h), "Duplicate key found: %s", h);
                linkedHashMap.put(h, a(evplVar));
            }
            emxf.m(evplVar.t() == 4, "Bad token: ".concat(evplVar.e()));
            evplVar.o();
            return DesugarCollections.unmodifiableMap(linkedHashMap);
        }
        if (t == 5) {
            return evplVar.j();
        }
        if (t == 6) {
            return Double.valueOf(evplVar.a());
        }
        if (t == 7) {
            return Boolean.valueOf(evplVar.s());
        }
        if (t != 8) {
            throw new IllegalStateException("Bad token: ".concat(evplVar.e()));
        }
        evplVar.p();
        return null;
    }
}
