package defpackage;

import androidx.car.app.hardware.info.EnergyProfile;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmql {
    public static final enhk a;
    public final alde b;
    public final cpbs c;
    public final akvz d;
    private final aldh e;

    static {
        enhd enhdVar = new enhd();
        enhdVar.k(cmrx.REACTION_BAR, eprt.CONVERSATION_VIEW_SELECTION_BAR);
        enhdVar.k(cmrx.CUSTOM_REACTION_PICKER, eprt.CUSTOM_REACTION_SELECTION_EMOJI_PICKER);
        enhdVar.k(cmrx.DITTO_REACTION_BAR, eprt.DITTO_CONVERSATION_VIEW_SELECTION_BAR);
        enhdVar.k(cmrx.EMOTIFY_CREATION, eprt.EMOTIFY_REACTION_CREATION);
        enhdVar.k(cmrx.DOUBLE_TAP_TO_REACT, eprt.DOUBLE_TAP_TO_REACT);
        a = enhdVar.c();
    }

    public cmql(alde aldeVar, aldh aldhVar, cpbs cpbsVar, akvz akvzVar) {
        this.b = aldeVar;
        this.e = aldhVar;
        this.c = cpbsVar;
        this.d = akvzVar;
    }

    public static eqfc a(cmrm cmrmVar, boolean z, boolean z2, eqfe eqfeVar) {
        eqfb eqfbVar = (eqfb) eqfc.a.createBuilder();
        int g = g(cmrmVar);
        eqfbVar.copyOnWrite();
        eqfc eqfcVar = (eqfc) eqfbVar.instance;
        eqfcVar.e = g - 1;
        eqfcVar.b |= 1;
        eqfbVar.copyOnWrite();
        eqfc eqfcVar2 = (eqfc) eqfbVar.instance;
        eqfeVar.getClass();
        eqfcVar2.d = eqfeVar;
        eqfcVar2.c = EnergyProfile.EVCONNECTOR_TYPE_OTHER;
        eqfbVar.copyOnWrite();
        eqfc eqfcVar3 = (eqfc) eqfbVar.instance;
        eqfcVar3.b |= 2;
        eqfcVar3.f = z;
        eqfbVar.copyOnWrite();
        eqfc eqfcVar4 = (eqfc) eqfbVar.instance;
        eqfcVar4.b |= 4;
        eqfcVar4.g = z2;
        return (eqfc) eqfbVar.build();
    }

    public static eqfc b(cmrm cmrmVar, boolean z, boolean z2, eqfg eqfgVar) {
        eqfb eqfbVar = (eqfb) eqfc.a.createBuilder();
        int g = g(cmrmVar);
        eqfbVar.copyOnWrite();
        eqfc eqfcVar = (eqfc) eqfbVar.instance;
        eqfcVar.e = g - 1;
        eqfcVar.b |= 1;
        eqfbVar.copyOnWrite();
        eqfc eqfcVar2 = (eqfc) eqfbVar.instance;
        eqfcVar2.b |= 2;
        eqfcVar2.f = z;
        eqfbVar.copyOnWrite();
        eqfc eqfcVar3 = (eqfc) eqfbVar.instance;
        eqfcVar3.b |= 4;
        eqfcVar3.g = z2;
        eqfbVar.copyOnWrite();
        eqfc eqfcVar4 = (eqfc) eqfbVar.instance;
        eqfgVar.getClass();
        eqfcVar4.d = eqfgVar;
        eqfcVar4.c = 104;
        return (eqfc) eqfbVar.build();
    }

    public static eqfc c(cmrm cmrmVar, boolean z, boolean z2, eqfk eqfkVar) {
        eqfb eqfbVar = (eqfb) eqfc.a.createBuilder();
        int g = g(cmrmVar);
        eqfbVar.copyOnWrite();
        eqfc eqfcVar = (eqfc) eqfbVar.instance;
        eqfcVar.e = g - 1;
        eqfcVar.b |= 1;
        eqfbVar.copyOnWrite();
        eqfc eqfcVar2 = (eqfc) eqfbVar.instance;
        eqfkVar.getClass();
        eqfcVar2.d = eqfkVar;
        eqfcVar2.c = 102;
        eqfbVar.copyOnWrite();
        eqfc eqfcVar3 = (eqfc) eqfbVar.instance;
        eqfcVar3.b |= 2;
        eqfcVar3.f = z;
        eqfbVar.copyOnWrite();
        eqfc eqfcVar4 = (eqfc) eqfbVar.instance;
        eqfcVar4.b |= 4;
        eqfcVar4.g = z2;
        return (eqfc) eqfbVar.build();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.eqfe d(defpackage.cmrl r5, defpackage.fayv r6, defpackage.bdhg r7) {
        /*
            boolean r0 = defpackage.auqr.a()
            if (r0 == 0) goto L17
            int r0 = r5.e
            cmrv r0 = defpackage.cmrv.b(r0)
            if (r0 != 0) goto L10
            cmrv r0 = defpackage.cmrv.UNRECOGNIZED
        L10:
            cmrv r1 = defpackage.cmrv.EMOTIFY
            if (r0 != r1) goto L17
            clbg r0 = defpackage.clbg.EMOTIFY_REACTIONS_NAMESPACE
            goto L19
        L17:
            clbg r0 = defpackage.clbg.REACTIONS_NAMESPACE
        L19:
            boolean r1 = defpackage.auqr.a()
            if (r1 == 0) goto L21
            int r1 = r5.e
        L21:
            boolean r1 = defpackage.auqr.a()
            if (r1 == 0) goto L29
            int r1 = r5.e
        L29:
            java.lang.String r1 = "In-Reply-To-Message-Id"
            j$.util.Optional r1 = defpackage.clbh.a(r6, r0, r1)
            boolean r1 = r1.isPresent()
            java.lang.String r2 = "Message-Reply-Type"
            j$.util.Optional r6 = defpackage.clbh.a(r6, r0, r2)
            boolean r6 = r6.isPresent()
            eqfe r0 = defpackage.eqfe.a
            eyfq r0 = r0.createBuilder()
            eqfd r0 = (defpackage.eqfd) r0
            r0.copyOnWrite()
            MessageType extends eyfy<MessageType, BuilderType> r2 = r0.instance
            eqfe r2 = (defpackage.eqfe) r2
            int r3 = r2.b
            r4 = 1
            r3 = r3 | r4
            r2.b = r3
            r2.c = r1
            r0.copyOnWrite()
            MessageType extends eyfy<MessageType, BuilderType> r1 = r0.instance
            eqfe r1 = (defpackage.eqfe) r1
            int r2 = r1.b
            r2 = r2 | 2
            r1.b = r2
            r1.d = r6
            int r5 = r5.e
            cmrv r5 = defpackage.cmrv.b(r5)
            if (r5 != 0) goto L6d
            cmrv r5 = defpackage.cmrv.UNRECOGNIZED
        L6d:
            cmrv r6 = defpackage.cmrv.REACTION_TYPE_UNSPECIFIED
            if (r5 == r6) goto L72
            goto L73
        L72:
            r4 = 0
        L73:
            r0.copyOnWrite()
            MessageType extends eyfy<MessageType, BuilderType> r5 = r0.instance
            eqfe r5 = (defpackage.eqfe) r5
            int r6 = r5.b
            r6 = r6 | 4
            r5.b = r6
            r5.e = r4
            java.lang.String r5 = r7.b
            if (r5 == 0) goto L95
            r0.copyOnWrite()
            MessageType extends eyfy<MessageType, BuilderType> r6 = r0.instance
            eqfe r6 = (defpackage.eqfe) r6
            int r7 = r6.b
            r7 = r7 | 8
            r6.b = r7
            r6.f = r5
        L95:
            eyfy r5 = r0.build()
            eqfe r5 = (defpackage.eqfe) r5
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cmql.d(cmrl, fayv, bdhg):eqfe");
    }

    public static eqfg e(cmrl cmrlVar, fayv fayvVar) {
        boolean isPresent = clbh.a(fayvVar, clbg.GSMA_RCS_NAMESPACE, "Reference-ID").isPresent();
        eqff eqffVar = (eqff) eqfg.a.createBuilder();
        eqffVar.copyOnWrite();
        eqfg eqfgVar = (eqfg) eqffVar.instance;
        eqfgVar.b |= 1;
        eqfgVar.c = isPresent;
        cmrv b = cmrv.b(cmrlVar.e);
        if (b == null) {
            b = cmrv.UNRECOGNIZED;
        }
        boolean z = b != cmrv.REACTION_TYPE_UNSPECIFIED;
        eqffVar.copyOnWrite();
        eqfg eqfgVar2 = (eqfg) eqffVar.instance;
        eqfgVar2.b |= 2;
        eqfgVar2.d = z;
        return (eqfg) eqffVar.build();
    }

    public static int g(cmrm cmrmVar) {
        int ordinal = cmrmVar.ordinal();
        if (ordinal != 1) {
            return ordinal != 2 ? 1 : 3;
        }
        return 2;
    }

    public final void f(MessageCoreData messageCoreData, List list, eqfc eqfcVar) {
        if (messageCoreData.t() == 0) {
            messageCoreData.bX(this.d.d(messageCoreData));
        }
        aldh aldhVar = this.e;
        long t = messageCoreData.t();
        int a2 = alee.a(messageCoreData);
        Integer valueOf = Integer.valueOf(this.c.a(-1).d());
        list.getClass();
        aldh.b(aldhVar, t, a2, valueOf, list, eqfcVar, null, null, 96);
    }
}
