package defpackage;

import android.util.Log;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekax implements ekav, ekay {
    private final ffbr a;
    private final Map b;
    private final Map c;
    private final ekaw d;
    private final ekbv e;

    public ekax(emxc emxcVar, ekbv ekbvVar, ffbr ffbrVar, Map map, Map map2) {
        ekbvVar.getClass();
        ffbrVar.getClass();
        map2.getClass();
        this.e = ekbvVar;
        this.a = ffbrVar;
        this.b = map;
        this.c = map2;
        this.d = (ekaw) ((emxn) emxcVar).a;
    }

    private final ListenableFuture h(String str, boolean z) {
        ejzu ejzuVar = (ejzu) this.c.get(str);
        if (ejzuVar == null) {
            Log.w("ConfigurationUpdater", "No Mendel package registered for ".concat(String.valueOf(str)));
            return erqt.i(null);
        }
        int ordinal = ejzuVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        throw new ffcd();
                    }
                }
            }
            return this.d.b(str, z);
        }
        return ((ekcn) this.a.b()).a(str, z);
    }

    private final ListenableFuture i(boolean z) {
        enip keySet = ((enhk) this.b).keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : keySet) {
            k();
            arrayList.add(obj);
        }
        ArrayList arrayList2 = new ArrayList(ffdx.n(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(this.e.a((String) it.next()));
        }
        ArrayList arrayList3 = new ArrayList(ffdx.n(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(h((String) it2.next(), z));
        }
        return ekcu.a(arrayList3);
    }

    private final ListenableFuture j(String str, eisx eisxVar) {
        ekbv ekbvVar = this.e;
        Map map = this.c;
        String a = ekbvVar.a(str);
        ejzu ejzuVar = (ejzu) map.get(a);
        if (ejzuVar == ejzu.d || ejzuVar == ejzu.b) {
            return this.d.c(a, eisxVar);
        }
        throw new IllegalStateException(a.o(ejzuVar, a, "Package ", " was not a user package. Instead was "));
    }

    private static final void k() {
        Boolean bool = true;
        bool.getClass();
    }

    @Override // defpackage.ekav
    public final ListenableFuture a(String str) {
        str.getClass();
        Map map = this.c;
        String a = this.e.a(str);
        ejzu ejzuVar = (ejzu) map.get(a);
        if (ejzuVar == ejzu.c || ejzuVar == ejzu.a) {
            return ((ekcn) this.a.b()).a(a, true);
        }
        throw new IllegalStateException(a.o(ejzuVar, a, "Package ", " was not a device package. Instead was "));
    }

    @Override // defpackage.ekav
    public final ListenableFuture b(String str, eisx eisxVar) {
        return j(str, eisxVar);
    }

    @Override // defpackage.ekav
    public final ListenableFuture c(String str) {
        return h(this.e.a(str), true);
    }

    @Override // defpackage.ekav
    public final ListenableFuture d(eisx eisxVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : ((enhk) this.b).entrySet()) {
            ejzu ejzuVar = (ejzu) entry.getValue();
            if (ejzuVar == ejzu.d || ejzuVar == ejzu.b) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Set keySet = linkedHashMap.keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : keySet) {
            k();
            arrayList.add(obj);
        }
        ArrayList arrayList2 = new ArrayList(ffdx.n(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(this.e.a((String) it.next()));
        }
        ArrayList arrayList3 = new ArrayList(ffdx.n(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(j((String) it2.next(), eisxVar));
        }
        return ekcu.a(arrayList3);
    }

    @Override // defpackage.ekav
    public final ListenableFuture e() {
        return i(true);
    }

    @Override // defpackage.ekay
    public final ListenableFuture f(String str) {
        return h(this.e.a(str), false);
    }

    @Override // defpackage.ekay
    public final ListenableFuture g() {
        return i(false);
    }
}
