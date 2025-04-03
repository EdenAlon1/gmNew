package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zsa implements ffxy {
    final /* synthetic */ zsg a;

    public zsa(zsg zsgVar) {
        this.a = zsgVar;
    }

    @Override // defpackage.ffxy
    public final /* bridge */ /* synthetic */ Object fQ(Object obj, ffgu ffguVar) {
        ((Boolean) obj).booleanValue();
        ((enrr) zsg.a.h().h("com/google/android/apps/messaging/conversation2/messagelist/message/MessageUiDataPreloaderImpl$1$4", "emit", 88, "MessageUiDataPreloaderImpl.kt")).r("MessageUiDataPreloader: Screen is idle kicking off preloading of %s lazy messages", this.a.c.size());
        Set set = this.a.c;
        set.getClass();
        enip f = engq.f(set);
        enqu listIterator = f.listIterator();
        listIterator.getClass();
        while (listIterator.hasNext()) {
            zrn zrnVar = (zrn) listIterator.next();
            if (zrnVar.a.b()) {
                ((enrr) zsg.a.e().h("com/google/android/apps/messaging/conversation2/messagelist/message/MessageUiDataPreloaderImpl$1$4", "emit", 103, "MessageUiDataPreloaderImpl.kt")).t("MessageUiDataPreloader: %s Already loaded.", ((zqy) zrnVar.b().b()).b());
            } else {
                ((enrr) zsg.a.e().h("com/google/android/apps/messaging/conversation2/messagelist/message/MessageUiDataPreloaderImpl$1$4", "emit", 99, "MessageUiDataPreloaderImpl.kt")).t("MessageUiDataPreloader: %s Finished loading.", ((zqy) zrnVar.b().b()).b());
            }
        }
        this.a.c.removeAll(f);
        return ffcu.a;
    }
}
