package defpackage;

import android.net.Uri;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final /* synthetic */ class xvh extends ffkh implements ffjm {
    public xvh(Object obj) {
        super(2, obj, xvs.class, "onMagicEdit", "onMagicEdit(Ljava/util/List;I)V", 0);
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        drlh d;
        List list = (List) obj;
        int intValue = ((Number) obj2).intValue();
        list.getClass();
        xvs xvsVar = (xvs) this.g;
        ensk g = xvs.a.g();
        g.Y(ente.a, "BugleComposeRow2");
        ((enrr) g.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/attachment/DraftAttachmentUiAdapterImpl", "onMagicEdit", 136, "DraftAttachmentUiAdapterImpl.kt")).w("Attachments onMagicEdit %d, %s", intValue, list);
        xwb xwbVar = xvsVar.d;
        if (list.isEmpty() || intValue < 0 || intValue >= list.size()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        xhp xhpVar = (xhp) list.get(intValue);
        doxs b = xwc.b(xhpVar);
        if (b instanceof drlj) {
            xho xhoVar = xhpVar instanceof xho ? (xho) xhpVar : null;
            Uri uri = xhoVar != null ? xhoVar.b.c : null;
            if (uri == null) {
                d = drma.d((drlj) b, xwbVar.c, null);
                uri = Uri.parse(d.f());
            }
            xwbVar.b.h(new aimc(uri, Integer.valueOf(intValue)));
        } else {
            ((enrr) xwb.a.h().h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/attachment/DraftAttachmentViewer", "magicEdit", 73, "DraftAttachmentViewer.kt")).w("No-op for magicEdit() on position %d of %s", intValue, list);
        }
        return ffcu.a;
    }
}
