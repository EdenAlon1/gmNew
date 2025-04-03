package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cupz {
    public static final entd a = entd.c("BugleSpam");
    private final ffbr b;
    private final errl c;

    public cupz(ffbr ffbrVar, errl errlVar) {
        this.b = ffbrVar;
        this.c = errlVar;
    }

    public final elfl a(MessageCoreData messageCoreData) {
        elfl c;
        String ar = messageCoreData.ar();
        if (messageCoreData == null || ar == null || ar.trim().isEmpty()) {
            ((ensz) ((ensz) a.j()).h("com/google/android/apps/messaging/shared/util/spam/hades/MoiraiPrechecker", "allowedToRun", 34, "MoiraiPrechecker.java")).q("Null or empty message for moirai check, skipping.");
            return elfo.e(false);
        }
        if (!messageCoreData.cI()) {
            ((ensz) ((ensz) a.e()).h("com/google/android/apps/messaging/shared/util/spam/hades/MoiraiPrechecker", "allowedToRun", 39, "MoiraiPrechecker.java")).q("Non-incoming message for moirai check, skipping.");
            return elfo.e(false);
        }
        cubw cubwVar = (cubw) this.b.b();
        c = axol.c(cubwVar.e, ffhe.a, ffsm.a, new cubv(cubwVar, messageCoreData, null));
        return c.h(new emwl() { // from class: cupy
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                culu culuVar = (culu) obj;
                entd entdVar = cupz.a;
                boolean z = false;
                if (culuVar == null) {
                    return false;
                }
                if (!culuVar.a) {
                    ((ensz) ((ensz) cupz.a.e()).h("com/google/android/apps/messaging/shared/util/spam/hades/MoiraiPrechecker", "allowedToRun", 59, "MoiraiPrechecker.java")).q("Spam protection off, skipping moirai check.");
                } else if (culuVar.b) {
                    ((ensz) ((ensz) cupz.a.e()).h("com/google/android/apps/messaging/shared/util/spam/hades/MoiraiPrechecker", "allowedToRun", 64, "MoiraiPrechecker.java")).q("Message from contact, skipping moirai check.");
                } else if (culuVar.f) {
                    ((ensz) ((ensz) cupz.a.e()).h("com/google/android/apps/messaging/shared/util/spam/hades/MoiraiPrechecker", "allowedToRun", 69, "MoiraiPrechecker.java")).q("Message from rbm bot, skipping moirai check.");
                } else {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        }, this.c);
    }
}
