package defpackage;

import com.google.android.rcs.client.messaging.data.ContentType;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.DesugarCollections;
import j$.util.Optional;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cpoa implements cpna {
    public final cpsu a;
    public final ffbr b;
    public final errl c;
    public final cpor d;
    public final ffbr e;
    private final ffbr f;
    private final ffbr g;

    public cpoa(cpsu cpsuVar, ffbr ffbrVar, ffbr ffbrVar2, errl errlVar, cpor cporVar, ffbr ffbrVar3, ffbr ffbrVar4) {
        this.a = cpsuVar;
        this.b = ffbrVar;
        this.f = ffbrVar2;
        this.c = errlVar;
        this.d = cporVar;
        this.g = ffbrVar3;
        this.e = ffbrVar4;
    }

    private static String i(awup awupVar) {
        return ((ContentType) new avty().fP(awupVar)).toString();
    }

    @Override // defpackage.cpna
    public final /* synthetic */ awui a(Object obj) {
        awui awuiVar = ((awyz) obj).d;
        return awuiVar == null ? awui.a : awuiVar;
    }

    @Override // defpackage.cpna
    public final /* bridge */ /* synthetic */ awui b(Object obj) {
        awyz awyzVar = (awyz) obj;
        emxf.b(1 == (awyzVar.b & 1), "Self identity is missing in SendChatMessageRequest");
        awui awuiVar = awyzVar.c;
        return awuiVar == null ? awui.a : awuiVar;
    }

    @Override // defpackage.cpna
    public final /* synthetic */ elfl c(Object obj) {
        int i;
        elfl h;
        awyz awyzVar = (awyz) obj;
        if ((awyzVar.b & 2048) != 0) {
            axad axadVar = awyzVar.n;
            if (axadVar == null) {
                axadVar = axad.a;
            }
            this.d.d(axadVar, bdhg.a(awyzVar.h), 10);
        }
        ekzz f = eleg.f("TachyramSendMessage::convert");
        try {
            cpid cpidVar = new cpid();
            awul awulVar = awyzVar.k;
            if (awulVar == null) {
                awulVar = awul.a;
            }
            final esqf esqfVar = (esqf) cpidVar.fP(awulVar);
            f.close();
            emxf.a(1 == (awyzVar.b & 1));
            int i2 = 2;
            emxf.a((awyzVar.b & 2) != 0);
            final awui awuiVar = awyzVar.c;
            if (awuiVar == null) {
                awuiVar = awui.a;
            }
            final awui awuiVar2 = awyzVar.d;
            if (awuiVar2 == null) {
                awuiVar2 = awui.a;
            }
            ensz enszVar = (ensz) cpob.a.h();
            enszVar.Y(csux.a, awyzVar.h);
            enszVar.Y(csux.o, awyzVar.i);
            ensn ensnVar = csux.x;
            awul awulVar2 = awyzVar.k;
            if (awulVar2 == null) {
                awulVar2 = awul.a;
            }
            awup awupVar = awulVar2.c;
            if (awupVar == null) {
                awupVar = awup.a;
            }
            enszVar.Y(ensnVar, i(awupVar));
            ((ensz) enszVar.h("com/google/android/apps/messaging/shared/tachygram/chat/TachygramSendMessageWorkHandler$TachygramSendMessageOperation", "executeRequest", 186, "TachygramSendMessageWorkHandler.java")).q("Sending message.");
            f = eleg.f("TachygramSendMessage::createMessageMetadata_v2");
            try {
                final esrl a = esrm.a();
                awya awyaVar = awyzVar.m;
                if (awyaVar == null) {
                    awyaVar = awya.a;
                }
                awxx b = awxx.b(awyaVar.d);
                if (b == null) {
                    b = awxx.UNKNOWN_MESSAGE_PRIORITY;
                }
                int ordinal = b.ordinal();
                if (ordinal == 1) {
                    i = 2;
                } else if (ordinal == 2) {
                    i = 3;
                } else {
                    if (ordinal != 3) {
                        throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(b))));
                    }
                    i = 1;
                }
                a.g(i);
                awya awyaVar2 = awyzVar.m;
                if (awyaVar2 == null) {
                    awyaVar2 = awya.a;
                }
                awxx b2 = awxx.b(awyaVar2.d);
                if (b2 == null) {
                    b2 = awxx.UNKNOWN_MESSAGE_PRIORITY;
                }
                if (b2.equals(awxx.LOW)) {
                    i2 = 4;
                } else {
                    awxx b3 = awxx.b(awyaVar2.d);
                    if (b3 == null) {
                        b3 = awxx.UNKNOWN_MESSAGE_PRIORITY;
                    }
                    if (!b3.equals(awxx.NORMAL)) {
                        awxz b4 = awxz.b(awyaVar2.c);
                        if (b4 == null) {
                            b4 = awxz.UNKNOWN_MESSAGE_SOURCE;
                        }
                        int ordinal2 = b4.ordinal();
                        if (ordinal2 != 1) {
                            if (ordinal2 != 2) {
                                throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(b4))));
                            }
                        }
                    }
                    i2 = 3;
                }
                a.h(i2);
                fayv fayvVar = awyzVar.j;
                if (fayvVar == null) {
                    fayvVar = fayv.a;
                }
                int i3 = engw.d;
                engr engrVar = new engr();
                for (Map.Entry entry : DesugarCollections.unmodifiableMap(fayvVar.b).entrySet()) {
                    String str = (String) entry.getKey();
                    for (Map.Entry entry2 : DesugarCollections.unmodifiableMap(((fayz) entry.getValue()).b).entrySet()) {
                        String str2 = (String) entry2.getKey();
                        String str3 = (String) entry2.getValue();
                        str.getClass();
                        str2.getClass();
                        str3.getClass();
                        engrVar.h(new esrk(str, str2, str3));
                    }
                }
                a.i(engrVar.g());
                cpiw cpiwVar = new cpiw();
                awui awuiVar3 = awyzVar.c;
                if (awuiVar3 == null) {
                    awuiVar3 = awui.a;
                }
                a.f((fcek) cpiwVar.fP(awuiVar3));
                a.d(awyzVar.h);
                if ((awyzVar.b & 2048) != 0) {
                    axad axadVar2 = awyzVar.n;
                    if (axadVar2 == null) {
                        axadVar2 = axad.a;
                    }
                    ((esrj) a).a = new esqd(axadVar2.c);
                    ((esrj) a).b = (byte) (((esrj) a).b | Byte.MIN_VALUE);
                }
                if ((awyzVar.b & 4) != 0) {
                    cpiw cpiwVar2 = new cpiw();
                    awui awuiVar4 = awyzVar.e;
                    if (awuiVar4 == null) {
                        awuiVar4 = awui.a;
                    }
                    a.e((fcek) cpiwVar2.fP(awuiVar4));
                    h = ((cpow) this.f.b()).b(awyzVar.i).h(new emwl() { // from class: cpnv
                        @Override // defpackage.emwl
                        public final Object apply(Object obj2) {
                            esrl esrlVar = esrl.this;
                            esrlVar.c((fcek) obj2);
                            return esrlVar;
                        }
                    }, this.c);
                } else {
                    cpow cpowVar = (cpow) this.f.b();
                    awui awuiVar5 = awyzVar.d;
                    if (awuiVar5 == null) {
                        awuiVar5 = awui.a;
                    }
                    h = cpowVar.a(awuiVar5, awyzVar.i).h(new emwl() { // from class: cpnw
                        @Override // defpackage.emwl
                        public final Object apply(Object obj2) {
                            esrl esrlVar = esrl.this;
                            esrlVar.e((fcek) obj2);
                            return esrlVar;
                        }
                    }, this.c);
                }
                elfl h2 = h.h(new emwl() { // from class: cpny
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        return ((esrl) obj2).b();
                    }
                }, this.c);
                f.b(h2);
                f.close();
                return h2.i(new eroh() { // from class: cpnt
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        final esro esroVar = (esro) obj2;
                        boolean booleanValue = ((Boolean) ((cfup) ctjd.ak.get()).e()).booleanValue();
                        final esqf esqfVar2 = esqfVar;
                        awui awuiVar6 = awuiVar;
                        cpoa cpoaVar = cpoa.this;
                        cphu cphuVar = null;
                        if (booleanValue && ((Optional) cpoaVar.e.b()).isPresent()) {
                            cphuVar = ((cphv) ((Optional) cpoaVar.e.b()).get()).a(awuiVar6, awuiVar2, esqfVar2, esroVar);
                        }
                        ekzz f2 = eleg.f("TachygramSendMessage::getTransport_v2");
                        try {
                            elfl e = cpoaVar.a.e(awuiVar6, cphuVar);
                            f2.b(e);
                            f2.close();
                            return e.i(new eroh() { // from class: cpnq
                                @Override // defpackage.eroh
                                public final ListenableFuture a(Object obj3) {
                                    elfl c;
                                    cpry cpryVar = (cpry) obj3;
                                    esqf esqfVar3 = esqf.this;
                                    esqfVar3.getClass();
                                    esro esroVar2 = esroVar;
                                    esroVar2.getClass();
                                    c = axol.c(cpryVar.b, ffhe.a, ffsm.a, new cprx(cpryVar, esqfVar3, esroVar2, null));
                                    return c;
                                }
                            }, cpoaVar.c);
                        } catch (Throwable th) {
                            try {
                                f2.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                }, this.c);
            } finally {
            }
        } finally {
        }
    }

    @Override // defpackage.cpna
    public final /* bridge */ /* synthetic */ elfl d(Object obj, awud awudVar) {
        final awyz awyzVar = (awyz) obj;
        ensz enszVar = (ensz) cpob.a.j();
        enszVar.Y(csux.a, awyzVar.h);
        enszVar.Y(csux.o, awyzVar.i);
        ensn ensnVar = awgo.b;
        awuc b = awuc.b(awudVar.c);
        if (b == null) {
            b = awuc.UNKNOWN_STATUS;
        }
        enszVar.Y(ensnVar, b);
        ensn ensnVar2 = csux.x;
        awul awulVar = awyzVar.k;
        if (awulVar == null) {
            awulVar = awul.a;
        }
        awup awupVar = awulVar.c;
        if (awupVar == null) {
            awupVar = awup.a;
        }
        enszVar.Y(ensnVar2, i(awupVar));
        ((ensz) enszVar.h("com/google/android/apps/messaging/shared/tachygram/chat/TachygramSendMessageWorkHandler$TachygramSendMessageOperation", "onFailure", 230, "TachygramSendMessageWorkHandler.java")).q("TachygramTransport has failed to send the message.");
        this.d.a(awyzVar);
        avkh avkhVar = (avkh) this.b.b();
        eyee eyeeVar = awyzVar.l;
        awzc awzcVar = (awzc) awzd.a.createBuilder();
        awzcVar.copyOnWrite();
        awzd awzdVar = (awzd) awzcVar.instance;
        eyeeVar.getClass();
        awzdVar.b |= 2;
        awzdVar.d = eyeeVar;
        awzcVar.copyOnWrite();
        awzd awzdVar2 = (awzd) awzcVar.instance;
        awudVar.getClass();
        awzdVar2.c = awudVar;
        awzdVar2.b |= 1;
        eopq a = cpje.a();
        awzcVar.copyOnWrite();
        awzd awzdVar3 = (awzd) awzcVar.instance;
        a.getClass();
        awzdVar3.h = a;
        awzdVar3.b |= 32;
        return avkhVar.h((awzd) awzcVar.build()).h(new emwl() { // from class: cpnz
            @Override // defpackage.emwl
            public final Object apply(Object obj2) {
                awud awudVar2 = (awud) obj2;
                cpoa.this.d.b(awyzVar);
                return awudVar2;
            }
        }, this.c);
    }

    @Override // defpackage.cpna
    public final /* bridge */ /* synthetic */ elfl e(Object obj, Object obj2) {
        elfl h;
        final awyz awyzVar = (awyz) obj;
        final essy essyVar = (essy) obj2;
        ensz enszVar = (ensz) cpob.a.h();
        enszVar.Y(csux.a, awyzVar.h);
        enszVar.Y(csux.o, awyzVar.i);
        ensn ensnVar = csux.x;
        awul awulVar = awyzVar.k;
        if (awulVar == null) {
            awulVar = awul.a;
        }
        awup awupVar = awulVar.c;
        if (awupVar == null) {
            awupVar = awup.a;
        }
        enszVar.Y(ensnVar, i(awupVar));
        ((ensz) enszVar.h("com/google/android/apps/messaging/shared/tachygram/chat/TachygramSendMessageWorkHandler$TachygramSendMessageOperation", "onSuccess", 204, "TachygramSendMessageWorkHandler.java")).q("TachygramTransport has successfully processed message sending.");
        this.d.a(awyzVar);
        awui awuiVar = awyzVar.d;
        if (awuiVar == null) {
            awuiVar = awui.a;
        }
        awuh b = awuh.b(awuiVar.c);
        if (b == null) {
            b = awuh.UNKNOWN_TYPE;
        }
        if (b.equals(awuh.PHONE)) {
            awya awyaVar = awyzVar.m;
            if (awyaVar == null) {
                awyaVar = awya.a;
            }
            awxz b2 = awxz.b(awyaVar.c);
            if (b2 == null) {
                b2 = awxz.UNKNOWN_MESSAGE_SOURCE;
            }
            if (b2.equals(awxz.USER)) {
                awxx b3 = awxx.b(awyaVar.d);
                if (b3 == null) {
                    b3 = awxx.UNKNOWN_MESSAGE_PRIORITY;
                }
                if (b3.equals(awxx.HIGH) && !awyaVar.e) {
                    h = elfo.e(true);
                }
            }
            azaw azawVar = (azaw) this.g.b();
            awui awuiVar2 = awyzVar.d;
            if (awuiVar2 == null) {
                awuiVar2 = awui.a;
            }
            h = azawVar.d(awuiVar2).h(new emwl() { // from class: cpnx
                @Override // defpackage.emwl
                public final Object apply(Object obj3) {
                    avlk avlkVar = (avlk) obj3;
                    if (avlkVar.f()) {
                        ((ensz) ((ensz) cpob.a.j()).h("com/google/android/apps/messaging/shared/tachygram/chat/TachygramSendMessageWorkHandler$TachygramSendMessageOperation", "revocationSupported", 398, "TachygramSendMessageWorkHandler.java")).q("Unable to determine whether message revocation is supported because there is no cached capabilities for the remote party.");
                        return false;
                    }
                    boolean e = avlkVar.e("+g.gsma.rcs.msgrevoke");
                    ensz enszVar2 = (ensz) ((ensz) cpob.a.h()).h("com/google/android/apps/messaging/shared/tachygram/chat/TachygramSendMessageWorkHandler$TachygramSendMessageOperation", "revocationSupported", 404, "TachygramSendMessageWorkHandler.java");
                    Boolean valueOf = Boolean.valueOf(e);
                    enszVar2.t("Is message revocation supported based on remote party's capabilities: %b", valueOf);
                    return valueOf;
                }
            }, this.c);
        } else {
            ensz enszVar2 = (ensz) cpob.a.h();
            enszVar2.Y(awgo.c, b);
            ((ensz) enszVar2.h("com/google/android/apps/messaging/shared/tachygram/chat/TachygramSendMessageWorkHandler$TachygramSendMessageOperation", "revocationSupported", 384, "TachygramSendMessageWorkHandler.java")).q("Message revocation not supported. We are not talking to a one to one recipient.");
            h = elfo.e(false);
        }
        return h.h(new emwl() { // from class: cpnu
            @Override // defpackage.emwl
            public final Object apply(Object obj3) {
                awzc awzcVar = (awzc) awzd.a.createBuilder();
                eyee eyeeVar = awyz.this.l;
                awzcVar.copyOnWrite();
                awzd awzdVar = (awzd) awzcVar.instance;
                eyeeVar.getClass();
                awzdVar.b |= 2;
                awzdVar.d = eyeeVar;
                awty awtyVar = (awty) awud.a.createBuilder();
                awuc awucVar = awuc.OK;
                awtyVar.copyOnWrite();
                awud awudVar = (awud) awtyVar.instance;
                awudVar.c = awucVar.f;
                awudVar.b |= 1;
                awud awudVar2 = (awud) awtyVar.build();
                awzcVar.copyOnWrite();
                awzd awzdVar2 = (awzd) awzcVar.instance;
                awudVar2.getClass();
                awzdVar2.c = awudVar2;
                awzdVar2.b |= 1;
                eyja b4 = eykj.b(essyVar.a);
                awzcVar.copyOnWrite();
                awzd awzdVar3 = (awzd) awzcVar.instance;
                b4.getClass();
                awzdVar3.e = b4;
                awzdVar3.b |= 4;
                eopq a = cpje.a();
                awzcVar.copyOnWrite();
                awzd awzdVar4 = (awzd) awzcVar.instance;
                a.getClass();
                awzdVar4.h = a;
                awzdVar4.b |= 32;
                boolean booleanValue = ((Boolean) obj3).booleanValue();
                awzcVar.copyOnWrite();
                awzd awzdVar5 = (awzd) awzcVar.instance;
                awzdVar5.b |= 8;
                awzdVar5.f = booleanValue;
                return (awzd) awzcVar.build();
            }
        }, this.c).i(new eroh() { // from class: cpnr
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj3) {
                return ((avkh) cpoa.this.b.b()).h((awzd) obj3);
            }
        }, this.c).h(new emwl() { // from class: cpns
            @Override // defpackage.emwl
            public final Object apply(Object obj3) {
                awud awudVar = (awud) obj3;
                cpoa.this.d.b(awyzVar);
                return awudVar;
            }
        }, this.c);
    }

    @Override // defpackage.cpna
    public final /* bridge */ /* synthetic */ String f(Object obj) {
        awyz awyzVar = (awyz) obj;
        awui awuiVar = awyzVar.d;
        if (awuiVar == null) {
            awuiVar = awui.a;
        }
        awuh b = awuh.b(awuiVar.c);
        if (b == null) {
            b = awuh.UNKNOWN_TYPE;
        }
        emxf.m(b.equals(awuh.GROUP), "getRcsGroupId called on a non-group operation.");
        return awyzVar.i;
    }

    @Override // defpackage.cpna
    public final String g() {
        return "TachygramSendMessageOperation";
    }

    @Override // defpackage.cpna
    public final boolean h() {
        return true;
    }
}
