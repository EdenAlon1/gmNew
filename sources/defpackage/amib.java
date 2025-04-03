package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.DefaultConversation;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Duration;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amib implements amii {
    public final ffbr c;
    public final ffbr d;
    public final ffbr e;
    public final Object f = new Object();
    public Instant g = Instant.EPOCH;
    private final errl i;
    public static final entd a = entd.c("BugleConversation");
    private static final cqor h = new cqoq("BugleConversationUnlatcher::unlatchConversation");
    public static final Duration b = Duration.ofMinutes(2);

    public amib(errl errlVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3) {
        this.i = errlVar;
        this.c = ffbrVar;
        this.d = ffbrVar2;
        this.e = ffbrVar3;
    }

    @Override // defpackage.amii
    public final elfl a(final BugleConversationId bugleConversationId) {
        ekzz a2 = h.a();
        try {
            BugleConversation H = ((amhs) this.c.b()).H(bugleConversationId, false);
            final aqge aqgeVar = ((DefaultConversation) H).f;
            final aqge aqgeVar2 = ((DefaultConversation) H).d;
            ensz enszVar = (ensz) a.h();
            enszVar.Y(csux.q, bugleConversationId);
            ((ensz) enszVar.h("com/google/android/apps/messaging/shared/api/messaging/conversation/bugle/BugleConversationUnlatcher", "attemptUnlatchingConversation", 85, "BugleConversationUnlatcher.java")).q("Unlatcher: Checking if conversation needs unlatching.");
            elfl i = elfo.h(new erog() { // from class: amhz
                @Override // defpackage.erog
                public final ListenableFuture a() {
                    entd entdVar = amib.a;
                    elfl b2 = aqgeVar.b();
                    final BugleConversationId bugleConversationId2 = BugleConversationId.this;
                    return b2.h(new emwl() { // from class: amhv
                        @Override // defpackage.emwl
                        public final Object apply(Object obj) {
                            amfx amfxVar = (amfx) obj;
                            entd entdVar2 = amib.a;
                            boolean u = amfxVar.u();
                            BugleConversationId bugleConversationId3 = BugleConversationId.this;
                            if (u) {
                                ensz enszVar2 = (ensz) amib.a.j();
                                enszVar2.Y(csux.q, bugleConversationId3);
                                ((ensz) enszVar2.h("com/google/android/apps/messaging/shared/api/messaging/conversation/bugle/BugleConversationUnlatcher", "isConversationLatched", 123, "BugleConversationUnlatcher.java")).q("Unlatcher: Ignoring deleted conversation.");
                                return false;
                            }
                            if (amfxVar.v() != 0) {
                                ensz enszVar3 = (ensz) amib.a.h();
                                enszVar3.Y(csux.q, bugleConversationId3);
                                ((ensz) enszVar3.h("com/google/android/apps/messaging/shared/api/messaging/conversation/bugle/BugleConversationUnlatcher", "isConversationLatched", 131, "BugleConversationUnlatcher.java")).t("Unlatcher: Ignoring conversation type %s.", byyr.a(amfxVar.v()));
                                return false;
                            }
                            if (amfxVar.E() == eoxn.SEND_MODE_XMS_LATCH) {
                                return true;
                            }
                            ensz enszVar4 = (ensz) amib.a.h();
                            enszVar4.Y(csux.q, bugleConversationId3);
                            ((ensz) enszVar4.h("com/google/android/apps/messaging/shared/api/messaging/conversation/bugle/BugleConversationUnlatcher", "isConversationLatched", 141, "BugleConversationUnlatcher.java")).t("Unlatcher: Ignoring unlatched conversation. SendMode: %s.", amfxVar.E());
                            return false;
                        }
                    }, erpp.a);
                }
            }, this.i).i(new eroh() { // from class: amia
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    if (!((Boolean) obj).booleanValue()) {
                        return elfo.e(null);
                    }
                    aqge aqgeVar3 = aqgeVar2;
                    final BugleConversationId bugleConversationId2 = bugleConversationId;
                    final amib amibVar = amib.this;
                    return aqgeVar3.b().i(new eroh() { // from class: amhy
                        @Override // defpackage.eroh
                        public final ListenableFuture a(Object obj2) {
                            engw engwVar = (engw) obj2;
                            emxf.l(engwVar.size() == 1);
                            final ResolvedRecipient resolvedRecipient = (ResolvedRecipient) engwVar.get(0);
                            elfl b2 = resolvedRecipient.E(2).b();
                            final BugleConversationId bugleConversationId3 = bugleConversationId2;
                            final amib amibVar2 = amib.this;
                            return b2.i(new eroh() { // from class: amht
                                @Override // defpackage.eroh
                                public final ListenableFuture a(Object obj3) {
                                    boolean z;
                                    aqpf aqpfVar = (aqpf) obj3;
                                    boolean p = aqpfVar.p();
                                    final BugleConversationId bugleConversationId4 = bugleConversationId3;
                                    if (!p) {
                                        ensz enszVar2 = (ensz) amib.a.h();
                                        enszVar2.Y(csux.q, bugleConversationId4);
                                        ((ensz) enszVar2.h("com/google/android/apps/messaging/shared/api/messaging/conversation/bugle/BugleConversationUnlatcher", "attemptUnlatch", 171, "BugleConversationUnlatcher.java")).t("Unlatcher: Returning since Recipient does not have RCS capabilities. Recipient Capabilities: %s.", aqpfVar);
                                        return elfo.e(null);
                                    }
                                    final amib amibVar3 = amib.this;
                                    Instant f = ((cqoh) amibVar3.e.b()).f();
                                    synchronized (amibVar3.f) {
                                        z = Duration.between(amibVar3.g, f).compareTo(amib.b) >= 0;
                                        if (z) {
                                            amibVar3.g = f;
                                        }
                                    }
                                    if (!z) {
                                        ensz enszVar3 = (ensz) amib.a.h();
                                        enszVar3.Y(csux.q, bugleConversationId4);
                                        ((ensz) enszVar3.h("com/google/android/apps/messaging/shared/api/messaging/conversation/bugle/BugleConversationUnlatcher", "attemptUnlatch", 182, "BugleConversationUnlatcher.java")).q("Unlatcher: Skipping Recipient online status check due to rate limiting. Conversation will remain latched.");
                                        return elfo.e(null);
                                    }
                                    ResolvedRecipient resolvedRecipient2 = resolvedRecipient;
                                    ensz enszVar4 = (ensz) amib.a.h();
                                    enszVar4.Y(csux.q, bugleConversationId4);
                                    ((ensz) enszVar4.h("com/google/android/apps/messaging/shared/api/messaging/conversation/bugle/BugleConversationUnlatcher", "attemptUnlatch", 191, "BugleConversationUnlatcher.java")).q("Unlatcher: Calling Recipient.isOnline().");
                                    return resolvedRecipient2.t().i(new eroh() { // from class: amhw
                                        @Override // defpackage.eroh
                                        public final ListenableFuture a(Object obj4) {
                                            if (!((Boolean) obj4).booleanValue()) {
                                                return elfo.e(null);
                                            }
                                            final BugleConversationId bugleConversationId5 = bugleConversationId4;
                                            final amib amibVar4 = amib.this;
                                            ensz enszVar5 = (ensz) amib.a.h();
                                            enszVar5.Y(csux.q, bugleConversationId5);
                                            ((ensz) enszVar5.h("com/google/android/apps/messaging/shared/api/messaging/conversation/bugle/BugleConversationUnlatcher", "attemptUnlatch", BasePaymentResult.ERROR_REQUEST_CONNECTION_FAILED, "BugleConversationUnlatcher.java")).q("Unlatcher: Unlatching conversation. Recipient is ONLINE.");
                                            return ((amhs) amibVar4.c.b()).J(bugleConversationId5, eoxn.SEND_MODE_AUTO).h(new emwl() { // from class: amhx
                                                @Override // defpackage.emwl
                                                public final Object apply(Object obj5) {
                                                    ((altk) amib.this.d.b()).ay(bugleConversationId5.a, 6);
                                                    return null;
                                                }
                                            }, erpp.a);
                                        }
                                    }, erpp.a);
                                }
                            }, erpp.a);
                        }
                    }, erpp.a).f(Throwable.class, new eroh() { // from class: amhu
                        @Override // defpackage.eroh
                        public final ListenableFuture a(Object obj2) {
                            ensz enszVar2 = (ensz) amib.a.j();
                            enszVar2.Y(csux.q, BugleConversationId.this);
                            ((ensz) ((ensz) enszVar2.g((Throwable) obj2)).h("com/google/android/apps/messaging/shared/api/messaging/conversation/bugle/BugleConversationUnlatcher", "attemptUnlatchingConversation", 100, "BugleConversationUnlatcher.java")).q("Unlatcher: Exception thrown while unlatching. Conversation will remain latched.");
                            return elfo.e(null);
                        }
                    }, erpp.a);
                }
            }, erpp.a);
            a2.b(i);
            a2.close();
            return i;
        } catch (Throwable th) {
            try {
                a2.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
