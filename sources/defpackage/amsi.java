package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.api.messaging.Conversation;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation;
import com.google.android.apps.messaging.shared.api.messaging.conversation.emergencysos.EmergencySosConversation;
import com.google.android.apps.messaging.shared.api.messaging.conversation.emergencysos.EmergencySosConversationId;
import com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.EnumSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amsi implements amev {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/api/messaging/conversation/emergencysos/EmergencySosConversationRepository");
    public static final Set b = EnumSet.of(cnuh.SESSION_STATUS_OFF, cnuh.SESSION_STATUS_DISABLING, cnuh.SESSION_STATUS_ENDING_EMERGENCY);
    public final amry c;
    public final errl d;
    public final ffbr e;
    public final ffbr f;
    public final ffbr g;
    public final ffbr h;
    private final ffbr i;
    private final ffbr j;

    public amsi(amry amryVar, errl errlVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6) {
        this.c = amryVar;
        this.d = errlVar;
        this.e = ffbrVar;
        this.i = ffbrVar2;
        this.f = ffbrVar3;
        this.j = ffbrVar4;
        this.g = ffbrVar5;
        this.h = ffbrVar6;
    }

    @Override // defpackage.alxl
    public final elfl A(ConversationId conversationId, Uri uri) {
        return elfo.d(new UnsupportedOperationException("Icon update not supported for emergency sos conversations"));
    }

    @Override // defpackage.alxl
    public final elfl B(ConversationId conversationId) {
        return elfo.d(new UnsupportedOperationException("upgradeConversation not supported for emergency sos conversations"));
    }

    @Override // defpackage.alxl
    public final elfl C(ConversationId conversationId, eoko eokoVar) {
        ekzz f = eleg.f("EmergencySosConversationRepository#deleteConversation");
        try {
            emxf.a(conversationId instanceof EmergencySosConversationId);
            elfl C = ((amhs) this.g.b()).C(((EmergencySosConversationId) conversationId).b, eokoVar);
            f.close();
            return C;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.alxl
    public final aqge D(int i) {
        return ((amhs) this.g.b()).D(i);
    }

    @Override // defpackage.alxl
    public final elfl E(engw engwVar, int i) {
        return elfo.d(new UnsupportedOperationException("markConversationsAsRead not supported for emergency sos conversations"));
    }

    @Override // defpackage.alxl
    public final elfl F(engw engwVar, int i) {
        return elfo.d(new UnsupportedOperationException("markConversationsAsUnread not supported for emergency sos conversations"));
    }

    @Override // defpackage.amev
    public final ConversationId G(amwl amwlVar) {
        amwk b2 = amwk.b(amwlVar.b);
        if (b2 == null) {
            b2 = amwk.UNRECOGNIZED;
        }
        emxf.a(b2 == amwk.SATELLITE);
        return new EmergencySosConversationId(bdgq.b(amwlVar.c));
    }

    public final elfl H(final engw engwVar, final String str, final boolean z) {
        return ((cnni) this.i.b()).a().i(new eroh() { // from class: amsg
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                return ((amhs) amsi.this.g.b()).k(engwVar, str);
            }
        }, this.d).i(new eroh() { // from class: amsh
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                elfl c;
                Conversation conversation = (Conversation) obj;
                amsi amsiVar = amsi.this;
                cnsb cnsbVar = (cnsb) amsiVar.e.b();
                c = axol.c(cnsbVar.d, ffhe.a, ffsm.a, new cnsa(cnsbVar, null));
                axnw.f(c, "Failed to schedule questionnaire retrieval in PWQ.");
                if (z) {
                    axnw.f(((amhs) amsiVar.g.b()).I(conversation.d(), 9), "Failed to disable emergency sos conversation.");
                }
                return elfo.e(amsiVar.c.a((BugleConversation) conversation));
            }
        }, this.d);
    }

    public final boolean I(aoku aokuVar, boolean z) {
        return (z ? ((aolr) this.j.b()).m() : ((aolr) this.j.b()).l()).equals(aokuVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [com.google.android.apps.messaging.shared.api.messaging.Conversation, com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation] */
    @Override // defpackage.alxl
    public final Conversation a(ConversationId conversationId, alxk alxkVar) {
        ekzz f = eleg.f("EmergencySosConversationRepository#openConversation");
        try {
            emxf.a(conversationId instanceof EmergencySosConversationId);
            EmergencySosConversation a2 = this.c.a(((amhs) this.g.b()).a(((EmergencySosConversationId) conversationId).b, alxkVar));
            axnw.f(((cnvc) this.f.b()).a(), "Failed to update satellite session status.");
            f.close();
            return a2;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.alxl
    public final /* synthetic */ ConversationId b(amwl amwlVar) {
        return ameu.a();
    }

    @Override // defpackage.alxl
    public final /* synthetic */ ConversationId c(byte[] bArr) {
        return ameu.b();
    }

    @Override // defpackage.alxl
    public final aqge d(ConversationId conversationId) {
        throw new UnsupportedOperationException("Not implemented for Satellite");
    }

    @Override // defpackage.alxl
    public final elfl e(ConversationId conversationId, eoko eokoVar) {
        emxf.a(conversationId instanceof EmergencySosConversationId);
        return ((amhs) this.g.b()).e(((EmergencySosConversationId) conversationId).b, eokoVar);
    }

    @Override // defpackage.alxl
    public final elfl f(ConversationId conversationId) {
        return ((amhs) this.g.b()).f(((EmergencySosConversationId) conversationId).b);
    }

    @Override // defpackage.alxl
    public final elfl g(anvc anvcVar) {
        return elfo.d(new UnsupportedOperationException("Find conversation not supported for emergency sos conversations"));
    }

    @Override // defpackage.alxl
    public final elfl h(azcr azcrVar) {
        return elfo.d(new UnsupportedOperationException("Find conversation not supported for emergency sos conversations"));
    }

    @Override // defpackage.alxl
    public final elfl i(engw engwVar) {
        return elfo.d(new UnsupportedOperationException("Find conversation not supported for emergency sos conversations"));
    }

    @Override // defpackage.alxl
    public final elfl j() {
        int i = engw.d;
        return elfo.e(enou.a);
    }

    @Override // defpackage.alxl
    public final elfl k(engw engwVar, String str) {
        return m(Optional.empty(), engwVar, str);
    }

    @Override // defpackage.alxl
    public final elfl l(azcr azcrVar, aqux aquxVar, amer amerVar) {
        return elfo.d(new UnsupportedOperationException("getOrCreateConversation by destination unsupported for emergency sos conversations"));
    }

    @Override // defpackage.alxl
    public final elfl m(Optional optional, final engw engwVar, final String str) {
        elfl i;
        ekzz f = eleg.f("EmergencySosConversationRepository#getOrCreateConversation");
        try {
            if (engwVar.isEmpty()) {
                ensk j = a.j();
                j.Y(ente.a, "BugleSatellite");
                ((enrr) ((enrr) j).h("com/google/android/apps/messaging/shared/api/messaging/conversation/emergencysos/EmergencySosConversationRepository", "getOrCreateConversation", 125, "EmergencySosConversationRepository.java")).q("Unable to getOrCreateConversation: Empty recipient list.");
                i = elfo.d(new IllegalArgumentException("Unable to getOrCreateConversation: Empty recipient list."));
            } else {
                boolean z = true;
                if (engwVar.size() != 1 || !((Recipient) engwVar.get(0)).g().C()) {
                    z = false;
                }
                emxf.b(z, "Only one Satellite recipient is supported.");
                ensk h = a.h();
                h.Y(ente.a, "BugleSatellite");
                enrr enrrVar = (enrr) h;
                enrrVar.Y(csux.C, ((Recipient) engwVar.get(0)).g());
                ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/api/messaging/conversation/emergencysos/EmergencySosConversationRepository", "getOrCreateConversation", 136, "EmergencySosConversationRepository.java")).q("Processing getOrCreate for emergency conversation.");
                i = ((cnvc) this.f.b()).a().i(new eroh() { // from class: amsf
                    /* JADX WARN: Code restructure failed: missing block: B:22:0x009e, code lost:
                    
                        if (r0.contains(r9) != false) goto L38;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c9, code lost:
                    
                        if (r9 == defpackage.cnuh.SESSION_STATUS_DISABLING) goto L38;
                     */
                    @Override // defpackage.eroh
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final com.google.common.util.concurrent.ListenableFuture a(java.lang.Object r9) {
                        /*
                            r8 = this;
                            cnui r9 = (defpackage.cnui) r9
                            int r0 = r9.c
                            cnuh r0 = defpackage.cnuh.b(r0)
                            if (r0 != 0) goto Lc
                            cnuh r0 = defpackage.cnuh.UNRECOGNIZED
                        Lc:
                            java.lang.String r1 = r3
                            engw r2 = r2
                            amsi r3 = defpackage.amsi.this
                            cnuh r4 = defpackage.cnuh.SESSION_STATUS_DEMO
                            r5 = 1
                            r6 = 0
                            if (r0 == r4) goto L70
                            java.lang.Object r0 = r2.get(r6)
                            com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient r0 = (com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient) r0
                            aoku r0 = r0.g()
                            boolean r0 = r3.I(r0, r5)
                            if (r0 == 0) goto L70
                            enru r0 = defpackage.amsi.a
                            ensk r0 = r0.j()
                            ensn r4 = defpackage.ente.a
                            java.lang.String r5 = "BugleSatellite"
                            r0.Y(r4, r5)
                            enrr r0 = (defpackage.enrr) r0
                            java.lang.String r4 = "getOrCreateConversation"
                            r5 = 150(0x96, float:2.1E-43)
                            java.lang.String r6 = "com/google/android/apps/messaging/shared/api/messaging/conversation/emergencysos/EmergencySosConversationRepository"
                            java.lang.String r7 = "EmergencySosConversationRepository.java"
                            ensk r0 = r0.h(r6, r4, r5, r7)
                            enrr r0 = (defpackage.enrr) r0
                            int r9 = r9.c
                            cnuh r9 = defpackage.cnuh.b(r9)
                            if (r9 != 0) goto L4f
                            cnuh r9 = defpackage.cnuh.UNRECOGNIZED
                        L4f:
                            java.lang.String r4 = "Invalid session status [%s] for creating demo conversation, trying syncing session status with Stargate"
                            java.lang.String r9 = r9.name()
                            r0.t(r4, r9)
                            ffbr r9 = r3.f
                            java.lang.Object r9 = r9.b()
                            cnvc r9 = (defpackage.cnvc) r9
                            elfl r9 = r9.b()
                            amse r0 = new amse
                            r0.<init>()
                            errl r1 = r3.d
                            elfl r9 = r9.i(r0, r1)
                            return r9
                        L70:
                            ffbr r0 = r3.h
                            java.lang.Object r0 = r0.b()
                            asll r0 = (defpackage.asll) r0
                            boolean r0 = r0.a()
                            if (r0 == 0) goto La1
                            java.lang.Object r0 = r2.get(r6)
                            com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient r0 = (com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient) r0
                            aoku r0 = r0.g()
                            boolean r0 = r3.I(r0, r6)
                            if (r0 == 0) goto Lcc
                            java.util.Set r0 = defpackage.amsi.b
                            int r9 = r9.c
                            cnuh r9 = defpackage.cnuh.b(r9)
                            if (r9 != 0) goto L9a
                            cnuh r9 = defpackage.cnuh.UNRECOGNIZED
                        L9a:
                            boolean r9 = r0.contains(r9)
                            if (r9 == 0) goto Lcc
                            goto Lcd
                        La1:
                            java.lang.Object r0 = r2.get(r6)
                            com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient r0 = (com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient) r0
                            aoku r0 = r0.g()
                            boolean r0 = r3.I(r0, r6)
                            if (r0 == 0) goto Lcc
                            int r9 = r9.c
                            cnuh r0 = defpackage.cnuh.b(r9)
                            if (r0 != 0) goto Lbb
                            cnuh r0 = defpackage.cnuh.UNRECOGNIZED
                        Lbb:
                            cnuh r4 = defpackage.cnuh.SESSION_STATUS_OFF
                            if (r0 == r4) goto Lcd
                            cnuh r9 = defpackage.cnuh.b(r9)
                            if (r9 != 0) goto Lc7
                            cnuh r9 = defpackage.cnuh.UNRECOGNIZED
                        Lc7:
                            cnuh r0 = defpackage.cnuh.SESSION_STATUS_DISABLING
                            if (r9 != r0) goto Lcc
                            goto Lcd
                        Lcc:
                            r5 = r6
                        Lcd:
                            elfl r9 = r3.H(r2, r1, r5)
                            return r9
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.amsf.a(java.lang.Object):com.google.common.util.concurrent.ListenableFuture");
                    }
                }, this.d);
            }
            f.close();
            return i;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.alxl
    public final elfl n(ConversationId conversationId, ampp amppVar, Recipient recipient) {
        return elfo.d(new UnsupportedOperationException("incomingRichThemeUpdate not supported for emergency sos conversations"));
    }

    @Override // defpackage.alxl
    public final elfl o(ConversationId conversationId) {
        return elfo.d(new UnsupportedOperationException("Leave not supported for emergency sos conversation"));
    }

    @Override // defpackage.alxl
    public final elfl p(engw engwVar) {
        return elfo.d(new UnsupportedOperationException("Leave not supported for emergency sos conversation"));
    }

    @Override // defpackage.alxl
    public final elfl q(ConversationId conversationId, ampp amppVar) {
        return elfo.d(new UnsupportedOperationException("outgoingRichThemeUpdate not supported for emergency sos conversations"));
    }

    @Override // defpackage.alxl
    public final elfl r(Recipient recipient) {
        return elfo.d(new UnsupportedOperationException("refreshAllConversationIconsForRecipient not supported for emergency sos conversations"));
    }

    @Override // defpackage.alxl
    public final elfl s(ConversationId conversationId, String str) {
        return elfo.d(new UnsupportedOperationException("Rename not supported for emergency sos conversations"));
    }

    @Override // defpackage.alxl
    public final elfl t(ConversationId conversationId, aqux aquxVar) {
        ekzz f = eleg.f("EmergencySosConversationRepository#setActiveSelfIdentity");
        try {
            emxf.a(conversationId instanceof EmergencySosConversationId);
            elfl t = ((amhs) this.g.b()).t(((EmergencySosConversationId) conversationId).b, aquxVar);
            f.close();
            return t;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.alxl
    public final elfl u(ConversationId conversationId, String str, String str2, apmq apmqVar) {
        return ((amhs) this.g.b()).u(((EmergencySosConversationId) conversationId).b, str, str2, apmqVar);
    }

    @Override // defpackage.alxl
    public final elfl v(ConversationId conversationId, String str, Uri uri) {
        return elfo.d(new UnsupportedOperationException("setNameAndIcon not supported for emergency sos conversations"));
    }

    @Override // defpackage.alxl
    public final elfl w(ConversationId conversationId, amny amnyVar) {
        return elfo.d(new UnsupportedOperationException("setParentalApprovalStatusLocally not supported for emergency sos conversations"));
    }

    @Override // defpackage.alxl
    public final elfl x(ConversationId conversationId, cuea cueaVar) {
        return ((amhs) this.g.b()).x(conversationId, cueaVar);
    }

    @Override // defpackage.alxl
    public final elfl y(ConversationId conversationId, eoko eokoVar) {
        emxf.a(conversationId instanceof EmergencySosConversationId);
        return ((amhs) this.g.b()).y(((EmergencySosConversationId) conversationId).b, eokoVar);
    }

    @Override // defpackage.alxl
    public final elfl z(ConversationId conversationId, cuex cuexVar, String str, boolean z, cuea cueaVar) {
        return ((amhs) this.g.b()).z(conversationId, cuexVar, str, false, cueaVar);
    }
}
