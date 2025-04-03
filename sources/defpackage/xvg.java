package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final /* synthetic */ class xvg extends ffkh implements ffjm {
    public xvg(Object obj) {
        super(2, obj, xvs.class, "onClick", "onClick(Ljava/util/List;I)V", 0);
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        List list = (List) obj;
        int intValue = ((Number) obj2).intValue();
        list.getClass();
        xvs xvsVar = (xvs) this.g;
        if (list.size() <= intValue) {
            throw new IllegalStateException("Clicked attachment position out of bounds.");
        }
        ensk g = xvs.a.g();
        g.Y(ente.a, "BugleComposeRow2");
        ((enrr) g.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/attachment/DraftAttachmentUiAdapterImpl", "onClick", 115, "DraftAttachmentUiAdapterImpl.kt")).w("Attachments onClick %d, %s", intValue, list);
        axol.k(xvsVar.c, null, new xvf(xvsVar, list, intValue, null), 3);
        return ffcu.a;
    }
}
