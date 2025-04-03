package defpackage;

import android.util.ArrayMap;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbuk implements cbuj {
    private static final entd a = entd.c("BugleSearch");
    private final ffbr b;
    private final ffbr c;
    private final ffbr d;
    private final ffbr e;

    public cbuk(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4) {
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.d = ffbrVar3;
        this.e = ffbrVar4;
    }

    @Override // defpackage.cbyl
    public final elfl a(btih btihVar) {
        elfl d;
        emxf.a(d(btihVar));
        ekzz f = eleg.f("IcingWorkerImpl::process");
        try {
            String s = btihVar.s();
            if (s == null) {
                ensz enszVar = (ensz) a.j();
                enszVar.Y(cbrm.g, "IcingWorkerImpl");
                ((ensz) enszVar.h("com/google/android/apps/messaging/shared/datamodel/search/worker/IcingWorkerImpl", "processInternal", 133, "IcingWorkerImpl.java")).q("Icing can't process the workitem as workItemId is null");
                d = elfo.e(false);
            } else {
                entd entdVar = a;
                ensk o = entdVar.o();
                o.Y(cbrm.g, "IcingWorkerImpl");
                o.Y(cbrm.h, Integer.valueOf(btihVar.m()));
                ((ensz) o.h("com/google/android/apps/messaging/shared/datamodel/search/worker/IcingWorkerImpl", "processInternal", 141, "IcingWorkerImpl.java")).q("Processing work item.");
                int m = btihVar.m();
                if (m == 1) {
                    ensk o2 = entdVar.o();
                    o2.Y(csux.a, s);
                    o2.Y(cbrm.g, "IcingWorkerImpl");
                    ((ensz) o2.h("com/google/android/apps/messaging/shared/datamodel/search/worker/IcingWorkerImpl", "processInternal", 164, "IcingWorkerImpl.java")).q("Indexing message");
                    d = ((cbrn) this.b.b()).d(engw.r(bdhb.b(s)));
                } else if (m == 2) {
                    ensk o3 = entdVar.o();
                    o3.Y(csux.o, s);
                    o3.Y(cbrm.g, "IcingWorkerImpl");
                    ((ensz) o3.h("com/google/android/apps/messaging/shared/datamodel/search/worker/IcingWorkerImpl", "processInternal", 154, "IcingWorkerImpl.java")).q("Indexing conversation");
                    d = ((cbrn) this.b.b()).b(engw.r(bdgq.b(s)));
                } else if (m == 3) {
                    ensk o4 = entdVar.o();
                    o4.Y(csux.m, s);
                    o4.Y(cbrm.g, "IcingWorkerImpl");
                    ((ensz) o4.h("com/google/android/apps/messaging/shared/datamodel/search/worker/IcingWorkerImpl", "processInternal", 174, "IcingWorkerImpl.java")).q("Indexing participant");
                    d = ((cbrn) this.b.b()).e(engw.r(s));
                } else if (m != 4) {
                    ((ensz) ((ensz) entdVar.j()).h("com/google/android/apps/messaging/shared/datamodel/search/worker/IcingWorkerImpl", "processInternal", 186, "IcingWorkerImpl.java")).r("Icing can't process the work item because it has an unknown type: %s", btihVar.m());
                    d = elfo.e(false);
                } else {
                    ensk o5 = entdVar.o();
                    o5.Y(csux.V, s);
                    o5.Y(cbrm.g, "IcingWorkerImpl");
                    ((ensz) o5.h("com/google/android/apps/messaging/shared/datamodel/search/worker/IcingWorkerImpl", "processInternal", 181, "IcingWorkerImpl.java")).q("Indexing annotation");
                    d = ((cbrn) this.b.b()).c(engw.r(s));
                }
            }
            f.b(d);
            f.close();
            return d;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.cbyk
    public final Map b(Collection collection) {
        ArrayMap arrayMap = new ArrayMap();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            btih btihVar = (btih) it.next();
            if (d(btihVar)) {
                arrayMap.put(btihVar.r(), a(btihVar));
            }
        }
        return arrayMap;
    }

    @Override // defpackage.cbyk
    public final Set c(Collection collection) {
        cmj cmjVar = new cmj();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            btih btihVar = (btih) it.next();
            if (d(btihVar)) {
                cmjVar.add(btihVar.r());
            }
        }
        return cmjVar;
    }

    @Override // defpackage.cbyl
    public final boolean d(btih btihVar) {
        try {
            axez c = ((axkm) this.d.b()).c();
            if (axmm.m(c)) {
                ((ensz) a.o().h("com/google/android/apps/messaging/shared/datamodel/search/worker/IcingWorkerImpl", "canProcess", 92, "IcingWorkerImpl.java")).q("Skipping icing index work because CMS Restore is running.");
                return false;
            }
        } catch (eygu e) {
            ((ensz) ((ensz) ((ensz) a.j()).g(e)).h("com/google/android/apps/messaging/shared/datamodel/search/worker/IcingWorkerImpl", "canProcess", 'U', "IcingWorkerImpl.java")).q("Failed to get CmsSettingsData, will schedule icing index work.");
        }
        return (btihVar.o() & 1) != 0;
    }
}
