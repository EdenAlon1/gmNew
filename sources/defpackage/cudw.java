package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.api.messaging.Conversation;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cudw implements cudn {
    private static final enru b = enru.c("com/google/android/apps/messaging/shared/util/spam/a2p/ChatbotSubscriptionManagerImpl");
    public final Context a;
    private final ffsk c;
    private final ffbr d;
    private final ffbr e;
    private final ffbr f;
    private final ffbr g;

    public cudw(Context context, ffsk ffskVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4) {
        context.getClass();
        ffskVar.getClass();
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        ffbrVar4.getClass();
        this.a = context;
        this.c = ffskVar;
        this.d = ffbrVar;
        this.e = ffbrVar2;
        this.f = ffbrVar3;
        this.g = ffbrVar4;
    }

    private final cuef h(cuff cuffVar) {
        int ordinal = cuffVar.ordinal();
        if (ordinal == 0) {
            return cuef.CONVERSATION_SUBSCRIPTION_STATE_UNSPECIFIED;
        }
        if (ordinal == 1) {
            return cuef.SUBSCRIBE_SENT;
        }
        if (ordinal == 2) {
            return cuef.UNSUBSCRIBE_SENT;
        }
        if (ordinal == 3) {
            return cuef.UNRECOGNIZED;
        }
        throw new ffcd();
    }

    private final cuen i(cuff cuffVar) {
        int ordinal = cuffVar.ordinal();
        if (ordinal == 0) {
            return cuen.CONVERSATION_TOOLSTONE_STATE_UNSPECIFIED;
        }
        if (ordinal == 1) {
            return cuen.HIDE;
        }
        if (ordinal == 2) {
            return cuen.HIDE;
        }
        if (ordinal == 3) {
            return cuen.UNRECOGNIZED;
        }
        throw new ffcd();
    }

    private static final boolean j(ResolvedRecipient resolvedRecipient, alxj alxjVar) {
        return resolvedRecipient.g().B() && alxjVar.b() == alxi.RBM;
    }

    @Override // defpackage.cudn
    public final elfl a(Conversation conversation) {
        elfl c;
        c = axol.c(this.c, ffhe.a, ffsm.a, new cudt(this, conversation, null));
        return c;
    }

    @Override // defpackage.cudn
    public final elfl b(Conversation conversation, cuex cuexVar, String str, cuea cueaVar) {
        elfl c;
        cuexVar.getClass();
        c = axol.c(this.c, ffhe.a, ffsm.a, new cudv(this, conversation, cuexVar, str, cueaVar, null));
        return c;
    }

    @Override // defpackage.cudn
    public final cuef c(cuff cuffVar) {
        cuffVar.getClass();
        return h(cuffVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.cuff r7, com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r8, defpackage.alxj r9, defpackage.cuex r10, java.lang.String r11, defpackage.ffgu r12) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cudw.d(cuff, com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient, alxj, cuex, java.lang.String, ffgu):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x011e, code lost:
    
        if (defpackage.fgfz.c(r0, r2) == r3) goto L59;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.cuff r21, com.google.android.apps.messaging.shared.api.messaging.Conversation r22, com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r23, defpackage.alxj r24, defpackage.ffgu r25) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cudw.e(cuff, com.google.android.apps.messaging.shared.api.messaging.Conversation, com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient, alxj, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x016e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(com.google.android.apps.messaging.shared.api.messaging.Conversation r12, defpackage.ffgu r13) {
        /*
            Method dump skipped, instructions count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cudw.f(com.google.android.apps.messaging.shared.api.messaging.Conversation, ffgu):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x019e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01f3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01f4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(com.google.android.apps.messaging.shared.api.messaging.Conversation r19, defpackage.cuex r20, java.lang.String r21, defpackage.cuea r22, defpackage.ffgu r23) {
        /*
            Method dump skipped, instructions count: 513
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cudw.g(com.google.android.apps.messaging.shared.api.messaging.Conversation, cuex, java.lang.String, cuea, ffgu):java.lang.Object");
    }
}
