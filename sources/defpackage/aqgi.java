package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aqgi {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/api/messaging/protocol/ConversationRcsSelector");
    private static final ensn c = new ensn("is_rcs_available_convo_v1", Boolean.class, false, false);
    public final ffbr b;
    private final ckds d;
    private final csjk e;
    private final ffbr f;
    private final azbq g;
    private final ffbr h;
    private final ffbr i;

    public aqgi(csjk csjkVar, ffbr ffbrVar, ckds ckdsVar, ffbr ffbrVar2, azbq azbqVar, ffbr ffbrVar3, ffbr ffbrVar4) {
        this.e = csjkVar;
        this.f = ffbrVar;
        this.d = ckdsVar;
        this.b = ffbrVar2;
        this.g = azbqVar;
        this.h = ffbrVar3;
        this.i = ffbrVar4;
    }

    public static eoxn a(int i) {
        return i != 0 ? i != 1 ? i != 2 ? eoxn.UNKNOWN_SEND_MODE : eoxn.SEND_MODE_XMS_LATCH : eoxn.SEND_MODE_XMS : eoxn.SEND_MODE_AUTO;
    }

    public static boolean g(eoxn eoxnVar) {
        int ordinal = eoxnVar.ordinal();
        if (ordinal == 0) {
            ensk j = a.j();
            j.Y(ente.a, "BugleDataModel");
            ((enrr) ((enrr) j).h("com/google/android/apps/messaging/shared/api/messaging/protocol/ConversationRcsSelector", "isRcsSendingEnabledBySendModeStatic", 212, "ConversationRcsSelector.java")).q("RCS sending mode unknown");
            return false;
        }
        if (ordinal == 1) {
            ensk g = a.g();
            g.Y(ente.a, "BugleDataModel");
            ((enrr) ((enrr) g).h("com/google/android/apps/messaging/shared/api/messaging/protocol/ConversationRcsSelector", "isRcsSendingEnabledBySendModeStatic", 221, "ConversationRcsSelector.java")).q("RCS sending AUTO mode set");
            return true;
        }
        if (ordinal == 2) {
            ensk g2 = a.g();
            g2.Y(ente.a, "BugleDataModel");
            ((enrr) ((enrr) g2).h("com/google/android/apps/messaging/shared/api/messaging/protocol/ConversationRcsSelector", "isRcsSendingEnabledBySendModeStatic", 215, "ConversationRcsSelector.java")).q("RCS sending disabled, XMS mode set");
            return false;
        }
        if (ordinal != 3) {
            throw new IllegalArgumentException("Invalid send mode valie");
        }
        ensk g3 = a.g();
        g3.Y(ente.a, "BugleDataModel");
        ((enrr) ((enrr) g3).h("com/google/android/apps/messaging/shared/api/messaging/protocol/ConversationRcsSelector", "isRcsSendingEnabledBySendModeStatic", 218, "ConversationRcsSelector.java")).q("RCS sending disabled, XMS latch in effect");
        return false;
    }

    public final ephg b(Optional optional, int i) {
        enru enruVar = a;
        ensk e = enruVar.e();
        e.Y(ente.a, "BugleDataModel");
        ((enrr) ((enrr) e).h("com/google/android/apps/messaging/shared/api/messaging/protocol/ConversationRcsSelector", "createDefaultRcsOneOnOneConditions", 113, "ConversationRcsSelector.java")).r("ConversationRcsSelector#createDefaultRcsOneOnOneConditions subId=%d", i);
        eqwf eqwfVar = ((djrv) this.b.b()).d(i).a;
        boolean x = ((djrv) this.b.b()).x(i);
        ensk e2 = enruVar.e();
        e2.Y(ente.a, "BugleDataModel");
        enrr enrrVar = (enrr) e2;
        enrrVar.Y(csux.t, Integer.valueOf(i));
        enrrVar.Y(csux.P, eqwfVar.name());
        enrrVar.Y(c, Boolean.valueOf(x));
        ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/api/messaging/protocol/ConversationRcsSelector", "doCreateDefaultRcsOneOnOneConditions", 153, "ConversationRcsSelector.java")).q("ConversationRcsSelector#createDefaultRcsOneOnOneConditions RCS availability");
        ephf createBuilder = ephg.a.createBuilder();
        boolean z = false;
        boolean z2 = optional.isPresent() && ((avlk) optional.get()).g();
        createBuilder.copyOnWrite();
        ephg ephgVar = (ephg) createBuilder.instance;
        ephgVar.b |= 2;
        ephgVar.d = z2;
        createBuilder.copyOnWrite();
        ephg.a((ephg) createBuilder.instance);
        boolean I = ((atse) this.h.b()).a() ? i >= 0 && ((clws) this.i.b()).o(i) : this.d.I();
        createBuilder.copyOnWrite();
        ephg ephgVar2 = (ephg) createBuilder.instance;
        ephgVar2.b |= 8;
        ephgVar2.f = I;
        boolean r = ((atrg) this.f.b()).a() ? ((csmz) this.e.a()).r() : !this.d.D();
        createBuilder.copyOnWrite();
        ephg ephgVar3 = (ephg) createBuilder.instance;
        ephgVar3.b |= 16;
        ephgVar3.g = r;
        boolean z3 = optional.isPresent() && ((avlk) optional.get()).i();
        createBuilder.copyOnWrite();
        ephg ephgVar4 = (ephg) createBuilder.instance;
        ephgVar4.b |= 32;
        ephgVar4.h = z3;
        if (optional.isPresent()) {
            avlk avlkVar = (avlk) optional.get();
            if (avlkVar.e("video") && avlkVar.e("urn%3Aurn-7%3A3gpp-service.ims.icsi.mmtel")) {
                z = true;
            }
        }
        createBuilder.copyOnWrite();
        ephg ephgVar5 = (ephg) createBuilder.instance;
        ephgVar5.b |= 64;
        ephgVar5.i = z;
        createBuilder.copyOnWrite();
        ephg ephgVar6 = (ephg) createBuilder.instance;
        ephgVar6.b |= 128;
        ephgVar6.j = x;
        createBuilder.copyOnWrite();
        ephg ephgVar7 = (ephg) createBuilder.instance;
        ephgVar7.k = eqwfVar.N;
        ephgVar7.b |= 256;
        createBuilder.copyOnWrite();
        ephg ephgVar8 = (ephg) createBuilder.instance;
        ephgVar8.b |= 1;
        ephgVar8.c = x;
        return createBuilder.build();
    }

    public final ephg c(int i, Optional optional) {
        ekzz f = eleg.f("ConversationRcsSelector::getRcsOneOnOneConditions");
        try {
            final azbq azbqVar = this.g;
            azbqVar.getClass();
            ephg b = b(optional.map(new Function() { // from class: aqgh
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return azbq.this.a((aoku) obj);
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }), i);
            f.close();
            return b;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean d(ConversationIdType conversationIdType) {
        return this.d.A(conversationIdType);
    }

    public final boolean e(ephg ephgVar) {
        boolean z = ephgVar.c && ephgVar.d;
        return !ephgVar.e ? ephgVar.f && ephgVar.g && z : z;
    }

    public final boolean f(eoxo eoxoVar) {
        if (eoxoVar != null && eoxoVar.p && (eoxoVar.b & 1024) != 0) {
            eoks b = eoks.b(eoxoVar.f);
            if (b == null) {
                b = eoks.UNKNOWN_BUGLE_CONVERSATION_TYPE;
            }
            if (b.equals(eoks.CONVERSATION_TYPE_ONE_ON_ONE)) {
                ephg ephgVar = eoxoVar.l;
                if (ephgVar == null) {
                    ephgVar = ephg.a;
                }
                if (!ephgVar.h) {
                    return true;
                }
            }
        }
        return false;
    }
}
