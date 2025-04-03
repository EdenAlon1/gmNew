package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmsj implements cifg {
    public static final escc a;
    public static final escc b;
    private static final enru c = enru.c("com/google/android/apps/messaging/shared/reactions/ditto/delegate/SendReactionDelegate");
    private final ffbr d;
    private final ffbr e;
    private final ffbr f;
    private final auqu g;

    static {
        esca escaVar = (esca) escc.a.createBuilder();
        escaVar.copyOnWrite();
        ((escc) escaVar.instance).b = escb.a(4);
        a = (escc) escaVar.build();
        esca escaVar2 = (esca) escc.a.createBuilder();
        escaVar2.copyOnWrite();
        ((escc) escaVar2.instance).b = escb.a(3);
        b = (escc) escaVar2.build();
    }

    public cmsj(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, auqu auquVar) {
        this.d = ffbrVar;
        this.e = ffbrVar2;
        this.f = ffbrVar3;
        this.g = auquVar;
    }

    @Override // defpackage.cifg
    public final /* synthetic */ elfl a(ciff ciffVar) {
        return cife.a(this, ciffVar);
    }

    @Override // defpackage.cifg
    public final /* bridge */ /* synthetic */ elfl b(ciff ciffVar, eyhs eyhsVar) {
        elfl c2;
        esbz esbzVar = (esbz) eyhsVar;
        if (((ersq) ((auqd) this.g).a.b()).a("bugle.send_ditto_reactions_with_mapi")) {
            if (!esbzVar.c.isEmpty() && (esbzVar.b & 1) != 0) {
                cmrm b2 = cmrm.b(esbzVar.e);
                if (b2 == null) {
                    b2 = cmrm.UNRECOGNIZED;
                }
                if (b2 != cmrm.REACTION_ACTION_UNSPECIFIED) {
                    ensk h = c.h();
                    h.Y(ente.a, "BugleReactions");
                    enrr enrrVar = (enrr) h;
                    enrrVar.Y(cmsm.d, esbzVar.c);
                    ensn ensnVar = cmsm.i;
                    cmrm b3 = cmrm.b(esbzVar.e);
                    if (b3 == null) {
                        b3 = cmrm.UNRECOGNIZED;
                    }
                    enrrVar.Y(ensnVar, b3);
                    ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/reactions/ditto/delegate/SendReactionDelegate", "handleRequestInternal", 87, "SendReactionDelegate.java")).q("Initiating reaction sending from Ditto.");
                    cmsc cmscVar = (cmsc) this.e.b();
                    MessageIdType b4 = bdhb.b(esbzVar.c);
                    cmrl cmrlVar = esbzVar.d;
                    if (cmrlVar == null) {
                        cmrlVar = cmrl.a;
                    }
                    cmrl cmrlVar2 = cmrlVar;
                    cmrm b5 = cmrm.b(esbzVar.e);
                    if (b5 == null) {
                        b5 = cmrm.UNRECOGNIZED;
                    }
                    cmrm cmrmVar = b5;
                    cmrlVar2.getClass();
                    cmrmVar.getClass();
                    c2 = axol.c(cmscVar.b, ffhe.a, ffsm.a, new cmsb(cmscVar, b4, cmrlVar2, cmrmVar, null));
                    return c2.h(new emwl() { // from class: cmsh
                        @Override // defpackage.emwl
                        public final Object apply(Object obj) {
                            Boolean bool = (Boolean) obj;
                            escc esccVar = cmsj.a;
                            return (bool == null || !bool.booleanValue()) ? cmsj.a : cmsj.b;
                        }
                    }, erpp.a);
                }
            }
            ensk j = c.j();
            j.Y(ente.a, "BugleReactions");
            enrr enrrVar2 = (enrr) j;
            enrrVar2.Y(new ensn("has_reaction", Boolean.class, false, false), Boolean.valueOf(1 == (esbzVar.b & 1)));
            enrrVar2.Y(cmsm.d, esbzVar.c);
            ensn ensnVar2 = cmsm.i;
            cmrm b6 = cmrm.b(esbzVar.e);
            if (b6 == null) {
                b6 = cmrm.UNRECOGNIZED;
            }
            enrrVar2.Y(ensnVar2, b6);
            ((enrr) enrrVar2.h("com/google/android/apps/messaging/shared/reactions/ditto/delegate/SendReactionDelegate", "handleRequestInternal", 79, "SendReactionDelegate.java")).q("Cannot send a reaction from Ditto.");
            return elfo.e(a);
        }
        if (!esbzVar.c.isEmpty() && (esbzVar.b & 1) != 0) {
            cmrm b7 = cmrm.b(esbzVar.e);
            if (b7 == null) {
                b7 = cmrm.UNRECOGNIZED;
            }
            if (b7 != cmrm.REACTION_ACTION_UNSPECIFIED) {
                csta cstaVar = (csta) this.f.b();
                escu escuVar = esbzVar.f;
                if (escuVar == null) {
                    escuVar = escu.a;
                }
                Optional a2 = cstaVar.a(escuVar);
                if (a2.isEmpty()) {
                    ensk j2 = c.j();
                    j2.Y(ente.a, "BugleReactions");
                    ((enrr) ((enrr) j2).h("com/google/android/apps/messaging/shared/reactions/ditto/delegate/SendReactionDelegate", "handleRequestInternalOld", 119, "SendReactionDelegate.java")).q("Can not send a reaction from Ditto because the subId was DEFAULT_SELF_SUB_ID");
                    return elfo.e(a);
                }
                ensk h2 = c.h();
                h2.Y(ente.a, "BugleReactions");
                enrr enrrVar3 = (enrr) h2;
                enrrVar3.Y(cmsm.d, esbzVar.c);
                ensn ensnVar3 = cmsm.i;
                cmrm b8 = cmrm.b(esbzVar.e);
                if (b8 == null) {
                    b8 = cmrm.UNRECOGNIZED;
                }
                enrrVar3.Y(ensnVar3, b8);
                ((enrr) enrrVar3.h("com/google/android/apps/messaging/shared/reactions/ditto/delegate/SendReactionDelegate", "handleRequestInternalOld", 128, "SendReactionDelegate.java")).q("Initiating reaction sending from Ditto.");
                cndo cndoVar = (cndo) this.d.b();
                MessageIdType b9 = bdhb.b(esbzVar.c);
                cmrl cmrlVar3 = esbzVar.d;
                if (cmrlVar3 == null) {
                    cmrlVar3 = cmrl.a;
                }
                cmrl cmrlVar4 = cmrlVar3;
                cmrm b10 = cmrm.b(esbzVar.e);
                if (b10 == null) {
                    b10 = cmrm.UNRECOGNIZED;
                }
                return cndoVar.a(b9, cmrlVar4, b10, eprt.DITTO_CONVERSATION_VIEW_SELECTION_BAR, ((Integer) a2.get()).intValue()).h(new emwl() { // from class: cmsi
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        Boolean bool = (Boolean) obj;
                        escc esccVar = cmsj.a;
                        return (bool == null || !bool.booleanValue()) ? cmsj.a : cmsj.b;
                    }
                }, erpp.a);
            }
        }
        ensk j3 = c.j();
        j3.Y(ente.a, "BugleReactions");
        enrr enrrVar4 = (enrr) j3;
        enrrVar4.Y(new ensn("has_reaction", Boolean.class, false, false), Boolean.valueOf(1 == (esbzVar.b & 1)));
        enrrVar4.Y(cmsm.d, esbzVar.c);
        ensn ensnVar4 = cmsm.i;
        cmrm b11 = cmrm.b(esbzVar.e);
        if (b11 == null) {
            b11 = cmrm.UNRECOGNIZED;
        }
        enrrVar4.Y(ensnVar4, b11);
        ((enrr) enrrVar4.h("com/google/android/apps/messaging/shared/reactions/ditto/delegate/SendReactionDelegate", "handleRequestInternalOld", 111, "SendReactionDelegate.java")).q("Can not send a reaction from Ditto.");
        return elfo.e(a);
    }

    @Override // defpackage.cifg
    public final /* bridge */ /* synthetic */ eyhs c(eyee eyeeVar) {
        return (esbz) eyfy.parseFrom(esbz.a, eyeeVar, eyfc.a());
    }
}
