package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
final /* synthetic */ class srg extends ffju implements ffjn {
    public srg(Object obj) {
        super(3, obj, srp.class, "getFirstValidBannerContent", "getFirstValidBannerContent(Ljava/util/List;Ljava/util/Map;)Lcom/google/android/apps/messaging/banner/api/BannerContent;", 4);
    }

    @Override // defpackage.ffjn
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        Object obj4;
        ffcf ffcfVar;
        List list = (List) obj;
        Map map = (Map) obj2;
        srp srpVar = (srp) this.b;
        ArrayList<ffcf> arrayList = new ArrayList();
        for (Object obj5 : list) {
            ejsy ejsyVar = (ejsy) ((ffcf) obj5).a;
            if ((ejsyVar instanceof ejsu) || ((ejsyVar instanceof ejsw) && ((ejsw) ejsyVar).a != null)) {
                arrayList.add(obj5);
            }
        }
        if (arrayList.size() != list.size()) {
            ((enrr) srp.a.h().h("com/google/android/apps/messaging/banner/BannersUiAdapterImpl", "getFirstValidBannerContent", 154, "BannersUiAdapterImpl.kt")).q("Banners are still loading, waiting until loaded to prioritize");
        } else {
            ((enrr) srp.a.h().h("com/google/android/apps/messaging/banner/BannersUiAdapterImpl", "getFirstValidBannerContent", 160, "BannersUiAdapterImpl.kt")).q("All banners have finished loading, getting the first non-null, eligible to display");
            ArrayList arrayList2 = new ArrayList(ffdx.n(arrayList, 10));
            for (ffcf ffcfVar2 : arrayList) {
                ejsy ejsyVar2 = (ejsy) ffcfVar2.a;
                ssb ssbVar = (ssb) ffcfVar2.b;
                srz srzVar = ejsyVar2 instanceof ejsu ? (srz) ((ejsu) ejsyVar2).a : ejsyVar2 instanceof ejsw ? (srz) ((ejsw) ejsyVar2).a : null;
                if (srzVar == null) {
                    ((enrr) srp.a.h().h("com/google/android/apps/messaging/banner/BannersUiAdapterImpl", "getFirstValidBannerContent", 173, "BannersUiAdapterImpl.kt")).t("Filtering out banner with %s because of invalid LocalSnapshot or null content", ssbVar);
                } else if (!srpVar.g.b || ffkj.e(srzVar.a(), srpVar.c) || ssbVar.a) {
                    ffcfVar = new ffcf(srzVar, ssbVar);
                    arrayList2.add(ffcfVar);
                } else {
                    ((enrr) srp.a.h().h("com/google/android/apps/messaging/banner/BannersUiAdapterImpl", "getFirstValidBannerContent", 191, "BannersUiAdapterImpl.kt")).D("Filtering out banner %s with %s because of being blocked", srzVar, ssbVar);
                }
                ffcfVar = null;
                arrayList2.add(ffcfVar);
            }
            List<ffcf> aa = ffdx.aa(arrayList2);
            ArrayList arrayList3 = new ArrayList(ffdx.n(aa, 10));
            for (ffcf ffcfVar3 : aa) {
                Object obj6 = ffcfVar3.a;
                obj6.getClass();
                arrayList3.add(new ffcf(obj6, ffcfVar3.b));
            }
            Iterator it = arrayList3.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj4 = null;
                    break;
                }
                obj4 = it.next();
                if (!map.containsKey(((srz) ((ffcf) obj4).a).a())) {
                    break;
                }
            }
            ffcf ffcfVar4 = (ffcf) obj4;
            if (ffcfVar4 != null && !((ssb) ffcfVar4.b).b) {
                srpVar.f.b = true;
                if (srpVar.c == null) {
                    srpVar.c = srpVar.a(ffcfVar4).a();
                }
            }
            if (ffcfVar4 != null) {
                return srpVar.a(ffcfVar4);
            }
        }
        return null;
    }
}
