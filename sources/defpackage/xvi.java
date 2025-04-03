package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xvi extends ffhv implements ffjn {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ xvs c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xvi(ffgu ffguVar, xvs xvsVar) {
        super(3, ffguVar);
        this.c = xvsVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        xvi xviVar = new xvi((ffgu) obj3, this.c);
        xviVar.d = (ffxy) obj;
        xviVar.b = obj2;
        return xviVar.b(ffcu.a);
    }

    /* JADX WARN: Type inference failed for: r10v2, types: [ffxy, java.lang.Object] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffxx xvrVar;
        ffxx a;
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ?? r10 = this.d;
            List<xhp> list = (List) this.b;
            if (list.isEmpty()) {
                xvrVar = new ffyg(xvs.b);
            } else {
                ArrayList arrayList = new ArrayList(ffdx.n(list, 10));
                for (final xhp xhpVar : list) {
                    final xvs xvsVar = this.c;
                    doxx doxxVar = xhpVar instanceof xho ? ((xho) xhpVar).a : xhpVar instanceof xhk ? ((xhk) xhpVar).b : null;
                    if (doxxVar instanceof doyd) {
                        doyd doydVar = (doyd) doxxVar;
                        if (le.z(doydVar.a.a())) {
                            xwh xwhVar = xvsVar.g;
                            String str = doydVar.b;
                            ffix ffixVar = new ffix() { // from class: xvc
                                @Override // defpackage.ffix
                                public final Object invoke() {
                                    ensk g = xvs.a.g();
                                    g.Y(ente.a, "BugleComposeRow2");
                                    enrr enrrVar = (enrr) g.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/attachment/DraftAttachmentUiAdapterImpl", "getUiDataFlow$lambda$4", 104, "DraftAttachmentUiAdapterImpl.kt");
                                    xhp xhpVar2 = xhp.this;
                                    enrrVar.t("Putting in vCardFlowCache for %s", xhpVar2);
                                    return xvsVar.e.a(xhpVar2);
                                }
                            };
                            Map map = xwhVar.a;
                            Object obj2 = map.get(str);
                            if (obj2 == null) {
                                obj2 = ffixVar.invoke();
                                map.put(str, obj2);
                            }
                            a = (ffxx) obj2;
                            arrayList.add(a);
                        }
                    }
                    a = xvsVar.e.a(xhpVar);
                    arrayList.add(a);
                }
                xvrVar = new xvr((ffxx[]) ffdx.ak(arrayList).toArray(new ffxx[0]), this.c, list);
            }
            this.a = 1;
            if (ffyk.c(r10, xvrVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }
}
