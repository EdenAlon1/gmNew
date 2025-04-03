package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class yzz extends ffhv implements ffjo {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    /* synthetic */ Object c;

    public yzz(ffgu ffguVar) {
        super(4, ffguVar);
    }

    @Override // defpackage.ffjo
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        yzz yzzVar = new yzz((ffgu) obj4);
        yzzVar.a = (engw) obj;
        yzzVar.b = (alxj) obj2;
        yzzVar.c = (engw) obj3;
        return yzzVar.b(ffcu.a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [alxj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Iterable, java.lang.Object] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ?? r13 = this.a;
        ?? r0 = this.b;
        ?? r1 = this.c;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : r1) {
            if (((amop) obj2).a == axcl.CONVERSATION_CLASSIFICATION_TYPE_PENPAL_SCAM) {
                arrayList.add(obj2);
            }
        }
        if (arrayList.size() > 1) {
            ensk i = zaa.a.i();
            i.Y(ente.a, "BugleSpam");
            ((enrr) i.h("com/google/android/apps/messaging/conversation2/bottomcontent/stickytoolstone/scam/PenpalScamAlertCardEligibilityCheckerImpl$isScamAlertCardEligible$5", "invokeSuspend", 99, "PenpalScamAlertCardEligibilityCheckerImpl.kt")).q("Penpal alert card found more than one classification for the conversation.");
        }
        if (arrayList.isEmpty()) {
            ensk g = zaa.a.g();
            g.Y(ente.a, "BugleSpam");
            ((enrr) g.h("com/google/android/apps/messaging/conversation2/bottomcontent/stickytoolstone/scam/PenpalScamAlertCardEligibilityCheckerImpl$isScamAlertCardEligible$5", "invokeSuspend", 105, "PenpalScamAlertCardEligibilityCheckerImpl.kt")).q("Penpal alert card not displayable because no scam classification was found.");
            return false;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : arrayList) {
            if (((amop) obj3).b == axcj.CONVERSATION_CLASSIFICATION_STATE_DISMISSED) {
                arrayList2.add(obj3);
            }
        }
        if (((amop) ffdx.M(arrayList2)) != null) {
            ensk g2 = zaa.a.g();
            g2.Y(ente.a, "BugleSpam");
            ((enrr) g2.h("com/google/android/apps/messaging/conversation2/bottomcontent/stickytoolstone/scam/PenpalScamAlertCardEligibilityCheckerImpl$isScamAlertCardEligible$5", "invokeSuspend", 117, "PenpalScamAlertCardEligibilityCheckerImpl.kt")).q("Penpal alert card not displayable because classification was dismissed.");
            return false;
        }
        if (r0.b() != alxi.ONE_ON_ONE) {
            ensk g3 = zaa.a.g();
            g3.Y(ente.a, "BugleSpam");
            ((enrr) g3.h("com/google/android/apps/messaging/conversation2/bottomcontent/stickytoolstone/scam/PenpalScamAlertCardEligibilityCheckerImpl$isScamAlertCardEligible$5", "invokeSuspend", 124, "PenpalScamAlertCardEligibilityCheckerImpl.kt")).q("Penpal alert card not displayable because conversation is not 1:1.");
            return false;
        }
        if (((Boolean) ((cfup) ctjd.bE.get()).e()).booleanValue() && (r0.g() == byyt.SPAM_FOLDER || r0.g() == byyt.BLOCKED_FOLDER)) {
            ensk g4 = zaa.a.g();
            g4.Y(ente.a, "BugleSpam");
            ((enrr) g4.h("com/google/android/apps/messaging/conversation2/bottomcontent/stickytoolstone/scam/PenpalScamAlertCardEligibilityCheckerImpl$isScamAlertCardEligible$5", "invokeSuspend", 135, "PenpalScamAlertCardEligibilityCheckerImpl.kt")).q("Penpal alert card not displayable because the conversation is in the spam folder.");
            return false;
        }
        ResolvedRecipient resolvedRecipient = (ResolvedRecipient) ffdx.M(r13);
        if (resolvedRecipient == null) {
            ensk g5 = zaa.a.g();
            g5.Y(ente.a, "BugleSpam");
            ((enrr) g5.h("com/google/android/apps/messaging/conversation2/bottomcontent/stickytoolstone/scam/PenpalScamAlertCardEligibilityCheckerImpl$isScamAlertCardEligible$5", "invokeSuspend", 145, "PenpalScamAlertCardEligibilityCheckerImpl.kt")).q("Penpal alert card not displayable because no recipient was found.");
            return false;
        }
        if (resolvedRecipient.A()) {
            ensk g6 = zaa.a.g();
            g6.Y(ente.a, "BugleSpam");
            ((enrr) g6.h("com/google/android/apps/messaging/conversation2/bottomcontent/stickytoolstone/scam/PenpalScamAlertCardEligibilityCheckerImpl$isScamAlertCardEligible$5", "invokeSuspend", 152, "PenpalScamAlertCardEligibilityCheckerImpl.kt")).q("Penpal alert card not displayable because recipient is a contact.");
            return false;
        }
        if (resolvedRecipient.z()) {
            ensk g7 = zaa.a.g();
            g7.Y(ente.a, "BugleSpam");
            ((enrr) g7.h("com/google/android/apps/messaging/conversation2/bottomcontent/stickytoolstone/scam/PenpalScamAlertCardEligibilityCheckerImpl$isScamAlertCardEligible$5", "invokeSuspend", 157, "PenpalScamAlertCardEligibilityCheckerImpl.kt")).q("Penpal alert card not displayable because recipient is blocked.");
            return false;
        }
        if (resolvedRecipient.H().c() || resolvedRecipient.H().d()) {
            ensk g8 = zaa.a.g();
            g8.Y(ente.a, "BugleSpam");
            ((enrr) g8.h("com/google/android/apps/messaging/conversation2/bottomcontent/stickytoolstone/scam/PenpalScamAlertCardEligibilityCheckerImpl$isScamAlertCardEligible$5", "invokeSuspend", 164, "PenpalScamAlertCardEligibilityCheckerImpl.kt")).q("Penpal alert card not displayable because recipient was marked as spam or not spam by the user.");
            return false;
        }
        if (cubn.a.a(resolvedRecipient.g())) {
            ensk g9 = zaa.a.g();
            g9.Y(ente.a, "BugleSpam");
            ((enrr) g9.h("com/google/android/apps/messaging/conversation2/bottomcontent/stickytoolstone/scam/PenpalScamAlertCardEligibilityCheckerImpl$isScamAlertCardEligible$5", "invokeSuspend", 173, "PenpalScamAlertCardEligibilityCheckerImpl.kt")).q("Penpal alert card not displayable because recipient is allowlisted.");
            return false;
        }
        ensk g10 = zaa.a.g();
        g10.Y(ente.a, "BugleSpam");
        ((enrr) g10.h("com/google/android/apps/messaging/conversation2/bottomcontent/stickytoolstone/scam/PenpalScamAlertCardEligibilityCheckerImpl$isScamAlertCardEligible$5", "invokeSuspend", 177, "PenpalScamAlertCardEligibilityCheckerImpl.kt")).q("Penpal alert card is displayable.");
        return true;
    }
}
