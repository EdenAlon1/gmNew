package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xua extends ffhv implements ffjm {
    Object a;
    int b;
    final /* synthetic */ xuk c;
    final /* synthetic */ ffji d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xua(xuk xukVar, ffji ffjiVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = xukVar;
        this.d = ffjiVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((xua) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object obj2;
        ffhh ffhhVar = ffhh.a;
        if (this.b != 0) {
            obj2 = this.a;
            ffci.b(obj);
        } else {
            ffci.b(obj);
            final fflb fflbVar = new fflb();
            xuk xukVar = this.c;
            final ffji ffjiVar = this.d;
            xukVar.f.c(new ffji() { // from class: xtz
                @Override // defpackage.ffji
                public final Object invoke(Object obj3) {
                    xhu xhuVar = (xhu) obj3;
                    Iterator it = xhuVar.b.iterator();
                    int i = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i = -1;
                            break;
                        }
                        if (((Boolean) ffji.this.invoke(it.next())).booleanValue()) {
                            break;
                        }
                        i++;
                    }
                    if (i == -1) {
                        return xhuVar;
                    }
                    fflb fflbVar2 = fflbVar;
                    List am = ffdx.am(xhuVar.b);
                    fflbVar2.a = new ffes(i, am.remove(i));
                    return xhu.c(xhuVar, null, am, null, false, null, null, false, 0, 1021);
                }
            });
            if (fflbVar.a == null) {
                ensk j = xuk.a.j();
                j.Y(ente.a, "BugleComposeRow2");
                ((enrr) j.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/attachment/DraftAttachmentController$removeAttachment$1", "invokeSuspend", 347, "DraftAttachmentController.kt")).q("removeAttachment removed nothing");
                return ffcu.a;
            }
            ensk h = xuk.a.h();
            h.Y(ente.a, "BugleComposeRow2");
            ((enrr) h.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/attachment/DraftAttachmentController$removeAttachment$1", "invokeSuspend", 337, "DraftAttachmentController.kt")).t("removeAttachment removed: %s", fflbVar.a);
            xuk xukVar2 = this.c;
            xhp xhpVar = (xhp) ((ffes) fflbVar.a).b;
            this.a = fflbVar;
            this.b = 1;
            if (xukVar2.d(xhpVar, this) == ffhhVar) {
                return ffhhVar;
            }
            obj2 = fflbVar;
        }
        if (this.c.p.a()) {
            xfv xfvVar = (xfv) this.c.q.b();
            ffes ffesVar = (ffes) ((fflb) obj2).a;
            xfvVar.d((xhp) ffesVar.b, ffesVar.a);
        } else {
            xgb xgbVar = (xgb) this.c.o.b();
            ffes ffesVar2 = (ffes) ((fflb) obj2).a;
            xhp xhpVar2 = (xhp) ffesVar2.b;
            int i = ffesVar2.a;
            xhpVar2.getClass();
            axol.k(xgbVar.b, null, new xga(xgbVar, xhpVar2, i, null), 3);
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new xua(this.c, this.d, ffguVar);
    }
}
