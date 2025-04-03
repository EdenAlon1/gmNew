package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class ciod implements erqj {
    final /* synthetic */ ciog a;

    public ciod(ciog ciogVar) {
        this.a = ciogVar;
    }

    @Override // defpackage.erqj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        List list = (List) obj;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.a.U((String) it.next());
        }
        this.a.U(null);
        if (list.isEmpty()) {
            return;
        }
        ciog ciogVar = this.a;
        int i = engw.d;
        ciogVar.Y(enou.a);
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        ((ensz) ((ensz) ((ensz) ciog.a.i()).g(th)).h("com/google/android/apps/messaging/shared/notification/BugleNotificationManagerImpl$1", "onFailure", (char) 297, "BugleNotificationManagerImpl.java")).q("Failed to get reminder notification reminder IDs");
    }
}
