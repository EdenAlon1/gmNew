package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class srl extends ffhv implements ffjn {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ srp c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public srl(ffgu ffguVar, srp srpVar) {
        super(3, ffguVar);
        this.c = srpVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        srl srlVar = new srl((ffgu) obj3, this.c);
        srlVar.d = (ffxy) obj;
        srlVar.b = (Object[]) obj2;
        return srlVar.b(ffcu.a);
    }

    /* JADX WARN: Type inference failed for: r10v2, types: [ffxy, java.lang.Object] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ?? r10 = this.d;
            List M = ffdo.M((ffcf[]) this.b);
            ArrayList<ffcf> arrayList = new ArrayList();
            for (Object obj2 : M) {
                if (((ejsy) ((ffcf) obj2).a) instanceof ejss) {
                    arrayList.add(obj2);
                }
            }
            for (ffcf ffcfVar : arrayList) {
                enrr enrrVar = (enrr) srp.a.j();
                Object obj3 = ffcfVar.a;
                obj3.getClass();
                ((enrr) enrrVar.g(((ejss) obj3).a).h("com/google/android/apps/messaging/banner/BannersUiAdapterImpl", "removeFailedBanners", 111, "BannersUiAdapterImpl.kt")).q("Failed to load banner");
            }
            M.removeAll(arrayList);
            List ak = ffdx.ak(M);
            this.a = 1;
            if (r10.fQ(ak, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }
}
