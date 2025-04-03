package defpackage;

import com.google.android.apps.messaging.shared.datamodel.etouffee.info.E2eeInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cakm extends ffhv implements ffjm {
    Object a;
    Object b;
    int c;
    final /* synthetic */ Iterable d;
    final /* synthetic */ cakn e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cakm(Iterable iterable, cakn caknVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.d = iterable;
        this.e = caknVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cakm) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ?? r1;
        LinkedHashMap linkedHashMap;
        ffhh ffhhVar = ffhh.a;
        if (this.c != 0) {
            ?? r0 = this.b;
            r1 = this.a;
            try {
                ffci.b(obj);
                linkedHashMap = r0;
                r1 = r1;
            } catch (Throwable th) {
                th = th;
                try {
                    throw th;
                } catch (Throwable th2) {
                    ffig.a(r1, th);
                    throw th2;
                }
            }
        } else {
            ffci.b(obj);
            Iterable iterable = this.d;
            cakn caknVar = this.e;
            ekzz f = eleg.f("getLocalE2eeInfoData");
            try {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(ffmk.f(ffew.a(ffdx.n(iterable, 10)), 16));
                for (Object obj2 : iterable) {
                    linkedHashMap2.put(obj2, ((awui) obj2).d);
                }
                cakk cakkVar = (cakk) caknVar.d.b();
                List ak = ffdx.ak(linkedHashMap2.values());
                this.a = f;
                this.b = linkedHashMap2;
                this.c = 1;
                obj = cakkVar.c(ak, this);
                if (obj == ffhhVar) {
                    return ffhhVar;
                }
                r1 = f;
                linkedHashMap = linkedHashMap2;
            } catch (Throwable th3) {
                th = th3;
                r1 = f;
                throw th;
            }
        }
        Map map = (Map) obj;
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(ffew.a(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            linkedHashMap3.put(entry.getKey(), (E2eeInfo) map.get(entry.getValue()));
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = linkedHashMap3.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                Map k = ffew.k(arrayList);
                ffig.a(r1, null);
                return k;
            }
            Map.Entry entry2 = (Map.Entry) it.next();
            Object key = entry2.getKey();
            Object value = entry2.getValue();
            ffcf ffcfVar = value != null ? new ffcf(key, value) : null;
            if (ffcfVar != null) {
                arrayList.add(ffcfVar);
            }
        }
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cakm(this.d, this.e, ffguVar);
    }
}
