package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cwdf {
    public static final boolean a(List list) {
        if (list.size() == 1) {
            return false;
        }
        Iterator it = list.iterator();
        boolean z = true;
        boolean z2 = true;
        while (it.hasNext()) {
            aqpf aqpfVar = (aqpf) it.next();
            z = z && aqpfVar.p();
            z2 = z2 && aqpfVar.q();
        }
        return z && z2;
    }

    public static final void b(List list) {
        boolean z = false;
        boolean z2 = true;
        if (list.size() == 1) {
            aqpf aqpfVar = (aqpf) list.get(0);
            ensk h = cwdp.a.h();
            h.Y(ente.a, "BugleContacts");
            ((enrr) h.h("com/google/android/apps/messaging/startchat/starter/ChatStarterImpl$Companion", "log", 337, "ChatStarterImpl.kt")).t("Opening a 1-1 conversation, rcsEnabledCap: %b", Boolean.valueOf(aqpfVar.p()));
            return;
        }
        Iterator it = list.iterator();
        boolean z3 = true;
        boolean z4 = true;
        while (it.hasNext()) {
            aqpf aqpfVar2 = (aqpf) it.next();
            z3 = z3 && aqpfVar2.p();
            z4 = z4 && aqpfVar2.q();
        }
        if (z3) {
            if (z4) {
                ensk h2 = cwdp.a.h();
                h2.Y(ente.a, "BugleContacts");
                ((enrr) h2.h("com/google/android/apps/messaging/startchat/starter/ChatStarterImpl$Companion", "log", 305, "ChatStarterImpl.kt")).q("attempting the creation of an RCS group");
                z4 = true;
                ensk h3 = cwdp.a.h();
                h3.Y(ente.a, "BugleContacts");
                ((enrr) h3.h("com/google/android/apps/messaging/startchat/starter/ChatStarterImpl$Companion", "log", 311, "ChatStarterImpl.kt")).J("othersCount: %d, othersRcsCapable: %b, othersGroupRcsCapable: %b", Integer.valueOf(list.size()), Boolean.valueOf(z2), Boolean.valueOf(z4));
            }
            z4 = false;
            z = true;
        }
        ensk h4 = cwdp.a.h();
        h4.Y(ente.a, "BugleContacts");
        ((enrr) h4.h("com/google/android/apps/messaging/startchat/starter/ChatStarterImpl$Companion", "log", 307, "ChatStarterImpl.kt")).q("attempting the creation of an MMS group");
        z2 = z;
        ensk h32 = cwdp.a.h();
        h32.Y(ente.a, "BugleContacts");
        ((enrr) h32.h("com/google/android/apps/messaging/startchat/starter/ChatStarterImpl$Companion", "log", 311, "ChatStarterImpl.kt")).J("othersCount: %d, othersRcsCapable: %b, othersGroupRcsCapable: %b", Integer.valueOf(list.size()), Boolean.valueOf(z2), Boolean.valueOf(z4));
    }
}
