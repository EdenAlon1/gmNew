package defpackage;

import android.content.Context;
import android.database.MatrixCursor;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;

/* compiled from: PG */
@ffbs
/* loaded from: classes8.dex */
public final class csee implements csdr {
    private static final enru a = enru.c("com/google/android/apps/messaging/shared/util/cloudstore/completeness/customthemes/CustomThemesCmsDataProvider");
    private final axkm b;
    private final ffbr c;
    private final ashh d;

    public csee(axkm axkmVar, ffbr ffbrVar, ashh ashhVar, ecrj ecrjVar) {
        axkmVar.getClass();
        ffbrVar.getClass();
        ashhVar.getClass();
        ecrjVar.getClass();
        this.b = axkmVar;
        this.c = ffbrVar;
        this.d = ashhVar;
    }

    @Override // defpackage.csdr
    public final eshn a() {
        return eshn.CUSTOM_THEMES;
    }

    @Override // defpackage.csdr
    public final List b() {
        if (this.b.al()) {
            bech a2 = ((cctp) this.c.b()).a(2, becg.UPDATE, 0);
            a2.f = 2;
            a2.d = ffdx.b("custom_theme");
            a2.a = "_theme";
            a2.g = ccue.a(65);
            return ffdx.b(a2.a());
        }
        bech bechVar = new bech();
        bechVar.c = becg.UPDATE;
        bechVar.e = 32;
        bechVar.f = 2;
        bechVar.b = 2;
        bechVar.d = ffdx.b("custom_theme");
        bechVar.c();
        bechVar.a = "_theme";
        bechVar.g = ccue.a(65);
        bechVar.h = this.d.a();
        return ffdx.b(bechVar.a());
    }

    @Override // defpackage.csdr
    public final List c() {
        return ffdx.b(((cctp) this.c.b()).d(2, becg.UPDATE, "_theme"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.csdr
    public final Map d(final List list) {
        bsob e = bsom.e();
        e.z("CustomThemesCmsDataProvider.getData");
        e.i(new Function() { // from class: csec
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                List<String> list2 = list;
                bsol bsolVar = (bsol) obj;
                ArrayList arrayList = new ArrayList(ffdx.n(list2, 10));
                for (String str : list2) {
                    str.getClass();
                    arrayList.add(bdgq.b(str));
                }
                bsolVar.t(arrayList);
                int intValue = bsom.g().intValue();
                if (intValue < 59820) {
                    dtub.w("custom_theme", intValue);
                }
                bsolVar.aq(new dtrx("conversations.custom_theme", 6));
                return bsolVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        e.f(new Function() { // from class: csed
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bskp bskpVar = (bskp) obj;
                return new bskq[]{bskpVar.a, bskpVar.ar};
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        engw y = e.b().y();
        y.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(ffmk.f(ffew.a(ffdx.n(y, 10)), 16));
        enqv it = y.iterator();
        while (it.hasNext()) {
            bseh bsehVar = (bseh) it.next();
            String a2 = bsehVar.C().a();
            ckkz J = bsehVar.J();
            J.getClass();
            ffcf ffcfVar = new ffcf(a2, new ffch(J.toByteString()));
            linkedHashMap.put(ffcfVar.a, ffcfVar.b);
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.csdr
    public final Map e(Map map) {
        map.getClass();
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            try {
                ckkz ckkzVar = (ckkz) eyfy.parseFrom(ckkz.a, (eyee) entry.getValue());
                ckkzVar.getClass();
                linkedHashMap.put(str, ckkzVar);
            } catch (eygu e) {
                linkedHashMap2.put(str, e);
            }
        }
        if (!linkedHashMap.isEmpty()) {
            MatrixCursor matrixCursor = new MatrixCursor(new String[]{bsom.c.a.d(), bsom.c.ar.d()});
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                matrixCursor.addRow(ffdx.g(Long.valueOf(bdgq.b((String) entry2.getKey()).a), ((ckkz) entry2.getValue()).toByteArray()));
            }
            bsoe bsoeVar = new bsoe();
            bsoeVar.ap("restoreDataInTransaction");
            bsoeVar.ad(new Function() { // from class: cseb
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bsol bsolVar = (bsol) obj;
                    Set keySet = linkedHashMap.keySet();
                    ArrayList arrayList = new ArrayList(ffdx.n(keySet, 10));
                    Iterator it = keySet.iterator();
                    while (it.hasNext()) {
                        arrayList.add(bdgq.b((String) it.next()));
                    }
                    bsolVar.t(arrayList);
                    int intValue = bsom.g().intValue();
                    if (intValue < 59820) {
                        dtub.w("custom_theme", intValue);
                    }
                    bsolVar.aq(new dtrx("conversations.custom_theme", 5));
                    return bsolVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            engw a2 = engq.a(ffdx.b(bsom.c.ar));
            Context context = dtub.b;
            bsoeVar.ao(a2, matrixCursor, new dtzq("$R = $V", new Object[]{"_I._id", bsom.c.a}));
            try {
                int e2 = bsoeVar.b().e();
                ensk h = a.h();
                h.Y(ente.a, "BugleCmsAddFields");
                ((enrr) h.h("com/google/android/apps/messaging/shared/util/cloudstore/completeness/customthemes/CustomThemesCmsDataProvider", "restoreDataInTransaction", BasePaymentResult.ERROR_REQUEST_TIMEOUT, "CustomThemesCmsDataProvider.kt")).u("Updated the custom theme column of %s conversation rows having null custom theme, out of %s.", e2, linkedHashMap.size());
            } catch (Exception e3) {
                ensk j = a.j();
                j.Y(ente.a, "BugleCmsAddFields");
                ((enrr) ((enrr) j).g(e3).h("com/google/android/apps/messaging/shared/util/cloudstore/completeness/customthemes/CustomThemesCmsDataProvider", "restoreDataInTransaction", 207, "CustomThemesCmsDataProvider.kt")).q("Bulk UPDATE of custom theme column failed.");
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(ffew.a(map.size()));
                Iterator it = map.entrySet().iterator();
                while (it.hasNext()) {
                    linkedHashMap3.put(((Map.Entry) it.next()).getKey(), e3);
                }
                linkedHashMap2.putAll(linkedHashMap3);
            }
        }
        return linkedHashMap2;
    }
}
