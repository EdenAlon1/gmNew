package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cpkl implements cpna {
    public final ffbr a;
    public final errl b;
    public final cpih c;
    public final ffbr d;
    private final ffbr e;
    private final cpix f;

    public cpkl(ffbr ffbrVar, ffbr ffbrVar2, errl errlVar, cpix cpixVar, cpih cpihVar, ffbr ffbrVar3) {
        this.a = ffbrVar;
        this.e = ffbrVar2;
        this.b = errlVar;
        this.f = cpixVar;
        this.c = cpihVar;
        this.d = ffbrVar3;
    }

    public static axal i(eyee eyeeVar, awuc awucVar) {
        axak axakVar = (axak) axal.a.createBuilder();
        axakVar.copyOnWrite();
        axal axalVar = (axal) axakVar.instance;
        eyeeVar.getClass();
        axalVar.b |= 2;
        axalVar.d = eyeeVar;
        awty awtyVar = (awty) awud.a.createBuilder();
        awtyVar.copyOnWrite();
        awud awudVar = (awud) awtyVar.instance;
        awudVar.c = awucVar.f;
        awudVar.b |= 1;
        awud awudVar2 = (awud) awtyVar.build();
        axakVar.copyOnWrite();
        axal axalVar2 = (axal) axakVar.instance;
        awudVar2.getClass();
        axalVar2.c = awudVar2;
        axalVar2.b |= 1;
        return (axal) axakVar.build();
    }

    @Override // defpackage.cpna
    public final /* bridge */ /* synthetic */ awui a(Object obj) {
        awwf awwfVar = ((axaj) obj).c;
        if (awwfVar == null) {
            awwfVar = awwf.a;
        }
        awui awuiVar = awwfVar.d;
        return awuiVar == null ? awui.a : awuiVar;
    }

    @Override // defpackage.cpna
    public final /* bridge */ /* synthetic */ awui b(Object obj) {
        axaj axajVar = (axaj) obj;
        emxf.b((axajVar.b & 4) != 0, "Self identity is missing in TriggerChatGroupFullStateUpdateRequest");
        awui awuiVar = axajVar.e;
        return awuiVar == null ? awui.a : awuiVar;
    }

    @Override // defpackage.cpna
    public final /* bridge */ /* synthetic */ elfl c(Object obj) {
        final axaj axajVar = (axaj) obj;
        emxf.l((axajVar.b & 4) != 0);
        cpil cpilVar = (cpil) this.e.b();
        awwf awwfVar = axajVar.c;
        if (awwfVar == null) {
            awwfVar = awwf.a;
        }
        return cpilVar.a(awwfVar).i(new eroh() { // from class: cpkh
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj2) {
                final esqu esquVar = (esqu) obj2;
                cpkl cpklVar = cpkl.this;
                cpsu cpsuVar = (cpsu) cpklVar.d.b();
                awui awuiVar = axajVar.e;
                if (awuiVar == null) {
                    awuiVar = awui.a;
                }
                return cpsuVar.b(awuiVar).i(new eroh() { // from class: cpkk
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj3) {
                        elfl c;
                        cprv cprvVar = (cprv) obj3;
                        esqu esquVar2 = esqu.this;
                        esquVar2.getClass();
                        c = axol.c(cprvVar.b, ffhe.a, ffsm.a, new cprs(cprvVar, esquVar2, null));
                        return c;
                    }
                }, cpklVar.b);
            }
        }, this.b);
    }

    @Override // defpackage.cpna
    public final /* bridge */ /* synthetic */ elfl d(Object obj, awud awudVar) {
        avkh avkhVar = (avkh) this.a.b();
        eyee eyeeVar = ((axaj) obj).d;
        axak axakVar = (axak) axal.a.createBuilder();
        axakVar.copyOnWrite();
        axal axalVar = (axal) axakVar.instance;
        eyeeVar.getClass();
        axalVar.b |= 2;
        axalVar.d = eyeeVar;
        axakVar.copyOnWrite();
        axal axalVar2 = (axal) axakVar.instance;
        awudVar.getClass();
        axalVar2.c = awudVar;
        axalVar2.b |= 1;
        return avkhVar.i((axal) axakVar.build());
    }

    @Override // defpackage.cpna
    public final /* bridge */ /* synthetic */ elfl e(Object obj, Object obj2) {
        final axaj axajVar = (axaj) obj;
        final esqv esqvVar = (esqv) obj2;
        if (!esqvVar.a.b.isEmpty()) {
            return this.f.a(esqvVar).i(new eroh() { // from class: cpkg
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj3) {
                    final cpkl cpklVar = cpkl.this;
                    avkh avkhVar = (avkh) cpklVar.a.b();
                    final axaj axajVar2 = axajVar;
                    elfl i = avkhVar.i(cpkl.i(axajVar2.d, awuc.OK));
                    final esqv esqvVar2 = esqvVar;
                    return i.i(new eroh() { // from class: cpkj
                        @Override // defpackage.eroh
                        public final ListenableFuture a(Object obj4) {
                            final awud awudVar = (awud) obj4;
                            awui awuiVar = axajVar2.e;
                            if (awuiVar == null) {
                                awuiVar = awui.a;
                            }
                            cpkl cpklVar2 = cpkl.this;
                            return cpklVar2.c.a(esqvVar2, awuiVar).h(new emwl() { // from class: cpki
                                @Override // defpackage.emwl
                                public final Object apply(Object obj5) {
                                    awud awudVar2 = awud.this;
                                    awud awudVar3 = (awud) obj5;
                                    awuc awucVar = awuc.OK;
                                    awuc b = awuc.b(awudVar2.c);
                                    if (b == null) {
                                        b = awuc.UNKNOWN_STATUS;
                                    }
                                    if (awucVar.equals(b)) {
                                        awuc awucVar2 = awuc.OK;
                                        awuc b2 = awuc.b(awudVar3.c);
                                        if (b2 == null) {
                                            b2 = awuc.UNKNOWN_STATUS;
                                        }
                                        if (awucVar2.equals(b2)) {
                                            awty awtyVar = (awty) awud.a.createBuilder();
                                            awuc awucVar3 = awuc.OK;
                                            awtyVar.copyOnWrite();
                                            awud awudVar4 = (awud) awtyVar.instance;
                                            awudVar4.c = awucVar3.f;
                                            awudVar4.b |= 1;
                                            return (awud) awtyVar.build();
                                        }
                                    }
                                    ensz enszVar = (ensz) ((ensz) cpkm.a.h()).h("com/google/android/apps/messaging/shared/tachygram/chat/TachygramGetGroupInfoWorkHandler$TachygramGetGroupInfoOperation", "mergeChatApiResults", 252, "TachygramGetGroupInfoWorkHandler.java");
                                    awuc b3 = awuc.b(awudVar2.c);
                                    if (b3 == null) {
                                        b3 = awuc.UNKNOWN_STATUS;
                                    }
                                    awuc b4 = awuc.b(awudVar3.c);
                                    if (b4 == null) {
                                        b4 = awuc.UNKNOWN_STATUS;
                                    }
                                    enszVar.u("IncomingChatApi did not succeed in processing a group trigger. \n onTriggerCompleteResult: %d, onGroupNotificationCompleteResult: %d", b3.f, b4.f);
                                    awty awtyVar2 = (awty) awud.a.createBuilder();
                                    awuc awucVar4 = awuc.FAILED_PERMANENTLY;
                                    awtyVar2.copyOnWrite();
                                    awud awudVar5 = (awud) awtyVar2.instance;
                                    awudVar5.c = awucVar4.f;
                                    awudVar5.b |= 1;
                                    return (awud) awtyVar2.build();
                                }
                            }, cpklVar2.b);
                        }
                    }, cpklVar.b);
                }
            }, this.b);
        }
        ((ensz) ((ensz) cpkm.a.h()).h("com/google/android/apps/messaging/shared/tachygram/chat/TachygramGetGroupInfoWorkHandler$TachygramGetGroupInfoOperation", "onSuccess", 165, "TachygramGetGroupInfoWorkHandler.java")).q("Tachygram fetched group information missing the conference URI.");
        return ((avkh) this.a.b()).i(i(axajVar.d, awuc.FAILED_PERMANENTLY));
    }

    @Override // defpackage.cpna
    public final /* bridge */ /* synthetic */ String f(Object obj) {
        awwf awwfVar = ((axaj) obj).c;
        if (awwfVar == null) {
            awwfVar = awwf.a;
        }
        return awwfVar.c;
    }

    @Override // defpackage.cpna
    public final String g() {
        return "TachygramGetGroupInfoOperation";
    }

    @Override // defpackage.cpna
    public final boolean h() {
        return false;
    }
}
