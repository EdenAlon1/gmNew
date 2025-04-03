package defpackage;

import android.net.Uri;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final /* synthetic */ class aado extends ffkh implements ffjo {
    public aado(Object obj) {
        super(4, obj, aaee.class, "openImage", "openImage(Lcom/google/android/apps/messaging/shared/api/messaging/Message;Ljava/util/List;Landroid/net/Uri;Ljava/lang/String;)V", 0);
    }

    @Override // defpackage.ffjo
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        alxr alxrVar = (alxr) obj;
        List list = (List) obj2;
        Uri uri = (Uri) obj3;
        String str = (String) obj4;
        alxrVar.getClass();
        list.getClass();
        uri.getClass();
        aaee aaeeVar = (aaee) this.g;
        ensk h = aaee.a.h();
        h.Y(ente.a, "BugleImage");
        ((enrr) h.h("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/image/ImageBubbleUiAdapter", "openImage", 584, "ImageBubbleUiAdapter.kt")).t("Opening media viewer with uri: %s", cskw.a(uri));
        if (aaeeVar.i.a()) {
            ((dsqt) aaeeVar.j.b()).b(((akld) aaeeVar.q.a()).a(list, list.indexOf(alxrVar)));
        } else {
            axol.k(aaeeVar.c, null, new aaeb(aaeeVar, uri, str, null), 3);
        }
        return ffcu.a;
    }
}
