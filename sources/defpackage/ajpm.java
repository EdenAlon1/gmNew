package defpackage;

import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ajpm implements erqj {
    final /* synthetic */ ajpo a;

    public ajpm(ajpo ajpoVar) {
        this.a = ajpoVar;
    }

    @Override // defpackage.erqj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        List<String> list = (List) obj;
        if (list.isEmpty()) {
            return;
        }
        ajpo ajpoVar = this.a;
        List asList = Arrays.asList(ajpoVar.n());
        for (String str : list) {
            if (!asList.contains(str)) {
                ciog ciogVar = (ciog) ajpoVar.c;
                ciogVar.U(str);
                if (str != null) {
                    elfr.l(ciogVar.T(), new cioe(ciogVar, str), erpp.a);
                }
            }
        }
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        ((ensz) ((ensz) ((ensz) ajpo.a.i()).g(th)).h("com/google/android/apps/messaging/reminder/notification/ReminderNotification$1", "onFailure", (char) 142, "ReminderNotification.java")).q("Failed to get reminder notification reminder IDs");
    }
}
