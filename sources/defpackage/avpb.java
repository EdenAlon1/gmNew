package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class avpb extends ffhv implements ffjm {
    Object a;
    int b;
    final /* synthetic */ avpd c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public avpb(avpd avpdVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = avpdVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((avpb) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Iterable, java.lang.Object] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        avpd avpdVar;
        ?? r0;
        ffhh ffhhVar = ffhh.a;
        if (this.b != 0) {
            r0 = this.a;
            avpdVar = (avpd) this.d;
            try {
                ffci.b(obj);
                r0 = r0;
            } catch (Throwable th) {
                th = th;
                try {
                    throw th;
                } catch (Throwable th2) {
                    ffig.a(r0, th);
                    throw th2;
                }
            }
        } else {
            ffci.b(obj);
            ffsk ffskVar = (ffsk) this.d;
            avpdVar = this.c;
            ekzz f = eleg.f("UnifiedCacheRcsCapabilitiesDataSource#LoadData");
            try {
                ?? r4 = avpdVar.h.get();
                r4.getClass();
                Set ar = ffdx.ar(r4);
                tyi tyiVar = avpdVar.j.a;
                int d = tyiVar.d();
                boolean x = ((djrv) tyiVar.p.b()).x(d);
                ensk e = tyi.a.e();
                e.Y(ente.a, "Bugle");
                ((enrr) ((enrr) e).h("com/google/android/apps/messaging/conversation/dataservice/RcsCapabilitiesDataSourceWrapper", "isRcsAvailableForCurrentlySelectedSubId", 220, "RcsCapabilitiesDataSourceWrapper.java")).x("Currently selected in convo v1 is subId=%d, isRcsAvailable=%b", d, x);
                if (!x) {
                    List aa = ffdx.aa(ar);
                    LinkedHashMap linkedHashMap = new LinkedHashMap(ffmk.f(ffew.a(ffdx.n(aa, 10)), 16));
                    for (Object obj2 : aa) {
                        linkedHashMap.put(obj2, avlk.d());
                    }
                    ejug a = ejug.a(engq.e(linkedHashMap), avpdVar.d.f());
                    ffig.a(f, null);
                    return a;
                }
                List<aoku> aa2 = ffdx.aa(ar);
                ArrayList arrayList = new ArrayList(ffdx.n(aa2, 10));
                for (aoku aokuVar : aa2) {
                    arrayList.add(ffra.b(ffskVar, ekxi.a(ffhe.a), ffsm.a, new avpa(null, aokuVar, avpdVar)));
                }
                this.d = avpdVar;
                this.a = f;
                this.b = 1;
                obj = ffqv.a(arrayList, this);
                if (obj == ffhhVar) {
                    return ffhhVar;
                }
                r0 = f;
            } catch (Throwable th3) {
                th = th3;
                r0 = f;
                throw th;
            }
        }
        Map k = ffew.k((Iterable) obj);
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : k.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            ffcf ffcfVar = value != null ? new ffcf(key, value) : null;
            if (ffcfVar != null) {
                arrayList2.add(ffcfVar);
            }
        }
        enhk e2 = engq.e(ffew.k(arrayList2));
        if (avpdVar.i) {
            avpdVar.i = false;
            ?? r3 = avpdVar.h.get();
            r3.getClass();
            aoku aokuVar2 = (aoku) ffdx.U(ffdx.aa(r3));
            if (aokuVar2 != null) {
                axol.k(avpdVar.c, null, new avoz(avpdVar, aokuVar2, null), 3);
            }
        }
        ejug a2 = ejug.a(e2, avpdVar.d.f());
        ffig.a(r0, null);
        return a2;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        avpb avpbVar = new avpb(this.c, ffguVar);
        avpbVar.d = obj;
        return avpbVar;
    }
}
