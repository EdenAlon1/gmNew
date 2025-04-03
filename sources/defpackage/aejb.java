package defpackage;

import java.util.HashSet;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aejb extends mr {
    private static final entd b = entd.c("Bugle");
    final Map a;

    public aejb(Map map) {
        this.a = map;
    }

    @Override // defpackage.mr
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        aely aelyVar = (aely) obj;
        aely aelyVar2 = (aely) obj2;
        HashSet hashSet = new HashSet();
        for (Map.Entry entry : ((enhk) this.a).entrySet()) {
            aemb aembVar = (aemb) entry.getKey();
            if (((aema) entry.getValue()).d(aelyVar, aelyVar2)) {
                hashSet.add(aembVar);
            }
        }
        if (!hashSet.isEmpty()) {
            ((ensz) ((ensz) b.h()).h("com/google/android/apps/messaging/home/list/DiffCallback", "getChangePayload", 61, "DiffCallback.java")).t("ConversationListViewParts to be rebound %s", hashSet);
        }
        return new aelt(enip.o(hashSet), false);
    }

    @Override // defpackage.mr
    public final /* synthetic */ boolean b(Object obj, Object obj2) {
        return ((aely) obj).equals((aely) obj2);
    }

    @Override // defpackage.mr
    public final /* bridge */ /* synthetic */ boolean c(Object obj, Object obj2) {
        return ((aely) obj).k().w().equals(((aely) obj2).k().w());
    }
}
