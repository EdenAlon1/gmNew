package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xvn implements ffji {
    final /* synthetic */ xvs a;
    final /* synthetic */ List b;

    public xvn(xvs xvsVar, List list) {
        this.a = xvsVar;
        this.b = list;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        final xhp xhpVar = (xhp) this.b.get(((Number) obj).intValue());
        ensk g = xvs.a.g();
        g.Y(ente.a, "BugleComposeRow2");
        ((enrr) g.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/attachment/DraftAttachmentUiAdapterImpl", "onRemove", 141, "DraftAttachmentUiAdapterImpl.kt")).t("Attachments onRemove %s", xhpVar);
        xvs xvsVar = this.a;
        if (xvsVar.h.a()) {
            ((xfv) xvsVar.i.b()).e(xhpVar.a(), 2);
        }
        xvsVar.f.h(new ffji() { // from class: xvb
            @Override // defpackage.ffji
            public final Object invoke(Object obj2) {
                xhp xhpVar2 = (xhp) obj2;
                xhpVar2.getClass();
                return Boolean.valueOf(doxw.a(xhpVar2, xhp.this));
            }
        });
        return ffcu.a;
    }
}
