package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xtw extends ffhv implements ffjm {
    Object a;
    int b;
    final /* synthetic */ xuk c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xtw(xuk xukVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = xukVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((xtw) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        enrr enrrVar;
        Iterator it;
        ffhh ffhhVar = ffhh.a;
        int i = this.b;
        if (i != 0) {
            Iterator it2 = i != 1 ? this.a : this.a;
            ffci.b(obj);
            it = it2;
        } else {
            ffci.b(obj);
            xuk xukVar = this.c;
            enru enruVar = xuk.a;
            xhu a = xukVar.f.a(new ffji() { // from class: xtv
                @Override // defpackage.ffji
                public final Object invoke(Object obj2) {
                    xhu xhuVar = (xhu) obj2;
                    return xhuVar.b.isEmpty() ? xhuVar : xhu.c(xhuVar, null, ffel.a, null, false, null, null, false, 0, 1021);
                }
            });
            boolean isEmpty = a.b.isEmpty();
            if (isEmpty) {
                ensk e = xuk.a.e();
                e.Y(ente.a, "BugleComposeRow2");
                enrrVar = (enrr) e;
            } else {
                ensk g = xuk.a.g();
                g.Y(ente.a, "BugleComposeRow2");
                enrrVar = (enrr) g;
            }
            ((enrr) enrrVar.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/attachment/DraftAttachmentController$hugoDraftAttachmentsController$1$clearAttachments$1", "invokeSuspend", 547, "DraftAttachmentController.kt")).t("clearAttachments oldIsEmpty: %b", Boolean.valueOf(isEmpty));
            it = a.b.iterator();
        }
        while (it.hasNext()) {
            xhp xhpVar = (xhp) it.next();
            xuk xukVar2 = this.c;
            enru enruVar2 = xuk.a;
            if (((ersq) ((asxp) xukVar2.l).a.b()).a("bugle.clean_up_attachments_on_clear")) {
                xuk xukVar3 = this.c;
                this.a = it;
                this.b = 1;
                if (xukVar3.d(xhpVar, this) == ffhhVar) {
                    return ffhhVar;
                }
            } else {
                xuk xukVar4 = this.c;
                this.a = it;
                this.b = 2;
                if (xukVar4.f(xhpVar, this) == ffhhVar) {
                    return ffhhVar;
                }
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new xtw(this.c, ffguVar);
    }
}
