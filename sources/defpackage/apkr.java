package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import j$.time.Duration;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class apkr extends ffhv implements ffjm {
    int a;
    final /* synthetic */ apkx b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public apkr(apkx apkxVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = apkxVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((apkr) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object obj2;
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            elfl b = this.b.e.b();
            b.getClass();
            this.a = 1;
            obj = fgfz.c(b, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        engw engwVar = (engw) obj;
        if (engwVar.isEmpty()) {
            ((enrr) apkx.a.j().h("com/google/android/apps/messaging/shared/api/messaging/message/compose/emergency/session/EmergencySessionSupplier$getAsync$1", "invokeSuspend", 46, "EmergencySessionSupplier.kt")).q("No recipients found for emergency session supplier");
            return ffem.a;
        }
        engwVar.getClass();
        ResolvedRecipient resolvedRecipient = (ResolvedRecipient) ffdx.K(engwVar);
        engw y = apkx.e().y();
        y.getClass();
        apkx apkxVar = this.b;
        ArrayList<bsyh> arrayList = new ArrayList();
        enqv it = y.iterator();
        while (it.hasNext()) {
            E next = it.next();
            bsyh bsyhVar = (bsyh) next;
            Optional e = resolvedRecipient.g().e();
            if (e.isPresent() && bsyhVar.o().equals(((awui) e.get()).d) && bsyhVar.m().isAfter(apkxVar.b.f())) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(ffdx.n(arrayList, 10));
        for (bsyh bsyhVar2 : arrayList) {
            bsyhVar2.getClass();
            arrayList2.add(apko.a(bsyhVar2));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj3 : arrayList2) {
            aplf aplfVar = ((apkn) obj3).b;
            Object obj4 = linkedHashMap.get(aplfVar);
            if (obj4 == null) {
                obj4 = new ArrayList();
                linkedHashMap.put(aplfVar, obj4);
            }
            ((List) obj4).add(obj3);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(ffew.a(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry.getKey(), (apkn) ffdx.K((List) entry.getValue()));
        }
        apkx apkxVar2 = this.b;
        for (apkn apknVar : linkedHashMap2.values()) {
            apld apldVar = apkxVar2.d;
            apknVar.getClass();
            synchronized (apldVar.e) {
                Iterator it2 = apldVar.e.keySet().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it2.next();
                    if (ffkj.e((apkn) obj2, apknVar)) {
                        break;
                    }
                }
                apkn apknVar2 = (apkn) obj2;
                if (apknVar2 != null) {
                    if (ffkj.e(apknVar.a, apknVar2.a) && apknVar.b == apknVar2.b && apknVar.c == apknVar2.c && ffkj.e(apknVar.d, apknVar2.d) && ffkj.e(apknVar.e, apknVar2.e)) {
                        ((enrr) apld.a.h().h("com/google/android/apps/messaging/shared/api/messaging/message/compose/emergency/session/EmergencySessionTimeoutTracker", "scheduleSessionTimeout", 69, "EmergencySessionTimeoutTracker.kt")).t("Skipping emergency session timeout tracking. Session is already tracked: %s", apknVar);
                    } else {
                        ffud ffudVar = (ffud) apldVar.e.get(apknVar2);
                        if (ffudVar != null) {
                            ffudVar.t(null);
                        }
                        apldVar.e.remove(apknVar2);
                    }
                }
                apldVar.e.put(apknVar, axol.k(apldVar.b, null, new aplc(Math.max(0L, Duration.between(((cqoh) apldVar.c.b()).f(), apknVar.e).toMillis()), apknVar, apldVar, null), 3));
            }
        }
        return linkedHashMap2;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new apkr(this.b, ffguVar);
    }
}
