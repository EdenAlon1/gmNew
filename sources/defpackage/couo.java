package defpackage;

import android.text.TextUtils;
import android.util.Xml;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.rcs.client.messaging.data.ContentType;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Instant;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.io.IOException;
import java.io.StringWriter;
import java.util.function.Consumer;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class couo {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/sms/ChatApiSender");
    public static final ckbx b = ckbx.j(0, 0).a();
    public final errl c;
    public final awtm d;
    public final ffbr e;
    public final ffbr f;
    public final avuh g;
    public final cpev h;
    public final ffbr i;
    public final cslr j;
    private final avkj k;
    private final avtu l;
    private final avla m;
    private final ffbr n;
    private final avtx o;

    public couo(avkj avkjVar, awtm awtmVar, avtu avtuVar, avla avlaVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, errl errlVar, ffbr ffbrVar4, avuh avuhVar, cslr cslrVar, avtx avtxVar, cpev cpevVar) {
        this.k = avkjVar;
        this.c = errlVar;
        this.d = awtmVar;
        this.l = avtuVar;
        this.m = avlaVar;
        this.e = ffbrVar;
        this.n = ffbrVar2;
        this.f = ffbrVar4;
        this.g = avuhVar;
        this.j = cslrVar;
        this.o = avtxVar;
        this.h = cpevVar;
        this.i = ffbrVar3;
    }

    public static boolean j(MessageCoreData messageCoreData, covl covlVar) {
        return covlVar.b(messageCoreData);
    }

    public static ckbx k(Exception exc, bdhg bdhgVar, int i) {
        ensk j = a.j();
        j.Y(ente.a, "BugleRcs");
        enrr enrrVar = (enrr) ((enrr) j).g(exc);
        enrrVar.Y(csux.f, bdhgVar);
        ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/sms/ChatApiSender", "exceptionToMessageStatusPlusUri", 1175, "ChatApiSender.java")).t("Sending message failed. Operation should not be retried. MessageType=%s", coun.a(i));
        eqww eqwwVar = exc instanceof cowg ? eqww.CHAT_API_SERIALIZATION_ERROR : eqww.CHAT_API_GENERIC_TRANSPORT_ERROR;
        ckbw j2 = ckbx.j(3, 10003);
        j2.b(1);
        eqxh eqxhVar = (eqxh) eqxi.a.createBuilder();
        eqxj eqxjVar = (eqxj) eqxk.a.createBuilder();
        eqxjVar.copyOnWrite();
        eqxk eqxkVar = (eqxk) eqxjVar.instance;
        eqxkVar.e = 1;
        eqxkVar.b |= 4;
        eqxjVar.copyOnWrite();
        eqxk eqxkVar2 = (eqxk) eqxjVar.instance;
        eqxkVar2.f = eqwwVar.C;
        eqxkVar2.b |= 8;
        eqxhVar.copyOnWrite();
        eqxi eqxiVar = (eqxi) eqxhVar.instance;
        eqxk eqxkVar3 = (eqxk) eqxjVar.build();
        eqxkVar3.getClass();
        eqxiVar.c = eqxkVar3;
        eqxiVar.b = 1 | eqxiVar.b;
        ((ckaw) j2).d = (eqxi) eqxhVar.build();
        return j2.a();
    }

    public static ckdq l(Exception exc, bdhg bdhgVar, int i) {
        ensk j = a.j();
        j.Y(ente.a, "BugleRcs");
        enrr enrrVar = (enrr) ((enrr) j).g(exc);
        enrrVar.Y(csux.f, bdhgVar);
        ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/sms/ChatApiSender", "exceptionToInvocationResultAndDiagnostics", 1203, "ChatApiSender.java")).t("Sending message failed. Operation should not be retried. MessageType=%s", coun.a(i));
        ckdq ckdqVar = new ckdq();
        ckdqVar.a = false;
        eqww eqwwVar = exc instanceof cowg ? eqww.CHAT_API_SERIALIZATION_ERROR : eqww.CHAT_API_GENERIC_TRANSPORT_ERROR;
        eqxh eqxhVar = (eqxh) eqxi.a.createBuilder();
        eqxj eqxjVar = (eqxj) eqxk.a.createBuilder();
        eqxjVar.copyOnWrite();
        eqxk eqxkVar = (eqxk) eqxjVar.instance;
        eqxkVar.e = 1;
        eqxkVar.b |= 4;
        eqxjVar.copyOnWrite();
        eqxk eqxkVar2 = (eqxk) eqxjVar.instance;
        eqxkVar2.f = eqwwVar.C;
        eqxkVar2.b |= 8;
        eqxhVar.copyOnWrite();
        eqxi eqxiVar = (eqxi) eqxhVar.instance;
        eqxk eqxkVar3 = (eqxk) eqxjVar.build();
        eqxkVar3.getClass();
        eqxiVar.c = eqxkVar3;
        eqxiVar.b |= 1;
        ckdqVar.b = (eqxi) eqxhVar.build();
        return ckdqVar;
    }

    public static boolean p(MessageCoreData messageCoreData) {
        return (TextUtils.isEmpty(messageCoreData.ay()) || messageCoreData.cr()) ? false : true;
    }

    private final eqxi q(awud awudVar) {
        eqxj eqxjVar = (eqxj) eqxk.a.createBuilder();
        eqxjVar.copyOnWrite();
        eqxk eqxkVar = (eqxk) eqxjVar.instance;
        eqxkVar.e = 1;
        eqxkVar.b |= 4;
        awua b2 = awua.b(awudVar.d);
        if (b2 == null) {
            b2 = awua.UNKNOWN_CAUSE;
        }
        eqww eqwwVar = (eqww) this.l.fP(b2);
        eqxjVar.copyOnWrite();
        eqxk eqxkVar2 = (eqxk) eqxjVar.instance;
        eqxkVar2.f = eqwwVar.C;
        eqxkVar2.b |= 8;
        avla avlaVar = this.m;
        awuc b3 = awuc.b(awudVar.c);
        if (b3 == null) {
            b3 = awuc.UNKNOWN_STATUS;
        }
        eqwy eqwyVar = (eqwy) avlaVar.fP(b3);
        eqxjVar.copyOnWrite();
        eqxk eqxkVar3 = (eqxk) eqxjVar.instance;
        eqxkVar3.g = eqwyVar.f;
        eqxkVar3.b |= 16;
        eqxk eqxkVar4 = (eqxk) eqxjVar.build();
        eqxh eqxhVar = (eqxh) eqxi.a.createBuilder();
        eqxhVar.copyOnWrite();
        eqxi eqxiVar = (eqxi) eqxhVar.instance;
        eqxkVar4.getClass();
        eqxiVar.c = eqxkVar4;
        eqxiVar.b |= 1;
        return (eqxi) eqxhVar.build();
    }

    public final axad a(MessageCoreData messageCoreData) {
        return (axad) this.g.fP((fjay) Optional.ofNullable(messageCoreData.aJ()).orElse(cslr.a()));
    }

    public final ckbx b(awzd awzdVar) {
        awud awudVar = awzdVar.c;
        if (awudVar == null) {
            awudVar = awud.a;
        }
        awua b2 = awua.b(awudVar.d);
        if (b2 == null) {
            b2 = awua.UNKNOWN_CAUSE;
        }
        awud awudVar2 = awzdVar.c;
        if (awudVar2 == null) {
            awudVar2 = awud.a;
        }
        awuc b3 = awuc.b(awudVar2.c);
        if (b3 == null) {
            b3 = awuc.UNKNOWN_STATUS;
        }
        int i = b2.v;
        int ordinal = b3.ordinal();
        if (ordinal == 1) {
            return ckbx.j(0, i).a();
        }
        if (ordinal == 2) {
            return ckbx.j(-1, i).a();
        }
        if (ordinal == 3) {
            ensk j = a.j();
            j.Y(ente.a, "BugleRcs");
            ((enrr) ((enrr) j).h("com/google/android/apps/messaging/shared/sms/ChatApiSender", "responseToMessageStatusPlusUri", 1238, "ChatApiSender.java")).q("ChatAPI response returned transient failure, setting message send status to AUTO_RETRY");
            ckbw j2 = ckbx.j(1, i);
            j2.b(1);
            awud awudVar3 = awzdVar.c;
            if (awudVar3 == null) {
                awudVar3 = awud.a;
            }
            ((ckaw) j2).d = q(awudVar3);
            awyp awypVar = awzdVar.g;
            if (awypVar == null) {
                awypVar = awyp.a;
            }
            j2.c(awypVar);
            return j2.a();
        }
        if (ordinal != 4) {
            ckbw j3 = ckbx.j(3, i);
            j3.b(1);
            return j3.a();
        }
        ckbw j4 = ckbx.j(3, i);
        j4.b(1);
        awud awudVar4 = awzdVar.c;
        if (awudVar4 == null) {
            awudVar4 = awud.a;
        }
        ((ckaw) j4).d = q(awudVar4);
        awyp awypVar2 = awzdVar.g;
        if (awypVar2 == null) {
            awypVar2 = awyp.a;
        }
        j4.c(awypVar2);
        return j4.a();
    }

    public final elfl c(final MessageCoreData messageCoreData, bdhg bdhgVar, awul awulVar, fayv fayvVar, avkl avklVar, awzj awzjVar, awya awyaVar) {
        return e(bdhgVar, awulVar, fayvVar, avklVar, awzjVar, awyaVar, (awui) messageCoreData.af().orElseThrow(new Supplier() { // from class: coul
            @Override // java.util.function.Supplier
            public final Object get() {
                enru enruVar = couo.a;
                return new coum(MessageCoreData.this.an());
            }
        }));
    }

    public final elfl d(final bdhg bdhgVar, avkl avklVar, awzn awznVar, Instant instant, cown cownVar, awya awyaVar, awui awuiVar) {
        elfl e;
        ekzz f = eleg.f("ChatApiSender::sendMessageReceiptForUnsavedMessage");
        try {
            fayv fayvVar = fayv.a;
            try {
                awul a2 = cownVar.a(awznVar, bdhgVar, instant);
                bdhg a3 = this.d.a();
                ensk h = a.h();
                h.Y(ente.a, "BugleRcs");
                enrr enrrVar = (enrr) h;
                enrrVar.Y(csux.f, bdhgVar);
                ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/sms/ChatApiSender", "sendSerializedMessageReceipt", 1077, "ChatApiSender.java")).D("Generated new RCS Message ID %s for outgoing report type: %s", a3.f(), awznVar.name());
                if (awzn.DELIVERY.equals(awznVar)) {
                    ((avkz) this.e.b()).a(bdhgVar, a3);
                }
                awzi awziVar = (awzi) awzj.a.createBuilder();
                String f2 = a3.f();
                awziVar.copyOnWrite();
                awzj awzjVar = (awzj) awziVar.instance;
                awzjVar.b |= 1;
                awzjVar.e = f2;
                awzl awzlVar = (awzl) awzo.a.createBuilder();
                String f3 = bdhgVar.f();
                awzlVar.copyOnWrite();
                awzo awzoVar = (awzo) awzlVar.instance;
                awzoVar.b |= 1;
                awzoVar.c = f3;
                awzlVar.copyOnWrite();
                awzo awzoVar2 = (awzo) awzlVar.instance;
                awzoVar2.d = awznVar.e;
                awzoVar2.b |= 2;
                awziVar.copyOnWrite();
                awzj awzjVar2 = (awzj) awziVar.instance;
                awzo awzoVar3 = (awzo) awzlVar.build();
                awzoVar3.getClass();
                awzjVar2.d = awzoVar3;
                awzjVar2.c = 5;
                axad axadVar = (axad) this.g.fP(cslr.a());
                awziVar.copyOnWrite();
                awzj awzjVar3 = (awzj) awziVar.instance;
                axadVar.getClass();
                awzjVar3.g = axadVar;
                awzjVar3.b |= 4;
                this.h.d(bdhgVar.f(), axadVar.c);
                try {
                    e = e(a3, a2, fayvVar, avklVar, (awzj) awziVar.build(), awyaVar, awuiVar).h(new emwl() { // from class: cott
                        @Override // defpackage.emwl
                        public final Object apply(Object obj) {
                            return couo.this.m((awzd) obj, 4);
                        }
                    }, this.c).e(IllegalArgumentException.class, new emwl() { // from class: cotu
                        @Override // defpackage.emwl
                        public final Object apply(Object obj) {
                            return couo.l((IllegalArgumentException) obj, bdhg.this, 4);
                        }
                    }, this.c);
                } catch (IllegalArgumentException e2) {
                    e = elfo.e(l(e2, bdhgVar, 4));
                }
            } catch (IllegalArgumentException e3) {
                e = elfo.e(l(e3, bdhgVar, 4));
            }
            f.b(e);
            f.close();
            return e;
        } finally {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final elfl e(final bdhg bdhgVar, awul awulVar, fayv fayvVar, avkl avklVar, awzj awzjVar, awya awyaVar, awui awuiVar) {
        final Optional empty;
        awui a2;
        awuh awuhVar = awuh.PHONE;
        awuh b2 = awuh.b(awuiVar.c);
        if (b2 == null) {
            b2 = awuh.UNKNOWN_TYPE;
        }
        emxf.m(awuhVar.equals(b2), "Only phone identity supported.");
        if ((awzjVar.b & 4) != 0) {
            axad axadVar = awzjVar.g;
            if (axadVar == null) {
                axadVar = axad.a;
            }
            empty = Optional.of(axadVar);
        } else {
            empty = Optional.empty();
        }
        if (avklVar.d()) {
            a2 = avklVar.b().d;
            if (a2 == null) {
                a2 = awui.a;
            }
        } else {
            a2 = avklVar.a();
        }
        String a3 = avklVar.d() ? avklVar.b().c : avki.a(a2);
        awzi awziVar = (awzi) awzjVar.toBuilder();
        awziVar.copyOnWrite();
        awzj awzjVar2 = (awzj) awziVar.instance;
        a3.getClass();
        awzjVar2.b |= 2;
        awzjVar2.f = a3;
        awziVar.copyOnWrite();
        awzj awzjVar3 = (awzj) awziVar.instance;
        awuiVar.getClass();
        awzjVar3.i = awuiVar;
        awzjVar3.b |= 16;
        awziVar.copyOnWrite();
        awzj awzjVar4 = (awzj) awziVar.instance;
        a2.getClass();
        awzjVar4.h = a2;
        awzjVar4.b |= 8;
        awzj awzjVar5 = (awzj) awziVar.build();
        final awyy awyyVar = (awyy) awyz.a.createBuilder();
        awyyVar.copyOnWrite();
        awyz awyzVar = (awyz) awyyVar.instance;
        awuiVar.getClass();
        awyzVar.c = awuiVar;
        awyzVar.b |= 1;
        awyyVar.copyOnWrite();
        awyz awyzVar2 = (awyz) awyyVar.instance;
        a2.getClass();
        awyzVar2.d = a2;
        awyzVar2.b |= 2;
        String e = bdhg.e(bdhgVar);
        awyyVar.copyOnWrite();
        awyz awyzVar3 = (awyz) awyyVar.instance;
        awyzVar3.b |= 32;
        awyzVar3.h = e;
        awyyVar.copyOnWrite();
        awyz awyzVar4 = (awyz) awyyVar.instance;
        a3.getClass();
        awyzVar4.b |= 64;
        awyzVar4.i = a3;
        awyyVar.copyOnWrite();
        awyz awyzVar5 = (awyz) awyyVar.instance;
        awulVar.getClass();
        awyzVar5.k = awulVar;
        awyzVar5.b |= 256;
        awyyVar.copyOnWrite();
        awyz awyzVar6 = (awyz) awyyVar.instance;
        fayvVar.getClass();
        awyzVar6.j = fayvVar;
        awyzVar6.b |= 128;
        eyee byteString = awzjVar5.toByteString();
        awyyVar.copyOnWrite();
        awyz awyzVar7 = (awyz) awyyVar.instance;
        awyzVar7.b |= 512;
        awyzVar7.l = byteString;
        awyyVar.copyOnWrite();
        awyz awyzVar8 = (awyz) awyyVar.instance;
        awyaVar.getClass();
        awyzVar8.m = awyaVar;
        awyzVar8.b |= 1024;
        if (avklVar.d() && avklVar.b) {
            awui awuiVar2 = (awui) avklVar.c().get(0);
            awyyVar.copyOnWrite();
            awyz awyzVar9 = (awyz) awyyVar.instance;
            awuiVar2.getClass();
            awyzVar9.e = awuiVar2;
            awyzVar9.b |= 4;
        }
        empty.ifPresent(new Consumer() { // from class: coug
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                awyy awyyVar2 = awyy.this;
                axad axadVar2 = (axad) obj;
                awyyVar2.copyOnWrite();
                awyz awyzVar10 = (awyz) awyyVar2.instance;
                awyz awyzVar11 = awyz.a;
                axadVar2.getClass();
                awyzVar10.n = axadVar2;
                awyzVar10.b |= 2048;
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        ((avle) this.f.b()).c(empty, bdhgVar);
        ekzz f = eleg.f("ChatApiSender::sendChatMessage::OutgoingChatApi::sendMessage");
        try {
            elfl e2 = this.k.e((awyz) awyyVar.build());
            f.b(e2);
            f.close();
            return e2.h(new emwl() { // from class: cots
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    awzd awzdVar = (awzd) obj;
                    ((avle) couo.this.f.b()).d(empty, bdhgVar);
                    return awzdVar;
                }
            }, this.c);
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final elfl f(final MessageCoreData messageCoreData, final avkl avklVar, cowk cowkVar, final emwl emwlVar, awvd awvdVar, final awya awyaVar) {
        elfl e;
        ekzz f = eleg.f("ChatApiSender::sendFileTransferDetails");
        try {
            if (awvdVar == null) {
                ensk j = a.j();
                j.Y(ente.a, "BugleRcs");
                enrr enrrVar = (enrr) j;
                enrrVar.Y(csux.f, messageCoreData.E());
                ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/sms/ChatApiSender", "sendFileTransferDetailsNotTraced", 773, "ChatApiSender.java")).q("Missing file upload result while attempting to send file transfer details");
                ckbw j2 = ckbx.j(3, 10003);
                j2.b(1);
                eqxh eqxhVar = (eqxh) eqxi.a.createBuilder();
                eqxj eqxjVar = (eqxj) eqxk.a.createBuilder();
                eqxjVar.copyOnWrite();
                eqxk eqxkVar = (eqxk) eqxjVar.instance;
                eqxkVar.e = 1;
                eqxkVar.b = 4 | eqxkVar.b;
                eqww eqwwVar = eqww.CHAT_API_INVALID_FILE_UPLOAD_RESULT;
                eqxjVar.copyOnWrite();
                eqxk eqxkVar2 = (eqxk) eqxjVar.instance;
                eqxkVar2.f = eqwwVar.C;
                eqxkVar2.b |= 8;
                eqxhVar.copyOnWrite();
                eqxi eqxiVar = (eqxi) eqxhVar.instance;
                eqxk eqxkVar3 = (eqxk) eqxjVar.build();
                eqxkVar3.getClass();
                eqxiVar.c = eqxkVar3;
                eqxiVar.b = 1 | eqxiVar.b;
                ((ckaw) j2).d = (eqxi) eqxhVar.build();
                e = elfo.e(j2.a());
            } else {
                final bdhg E = messageCoreData.E();
                awzi awziVar = (awzi) awzj.a.createBuilder();
                String f2 = E.f();
                awziVar.copyOnWrite();
                awzj awzjVar = (awzj) awziVar.instance;
                awzjVar.b |= 1;
                awzjVar.e = f2;
                awze awzeVar = (awze) awzf.a.createBuilder();
                boolean d = avklVar.d();
                awzeVar.copyOnWrite();
                awzf awzfVar = (awzf) awzeVar.instance;
                awzfVar.b |= 2;
                awzfVar.d = d;
                eyja d2 = eykm.d(messageCoreData.r());
                awzeVar.copyOnWrite();
                awzf awzfVar2 = (awzf) awzeVar.instance;
                d2.getClass();
                awzfVar2.c = d2;
                awzfVar2.b = 1 | awzfVar2.b;
                awziVar.copyOnWrite();
                awzj awzjVar2 = (awzj) awziVar.instance;
                awzf awzfVar3 = (awzf) awzeVar.build();
                awzfVar3.getClass();
                awzjVar2.d = awzfVar3;
                awzjVar2.c = 4;
                axad a2 = a(messageCoreData);
                awziVar.copyOnWrite();
                awzj awzjVar3 = (awzj) awziVar.instance;
                a2.getClass();
                awzjVar3.g = a2;
                awzjVar3.b = 4 | awzjVar3.b;
                final awzj awzjVar4 = (awzj) awziVar.build();
                try {
                    e = cowkVar.a(awvdVar, messageCoreData, avklVar).i(new eroh() { // from class: cotz
                        @Override // defpackage.eroh
                        public final ListenableFuture a(Object obj) {
                            emwl emwlVar2 = emwlVar;
                            MessageCoreData messageCoreData2 = messageCoreData;
                            awul awulVar = (awul) obj;
                            return couo.this.c(messageCoreData2, messageCoreData2.E(), awulVar, (fayv) emwlVar2.apply(messageCoreData2), avklVar, awzjVar4, awyaVar);
                        }
                    }, this.c).h(new coui(this), this.c).e(IllegalArgumentException.class, new emwl() { // from class: coua
                        @Override // defpackage.emwl
                        public final Object apply(Object obj) {
                            return couo.k((IllegalArgumentException) obj, bdhg.this, 3);
                        }
                    }, this.c);
                } catch (IllegalArgumentException e2) {
                    e = elfo.e(k(e2, E, 3));
                }
            }
            f.b(e);
            f.close();
            return e;
        } finally {
        }
    }

    public final elfl g(final MessageCoreData messageCoreData, final avkl avklVar, covl covlVar, final emwl emwlVar, final awya awyaVar) {
        elfl e;
        ekzz f = eleg.f("ChatApiSender::sendLocationInformationNotTraced");
        try {
            if (j(messageCoreData, covlVar)) {
                final bdhg E = messageCoreData.E();
                awzi awziVar = (awzi) awzj.a.createBuilder();
                String f2 = E.f();
                awziVar.copyOnWrite();
                awzj awzjVar = (awzj) awziVar.instance;
                awzjVar.b |= 1;
                awzjVar.e = f2;
                awzg awzgVar = (awzg) awzh.a.createBuilder();
                boolean d = avklVar.d();
                awzgVar.copyOnWrite();
                awzh awzhVar = (awzh) awzgVar.instance;
                awzhVar.b |= 2;
                awzhVar.d = d;
                eyja d2 = eykm.d(messageCoreData.r());
                awzgVar.copyOnWrite();
                awzh awzhVar2 = (awzh) awzgVar.instance;
                d2.getClass();
                awzhVar2.c = d2;
                awzhVar2.b |= 1;
                awziVar.copyOnWrite();
                awzj awzjVar2 = (awzj) awziVar.instance;
                awzh awzhVar3 = (awzh) awzgVar.build();
                awzhVar3.getClass();
                awzjVar2.d = awzhVar3;
                awzjVar2.c = 3;
                axad a2 = a(messageCoreData);
                awziVar.copyOnWrite();
                awzj awzjVar3 = (awzj) awziVar.instance;
                a2.getClass();
                awzjVar3.g = a2;
                awzjVar3.b |= 4;
                final awzj awzjVar4 = (awzj) awziVar.build();
                try {
                    e = covlVar.a(messageCoreData, avklVar).i(new eroh() { // from class: cotx
                        @Override // defpackage.eroh
                        public final ListenableFuture a(Object obj) {
                            emwl emwlVar2 = emwlVar;
                            MessageCoreData messageCoreData2 = messageCoreData;
                            awul awulVar = (awul) obj;
                            return couo.this.c(messageCoreData2, messageCoreData2.E(), awulVar, (fayv) emwlVar2.apply(messageCoreData2), avklVar, awzjVar4, awyaVar);
                        }
                    }, this.c).h(new coui(this), this.c).e(IllegalArgumentException.class, new emwl() { // from class: coty
                        @Override // defpackage.emwl
                        public final Object apply(Object obj) {
                            return couo.k((IllegalArgumentException) obj, bdhg.this, 2);
                        }
                    }, this.c);
                } catch (IllegalArgumentException e2) {
                    e = elfo.e(k(e2, E, 2));
                }
            } else {
                e = elfo.e(b);
            }
            f.b(e);
            f.close();
            return e;
        } finally {
        }
    }

    public final elfl h(final MessageCoreData messageCoreData, final avkl avklVar, final awzn awznVar, cown cownVar, final emwl emwlVar, final awya awyaVar) {
        elfl e;
        ekzz f = eleg.f("ChatApiSender::sendMessageReceipt");
        try {
            final bdhg E = messageCoreData.E();
            try {
                e = cownVar.c(awznVar, messageCoreData, avklVar).i(new eroh() { // from class: coub
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj) {
                        emwl emwlVar2 = emwlVar;
                        MessageCoreData messageCoreData2 = messageCoreData;
                        awul awulVar = (awul) obj;
                        fayv fayvVar = (fayv) emwlVar2.apply(messageCoreData2);
                        final couo couoVar = couo.this;
                        bdhg a2 = couoVar.d.a();
                        boolean a3 = ((augx) couoVar.i.b()).a();
                        final bdhg bdhgVar = E;
                        avkl avklVar2 = avklVar;
                        awzn awznVar2 = awznVar;
                        awya awyaVar2 = awyaVar;
                        if (!a3 && awznVar2 == awzn.DELIVERY_FAILED) {
                            ensk j = couo.a.j();
                            j.Y(ente.a, "BugleRcs");
                            enrr enrrVar = (enrr) j;
                            enrrVar.Y(csux.f, bdhgVar);
                            ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/sms/ChatApiSender", "sendSerializedMessageReceipt", 1010, "ChatApiSender.java")).t("Not send negative delivery report for RCS Message ID %s as the flag is off", a2.f());
                            ckdq ckdqVar = new ckdq();
                            ckdqVar.b = eqxi.a;
                            ckdqVar.a = true;
                            return elfo.e(ckdqVar);
                        }
                        ensk h = couo.a.h();
                        h.Y(ente.a, "BugleRcs");
                        enrr enrrVar2 = (enrr) h;
                        enrrVar2.Y(csux.f, bdhgVar);
                        ((enrr) enrrVar2.h("com/google/android/apps/messaging/shared/sms/ChatApiSender", "sendSerializedMessageReceipt", 1021, "ChatApiSender.java")).D("Generated new RCS Message ID %s for outgoing report type: %s", a2.f(), awznVar2.name());
                        if (Objects.equals(awznVar2, awzn.DELIVERY)) {
                            ((avkz) couoVar.e.b()).a(bdhgVar, a2);
                        }
                        awzi awziVar = (awzi) awzj.a.createBuilder();
                        String f2 = a2.f();
                        awziVar.copyOnWrite();
                        awzj awzjVar = (awzj) awziVar.instance;
                        awzjVar.b |= 1;
                        awzjVar.e = f2;
                        awzl awzlVar = (awzl) awzo.a.createBuilder();
                        String f3 = bdhgVar.f();
                        awzlVar.copyOnWrite();
                        awzo awzoVar = (awzo) awzlVar.instance;
                        awzoVar.b |= 1;
                        awzoVar.c = f3;
                        awzlVar.copyOnWrite();
                        awzo awzoVar2 = (awzo) awzlVar.instance;
                        awzoVar2.d = awznVar2.e;
                        awzoVar2.b |= 2;
                        awziVar.copyOnWrite();
                        awzj awzjVar2 = (awzj) awziVar.instance;
                        awzo awzoVar3 = (awzo) awzlVar.build();
                        awzoVar3.getClass();
                        awzjVar2.d = awzoVar3;
                        awzjVar2.c = 5;
                        axad axadVar = (axad) couoVar.g.fP(cslr.a());
                        awziVar.copyOnWrite();
                        awzj awzjVar3 = (awzj) awziVar.instance;
                        axadVar.getClass();
                        awzjVar3.g = axadVar;
                        awzjVar3.b |= 4;
                        couoVar.h.d(bdhgVar.f(), axadVar.c);
                        try {
                            return couoVar.c(messageCoreData2, a2, awulVar, fayvVar, avklVar2, (awzj) awziVar.build(), awyaVar2).h(new emwl() { // from class: cotv
                                @Override // defpackage.emwl
                                public final Object apply(Object obj2) {
                                    return couo.this.m((awzd) obj2, 4);
                                }
                            }, couoVar.c).e(IllegalArgumentException.class, new emwl() { // from class: cotw
                                @Override // defpackage.emwl
                                public final Object apply(Object obj2) {
                                    return couo.l((IllegalArgumentException) obj2, bdhg.this, 4);
                                }
                            }, couoVar.c);
                        } catch (IllegalArgumentException e2) {
                            return elfo.e(couo.l(e2, bdhgVar, 4));
                        }
                    }
                }, this.c).e(IllegalArgumentException.class, new emwl() { // from class: coud
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        return couo.l((IllegalArgumentException) obj, bdhg.this, 4);
                    }
                }, this.c);
            } catch (IllegalArgumentException e2) {
                e = elfo.e(l(e2, E, 4));
            }
            f.b(e);
            f.close();
            return e;
        } finally {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final elfl i(awui awuiVar, final bdhg bdhgVar, awui awuiVar2) {
        elfl e;
        ekzz f = eleg.f("ChatApiSender::sendRbmSpamReport");
        try {
            String str = awuiVar.d;
            if (str == null) {
                throw new NullPointerException("Null rcsBotId");
            }
            engw r = engw.r(bdhgVar.f());
            if (r == null) {
                throw new NullPointerException("Null rcsMessageIds");
            }
            eiet eietVar = new eiet(str, r);
            emxf.m(((enou) eietVar.b).c <= 10, "Maximum of 10 messages can be reported in a single RBM spam report");
            try {
                ContentType contentType = eika.a;
            } catch (eikm e2) {
                e = elfo.e(k(e2, bdhgVar, 7));
            }
            try {
                StringWriter stringWriter = new StringWriter();
                try {
                    dktf dktfVar = new dktf();
                    dktfVar.a = stringWriter;
                    dktfVar.startDocument(Xml.Encoding.UTF_8.toString(), true);
                    dktfVar.startTag("", "SR");
                    dktfVar.startTag("", "ChatBot");
                    dktfVar.text(eietVar.a);
                    dktfVar.endTag("", "ChatBot");
                    enqv it = eietVar.b.iterator();
                    while (it.hasNext()) {
                        String str2 = (String) it.next();
                        if (!TextUtils.isEmpty(str2)) {
                            dktfVar.startTag("", "Message-ID");
                            dktfVar.text(str2);
                            dktfVar.endTag("", "Message-ID");
                        }
                    }
                    dktfVar.endTag("", "SR");
                    dktfVar.flush();
                    String stringWriter2 = stringWriter.toString();
                    stringWriter.close();
                    eijj eijjVar = new eijj();
                    eijjVar.c(eika.a);
                    eijjVar.b(eyee.A(stringWriter2));
                    eijp a2 = eijjVar.a();
                    bdhg a3 = this.d.a();
                    awzi awziVar = (awzi) awzj.a.createBuilder();
                    String f2 = a3.f();
                    awziVar.copyOnWrite();
                    awzj awzjVar = (awzj) awziVar.instance;
                    awzjVar.b |= 1;
                    awzjVar.e = f2;
                    awzx awzxVar = awzx.a;
                    awziVar.copyOnWrite();
                    awzj awzjVar2 = (awzj) awziVar.instance;
                    awzxVar.getClass();
                    awzjVar2.d = awzxVar;
                    awzjVar2.c = 10;
                    axad axadVar = (axad) this.g.fP(cslr.a());
                    awziVar.copyOnWrite();
                    awzj awzjVar3 = (awzj) awziVar.instance;
                    axadVar.getClass();
                    awzjVar3.g = axadVar;
                    awzjVar3.b |= 4;
                    awzj awzjVar4 = (awzj) awziVar.build();
                    awul awulVar = (awul) this.o.fP(a2);
                    fayv fayvVar = fayv.a;
                    avkl avklVar = new avkl(awuiVar);
                    awxv awxvVar = (awxv) awya.a.createBuilder();
                    awxz awxzVar = awxz.CONTROL;
                    awxvVar.copyOnWrite();
                    awya awyaVar = (awya) awxvVar.instance;
                    awyaVar.c = awxzVar.d;
                    awyaVar.b |= 1;
                    awxx awxxVar = awxx.NORMAL;
                    awxvVar.copyOnWrite();
                    awya awyaVar2 = (awya) awxvVar.instance;
                    awyaVar2.d = awxxVar.e;
                    awyaVar2.b |= 2;
                    awxvVar.copyOnWrite();
                    awya awyaVar3 = (awya) awxvVar.instance;
                    awyaVar3.b |= 8;
                    awyaVar3.f = false;
                    e = e(a3, awulVar, fayvVar, avklVar, awzjVar4, (awya) awxvVar.build(), awuiVar2).h(new coui(this), this.c).e(IllegalArgumentException.class, new emwl() { // from class: couk
                        @Override // defpackage.emwl
                        public final Object apply(Object obj) {
                            return couo.k((IllegalArgumentException) obj, bdhg.this, 7);
                        }
                    }, this.c);
                    f.b(e);
                    f.close();
                    return e;
                } finally {
                }
            } catch (IOException | IllegalArgumentException | IllegalStateException e3) {
                throw new eikm("Error serializing RbmSpamReport.", e3);
            }
        } finally {
        }
    }

    public final ckdq m(awzd awzdVar, int i) {
        ckdq ckdqVar = new ckdq();
        eopq eopqVar = awzdVar.h;
        if (eopqVar == null) {
            eopqVar = eopq.a;
        }
        eqyl b2 = eqyl.b(eopqVar.aa);
        if (b2 == null) {
            b2 = eqyl.UNKNOWN_RCS_TYPE;
        }
        ckdqVar.c = b2;
        ckdqVar.b = eqxi.a;
        awud awudVar = awzdVar.c;
        if (awudVar == null) {
            awudVar = awud.a;
        }
        awuc b3 = awuc.b(awudVar.c);
        if (b3 == null) {
            b3 = awuc.UNKNOWN_STATUS;
        }
        int ordinal = b3.ordinal();
        if (ordinal == 0) {
            ensk j = a.j();
            j.Y(ente.a, "BugleRcs");
            enrr enrrVar = (enrr) ((enrr) j).h("com/google/android/apps/messaging/shared/sms/ChatApiSender", "responseToInvocationResultAndDiagnostics", 1273, "ChatApiSender.java");
            awud awudVar2 = awzdVar.c;
            if (awudVar2 == null) {
                awudVar2 = awud.a;
            }
            awuc b4 = awuc.b(awudVar2.c);
            if (b4 == null) {
                b4 = awuc.UNKNOWN_STATUS;
            }
            enrrVar.D("Received unknown status: %s while sending message. MessageType=%s", b4.name(), coun.a(i));
        } else {
            if (ordinal == 1 || ordinal == 2) {
                ckdqVar.a = true;
                return ckdqVar;
            }
            if (ordinal != 3 && ordinal != 4) {
                return ckdqVar;
            }
        }
        awud awudVar3 = awzdVar.c;
        if (awudVar3 == null) {
            awudVar3 = awud.a;
        }
        ckdqVar.b = q(awudVar3);
        ckdqVar.a = false;
        return ckdqVar;
    }

    public final elfl n(final MessageCoreData messageCoreData, elfl elflVar, final avkl avklVar, final emwl emwlVar, final awya awyaVar, final bdhg bdhgVar, final awzj awzjVar, final int i) {
        return elflVar.i(new eroh() { // from class: couh
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                emwl emwlVar2 = emwlVar;
                MessageCoreData messageCoreData2 = messageCoreData;
                awul awulVar = (awul) obj;
                return couo.this.c(messageCoreData2, messageCoreData2.E(), awulVar, (fayv) emwlVar2.apply(messageCoreData2), avklVar, awzjVar, awyaVar);
            }
        }, this.c).h(new coui(this), this.c).e(IllegalArgumentException.class, new emwl() { // from class: couj
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return couo.k((IllegalArgumentException) obj, bdhg.this, i);
            }
        }, this.c);
    }

    public final elfl o(MessageCoreData messageCoreData, avkl avklVar, cowm cowmVar, emwl emwlVar, awya awyaVar) {
        elfl e;
        ekzz f = eleg.f("ChatApiSender::sendBasicText");
        try {
            if (p(messageCoreData)) {
                bdhg E = messageCoreData.E();
                awzi awziVar = (awzi) awzj.a.createBuilder();
                String f2 = E.f();
                awziVar.copyOnWrite();
                awzj awzjVar = (awzj) awziVar.instance;
                awzjVar.b |= 1;
                awzjVar.e = f2;
                awyw awywVar = (awyw) awyx.a.createBuilder();
                boolean d = avklVar.d();
                awywVar.copyOnWrite();
                awyx awyxVar = (awyx) awywVar.instance;
                awyxVar.b |= 2;
                awyxVar.d = d;
                eyja d2 = eykm.d(messageCoreData.r());
                awywVar.copyOnWrite();
                awyx awyxVar2 = (awyx) awywVar.instance;
                d2.getClass();
                awyxVar2.c = d2;
                awyxVar2.b |= 1;
                awziVar.copyOnWrite();
                awzj awzjVar2 = (awzj) awziVar.instance;
                awyx awyxVar3 = (awyx) awywVar.build();
                awyxVar3.getClass();
                awzjVar2.d = awyxVar3;
                awzjVar2.c = 2;
                axad a2 = a(messageCoreData);
                awziVar.copyOnWrite();
                awzj awzjVar3 = (awzj) awziVar.instance;
                a2.getClass();
                awzjVar3.g = a2;
                awzjVar3.b |= 4;
                try {
                    e = n(messageCoreData, cowmVar.d(messageCoreData, avklVar), avklVar, emwlVar, awyaVar, E, (awzj) awziVar.build(), 1);
                } catch (IllegalArgumentException e2) {
                    e = elfo.e(k(e2, E, 1));
                }
            } else {
                e = elfo.e(b);
            }
            f.b(e);
            f.close();
            return e;
        } finally {
        }
    }
}
