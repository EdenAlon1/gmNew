package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekbx {
    public static final String a(Map map, ekeo ekeoVar) {
        boolean I;
        String a = ekeoVar.a();
        I = ffpc.I(a, "#", false);
        if (I) {
            throw new IllegalStateException("Subpackages should be provided without their base package: ".concat(String.valueOf(a)));
        }
        String str = (String) map.get(a);
        return str != null ? a.w(str, a, "#") : a;
    }

    public static final Map b(Map map, Map map2, Map map3, Map map4) {
        map4.getClass();
        enhd enhdVar = new enhd();
        for (Map.Entry entry : ((enhk) map).entrySet()) {
            eken ekenVar = (eken) entry.getKey();
            final ffbr ffbrVar = (ffbr) entry.getValue();
            enhdVar.k(c(map3, ekenVar), new erog() { // from class: ekbr
                @Override // defpackage.erog
                public final ListenableFuture a() {
                    return erqt.i(((eyhs) ffbr.this.b()).toByteArray());
                }
            });
        }
        for (Map.Entry entry2 : ((enhk) map2).entrySet()) {
            eken ekenVar2 = (eken) entry2.getKey();
            final ffbr ffbrVar2 = (ffbr) entry2.getValue();
            enhdVar.k(c(map3, ekenVar2), new erog() { // from class: ekbs
                @Override // defpackage.erog
                public final ListenableFuture a() {
                    ListenableFuture a = ((erog) ffbr.this.b()).a();
                    final ekbw ekbwVar = ekbw.a;
                    return elfr.j(a, new emwl() { // from class: ekbq
                        @Override // defpackage.emwl
                        public final Object apply(Object obj) {
                            return ffji.this.invoke(obj);
                        }
                    }, erpp.a);
                }
            });
        }
        enhk c = enhdVar.c();
        Set keySet = map4.keySet();
        enip keySet2 = c.keySet();
        keySet2.getClass();
        if (keySet.containsAll(keySet2)) {
            return c;
        }
        throw new IllegalStateException("Parameters provided for mendel package not in use. Known packages: " + map4.keySet() + ", params provided: " + c.keySet());
    }

    private static final String c(Map map, eken ekenVar) {
        boolean I;
        String a = ekenVar.a();
        I = ffpc.I(a, "#", false);
        if (I) {
            throw new IllegalStateException("Subpackages should be provided without their base package: ".concat(a));
        }
        String str = (String) map.get(a);
        return str != null ? a.w(str, a, "#") : a;
    }
}
