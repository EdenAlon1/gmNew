package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clmf {
    public static final entd a = entd.c("BugleRcs");
    public final avkh b;
    private final errl c;
    private final clmd d;

    public clmf(errl errlVar, clmd clmdVar, avkh avkhVar) {
        this.c = errlVar;
        this.d = clmdVar;
        this.b = avkhVar;
    }

    public final elfl a(final awud awudVar, final String str) {
        clmd clmdVar = this.d;
        ffbr ffbrVar = clmdVar.d;
        elfl a2 = clmdVar.c.a();
        final avkc avkcVar = (avkc) ffbrVar.b();
        avkcVar.getClass();
        return a2.h(new emwl() { // from class: clmb
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return avkc.this.c((String) obj);
            }
        }, clmdVar.b).i(new eroh() { // from class: clmc
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                awui awuiVar = (awui) obj;
                entd entdVar = clmd.a;
                awud awudVar2 = awud.this;
                awua b = awua.b(awudVar2.d);
                if (b == null) {
                    b = awua.UNKNOWN_CAUSE;
                }
                String str2 = str;
                int ordinal = b.ordinal();
                if (ordinal == 2) {
                    ((ensz) clmd.a.n().h("com/google/android/apps/messaging/shared/rcs/messaging/emitter/ResponseGroupEventEmitter", "emitForGroupTooFewParticipants", 97, "ResponseGroupEventEmitter.java")).q("Emitting GroupEvent for GROUP_TOO_FEW_PARTICIPANTS");
                    awvs awvsVar = (awvs) awvt.c.createBuilder();
                    awvsVar.copyOnWrite();
                    awvt awvtVar = (awvt) awvsVar.instance;
                    awvtVar.d |= 1;
                    awvtVar.e = str2;
                    awvk awvkVar = (awvk) awvn.a.createBuilder();
                    awvm awvmVar = awvm.CAUSE_ONLY_SELF_IN_GROUP;
                    awvkVar.copyOnWrite();
                    awvn awvnVar = (awvn) awvkVar.instance;
                    awvnVar.c = awvmVar.d;
                    awvnVar.b |= 1;
                    awvsVar.copyOnWrite();
                    awvt awvtVar2 = (awvt) awvsVar.instance;
                    awvn awvnVar2 = (awvn) awvkVar.build();
                    awvnVar2.getClass();
                    awvtVar2.q = awvnVar2;
                    awvtVar2.d |= 256;
                    awvsVar.copyOnWrite();
                    awvt awvtVar3 = (awvt) awvsVar.instance;
                    awuiVar.getClass();
                    awvtVar3.r = awuiVar;
                    awvtVar3.d |= 512;
                    return elfo.e(Optional.of((awvt) awvsVar.build()));
                }
                if (ordinal == 4) {
                    awvs awvsVar2 = (awvs) awvt.c.createBuilder();
                    awvsVar2.copyOnWrite();
                    awvt awvtVar4 = (awvt) awvsVar2.instance;
                    awvtVar4.d |= 1;
                    awvtVar4.e = str2;
                    awvsVar2.copyOnWrite();
                    awvt awvtVar5 = (awvt) awvsVar2.instance;
                    awuiVar.getClass();
                    awvtVar5.r = awuiVar;
                    awvtVar5.d |= 512;
                    awvsVar2.b(awuiVar);
                    return elfo.e(Optional.of((awvt) awvsVar2.build()));
                }
                if (ordinal != 8) {
                    ensk o = clmd.a.o();
                    o.Y(awgo.a, awudVar2);
                    ((ensz) o.h("com/google/android/apps/messaging/shared/rcs/messaging/emitter/ResponseGroupEventEmitter", "emitGroupEventForWithSelfChatEndpoint", 86, "ResponseGroupEventEmitter.java")).q("ResponseGroupEventEmitter no GroupEvent to emit for cause");
                    return elfo.e(Optional.empty());
                }
                ((ensz) clmd.a.n().h("com/google/android/apps/messaging/shared/rcs/messaging/emitter/ResponseGroupEventEmitter", "emitForGroupNotFound", 130, "ResponseGroupEventEmitter.java")).q("Emitting GroupEvent for GROUP_NOT_FOUND");
                awvs awvsVar3 = (awvs) awvt.c.createBuilder();
                awvsVar3.copyOnWrite();
                awvt awvtVar6 = (awvt) awvsVar3.instance;
                awvtVar6.d |= 1;
                awvtVar6.e = str2;
                awvk awvkVar2 = (awvk) awvn.a.createBuilder();
                awvm awvmVar2 = awvm.CAUSE_GROUP_NOT_FOUND;
                awvkVar2.copyOnWrite();
                awvn awvnVar3 = (awvn) awvkVar2.instance;
                awvnVar3.c = awvmVar2.d;
                awvnVar3.b |= 1;
                awvsVar3.copyOnWrite();
                awvt awvtVar7 = (awvt) awvsVar3.instance;
                awvn awvnVar4 = (awvn) awvkVar2.build();
                awvnVar4.getClass();
                awvtVar7.q = awvnVar4;
                awvtVar7.d |= 256;
                awvsVar3.copyOnWrite();
                awvt awvtVar8 = (awvt) awvsVar3.instance;
                awuiVar.getClass();
                awvtVar8.r = awuiVar;
                awvtVar8.d |= 512;
                return elfo.e(Optional.of((awvt) awvsVar3.build()));
            }
        }, clmdVar.b).i(new eroh() { // from class: clme
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                Optional optional = (Optional) obj;
                if (optional.isPresent()) {
                    clmf clmfVar = clmf.this;
                    ((ensz) clmf.a.n().h("com/google/android/apps/messaging/shared/rcs/messaging/emitter/ResponseGroupEventProcessor", "processEmittedGroupEventFor", 54, "ResponseGroupEventProcessor.java")).q("ResponseGroupEventProcessor calling IncomingChatApi");
                    return clmfVar.b.c((awvt) optional.get());
                }
                ((ensz) clmf.a.n().h("com/google/android/apps/messaging/shared/rcs/messaging/emitter/ResponseGroupEventProcessor", "processEmittedGroupEventFor", 57, "ResponseGroupEventProcessor.java")).q("ResponseGroupEventProcessor not calling IncomingChatApi");
                awty awtyVar = (awty) awud.a.createBuilder();
                awuc awucVar = awuc.OK;
                awtyVar.copyOnWrite();
                awud awudVar2 = (awud) awtyVar.instance;
                awudVar2.c = awucVar.f;
                awudVar2.b |= 1;
                return elfo.e((awud) awtyVar.build());
            }
        }, this.c);
    }
}
