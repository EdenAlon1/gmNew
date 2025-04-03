package defpackage;

import j$.time.Instant;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.Iterator;
import java.util.function.Consumer;

/* compiled from: PG */
@Deprecated
/* loaded from: classes8.dex */
public final class cpll {
    public static final entd a = entd.c("BugleTachygram");
    private static final engw i = engw.s(awuc.OK, awuc.FAILED_PERMANENTLY);
    public final avkh b;
    public final ffbr c;
    public final ffbr d;
    public final errl e;
    public final awui f;
    public final ffbr g;
    public final ffbr h;

    public cpll(avkh avkhVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, errl errlVar, ffbr ffbrVar4, fcek fcekVar) {
        this.b = avkhVar;
        this.c = ffbrVar;
        this.d = ffbrVar2;
        this.e = errlVar;
        this.g = ffbrVar3;
        this.h = ffbrVar4;
        this.f = (awui) new cpiw().m().fP(fcekVar);
        emxf.m(!r1.equals(awui.a), "SelfChatEndpoint missing");
    }

    public static engw c(Iterable iterable) {
        int i2 = engw.d;
        engr engrVar = new engr();
        emwd m = new cpiw().m();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            fcek fcekVar = (fcek) it.next();
            fgtg b = fgtg.b(fcekVar.b);
            if (b == null) {
                b = fgtg.UNRECOGNIZED;
            }
            emxf.m(!b.equals(fgtg.GROUP_ID), "A ChatEndpoint participant of a group should not be of type GROUP_ID.");
            engrVar.h((awui) m.fP(fcekVar));
        }
        return engrVar.g();
    }

    public static void d(awud awudVar, String str) {
        awuc b = awuc.b(awudVar.c);
        if (b == null) {
            b = awuc.UNKNOWN_STATUS;
        }
        emxf.n(i.contains(b), "IncomingChatApi returned an unexpected status: %s", b.f);
        awuc awucVar = awuc.FAILED_PERMANENTLY;
        awuc b2 = awuc.b(awudVar.c);
        if (b2 == null) {
            b2 = awuc.UNKNOWN_STATUS;
        }
        if (awucVar.equals(b2)) {
            ((ensz) ((ensz) a.j()).h("com/google/android/apps/messaging/shared/tachygram/chat/TachygramGroupHandlerChapiAdapter", "checkIncomingChatApiStatus", 403, "TachygramGroupHandlerChapiAdapter.java")).t("Chat API failed to process GroupEvent for %s", str);
        }
    }

    public final awvs a(String str, Optional optional, final Instant instant) {
        final awvs awvsVar = (awvs) awvt.c.createBuilder();
        awvsVar.copyOnWrite();
        awvt awvtVar = (awvt) awvsVar.instance;
        str.getClass();
        awvtVar.d |= 1;
        awvtVar.e = str;
        optional.ifPresent(new Consumer() { // from class: cpkq
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                entd entdVar = cpll.a;
                awxe awxeVar = (awxe) awxf.a.createBuilder();
                awui awuiVar = (awui) new cpiw().m().fP((fcek) obj);
                awxeVar.copyOnWrite();
                awxf awxfVar = (awxf) awxeVar.instance;
                awuiVar.getClass();
                awxfVar.c = awuiVar;
                awxfVar.b |= 1;
                eyja b = eykj.b(instant);
                awxeVar.copyOnWrite();
                awxf awxfVar2 = (awxf) awxeVar.instance;
                b.getClass();
                awxfVar2.d = b;
                awxfVar2.b |= 2;
                awxf awxfVar3 = (awxf) awxeVar.build();
                awvs awvsVar2 = awvs.this;
                awvsVar2.copyOnWrite();
                awvt awvtVar2 = (awvt) awvsVar2.instance;
                eygj eygjVar = awvt.a;
                awxfVar3.getClass();
                awvtVar2.p = awxfVar3;
                awvtVar2.d |= 128;
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        awvsVar.copyOnWrite();
        awvt awvtVar2 = (awvt) awvsVar.instance;
        awui awuiVar = this.f;
        awuiVar.getClass();
        awvtVar2.r = awuiVar;
        awvtVar2.d |= 512;
        return awvsVar;
    }

    public final elfl b(awvt awvtVar, final String str) {
        return this.b.c(awvtVar).h(new emwl() { // from class: cpld
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                cpll.d((awud) obj, str);
                return null;
            }
        }, this.e);
    }
}
