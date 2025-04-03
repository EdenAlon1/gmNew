package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccxe implements ccum {
    public static final entd a = entd.c("BugleCms");
    public final cdvt b;
    public final axkm c;
    public final dtuu d;
    public final ecrj e;
    public final ashx f;
    private final eisx g;
    private final ffbr h;
    private final cdnd i;
    private final ffbr j;
    private final ffbr k;
    private final ffbr l;
    private final asjc m;
    private final ffsk n;
    private final ffhd o;
    private final ashn p;

    public ccxe(eisx eisxVar, ffbr ffbrVar, cdnd cdndVar, cdvt cdvtVar, axkm axkmVar, crud crudVar, ffbr ffbrVar2, dtuu dtuuVar, ecrj ecrjVar, ffbr ffbrVar3, ffbr ffbrVar4, asjc asjcVar, ashx ashxVar, ffsk ffskVar, ffhd ffhdVar, ashn ashnVar) {
        eisxVar.getClass();
        ffbrVar.getClass();
        cdndVar.getClass();
        axkmVar.getClass();
        crudVar.getClass();
        ffbrVar2.getClass();
        dtuuVar.getClass();
        ecrjVar.getClass();
        ffbrVar3.getClass();
        ffbrVar4.getClass();
        asjcVar.getClass();
        ashxVar.getClass();
        ffskVar.getClass();
        ffhdVar.getClass();
        ashnVar.getClass();
        this.g = eisxVar;
        this.h = ffbrVar;
        this.i = cdndVar;
        this.b = cdvtVar;
        this.c = axkmVar;
        this.j = ffbrVar2;
        this.d = dtuuVar;
        this.e = ecrjVar;
        this.k = ffbrVar3;
        this.l = ffbrVar4;
        this.m = asjcVar;
        this.f = ashxVar;
        this.n = ffskVar;
        this.o = ffhdVar;
        this.p = ashnVar;
    }

    public static final engw h(List list) {
        engw<String> a2 = engq.a(list);
        efbd.b();
        ArrayList arrayList = new ArrayList(ffdx.n(a2, 10));
        for (String str : a2) {
            str.getClass();
            arrayList.add(ffpc.h(str));
        }
        final ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((Long) obj) != null) {
                arrayList2.add(obj);
            }
        }
        String[] strArr = bqhg.a;
        bqgz bqgzVar = new bqgz();
        bqgzVar.f("CmsBackupDependencyCacheDatabaseOperations#deleteDependencyMessages");
        bqgzVar.c(new Function() { // from class: cruc
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                bqhf bqhfVar = (bqhf) obj2;
                bqhfVar.getClass();
                bqhfVar.aq(new dtrw("cms_backup_dependency_cache_table.dependency_id", 3, bqhf.at(arrayList2), true));
                return bqhfVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        final bqhe bqheVar = (bqhe) bqgzVar.b().b;
        engw<bqge> engwVar = (engw) bqhg.a().r("cms_backup_dependency_cache_table-deleteAndReturnDeletedRows-txn", new emyl() { // from class: bqga
            @Override // defpackage.emyl
            public final Object get() {
                String[] strArr2 = bqhg.a;
                bqhd bqhdVar = new bqhd(bqhg.a);
                bqhe bqheVar2 = bqhe.this;
                bqhdVar.k(bqheVar2);
                bqhdVar.z("cms_backup_dependency_cache_table-deleteAndReturnDeletedRows-query");
                engw y = bqhdVar.b().y();
                bqgz bqgzVar2 = new bqgz();
                bqgzVar2.b = bqheVar2;
                bqgzVar2.f("cms_backup_dependency_cache_table-deleteAndReturnDeletedRows-delete");
                bqgzVar2.b().b();
                return y;
            }
        });
        engwVar.getClass();
        ArrayList arrayList3 = new ArrayList(ffdx.n(engwVar, 10));
        for (bqge bqgeVar : engwVar) {
            bqgeVar.az(1, "dependent_id");
            arrayList3.add(String.valueOf(bqgeVar.b));
        }
        return engq.a(arrayList3);
    }

    private final void i(String str, Optional optional, ccvl ccvlVar) {
        ekzz f = eleg.f("CmsMessagesBackupDelegate#scheduleInitialMediaUploadForMessage");
        try {
            crzp crzpVar = (crzp) fflm.b(optional);
            if (crzpVar == null) {
                if (!((asix) this.l.b()).a()) {
                    throw new ccwp(str);
                }
                throw new ccwp(str, this.k);
            }
            MessageCoreData a2 = crzpVar.a();
            boolean b = ((Boolean) ((cfup) csgj.G.get()).e()).booleanValue() ? csfx.b(ccvlVar.c) : true;
            this.i.g(a2, b, eykm.c);
            this.i.f(a2, b, eykm.c);
            ffig.a(f, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ffig.a(f, th);
                throw th2;
            }
        }
    }

    @Override // defpackage.ccum
    public final Object a(Map map, ccvl ccvlVar, ffgu ffguVar) {
        return ffra.a(ekxi.a(this.o), new ccwy(null, map, this, ccvlVar), ffguVar);
    }

    @Override // defpackage.ccum
    public final void b(axue axueVar, String str, Optional optional, String str2, ccvl ccvlVar) {
        axueVar.getClass();
        if (!this.m.a()) {
            ensk o = a.o();
            o.Y(cdii.c, str);
            o.Y(cdii.d, ccvlVar.b.a);
            o.Y(cdii.p, Integer.valueOf(ccvlVar.b.b));
            o.Y(csux.a, str2);
            o.q("Processed CMS message backup");
        }
        if (this.p.a()) {
            if (!csfx.b(ccvlVar.c) && ((Boolean) ((cfup) csgj.G.get()).e()).booleanValue() && axueVar == axue.CMS_EVENT_TYPE_CREATE_TRIGGERED) {
                i(str, optional, ccvlVar);
            }
        } else if (csfx.b(ccvlVar.c) || (((Boolean) ((cfup) csgj.G.get()).e()).booleanValue() && axueVar == axue.CMS_EVENT_TYPE_CREATE_TRIGGERED)) {
            i(str, optional, ccvlVar);
        }
        if (csgj.a() && ((ashs) this.j.b()).a() && !csfx.b(ccvlVar.c)) {
            axol.k(this.n, null, new ccxd(this, str, ccvlVar, null), 3);
        }
    }

    @Override // defpackage.ccum
    public final Object c(String str, String str2) {
        ensz enszVar = (ensz) a.h();
        enszVar.Y(cdii.c, str);
        enszVar.Y(cdii.e, str2);
        enszVar.q("Recovering from ALREADY_EXISTS error for message");
        return ccug.a;
    }

    @Override // defpackage.ccum
    public final /* synthetic */ Object d(Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(ffew.a(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), new ffch(entry.getValue()));
        }
        return linkedHashMap;
    }

    @Override // defpackage.ccum
    public final void e(axue axueVar, String str, ccvl ccvlVar) {
        axueVar.getClass();
        ensz enszVar = (ensz) a.j();
        enszVar.Y(cdii.d, ccvlVar.b.a);
        enszVar.Y(cdii.c, str);
        enszVar.Y(cdii.p, Integer.valueOf(ccvlVar.b.b));
        enszVar.q("Failure while processing Cms Message.");
    }

    @Override // defpackage.ccum
    public final void f(List list, ccvl ccvlVar) {
        if (csgj.a() && ((Boolean) ((cfup) csgj.o.get()).e()).booleanValue() && csfx.b(ccvlVar.c)) {
            axol.k(this.n, null, new ccwz(this, list, null), 3);
        }
        if (((ashs) this.j.b()).a() && csgj.a()) {
            axol.k(this.n, null, new ccxb(this, list, ccvlVar, null), 3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g(engw engwVar, ccvl ccvlVar) {
        enqv it = engwVar.iterator();
        it.getClass();
        while (it.hasNext()) {
            String str = (String) it.next();
            cccd cccdVar = (cccd) ccce.a.createBuilder();
            cccdVar.getClass();
            ccbw.b(this.g.a(), cccdVar);
            ccbw.f(5, cccdVar);
            ccbw.e(str, cccdVar);
            ccbw.c(ccrk.a(6), cccdVar);
            ccbw.d(csfx.b(ccvlVar.c), cccdVar);
            ffbr ffbrVar = this.h;
            ((ccdo) ffbrVar.b()).c(ccbw.a(cccdVar));
            ensz enszVar = (ensz) a.h();
            enszVar.Y(cdii.c, str);
            enszVar.Y(cdii.d, ccvlVar.b.a);
            enszVar.Y(cdii.p, Integer.valueOf(ccvlVar.b.b));
            enszVar.q("Queued deferred message dependent work.");
        }
    }
}
