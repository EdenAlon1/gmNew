package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xuc extends ffhv implements ffjm {
    int a;
    final /* synthetic */ xuk b;
    final /* synthetic */ ffji c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xuc(xuk xukVar, ffji ffjiVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = xukVar;
        this.c = ffjiVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((xuc) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            final fflb fflbVar = new fflb();
            xuk xukVar = this.b;
            final ffji ffjiVar = this.c;
            xukVar.f.b(new ffji() { // from class: xub
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
            if (xhpVar != null) {
                ensk h = xuk.a.h();
                h.Y(ente.a, "BugleComposeRow2");
                ((enrr) h.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/attachment/DraftAttachmentController$removeAttachmentWithoutLogging$1", "invokeSuspend", 372, "DraftAttachmentController.kt")).t("removeAttachment removed: %s", xhpVar);
                xuk xukVar2 = this.b;
                this.a = 1;
                if (xukVar2.d(xhpVar, this) == ffhhVar) {
                    return ffhhVar;
                }
            } else {
                ensk j = xuk.a.j();
                j.Y(ente.a, "BugleComposeRow2");
                ((enrr) j.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/attachment/DraftAttachmentController$removeAttachmentWithoutLogging$1", "invokeSuspend", 375, "DraftAttachmentController.kt")).q("removeAttachment removed nothing");
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new xuc(this.b, this.c, ffguVar);
    }
}
