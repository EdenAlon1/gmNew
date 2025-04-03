package defpackage;

import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vfh implements tuy {
    private static final entd a = entd.c("BugleReactions");

    @Override // defpackage.tuy
    public final engw a(bcse bcseVar) {
        Object vfnVar;
        cmrf cmrfVar = bcseVar.s;
        if (cmrfVar == null) {
            int i = engw.d;
            return enou.a;
        }
        int i2 = engw.d;
        engr engrVar = new engr();
        for (cmro cmroVar : cmrfVar.b) {
            emxf.a(cmroVar.d.size() > 0);
            cmrl cmrlVar = cmroVar.c;
            if (cmrlVar == null) {
                cmrlVar = cmrl.a;
            }
            cmrv b = cmrv.b(cmrlVar.e);
            if (b == null) {
                b = cmrv.UNRECOGNIZED;
            }
            if (b == cmrv.CUSTOM) {
                cmrl cmrlVar2 = cmroVar.c;
                if (cmrlVar2 == null) {
                    cmrlVar2 = cmrl.a;
                }
                cmrl cmrlVar3 = (cmrl) cmrq.m.get(cmrlVar2.d);
                if (cmrlVar3 != null) {
                    vfnVar = new vfg(cmrlVar3, cmroVar.d.size());
                } else {
                    cmrl cmrlVar4 = cmroVar.c;
                    if (cmrlVar4 == null) {
                        cmrlVar4 = cmrl.a;
                    }
                    vfnVar = new vfn(cmrlVar4, cmroVar.d.size());
                }
                engrVar.h(vfnVar);
            } else {
                cmrl cmrlVar5 = cmroVar.c;
                cmrv b2 = cmrv.b((cmrlVar5 == null ? cmrl.a : cmrlVar5).e);
                if (b2 == null) {
                    b2 = cmrv.UNRECOGNIZED;
                }
                if (b2 == cmrv.REACTION_TYPE_UNSPECIFIED) {
                    ((ensz) a.a(Level.SEVERE).h("com/google/android/apps/messaging/conversation/reactions/ui/badges/ReactionBadgeDataConverter", "convert", 50, "ReactionBadgeDataConverter.java")).q("Ignoring the reaction of unspecified type.");
                } else {
                    cmrv b3 = cmrv.b((cmrlVar5 == null ? cmrl.a : cmrlVar5).e);
                    if (b3 == null) {
                        b3 = cmrv.UNRECOGNIZED;
                    }
                    if (b3 == cmrv.EMOTIFY) {
                        ((ensz) a.a(Level.INFO).h("com/google/android/apps/messaging/conversation/reactions/ui/badges/ReactionBadgeDataConverter", "convert", 52, "ReactionBadgeDataConverter.java")).q("Ignoring the Emotify reaction for conv1.");
                    } else {
                        if (cmrlVar5 == null) {
                            cmrlVar5 = cmrl.a;
                        }
                        engrVar.h(new vfg(cmrlVar5, cmroVar.d.size()));
                    }
                }
            }
        }
        return engrVar.g();
    }
}
