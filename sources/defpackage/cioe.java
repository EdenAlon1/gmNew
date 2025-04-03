package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cioe implements erqj {
    final /* synthetic */ String a;
    final /* synthetic */ ciog b;

    public cioe(ciog ciogVar, String str) {
        this.a = str;
        this.b = ciogVar;
    }

    @Override // defpackage.erqj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        List list = (List) obj;
        if (list.isEmpty()) {
            return;
        }
        String str = this.a;
        ciog ciogVar = this.b;
        ArrayList arrayList = new ArrayList(list);
        arrayList.remove(str);
        ciogVar.Y(arrayList);
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        ((ensz) ((ensz) ((ensz) ciog.a.i()).g(th)).h("com/google/android/apps/messaging/shared/notification/BugleNotificationManagerImpl$2", "onFailure", (char) 319, "BugleNotificationManagerImpl.java")).q("Failed to get reminder notification reminder IDs");
    }
}
