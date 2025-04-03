package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahwv implements ffji {
    final /* synthetic */ ahwz a;
    final /* synthetic */ List b;

    public ahwv(ahwz ahwzVar, List list) {
        this.a = ahwzVar;
        this.b = list;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        final xhp xhpVar = (xhp) this.b.get(((Number) obj).intValue());
        ((enrr) ahwz.a.g().h("com/google/android/apps/messaging/multishare/editmessage/bottomcontent/composerow/attachments/DraftAttachmentUiAdapterImpl", "onRemove", 93, "DraftAttachmentUiAdapterImpl.kt")).t("Attachments onRemove %s", xhpVar);
        ffji ffjiVar = new ffji() { // from class: ahwk
            @Override // defpackage.ffji
            public final Object invoke(Object obj2) {
                xhp xhpVar2 = (xhp) obj2;
                xhpVar2.getClass();
                return Boolean.valueOf(doxw.a(xhpVar2, xhp.this));
            }
        };
        ahwz ahwzVar = this.a;
        axol.k(ahwzVar.c, null, new ahwp(ahwzVar, ffjiVar, null), 3);
        return ffcu.a;
    }
}
