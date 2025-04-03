package defpackage;

import android.os.Build;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aphr implements aphs {
    public static final entd a = entd.c("BugleConversation");
    public final errl b;
    public final ffbr c;
    private final errl d;
    private final aphw e;

    public aphr(errl errlVar, errl errlVar2, aphw aphwVar, ffbr ffbrVar) {
        this.b = errlVar;
        this.d = errlVar2;
        this.e = aphwVar;
        this.c = ffbrVar;
    }

    @Override // defpackage.aphs
    public final elfl a(final amfx amfxVar, final engw engwVar) {
        final elfl b = this.e.b();
        return elfo.k(b).b(new erog() { // from class: aphq
            @Override // defpackage.erog
            public final ListenableFuture a() {
                boolean booleanValue = ((Boolean) erqt.q(b)).booleanValue();
                aphr aphrVar = aphr.this;
                boolean a2 = ((asvn) aphrVar.c.b()).a();
                final engw engwVar2 = engwVar;
                final boolean z = false;
                if (a2 && engwVar2.size() == 1 && ((ResolvedRecipient) engwVar2.get(0)).g().C()) {
                    z = true;
                }
                if (!booleanValue && !z) {
                    return elfo.e(alxh.NOT_DEFAULT_SMS_APP);
                }
                final amfx amfxVar2 = amfxVar;
                elfl e = elfo.e(aqys.b);
                final aqux f = amfxVar2.f();
                if (f != null) {
                    e = f.e().b();
                }
                return e.i(new eroh() { // from class: aphp
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj) {
                        alxh alxhVar;
                        aqux f2;
                        aoku aokuVar;
                        alxh alxhVar2;
                        aqux f3;
                        aqys aqysVar = (aqys) obj;
                        entd entdVar = aphr.a;
                        amfx amfxVar3 = amfx.this;
                        if (amfxVar3.u()) {
                            ensz enszVar = (ensz) aphr.a.j();
                            enszVar.Y(csux.q, amfxVar3.c());
                            ((ensz) enszVar.h("com/google/android/apps/messaging/shared/api/messaging/message/compose/disable/BugleComposeDisabler", "getComposeDisabledFromConversationProperties", 117, "BugleComposeDisabler.java")).q("No conversation found for ComposeDisabler");
                            alxhVar = alxh.CONVERSATION_UNKNOWN;
                        } else if (amfxVar3.d() != amny.b) {
                            ensz enszVar2 = (ensz) aphr.a.j();
                            enszVar2.Y(csux.q, amfxVar3.c());
                            ((ensz) enszVar2.h("com/google/android/apps/messaging/shared/api/messaging/message/compose/disable/BugleComposeDisabler", "getComposeDisabledFromConversationProperties", 125, "BugleComposeDisabler.java")).q("Compose Disabled: Conversation not approved by parent.");
                            alxhVar = alxh.PARENTAL_APPROVAL_REQUIRED;
                        } else if (f != null || z) {
                            int ordinal = amfxVar3.A().ordinal();
                            if (ordinal == 1) {
                                ensz enszVar3 = (ensz) aphr.a.h();
                                enszVar3.Y(csux.q, amfxVar3.c());
                                ((ensz) enszVar3.h("com/google/android/apps/messaging/shared/api/messaging/message/compose/disable/BugleComposeDisabler", "getComposeDisabledFromConversationProperties", 155, "BugleComposeDisabler.java")).q("Compose Disabled: The RCS group has no other members.");
                                alxhVar = alxh.GROUP_EMPTY;
                            } else if (ordinal == 2) {
                                ensz enszVar4 = (ensz) aphr.a.h();
                                enszVar4.Y(csux.q, amfxVar3.c());
                                ((ensz) enszVar4.h("com/google/android/apps/messaging/shared/api/messaging/message/compose/disable/BugleComposeDisabler", "getComposeDisabledFromConversationProperties", 161, "BugleComposeDisabler.java")).q("Compose Disabled: The RCS group is too large.");
                                alxhVar = alxh.GROUP_TOO_LARGE;
                            } else if (ordinal == 3) {
                                ensz enszVar5 = (ensz) aphr.a.j();
                                enszVar5.Y(csux.q, amfxVar3.c());
                                ((ensz) enszVar5.h("com/google/android/apps/messaging/shared/api/messaging/message/compose/disable/BugleComposeDisabler", "getComposeDisabledFromConversationProperties", 149, "BugleComposeDisabler.java")).q("Compose Disabled: The RCS group was not found on the server.");
                                alxhVar = alxh.CONVERSATION_UNKNOWN;
                            } else {
                                if (ordinal == 4) {
                                    throw new IllegalStateException("UNRECOGNIZED ConversationErrorState");
                                }
                                if (amfxVar3.w() == 9) {
                                    ensz enszVar6 = (ensz) aphr.a.h();
                                    enszVar6.Y(csux.q, amfxVar3.c());
                                    ((ensz) enszVar6.h("com/google/android/apps/messaging/shared/api/messaging/message/compose/disable/BugleComposeDisabler", "getComposeDisabledFromConversationProperties", 174, "BugleComposeDisabler.java")).q("Compose Disabled: The satellite communication has ended.");
                                    alxhVar = alxh.CONVERSATION_ENDED;
                                } else if (ersy.a("bugle.add_rcs_group_creation_in_progress_as_compose_disable_reason", "bugle") && amfxVar3.w() == 8) {
                                    ensz enszVar7 = (ensz) aphr.a.h();
                                    enszVar7.Y(csux.q, amfxVar3.c());
                                    ((ensz) enszVar7.h("com/google/android/apps/messaging/shared/api/messaging/message/compose/disable/BugleComposeDisabler", "getComposeDisabledFromConversationProperties", 184, "BugleComposeDisabler.java")).q("Compose Disabled: The RCS group creation is in progress.");
                                    alxhVar = alxh.RCS_GROUP_CREATION_IN_PROGRESS;
                                } else if (amfxVar3.w() != 0 && amfxVar3.w() != 1) {
                                    ensz enszVar8 = (ensz) aphr.a.h();
                                    enszVar8.Y(csux.q, amfxVar3.c());
                                    ((ensz) enszVar8.h("com/google/android/apps/messaging/shared/api/messaging/message/compose/disable/BugleComposeDisabler", "getComposeDisabledFromConversationProperties", 193, "BugleComposeDisabler.java")).q("Compose Disabled: The user is no longer a member of this group.");
                                    alxhVar = alxh.GROUP_NOT_A_MEMBER;
                                } else if (byyr.d(amfxVar3.v()) && !aqysVar.a()) {
                                    ensz enszVar9 = (ensz) aphr.a.h();
                                    enszVar9.Y(csux.q, amfxVar3.c());
                                    ((ensz) enszVar9.h("com/google/android/apps/messaging/shared/api/messaging/message/compose/disable/BugleComposeDisabler", "getComposeDisabledFromConversationProperties", BasePaymentResult.ERROR_REQUEST_CONNECTION_FAILED, "BugleComposeDisabler.java")).q("Compose Disabled: This is an RCS group and RCS is not connected.");
                                    alxhVar = aqysVar == aqys.c ? alxh.RCS_UNSUPPORTED_BY_CARRIER : alxh.RCS_DISCONNECTED;
                                } else if (byyr.b(amfxVar3.v()) && (f2 = amfxVar3.f()) != null && ((aokuVar = (aoku) f2.m().orElse(null)) == null || aokuVar.x())) {
                                    ensz enszVar10 = (ensz) aphr.a.h();
                                    enszVar10.Y(csux.q, amfxVar3.c());
                                    ((ensz) enszVar10.h("com/google/android/apps/messaging/shared/api/messaging/message/compose/disable/BugleComposeDisabler", "getComposeDisabledFromConversationProperties", 217, "BugleComposeDisabler.java")).q("Compose Disabled: This is a group and self phone number is unknown.");
                                    alxhVar = alxh.GROUP_NO_SELF_NUMBER;
                                } else {
                                    ensz enszVar11 = (ensz) aphr.a.h();
                                    enszVar11.Y(csux.q, amfxVar3.c());
                                    ((ensz) enszVar11.h("com/google/android/apps/messaging/shared/api/messaging/message/compose/disable/BugleComposeDisabler", "getComposeDisabledFromConversationProperties", 226, "BugleComposeDisabler.java")).q("Compose is Enabled.");
                                    alxhVar = alxh.NONE;
                                }
                            }
                        } else {
                            ensz enszVar12 = (ensz) aphr.a.j();
                            enszVar12.Y(csux.q, amfxVar3.c());
                            ((ensz) enszVar12.h("com/google/android/apps/messaging/shared/api/messaging/message/compose/disable/BugleComposeDisabler", "getComposeDisabledFromConversationProperties", 134, "BugleComposeDisabler.java")).q("Compose Disabled: No active Self Identity.");
                            alxhVar = alxh.SELFIDENTITY_UNAVAILABLE;
                        }
                        if (alxhVar != alxh.NONE) {
                            return elfo.e(alxhVar);
                        }
                        engw engwVar3 = engwVar2;
                        boolean a3 = aqysVar.a();
                        if (engwVar3.size() > 1) {
                            alxhVar2 = alxh.NONE;
                        } else if (engwVar3.isEmpty()) {
                            ensz enszVar13 = (ensz) aphr.a.j();
                            enszVar13.Y(csux.q, amfxVar3.c());
                            ((ensz) enszVar13.h("com/google/android/apps/messaging/shared/api/messaging/message/compose/disable/BugleComposeDisabler", "handleOneOnOneRecipientReasons", 241, "BugleComposeDisabler.java")).r("Compose Disabled: This conversation has no recipients. Conversation type %d.", amfxVar3.v());
                            alxhVar2 = alxh.GROUP_EMPTY;
                        } else {
                            ResolvedRecipient resolvedRecipient = (ResolvedRecipient) engwVar3.get(0);
                            if (resolvedRecipient.C()) {
                                ensz enszVar14 = (ensz) aphr.a.h();
                                enszVar14.Y(csux.q, amfxVar3.c());
                                ((ensz) enszVar14.h("com/google/android/apps/messaging/shared/api/messaging/message/compose/disable/BugleComposeDisabler", "handleOneOnOneRecipientReasons", 253, "BugleComposeDisabler.java")).q("Compose Disabled: This is an incoming-only recipient.");
                                alxhVar2 = alxh.RECIPIENT_INCOMING_ONLY;
                            } else if (!resolvedRecipient.g().B() || a3) {
                                if (((Boolean) ((cfup) ctjd.ak.get()).e()).booleanValue() && resolvedRecipient.g().A()) {
                                    if (!a3) {
                                        ensz enszVar15 = (ensz) aphr.a.h();
                                        enszVar15.Y(csux.q, amfxVar3.c());
                                        ((ensz) enszVar15.h("com/google/android/apps/messaging/shared/api/messaging/message/compose/disable/BugleComposeDisabler", "handleOneOnOneRecipientReasons", 272, "BugleComposeDisabler.java")).q("Compose Disabled: This is an RCS required conversation and RCS is not connected");
                                        alxhVar2 = alxh.RCS_DISCONNECTED;
                                    } else if (((Boolean) ctjd.ar.e()).booleanValue() && (f3 = amfxVar3.f()) != null && !f3.i().e()) {
                                        ensz enszVar16 = (ensz) aphr.a.h();
                                        enszVar16.Y(csux.q, amfxVar3.c());
                                        ((ensz) enszVar16.h("com/google/android/apps/messaging/shared/api/messaging/message/compose/disable/BugleComposeDisabler", "handleOneOnOneRecipientReasons", 282, "BugleComposeDisabler.java")).q("Compose Disabled: This is an RCS Tachygram required conversation and current transport type does not support Penpal");
                                        alxhVar2 = alxh.RCS_UNSUPPORTED_BY_CARRIER;
                                    }
                                }
                                alxhVar2 = alxh.NONE;
                            } else {
                                ensz enszVar17 = (ensz) aphr.a.h();
                                enszVar17.Y(csux.q, amfxVar3.c());
                                ((ensz) enszVar17.h("com/google/android/apps/messaging/shared/api/messaging/message/compose/disable/BugleComposeDisabler", "handleOneOnOneRecipientReasons", 261, "BugleComposeDisabler.java")).q("Compose Disabled: This is an RBM conversation and RCS is not connected.");
                                alxhVar2 = alxh.RCS_DISCONNECTED;
                            }
                        }
                        return elfo.e(alxhVar2);
                    }
                }, aphrVar.b);
            }
        }, Build.VERSION.SDK_INT <= 26 ? this.d : this.b);
    }
}
