package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zaa implements yzu {
    public static final enru a = enru.c("com/google/android/apps/messaging/conversation2/bottomcontent/stickytoolstone/scam/PenpalScamAlertCardEligibilityCheckerImpl");
    private final ffsk b;
    private final ConversationId c;
    private final ffxx d;
    private final ffxx e;
    private final ffxx f;
    private final ffbr g;
    private final ffbr h;
    private final ffbr i;

    public zaa(ffsk ffskVar, ConversationId conversationId, ffxx ffxxVar, ffxx ffxxVar2, ffxx ffxxVar3, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3) {
        ffskVar.getClass();
        conversationId.getClass();
        ffxxVar.getClass();
        ffxxVar2.getClass();
        ffxxVar3.getClass();
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        this.b = ffskVar;
        this.c = conversationId;
        this.d = ffxxVar;
        this.e = ffxxVar2;
        this.f = ffxxVar3;
        this.g = ffbrVar;
        this.h = ffbrVar2;
        this.i = ffbrVar3;
    }

    @Override // defpackage.yzu
    public final fgdj a() {
        if (!((Boolean) ((cfup) ctjd.bD.get()).e()).booleanValue()) {
            ensk g = a.g();
            g.Y(ente.a, "BugleSpam");
            ((enrr) g.h("com/google/android/apps/messaging/conversation2/bottomcontent/stickytoolstone/scam/PenpalScamAlertCardEligibilityCheckerImpl", "isScamAlertCardEligible", 63, "PenpalScamAlertCardEligibilityCheckerImpl.kt")).q("Penpal alert card not displayable because flag is disabled.");
            return new axqf(new ffix() { // from class: yzv
                @Override // defpackage.ffix
                public final Object invoke() {
                    return false;
                }
            });
        }
        if (!((atfl) this.i.b()).a()) {
            ensk g2 = a.g();
            g2.Y(ente.a, "BugleSpam");
            ((enrr) g2.h("com/google/android/apps/messaging/conversation2/bottomcontent/stickytoolstone/scam/PenpalScamAlertCardEligibilityCheckerImpl", "isScamAlertCardEligible", 68, "PenpalScamAlertCardEligibilityCheckerImpl.kt")).q("Penpal alert card not displayable because alert card flag is disabled.");
            return new axqf(new ffix() { // from class: yzw
                @Override // defpackage.ffix
                public final Object invoke() {
                    return false;
                }
            });
        }
        if (!cufg.a() ? ((culz) this.g.b()).e() : ((culw) this.h.b()).e()) {
            ensk g3 = a.g();
            g3.Y(ente.a, "BugleSpam");
            ((enrr) g3.h("com/google/android/apps/messaging/conversation2/bottomcontent/stickytoolstone/scam/PenpalScamAlertCardEligibilityCheckerImpl", "isScamAlertCardEligible", 79, "PenpalScamAlertCardEligibilityCheckerImpl.kt")).q("Penpal alert card not displayable because spam protection is disabled.");
            return new axqf(new ffix() { // from class: yzx
                @Override // defpackage.ffix
                public final Object invoke() {
                    return false;
                }
            });
        }
        if (this.c instanceof BugleConversationId) {
            ffxx a2 = fgck.a(this.e, this.d, this.f, new yzz(null));
            ffsk ffskVar = this.b;
            int i = fgcz.a;
            return fgbn.b(a2, ffskVar, fgcy.b, false);
        }
        ensk g4 = a.g();
        g4.Y(ente.a, "BugleSpam");
        ((enrr) g4.h("com/google/android/apps/messaging/conversation2/bottomcontent/stickytoolstone/scam/PenpalScamAlertCardEligibilityCheckerImpl", "isScamAlertCardEligible", 84, "PenpalScamAlertCardEligibilityCheckerImpl.kt")).q("Penpal alert card not displayable because conversation is not a bugle conversation.");
        return new axqf(new ffix() { // from class: yzy
            @Override // defpackage.ffix
            public final Object invoke() {
                return false;
            }
        });
    }
}
