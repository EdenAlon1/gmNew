package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahwp extends ffhv implements ffjm {
    final /* synthetic */ ahwz a;
    final /* synthetic */ ffji b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahwp(ahwz ahwzVar, ffji ffjiVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = ahwzVar;
        this.b = ffjiVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ahwp) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        final fflb fflbVar = new fflb();
        final ffji ffjiVar = this.b;
        this.a.d.b(new ffji() { // from class: ahwo
            @Override // defpackage.ffji
            public final Object invoke(Object obj2) {
                Object obj3;
                xhu xhuVar = (xhu) obj2;
                Iterator it = xhuVar.b.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj3 = null;
                        break;
                    }
                    ffji ffjiVar2 = ffji.this;
                    obj3 = it.next();
                    if (((Boolean) ffjiVar2.invoke(obj3)).booleanValue()) {
                        break;
                    }
                }
                xhp xhpVar = (xhp) obj3;
                fflbVar.a = xhpVar;
                return xhpVar == null ? xhuVar : xhu.c(xhuVar, null, ffdx.ac(xhuVar.b, xhpVar), null, false, null, null, false, 0, 1021);
            }
        });
        xhp xhpVar = (xhp) fflbVar.a;
        ((enrr) ((enrr) (xhpVar != null ? ahwz.a.g() : ahwz.a.h())).h("com/google/android/apps/messaging/multishare/editmessage/bottomcontent/composerow/attachments/DraftAttachmentUiAdapterImpl$removeAttachment$1", "invokeSuspend", 113, "DraftAttachmentUiAdapterImpl.kt")).t("removeAttachment removed: %s", xhpVar);
        Object obj2 = xhpVar instanceof xho ? ((xho) xhpVar).a : xhpVar instanceof xhk ? ((xhk) xhpVar).b : null;
        if (obj2 instanceof doyd) {
            ((enrr) ahwz.a.g().h("com/google/android/apps/messaging/multishare/editmessage/bottomcontent/composerow/attachments/DraftAttachmentUiAdapterImpl$removeAttachment$1", "invokeSuspend", 126, "DraftAttachmentUiAdapterImpl.kt")).t("Removing from vCardFlowCache for %s", obj2);
            this.a.f.remove(((doyd) obj2).b);
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ahwp(this.a, this.b, ffguVar);
    }
}
