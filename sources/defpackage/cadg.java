package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.ims.rcsservice.chatsession.ChatSessionMessageEvent;
import com.google.android.ims.rcsservice.chatsession.message.ChatMessage;
import com.google.android.rcs.client.messaging.data.AutoValue_FileTransferInformation;
import com.google.android.rcs.client.messaging.data.ContentType;
import com.google.android.rcs.client.messaging.data.FileInformation;
import com.google.android.rcs.client.messaging.data.FileTransferInformation;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.communication.synapse.security.scytale.HandleReceiptResult;
import com.google.communication.synapse.security.scytale.NativeMessageEncryptorV2;
import com.google.communication.synapse.security.scytale.Scope;
import com.google.communication.synapse.security.scytale.SecureMessage;
import com.google.communication.synapse.security.scytale.SecureMessageType;
import com.google.communication.synapse.security.scytale.UserDevice;
import com.google.media.webrtc.common.StatusOr;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.Callable;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cadg {
    public static final cskc a = cskc.g("BugleEtouffee", "IncomingEncryptedMessageProcessor");
    public final ffbr b;
    public final caga c;
    public final avty d;
    public final bzze e;
    public final awso f;
    public final cadh g;
    public final cahm h;
    public final akzt i;
    public final errl j;
    public final errl k;
    public final caet l;
    public final avtx m;
    public final bzzi n;
    public final ffbr o;
    private final cqoh p;
    private final ffbr q;
    private final ffbr r;
    private final atmb s;

    public cadg(ffbr ffbrVar, caga cagaVar, cqoh cqohVar, bzze bzzeVar, awso awsoVar, cadh cadhVar, cahm cahmVar, akzt akztVar, errl errlVar, errl errlVar2, caet caetVar, avtx avtxVar, bzzi bzziVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, atmb atmbVar) {
        this.b = ffbrVar;
        this.c = cagaVar;
        this.p = cqohVar;
        this.e = bzzeVar;
        this.f = awsoVar;
        this.g = cadhVar;
        this.h = cahmVar;
        this.l = caetVar;
        this.m = avtxVar;
        this.n = bzziVar;
        this.o = ffbrVar2;
        ContentType contentType = eijr.a;
        ContentType contentType2 = eijw.a;
        this.q = ffbrVar3;
        this.i = akztVar;
        this.k = errlVar2;
        this.j = errlVar;
        this.d = new avty();
        this.r = ffbrVar4;
        this.s = atmbVar;
    }

    public static Bundle a(Optional optional, eopq eopqVar) {
        Bundle bundle = new Bundle();
        bundle.putString("chat.extra.wrappingContentType", djbb.c);
        if (optional.isPresent()) {
            bundle.putString("chat.extra.customDeliveryReceiptContentType", ((ChatMessage) optional.get()).getContentType());
            bundle.putByteArray("chat.extra.customDeliveryReceipt", ((ChatMessage) optional.get()).getContent());
        }
        bundle.putByteArray("chat.extra.logData", eopqVar.toByteArray());
        return bundle;
    }

    public static elfl d(awxk awxkVar) {
        emxf.m((awxkVar.c & 64) != 0, "Receiver must be set");
        awui awuiVar = awxkVar.j;
        if (awuiVar == null) {
            awuiVar = awui.a;
        }
        return elfo.e(awuiVar.d);
    }

    public static void g(Exception exc) {
        csjb e = a.e();
        e.I("No MessageEncryptor available to decrypt incoming message.");
        e.A("errorMessage", exc.getMessage());
        e.r();
    }

    public static boolean i(awxk awxkVar) {
        awui awuiVar = awxkVar.g;
        if (awuiVar == null) {
            awuiVar = awui.a;
        }
        awuh b = awuh.b(awuiVar.c);
        if (b == null) {
            b = awuh.UNKNOWN_TYPE;
        }
        return b.equals(awuh.GROUP);
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0161  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ckep b(defpackage.awrj r8) {
        /*
            Method dump skipped, instructions count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cadg.b(awrj):ckep");
    }

    public final elfl c(final awrj awrjVar, final eyee eyeeVar) {
        final elfl d = d(((awnu) awrjVar).a);
        final elfl i = d.i(new eroh() { // from class: cacy
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                return ((bzvx) cadg.this.b.b()).b((String) obj);
            }
        }, this.k);
        return i.i(new eroh() { // from class: cacz
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                final NativeMessageEncryptorV2 nativeMessageEncryptorV2 = (NativeMessageEncryptorV2) obj;
                final faym faymVar = (faym) eyfy.parseFrom(faym.a, eyeeVar, eyfc.a());
                final awrj awrjVar2 = awrjVar;
                if (bzwf.g() && faymVar.e) {
                    csjb e = cadg.a.e();
                    e.I("Unexpected FTD is received.");
                    e.h(bdhg.a(((awnu) awrjVar2).a.l));
                    e.r();
                    return elfo.e(caes.e(bzwg.INVALID_FTD_RECEIPT));
                }
                elfl elflVar = d;
                final cadg cadgVar = cadg.this;
                String str = (String) erqt.q(elflVar);
                final bdhg a2 = bdhg.a(((awnu) awrjVar2).a.l);
                return cadgVar.c.a(str).i(new eroh() { // from class: cacr
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        cadg cadgVar2 = cadg.this;
                        faym faymVar2 = faymVar;
                        ckep b = cadgVar2.b(awrjVar2);
                        NativeMessageEncryptorV2 nativeMessageEncryptorV22 = nativeMessageEncryptorV2;
                        caes a3 = cadgVar2.l.a((String) obj2, faymVar2, b, nativeMessageEncryptorV22);
                        cadgVar2.h(a3, a2);
                        return elfo.e(a3);
                    }
                }, cadgVar.j);
            }
        }, this.k).e(eygu.class, new emwl() { // from class: cada
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                csjb e = cadg.a.e();
                e.I("Unable to parse the incoming chat message content as a MessageEnvelope.");
                e.A("errorMessage", ((eygu) obj).getMessage());
                e.r();
                return caes.e(bzwg.INVALID_PROTOCOL_BUFFER);
            }
        }, this.k).e(IllegalStateException.class, new emwl() { // from class: cadb
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                cadg.g((IllegalStateException) obj);
                return caes.e(bzwg.ENCRYPTOR_NOT_FOUND);
            }
        }, this.k).i(new eroh() { // from class: cadc
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                return cadg.this.e(awrjVar, (caes) obj, i);
            }
        }, this.k);
    }

    public final elfl e(final awrj awrjVar, final caes caesVar, final elfl elflVar) {
        return elfo.h(new erog() { // from class: caco
            @Override // defpackage.erog
            public final ListenableFuture a() {
                elfl elflVar2;
                caes caesVar2 = caesVar;
                final fays b = caesVar2.b();
                final Optional ofNullable = Optional.ofNullable(caesVar2.a());
                final cadg cadgVar = cadg.this;
                final awrj awrjVar2 = awrjVar;
                if (b == null) {
                    bzwg bzwgVar = (bzwg) caesVar2.c().orElse(ofNullable.isPresent() ? bzwg.FTD : bzwg.EMPTY_ENCRYPTED_ENVELOPE);
                    cadgVar.n.f(bdhg.a(((awnu) awrjVar2).a.l), bdhg.a, 4, 24, eont.a(((Integer) Optional.of(bzwgVar).map(new Function() { // from class: bzzf
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            return Integer.valueOf(((bzwg) obj).y + 10);
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }).orElse(0)).intValue()));
                    cadgVar.i.e("Bugle.Etouffee.DecryptionAborted.Reason", bzwgVar.y);
                    if (!ofNullable.isEmpty()) {
                        return cadgVar.f(awrjVar2, ofNullable);
                    }
                    cadg.a.p("No decrypted message and no FTD receipt. Drop the message.");
                    return elfo.e(avui.FAIL_NO_RETRY);
                }
                elfl elflVar3 = elflVar;
                final ContentType e = ContentType.e(b.c);
                final NativeMessageEncryptorV2 nativeMessageEncryptorV2 = (NativeMessageEncryptorV2) erqt.q(elflVar3);
                if ((bzwf.g() && ((Boolean) bzwf.d.e()).booleanValue()) || bzwf.f()) {
                    ContentType e2 = ContentType.e(b.c);
                    if (eijq.e.f(e2) || eijq.c.f(e2) || eijq.b.f(e2)) {
                        fayv fayvVar = b.f;
                        if (fayvVar == null) {
                            fayvVar = fayv.a;
                        }
                        if (clbh.a(fayvVar, clbg.ETOUFFEE_NAMESPACE, "original-message-id").isPresent()) {
                            final cahm cahmVar = cadgVar.h;
                            elflVar2 = elfo.g(new Callable() { // from class: cahh
                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    cahm.a.m("Converting a resent message to group message.");
                                    fayv fayvVar2 = b.f;
                                    if (fayvVar2 == null) {
                                        fayvVar2 = fayv.a;
                                    }
                                    awrj awrjVar3 = awrjVar2;
                                    cahm cahmVar2 = cahm.this;
                                    Optional a2 = cahmVar2.a(fayvVar2);
                                    if (a2.isEmpty()) {
                                        cahm.a.r("The received message is not a valid resent message.");
                                        ((bzzi) cahmVar2.i.b()).c(bdhg.a(((awnu) awrjVar3).a.l), 47);
                                        throw new caic("Invalid resent message request.");
                                    }
                                    bdhg bdhgVar = (bdhg) a2.get();
                                    MessageCoreData w = ((bdmq) cahmVar2.e.b()).w(bdhgVar);
                                    if (w == null) {
                                        cahm.a.r("The original message is not found or invalid for resending.");
                                        ((bzzi) cahmVar2.i.b()).c(bdhg.a(((awnu) awrjVar3).a.l), 48);
                                        throw new caic("The original message is not found for the resent message.");
                                    }
                                    bseh r = ((bczy) cahmVar2.f.b()).r(w.z());
                                    if (r == null) {
                                        cahm.a.r("The original conversation is not found.");
                                        ((bzzi) cahmVar2.i.b()).c(bdhg.a(((awnu) awrjVar3).a.l), 48);
                                        throw new caic("Conversation is not found for the resent message.");
                                    }
                                    csjb a3 = cahm.a.a();
                                    a3.I("Found the existing conversation.");
                                    a3.c(r.C());
                                    a3.r();
                                    if (TextUtils.isEmpty(r.ad())) {
                                        ((bzzi) cahmVar2.i.b()).d(bdhg.a(((awnu) awrjVar3).a.l), bdhgVar, 54);
                                        throw new caic("Missing group Id.");
                                    }
                                    if (TextUtils.isEmpty(r.ac())) {
                                        ((bzzi) cahmVar2.i.b()).d(bdhg.a(((awnu) awrjVar3).a.l), bdhgVar, 55);
                                        throw new caic("Missing group conference uri.");
                                    }
                                    awri d = awrjVar3.d();
                                    awxh awxhVar = (awxh) ((awnu) awrjVar3).a.toBuilder();
                                    awuf awufVar = (awuf) awui.a.createBuilder();
                                    String ac = r.ac();
                                    ac.getClass();
                                    awufVar.copyOnWrite();
                                    awui awuiVar = (awui) awufVar.instance;
                                    awuiVar.b |= 2;
                                    awuiVar.d = ac;
                                    awuh awuhVar = awuh.GROUP;
                                    awufVar.copyOnWrite();
                                    awui awuiVar2 = (awui) awufVar.instance;
                                    awuiVar2.c = awuhVar.f;
                                    awuiVar2.b |= 1;
                                    awui awuiVar3 = (awui) awufVar.build();
                                    awxhVar.copyOnWrite();
                                    awxk awxkVar = (awxk) awxhVar.instance;
                                    awuiVar3.getClass();
                                    awxkVar.g = awuiVar3;
                                    awxkVar.c |= 8;
                                    String ad = r.ad();
                                    ad.getClass();
                                    awxhVar.copyOnWrite();
                                    awxk awxkVar2 = (awxk) awxhVar.instance;
                                    awxkVar2.c |= 512;
                                    awxkVar2.m = ad;
                                    d.c((awxk) awxhVar.build());
                                    return d.d();
                                }
                            }, cahmVar.c).i(new eroh() { // from class: cahi
                                @Override // defpackage.eroh
                                public final ListenableFuture a(Object obj) {
                                    final awrj awrjVar3 = (awrj) obj;
                                    awxk b2 = awrjVar3.b();
                                    cahm cahmVar2 = cahm.this;
                                    return cahmVar2.k.a(b2).h(new emwl() { // from class: cahj
                                        @Override // defpackage.emwl
                                        public final Object apply(Object obj2) {
                                            awri d = awrj.this.d();
                                            d.c((awxk) obj2);
                                            return d.d();
                                        }
                                    }, cahmVar2.b);
                                }
                            }, cahmVar.b).h(new emwl() { // from class: cacx
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // defpackage.emwl
                                public final Object apply(Object obj) {
                                    Optional empty;
                                    fays faysVar;
                                    awrj awrjVar3 = (awrj) obj;
                                    bdhg a2 = bdhg.a(((awnu) awrjVar2).a.l);
                                    cahm.a.m("Updating the original message");
                                    fays faysVar2 = b;
                                    fayv fayvVar2 = faysVar2.f;
                                    if (fayvVar2 == null) {
                                        fayvVar2 = fayv.a;
                                    }
                                    cadg cadgVar2 = cadg.this;
                                    fayt faytVar = (fayt) fayvVar2.toBuilder();
                                    String str = clbg.ETOUFFEE_NAMESPACE.o;
                                    str.getClass();
                                    faytVar.copyOnWrite();
                                    ((fayv) faytVar.instance).a().remove(str);
                                    fayr fayrVar = (fayr) faysVar2.toBuilder();
                                    fayrVar.copyOnWrite();
                                    fays faysVar3 = (fays) fayrVar.instance;
                                    fayv fayvVar3 = (fayv) faytVar.build();
                                    fayvVar3.getClass();
                                    faysVar3.f = fayvVar3;
                                    faysVar3.b |= 8;
                                    cahm cahmVar2 = cadgVar2.h;
                                    if (bzwf.f()) {
                                        fayv fayvVar4 = faysVar2.f;
                                        if (fayvVar4 == null) {
                                            fayvVar4 = fayv.a;
                                        }
                                        Optional a3 = clbh.a(fayvVar4, clbg.ETOUFFEE_NAMESPACE, "otk");
                                        if (a3.isEmpty()) {
                                            cahm.a.r("Missing otk header.");
                                            ((bzzi) cahmVar2.i.b()).c(a2, 49);
                                            throw new IllegalStateException("The OTK header is missing.");
                                        }
                                        fayv fayvVar5 = faysVar2.f;
                                        if (fayvVar5 == null) {
                                            fayvVar5 = fayv.a;
                                        }
                                        Optional a4 = cahmVar2.a(fayvVar5);
                                        if (a4.isEmpty() || ((bdhg) a4.get()).i()) {
                                            ((bzzi) cahmVar2.i.b()).c(a2, 50);
                                            throw new IllegalStateException("The original message Id is missing.");
                                        }
                                        final bdhg bdhgVar = (bdhg) a4.get();
                                        caig caigVar = (caig) cahmVar2.g.b();
                                        bwgr a5 = bwgw.a();
                                        a5.z("getPendingMessageEnvelope");
                                        a5.d(new Function() { // from class: caid
                                            @Override // java.util.function.Function
                                            /* renamed from: andThen */
                                            public final /* synthetic */ Function mo448andThen(Function function) {
                                                return Function$CC.$default$andThen(this, function);
                                            }

                                            @Override // java.util.function.Function
                                            public final Object apply(Object obj2) {
                                                bwgv bwgvVar = (bwgv) obj2;
                                                bwgvVar.d(bdhg.this);
                                                bwgvVar.b(byze.FAILED_TO_DECRYPT);
                                                return bwgvVar;
                                            }

                                            public final /* synthetic */ Function compose(Function function) {
                                                return Function$CC.$default$compose(this, function);
                                            }
                                        });
                                        bwfn bwfnVar = bwgw.c;
                                        a5.c(bwfnVar.d, bwfnVar.e);
                                        engw y = a5.b().y();
                                        if (((enou) y).c == 1) {
                                            y.get(0);
                                            bwdu bwduVar = (bwdu) y.get(0);
                                            if (bwduVar.l() == null || !eijq.b.g(bwduVar.l())) {
                                                String m = bwduVar.m();
                                                if (TextUtils.isEmpty(m)) {
                                                    csjb e3 = caig.a.e();
                                                    e3.I("No raw text in the pending message.");
                                                    e3.h(bdhgVar);
                                                    e3.r();
                                                    empty = Optional.empty();
                                                } else {
                                                    try {
                                                        empty = Optional.of(cadi.a(m));
                                                    } catch (eygu e4) {
                                                        ((bzzi) caigVar.b.b()).c(bdhgVar, 52);
                                                        throw new IllegalStateException("Failed to parse the pending message.", e4);
                                                    }
                                                }
                                            } else {
                                                String m2 = bwduVar.m();
                                                if (TextUtils.isEmpty(m2)) {
                                                    csjb e5 = caig.a.e();
                                                    e5.I("No raw data in the pending file transfer.");
                                                    e5.h(bdhgVar);
                                                    e5.r();
                                                    empty = Optional.empty();
                                                } else {
                                                    ContentType contentType = eijr.a;
                                                    try {
                                                        eijj eijjVar = new eijj();
                                                        eijjVar.c(eijq.b);
                                                        eijjVar.b(eyee.A(m2));
                                                        Optional optional = ((AutoValue_FileTransferInformation) eijr.c(eijjVar.a())).c;
                                                        if (optional.isPresent()) {
                                                            empty = Optional.of((faym) eyfy.parseFrom(faym.a, (eyee) optional.get(), eyfc.a()));
                                                        } else {
                                                            csjb e6 = caig.a.e();
                                                            e6.I("No encrypted data in the pending file transfer.");
                                                            e6.h(bdhgVar);
                                                            e6.r();
                                                            empty = Optional.empty();
                                                        }
                                                    } catch (eikm | eygu e7) {
                                                        ((bzzi) caigVar.b.b()).c(bdhgVar, 52);
                                                        throw new IllegalStateException("Failed to parse the pending FT message.", e7);
                                                    }
                                                }
                                            }
                                        } else {
                                            empty = Optional.empty();
                                        }
                                        if (empty.isEmpty()) {
                                            ((bzzi) cahmVar2.i.b()).c(a2, 51);
                                            throw new IllegalStateException("The pending message is missing:".concat(String.valueOf(bdhgVar.b)));
                                        }
                                        byte[] bArr = (byte[]) cafo.a(nativeMessageEncryptorV2.decryptWithOneTimeKey(Scope.create(((cafi) cahmVar2.h.b()).b()), new SecureMessage(bdhg.e(bdhgVar), SecureMessageType.SECURE, ((faym) empty.get()).c.I()), Base64.decode(((String) a3.get()).getBytes(StandardCharsets.UTF_8), 0), true));
                                        csjb c = cahm.a.c();
                                        c.I("Decrypted the pending message.");
                                        c.h(bdhgVar);
                                        c.r();
                                        try {
                                            fays faysVar4 = (fays) eyfy.parseFrom(fays.a, bArr, eyfc.a());
                                            fayv fayvVar6 = faysVar4.f;
                                            if (fayvVar6 == null) {
                                                fayvVar6 = fayv.a;
                                            }
                                            clbi b2 = clbi.b(fayvVar6);
                                            b2.d(clbg.ETOUFFEE_NAMESPACE, "original-message-id", bdhg.e(bdhgVar));
                                            fayv c2 = b2.c();
                                            String str2 = faysVar4.c;
                                            fayrVar.copyOnWrite();
                                            fays faysVar5 = (fays) fayrVar.instance;
                                            str2.getClass();
                                            faysVar5.b |= 1;
                                            faysVar5.c = str2;
                                            fayrVar.copyOnWrite();
                                            fays faysVar6 = (fays) fayrVar.instance;
                                            c2.getClass();
                                            faysVar6.f = c2;
                                            faysVar6.b |= 8;
                                            eyee eyeeVar = faysVar4.e;
                                            fayrVar.copyOnWrite();
                                            fays faysVar7 = (fays) fayrVar.instance;
                                            eyeeVar.getClass();
                                            faysVar7.b |= 4;
                                            faysVar7.e = eyeeVar;
                                            faysVar = (fays) fayrVar.build();
                                        } catch (eygu e8) {
                                            cahm.a.r("Failed to parse the decrypted message");
                                            ((bzzi) cahmVar2.i.b()).c(a2, 53);
                                            throw new IllegalStateException("Failed to parse the decrypted pending message.", e8);
                                        }
                                    } else {
                                        cahm.a.m("Otk receiver is not enabled.");
                                        ((akzt) cahmVar2.j.b()).e("Bugle.Etouffee.MonitoredNonExceptionalStates", bzwi.a(2));
                                        faysVar = (fays) fayrVar.build();
                                    }
                                    return new emxd(awrjVar3, faysVar);
                                }
                            }, cadgVar.j);
                            return elflVar2.i(new eroh() { // from class: cact
                                @Override // defpackage.eroh
                                public final ListenableFuture a(Object obj) {
                                    awrj d;
                                    emxd emxdVar = (emxd) obj;
                                    final awrj awrjVar3 = (awrj) emxdVar.a;
                                    final fays faysVar = (fays) emxdVar.b;
                                    ContentType contentType = eijq.e;
                                    ContentType contentType2 = e;
                                    boolean f = contentType.f(contentType2);
                                    Optional optional = ofNullable;
                                    final cadg cadgVar2 = cadg.this;
                                    if (f || eijq.c.f(contentType2) || eijq.a.f(contentType2) || djbc.a.f(contentType2)) {
                                        if (faysVar == null) {
                                            d = awrjVar3;
                                        } else {
                                            awri c = awrj.c();
                                            awxh awxhVar = (awxh) awrjVar3.b().toBuilder();
                                            fayv fayvVar2 = faysVar.f;
                                            if (fayvVar2 == null) {
                                                fayvVar2 = fayv.a;
                                            }
                                            awxhVar.copyOnWrite();
                                            awxk awxkVar = (awxk) awxhVar.instance;
                                            fayvVar2.getClass();
                                            awxkVar.n = fayvVar2;
                                            awxkVar.c |= 1024;
                                            awxhVar.copyOnWrite();
                                            ((awxk) awxhVar.instance).o = awxk.emptyProtobufList();
                                            awuk awukVar = (awuk) awul.a.createBuilder();
                                            awup awupVar = (awup) cadgVar2.d.m().fP(ContentType.e(faysVar.c));
                                            awukVar.copyOnWrite();
                                            awul awulVar = (awul) awukVar.instance;
                                            awupVar.getClass();
                                            awulVar.c = awupVar;
                                            awulVar.b = 1 | awulVar.b;
                                            eyee eyeeVar = faysVar.e;
                                            awukVar.copyOnWrite();
                                            awul awulVar2 = (awul) awukVar.instance;
                                            eyeeVar.getClass();
                                            awulVar2.b = 2 | awulVar2.b;
                                            awulVar2.d = eyeeVar;
                                            awxhVar.b(awukVar);
                                            c.c((awxk) awxhVar.build());
                                            d = c.d();
                                        }
                                        eopq eopqVar = awrjVar3.b().q;
                                        if (eopqVar == null) {
                                            eopqVar = eopq.a;
                                        }
                                        return cadgVar2.f.b(d, cadg.a(optional, eopqVar));
                                    }
                                    if (!eijq.b.f(contentType2)) {
                                        if (djbb.e(contentType2)) {
                                            return cadg.d(awrjVar3.b()).i(new eroh() { // from class: cacu
                                                @Override // defpackage.eroh
                                                public final ListenableFuture a(Object obj2) {
                                                    return ((bzvx) cadg.this.b.b()).b((String) obj2);
                                                }
                                            }, cadgVar2.k).i(new eroh() { // from class: cacv
                                                @Override // defpackage.eroh
                                                public final ListenableFuture a(Object obj2) {
                                                    fayq fayqVar;
                                                    int i;
                                                    fayp b2;
                                                    fayp faypVar;
                                                    bzze bzzeVar;
                                                    Optional empty;
                                                    String str;
                                                    awrj awrjVar4 = awrjVar3;
                                                    NativeMessageEncryptorV2 nativeMessageEncryptorV22 = (NativeMessageEncryptorV2) obj2;
                                                    awui awuiVar = awrjVar4.b().d;
                                                    fays faysVar2 = faysVar;
                                                    if (awuiVar == null) {
                                                        awuiVar = awui.a;
                                                    }
                                                    String str2 = awuiVar.d;
                                                    eopq eopqVar2 = awrjVar4.b().q;
                                                    if (eopqVar2 == null) {
                                                        eopqVar2 = eopq.a;
                                                    }
                                                    awui awuiVar2 = awrjVar4.b().g;
                                                    if (awuiVar2 == null) {
                                                        awuiVar2 = awui.a;
                                                    }
                                                    awuh b3 = awuh.b(awuiVar2.c);
                                                    if (b3 == null) {
                                                        b3 = awuh.UNKNOWN_TYPE;
                                                    }
                                                    boolean equals = b3.equals(awuh.GROUP);
                                                    String str3 = awrjVar4.b().l;
                                                    try {
                                                        fayqVar = (fayq) eyfy.parseFrom(fayq.a, faysVar2.e, eyfc.a());
                                                        ensk h = bzze.b.h();
                                                        h.Y(ente.a, "BugleEtouffee");
                                                        enrr enrrVar = (enrr) h;
                                                        enrrVar.Y(csux.e, str3);
                                                        enrr enrrVar2 = (enrr) enrrVar.h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/EncryptedRcsReceiptHandler", "handleEncryptedReceipt", 192, "EncryptedRcsReceiptHandler.java");
                                                        String str4 = fayqVar.c;
                                                        fayp b4 = fayp.b(fayqVar.d);
                                                        if (b4 == null) {
                                                            b4 = fayp.UNKNOWN;
                                                        }
                                                        enrrVar2.D("Received encrypted RCS report for message %s. Type: %s", str4, b4.name());
                                                        i = fayqVar.d;
                                                        b2 = fayp.b(i);
                                                        if (b2 == null) {
                                                            b2 = fayp.UNKNOWN;
                                                        }
                                                        faypVar = fayp.SUCCESS;
                                                        bzzeVar = cadg.this.e;
                                                    } catch (eygu e3) {
                                                        bzze.a.o("Error while reading SIGNAL_SUCCESS proto.", e3);
                                                    }
                                                    if (b2 != faypVar) {
                                                        fayp b5 = fayp.b(i);
                                                        if (b5 == null) {
                                                            b5 = fayp.UNKNOWN;
                                                        }
                                                        if (b5 == fayp.READ) {
                                                            return ((cldf) bzzeVar.f.b()).a(new ChatSessionMessageEvent(-1L, fayqVar.c, -1L, 50032, str2, bzwf.g() && equals), true, bdhg.a(str3), eopqVar2);
                                                        }
                                                        csjb b6 = bzze.a.b();
                                                        b6.I("Unsupported receipt type");
                                                        fayp b7 = fayp.b(fayqVar.d);
                                                        if (b7 == null) {
                                                            b7 = fayp.UNKNOWN;
                                                        }
                                                        b6.A("receiptType", b7);
                                                        b6.r();
                                                        return elfo.e(null);
                                                    }
                                                    bzzeVar.e.e("Bugle.Etouffee.DeliveryImdn.ChatApi.Format", bzwh.a(2));
                                                    String str5 = faysVar2.d;
                                                    boolean z = bzwf.g() && equals;
                                                    csjb c2 = bzze.a.c();
                                                    c2.I("Received encrypted delivery report (SIGNAL_SUCCESS)");
                                                    c2.A("acknowledgedMessageId", fayqVar.c);
                                                    c2.r();
                                                    StatusOr<HandleReceiptResult> handleReceiptV2 = (z && bzwf.e()) ? nativeMessageEncryptorV22.handleReceiptV2(Scope.create(bzzeVar.c.b()), new UserDevice(str2, str5), cady.b(fayqVar)) : nativeMessageEncryptorV22.handleReceipt(Scope.create(bzzeVar.c.b()), new UserDevice(str2, str5), cady.b(fayqVar));
                                                    if (!handleReceiptV2.hasValue) {
                                                        csjb c3 = bzze.a.c();
                                                        c3.I("Failed to process SIGNAL_SUCCESS.");
                                                        c3.A("errorMessage", handleReceiptV2.status.toString());
                                                        c3.r();
                                                    }
                                                    if (z && bzwf.e()) {
                                                        cahm cahmVar2 = (cahm) bzzeVar.d.b();
                                                        MessageCoreData x = ((bdmq) cahmVar2.e.b()).x(bdhg.a(fayqVar.c));
                                                        if (x != null) {
                                                            if (x.cX() && x.cB() && x.cF() && !TextUtils.isEmpty(x.ap())) {
                                                                empty = Optional.of(x.D());
                                                                str = ((bdhg) empty.orElse(bdhg.a)).b;
                                                                if (!TextUtils.isEmpty(str) && !nativeMessageEncryptorV22.deleteMessageOneTimeKey(Scope.create(((cafi) cahmVar2.h.b()).b()), new UserDevice(str2, str5), str).f()) {
                                                                    csjb e4 = cahm.a.e();
                                                                    e4.I("Failed to delete one time key.");
                                                                    e4.h((bdhg) empty.get());
                                                                    e4.r();
                                                                }
                                                            }
                                                            empty = Optional.empty();
                                                            str = ((bdhg) empty.orElse(bdhg.a)).b;
                                                            if (!TextUtils.isEmpty(str)) {
                                                                csjb e42 = cahm.a.e();
                                                                e42.I("Failed to delete one time key.");
                                                                e42.h((bdhg) empty.get());
                                                                e42.r();
                                                            }
                                                        }
                                                    }
                                                    return ((cldf) bzzeVar.f.b()).a(new ChatSessionMessageEvent(-1L, fayqVar.c, -1L, 50035, str2, z), true, bdhg.a(str3), eopqVar2);
                                                }
                                            }, cadgVar2.j).h(new emwl() { // from class: cacw
                                                @Override // defpackage.emwl
                                                public final Object apply(Object obj2) {
                                                    return avui.SUCCESS;
                                                }
                                            }, erpp.a);
                                        }
                                        cadgVar2.n.c(bdhg.a(awrjVar3.b().l), 21);
                                        return cadgVar2.f(awrjVar3, Optional.empty());
                                    }
                                    emxf.a(optional.isPresent());
                                    ChatMessage chatMessage = (ChatMessage) optional.get();
                                    bdhg a2 = bdhg.a(awrjVar3.b().l);
                                    try {
                                        fayk faykVar = (fayk) eyfy.parseFrom(fayk.a, faysVar.e, eyfc.a());
                                        String[] strArr = btck.a;
                                        bszx bszxVar = new bszx();
                                        bszxVar.p(a2);
                                        bszxVar.i(chatMessage.getContentType());
                                        bszxVar.h(chatMessage.getContent());
                                        if ((faykVar.b & 2) != 0) {
                                            fayi fayiVar = faykVar.d;
                                            if (fayiVar == null) {
                                                fayiVar = fayi.a;
                                            }
                                            bszxVar.d(fayiVar.c.I());
                                            fayi fayiVar2 = faykVar.d;
                                            if (fayiVar2 == null) {
                                                fayiVar2 = fayi.a;
                                            }
                                            bszxVar.c(fayiVar2.d.I());
                                            fayi fayiVar3 = faykVar.d;
                                            if (fayiVar3 == null) {
                                                fayiVar3 = fayi.a;
                                            }
                                            bszxVar.e(fayiVar3.e);
                                        }
                                        if ((faykVar.b & 1) != 0) {
                                            fayi fayiVar4 = faykVar.c;
                                            if (fayiVar4 == null) {
                                                fayiVar4 = fayi.a;
                                            }
                                            bszxVar.n(fayiVar4.c.I());
                                            fayi fayiVar5 = faykVar.c;
                                            if (fayiVar5 == null) {
                                                fayiVar5 = fayi.a;
                                            }
                                            bszxVar.m(fayiVar5.d.I());
                                            fayi fayiVar6 = faykVar.c;
                                            if (fayiVar6 == null) {
                                                fayiVar6 = fayi.a;
                                            }
                                            bszxVar.o(fayiVar6.e);
                                        }
                                        bszxVar.b();
                                        try {
                                            awuk awukVar2 = (awuk) awrjVar3.e().toBuilder();
                                            awup awupVar2 = (awup) cadgVar2.d.m().fP(ContentType.e(faysVar.c));
                                            awukVar2.copyOnWrite();
                                            awul awulVar3 = (awul) awukVar2.instance;
                                            awupVar2.getClass();
                                            awulVar3.c = awupVar2;
                                            awulVar3.b |= 1;
                                            if ((faykVar.b & 4) != 0) {
                                                eyee eyeeVar2 = faykVar.e;
                                                awukVar2.copyOnWrite();
                                                awul awulVar4 = (awul) awukVar2.instance;
                                                eyeeVar2.getClass();
                                                awulVar4.b |= 2;
                                                awulVar4.d = eyeeVar2;
                                            }
                                            String E = ((awul) awukVar2.instance).d.E();
                                            ContentType contentType3 = eijr.a;
                                            eijj eijjVar = new eijj();
                                            eijjVar.c(eijq.b);
                                            eijjVar.b(eyee.A(E));
                                            FileTransferInformation c2 = eijr.c(eijjVar.a());
                                            eieg eiegVar = new eieg(c2);
                                            if ((faykVar.b & 2) != 0) {
                                                eifi c3 = ((AutoValue_FileTransferInformation) c2).a.c();
                                                fayi fayiVar7 = faykVar.d;
                                                if (fayiVar7 == null) {
                                                    fayiVar7 = fayi.a;
                                                }
                                                if ((fayiVar7.b & 8) != 0) {
                                                    c3.e(fayiVar7.f);
                                                }
                                                if ((fayiVar7.b & 16) != 0) {
                                                    avty avtyVar = cadgVar2.d;
                                                    awup awupVar3 = fayiVar7.g;
                                                    if (awupVar3 == null) {
                                                        awupVar3 = awup.a;
                                                    }
                                                    c3.c((ContentType) avtyVar.fP(awupVar3));
                                                }
                                                eiegVar.c(c3.i());
                                            }
                                            if (((AutoValue_FileTransferInformation) c2).b.isPresent() && (faykVar.b & 1) != 0) {
                                                eifi c4 = ((FileInformation) ((AutoValue_FileTransferInformation) c2).b.get()).c();
                                                fayi fayiVar8 = faykVar.c;
                                                if (fayiVar8 == null) {
                                                    fayiVar8 = fayi.a;
                                                }
                                                if ((fayiVar8.b & 16) != 0) {
                                                    avty avtyVar2 = cadgVar2.d;
                                                    awup awupVar4 = fayiVar8.g;
                                                    if (awupVar4 == null) {
                                                        awupVar4 = awup.a;
                                                    }
                                                    c4.c((ContentType) avtyVar2.fP(awupVar4));
                                                }
                                                eiegVar.e(c4.i());
                                            }
                                            eyee A = eyee.A(((eijk) eijr.d(eiegVar.a())).a.E());
                                            awukVar2.copyOnWrite();
                                            awul awulVar5 = (awul) awukVar2.instance;
                                            awulVar5.b |= 2;
                                            awulVar5.d = A;
                                            awri c5 = awrj.c();
                                            awxh awxhVar2 = (awxh) awrjVar3.b().toBuilder();
                                            fayv fayvVar3 = faysVar.f;
                                            if (fayvVar3 == null) {
                                                fayvVar3 = fayv.a;
                                            }
                                            awxhVar2.copyOnWrite();
                                            awxk awxkVar2 = (awxk) awxhVar2.instance;
                                            fayvVar3.getClass();
                                            awxkVar2.n = fayvVar3;
                                            awxkVar2.c |= 1024;
                                            awxhVar2.copyOnWrite();
                                            ((awxk) awxhVar2.instance).o = awxk.emptyProtobufList();
                                            awxhVar2.b(awukVar2);
                                            c5.c((awxk) awxhVar2.build());
                                            awrj d2 = c5.d();
                                            avty avtyVar3 = cadgVar2.d;
                                            awup awupVar5 = awrjVar3.e().c;
                                            if (awupVar5 == null) {
                                                awupVar5 = awup.a;
                                            }
                                            ContentType contentType4 = (ContentType) avtyVar3.fP(awupVar5);
                                            if (djbb.a(contentType4)) {
                                                cadgVar2.i.e("Bugle.Etouffee.FileTransfer.Format", covi.a(2));
                                                cadgVar2.n.f(a2, bdhg.a, 11, 3, 1);
                                            } else if (eijq.b.f(contentType4)) {
                                                cadgVar2.i.e("Bugle.Etouffee.FileTransfer.Format", covi.a(3));
                                                cadgVar2.n.f(a2, bdhg.a, 12, 3, 1);
                                            } else {
                                                cadgVar2.i.e("Bugle.Etouffee.FileTransfer.Format", covi.a(1));
                                            }
                                            Optional of = Optional.of(chatMessage);
                                            eopq eopqVar2 = awrjVar3.b().q;
                                            if (eopqVar2 == null) {
                                                eopqVar2 = eopq.a;
                                            }
                                            return cadgVar2.f.b(d2, cadg.a(of, eopqVar2));
                                        } catch (eikm e3) {
                                            csjb e4 = cadg.a.e();
                                            e4.I("Failed to deserialize the file transfer XML");
                                            e4.h(a2);
                                            e4.s(e3);
                                            cadgVar2.n.c(a2, 27);
                                            cadgVar2.i.e("Bugle.Etouffee.DecryptionAborted.Reason", bzwg.MALFORMED_XML.y);
                                            return elfo.e(avui.FAIL_NO_RETRY);
                                        }
                                    } catch (eygu e5) {
                                        csjb e6 = cadg.a.e();
                                        e6.I("Unabled to parse the decrypted contents as a file transfer message");
                                        e6.h(a2);
                                        e6.s(e5);
                                        cadgVar2.n.c(a2, 18);
                                        cadgVar2.i.e("Bugle.Etouffee.DecryptionAborted.Reason", bzwg.INVALID_PROTOCOL_BUFFER.y);
                                        return elfo.e(avui.FAIL_NO_RETRY);
                                    }
                                }
                            }, cadgVar.j);
                        }
                    }
                }
                elflVar2 = elfo.e(new emxd(awrjVar2, b));
                return elflVar2.i(new eroh() { // from class: cact
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj) {
                        awrj d;
                        emxd emxdVar = (emxd) obj;
                        final awrj awrjVar3 = (awrj) emxdVar.a;
                        final fays faysVar = (fays) emxdVar.b;
                        ContentType contentType = eijq.e;
                        ContentType contentType2 = e;
                        boolean f = contentType.f(contentType2);
                        Optional optional = ofNullable;
                        final cadg cadgVar2 = cadg.this;
                        if (f || eijq.c.f(contentType2) || eijq.a.f(contentType2) || djbc.a.f(contentType2)) {
                            if (faysVar == null) {
                                d = awrjVar3;
                            } else {
                                awri c = awrj.c();
                                awxh awxhVar = (awxh) awrjVar3.b().toBuilder();
                                fayv fayvVar2 = faysVar.f;
                                if (fayvVar2 == null) {
                                    fayvVar2 = fayv.a;
                                }
                                awxhVar.copyOnWrite();
                                awxk awxkVar = (awxk) awxhVar.instance;
                                fayvVar2.getClass();
                                awxkVar.n = fayvVar2;
                                awxkVar.c |= 1024;
                                awxhVar.copyOnWrite();
                                ((awxk) awxhVar.instance).o = awxk.emptyProtobufList();
                                awuk awukVar = (awuk) awul.a.createBuilder();
                                awup awupVar = (awup) cadgVar2.d.m().fP(ContentType.e(faysVar.c));
                                awukVar.copyOnWrite();
                                awul awulVar = (awul) awukVar.instance;
                                awupVar.getClass();
                                awulVar.c = awupVar;
                                awulVar.b = 1 | awulVar.b;
                                eyee eyeeVar = faysVar.e;
                                awukVar.copyOnWrite();
                                awul awulVar2 = (awul) awukVar.instance;
                                eyeeVar.getClass();
                                awulVar2.b = 2 | awulVar2.b;
                                awulVar2.d = eyeeVar;
                                awxhVar.b(awukVar);
                                c.c((awxk) awxhVar.build());
                                d = c.d();
                            }
                            eopq eopqVar = awrjVar3.b().q;
                            if (eopqVar == null) {
                                eopqVar = eopq.a;
                            }
                            return cadgVar2.f.b(d, cadg.a(optional, eopqVar));
                        }
                        if (!eijq.b.f(contentType2)) {
                            if (djbb.e(contentType2)) {
                                return cadg.d(awrjVar3.b()).i(new eroh() { // from class: cacu
                                    @Override // defpackage.eroh
                                    public final ListenableFuture a(Object obj2) {
                                        return ((bzvx) cadg.this.b.b()).b((String) obj2);
                                    }
                                }, cadgVar2.k).i(new eroh() { // from class: cacv
                                    @Override // defpackage.eroh
                                    public final ListenableFuture a(Object obj2) {
                                        fayq fayqVar;
                                        int i;
                                        fayp b2;
                                        fayp faypVar;
                                        bzze bzzeVar;
                                        Optional empty;
                                        String str;
                                        awrj awrjVar4 = awrjVar3;
                                        NativeMessageEncryptorV2 nativeMessageEncryptorV22 = (NativeMessageEncryptorV2) obj2;
                                        awui awuiVar = awrjVar4.b().d;
                                        fays faysVar2 = faysVar;
                                        if (awuiVar == null) {
                                            awuiVar = awui.a;
                                        }
                                        String str2 = awuiVar.d;
                                        eopq eopqVar2 = awrjVar4.b().q;
                                        if (eopqVar2 == null) {
                                            eopqVar2 = eopq.a;
                                        }
                                        awui awuiVar2 = awrjVar4.b().g;
                                        if (awuiVar2 == null) {
                                            awuiVar2 = awui.a;
                                        }
                                        awuh b3 = awuh.b(awuiVar2.c);
                                        if (b3 == null) {
                                            b3 = awuh.UNKNOWN_TYPE;
                                        }
                                        boolean equals = b3.equals(awuh.GROUP);
                                        String str3 = awrjVar4.b().l;
                                        try {
                                            fayqVar = (fayq) eyfy.parseFrom(fayq.a, faysVar2.e, eyfc.a());
                                            ensk h = bzze.b.h();
                                            h.Y(ente.a, "BugleEtouffee");
                                            enrr enrrVar = (enrr) h;
                                            enrrVar.Y(csux.e, str3);
                                            enrr enrrVar2 = (enrr) enrrVar.h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/EncryptedRcsReceiptHandler", "handleEncryptedReceipt", 192, "EncryptedRcsReceiptHandler.java");
                                            String str4 = fayqVar.c;
                                            fayp b4 = fayp.b(fayqVar.d);
                                            if (b4 == null) {
                                                b4 = fayp.UNKNOWN;
                                            }
                                            enrrVar2.D("Received encrypted RCS report for message %s. Type: %s", str4, b4.name());
                                            i = fayqVar.d;
                                            b2 = fayp.b(i);
                                            if (b2 == null) {
                                                b2 = fayp.UNKNOWN;
                                            }
                                            faypVar = fayp.SUCCESS;
                                            bzzeVar = cadg.this.e;
                                        } catch (eygu e3) {
                                            bzze.a.o("Error while reading SIGNAL_SUCCESS proto.", e3);
                                        }
                                        if (b2 != faypVar) {
                                            fayp b5 = fayp.b(i);
                                            if (b5 == null) {
                                                b5 = fayp.UNKNOWN;
                                            }
                                            if (b5 == fayp.READ) {
                                                return ((cldf) bzzeVar.f.b()).a(new ChatSessionMessageEvent(-1L, fayqVar.c, -1L, 50032, str2, bzwf.g() && equals), true, bdhg.a(str3), eopqVar2);
                                            }
                                            csjb b6 = bzze.a.b();
                                            b6.I("Unsupported receipt type");
                                            fayp b7 = fayp.b(fayqVar.d);
                                            if (b7 == null) {
                                                b7 = fayp.UNKNOWN;
                                            }
                                            b6.A("receiptType", b7);
                                            b6.r();
                                            return elfo.e(null);
                                        }
                                        bzzeVar.e.e("Bugle.Etouffee.DeliveryImdn.ChatApi.Format", bzwh.a(2));
                                        String str5 = faysVar2.d;
                                        boolean z = bzwf.g() && equals;
                                        csjb c2 = bzze.a.c();
                                        c2.I("Received encrypted delivery report (SIGNAL_SUCCESS)");
                                        c2.A("acknowledgedMessageId", fayqVar.c);
                                        c2.r();
                                        StatusOr<HandleReceiptResult> handleReceiptV2 = (z && bzwf.e()) ? nativeMessageEncryptorV22.handleReceiptV2(Scope.create(bzzeVar.c.b()), new UserDevice(str2, str5), cady.b(fayqVar)) : nativeMessageEncryptorV22.handleReceipt(Scope.create(bzzeVar.c.b()), new UserDevice(str2, str5), cady.b(fayqVar));
                                        if (!handleReceiptV2.hasValue) {
                                            csjb c3 = bzze.a.c();
                                            c3.I("Failed to process SIGNAL_SUCCESS.");
                                            c3.A("errorMessage", handleReceiptV2.status.toString());
                                            c3.r();
                                        }
                                        if (z && bzwf.e()) {
                                            cahm cahmVar2 = (cahm) bzzeVar.d.b();
                                            MessageCoreData x = ((bdmq) cahmVar2.e.b()).x(bdhg.a(fayqVar.c));
                                            if (x != null) {
                                                if (x.cX() && x.cB() && x.cF() && !TextUtils.isEmpty(x.ap())) {
                                                    empty = Optional.of(x.D());
                                                    str = ((bdhg) empty.orElse(bdhg.a)).b;
                                                    if (!TextUtils.isEmpty(str) && !nativeMessageEncryptorV22.deleteMessageOneTimeKey(Scope.create(((cafi) cahmVar2.h.b()).b()), new UserDevice(str2, str5), str).f()) {
                                                        csjb e42 = cahm.a.e();
                                                        e42.I("Failed to delete one time key.");
                                                        e42.h((bdhg) empty.get());
                                                        e42.r();
                                                    }
                                                }
                                                empty = Optional.empty();
                                                str = ((bdhg) empty.orElse(bdhg.a)).b;
                                                if (!TextUtils.isEmpty(str)) {
                                                    csjb e422 = cahm.a.e();
                                                    e422.I("Failed to delete one time key.");
                                                    e422.h((bdhg) empty.get());
                                                    e422.r();
                                                }
                                            }
                                        }
                                        return ((cldf) bzzeVar.f.b()).a(new ChatSessionMessageEvent(-1L, fayqVar.c, -1L, 50035, str2, z), true, bdhg.a(str3), eopqVar2);
                                    }
                                }, cadgVar2.j).h(new emwl() { // from class: cacw
                                    @Override // defpackage.emwl
                                    public final Object apply(Object obj2) {
                                        return avui.SUCCESS;
                                    }
                                }, erpp.a);
                            }
                            cadgVar2.n.c(bdhg.a(awrjVar3.b().l), 21);
                            return cadgVar2.f(awrjVar3, Optional.empty());
                        }
                        emxf.a(optional.isPresent());
                        ChatMessage chatMessage = (ChatMessage) optional.get();
                        bdhg a2 = bdhg.a(awrjVar3.b().l);
                        try {
                            fayk faykVar = (fayk) eyfy.parseFrom(fayk.a, faysVar.e, eyfc.a());
                            String[] strArr = btck.a;
                            bszx bszxVar = new bszx();
                            bszxVar.p(a2);
                            bszxVar.i(chatMessage.getContentType());
                            bszxVar.h(chatMessage.getContent());
                            if ((faykVar.b & 2) != 0) {
                                fayi fayiVar = faykVar.d;
                                if (fayiVar == null) {
                                    fayiVar = fayi.a;
                                }
                                bszxVar.d(fayiVar.c.I());
                                fayi fayiVar2 = faykVar.d;
                                if (fayiVar2 == null) {
                                    fayiVar2 = fayi.a;
                                }
                                bszxVar.c(fayiVar2.d.I());
                                fayi fayiVar3 = faykVar.d;
                                if (fayiVar3 == null) {
                                    fayiVar3 = fayi.a;
                                }
                                bszxVar.e(fayiVar3.e);
                            }
                            if ((faykVar.b & 1) != 0) {
                                fayi fayiVar4 = faykVar.c;
                                if (fayiVar4 == null) {
                                    fayiVar4 = fayi.a;
                                }
                                bszxVar.n(fayiVar4.c.I());
                                fayi fayiVar5 = faykVar.c;
                                if (fayiVar5 == null) {
                                    fayiVar5 = fayi.a;
                                }
                                bszxVar.m(fayiVar5.d.I());
                                fayi fayiVar6 = faykVar.c;
                                if (fayiVar6 == null) {
                                    fayiVar6 = fayi.a;
                                }
                                bszxVar.o(fayiVar6.e);
                            }
                            bszxVar.b();
                            try {
                                awuk awukVar2 = (awuk) awrjVar3.e().toBuilder();
                                awup awupVar2 = (awup) cadgVar2.d.m().fP(ContentType.e(faysVar.c));
                                awukVar2.copyOnWrite();
                                awul awulVar3 = (awul) awukVar2.instance;
                                awupVar2.getClass();
                                awulVar3.c = awupVar2;
                                awulVar3.b |= 1;
                                if ((faykVar.b & 4) != 0) {
                                    eyee eyeeVar2 = faykVar.e;
                                    awukVar2.copyOnWrite();
                                    awul awulVar4 = (awul) awukVar2.instance;
                                    eyeeVar2.getClass();
                                    awulVar4.b |= 2;
                                    awulVar4.d = eyeeVar2;
                                }
                                String E = ((awul) awukVar2.instance).d.E();
                                ContentType contentType3 = eijr.a;
                                eijj eijjVar = new eijj();
                                eijjVar.c(eijq.b);
                                eijjVar.b(eyee.A(E));
                                FileTransferInformation c2 = eijr.c(eijjVar.a());
                                eieg eiegVar = new eieg(c2);
                                if ((faykVar.b & 2) != 0) {
                                    eifi c3 = ((AutoValue_FileTransferInformation) c2).a.c();
                                    fayi fayiVar7 = faykVar.d;
                                    if (fayiVar7 == null) {
                                        fayiVar7 = fayi.a;
                                    }
                                    if ((fayiVar7.b & 8) != 0) {
                                        c3.e(fayiVar7.f);
                                    }
                                    if ((fayiVar7.b & 16) != 0) {
                                        avty avtyVar = cadgVar2.d;
                                        awup awupVar3 = fayiVar7.g;
                                        if (awupVar3 == null) {
                                            awupVar3 = awup.a;
                                        }
                                        c3.c((ContentType) avtyVar.fP(awupVar3));
                                    }
                                    eiegVar.c(c3.i());
                                }
                                if (((AutoValue_FileTransferInformation) c2).b.isPresent() && (faykVar.b & 1) != 0) {
                                    eifi c4 = ((FileInformation) ((AutoValue_FileTransferInformation) c2).b.get()).c();
                                    fayi fayiVar8 = faykVar.c;
                                    if (fayiVar8 == null) {
                                        fayiVar8 = fayi.a;
                                    }
                                    if ((fayiVar8.b & 16) != 0) {
                                        avty avtyVar2 = cadgVar2.d;
                                        awup awupVar4 = fayiVar8.g;
                                        if (awupVar4 == null) {
                                            awupVar4 = awup.a;
                                        }
                                        c4.c((ContentType) avtyVar2.fP(awupVar4));
                                    }
                                    eiegVar.e(c4.i());
                                }
                                eyee A = eyee.A(((eijk) eijr.d(eiegVar.a())).a.E());
                                awukVar2.copyOnWrite();
                                awul awulVar5 = (awul) awukVar2.instance;
                                awulVar5.b |= 2;
                                awulVar5.d = A;
                                awri c5 = awrj.c();
                                awxh awxhVar2 = (awxh) awrjVar3.b().toBuilder();
                                fayv fayvVar3 = faysVar.f;
                                if (fayvVar3 == null) {
                                    fayvVar3 = fayv.a;
                                }
                                awxhVar2.copyOnWrite();
                                awxk awxkVar2 = (awxk) awxhVar2.instance;
                                fayvVar3.getClass();
                                awxkVar2.n = fayvVar3;
                                awxkVar2.c |= 1024;
                                awxhVar2.copyOnWrite();
                                ((awxk) awxhVar2.instance).o = awxk.emptyProtobufList();
                                awxhVar2.b(awukVar2);
                                c5.c((awxk) awxhVar2.build());
                                awrj d2 = c5.d();
                                avty avtyVar3 = cadgVar2.d;
                                awup awupVar5 = awrjVar3.e().c;
                                if (awupVar5 == null) {
                                    awupVar5 = awup.a;
                                }
                                ContentType contentType4 = (ContentType) avtyVar3.fP(awupVar5);
                                if (djbb.a(contentType4)) {
                                    cadgVar2.i.e("Bugle.Etouffee.FileTransfer.Format", covi.a(2));
                                    cadgVar2.n.f(a2, bdhg.a, 11, 3, 1);
                                } else if (eijq.b.f(contentType4)) {
                                    cadgVar2.i.e("Bugle.Etouffee.FileTransfer.Format", covi.a(3));
                                    cadgVar2.n.f(a2, bdhg.a, 12, 3, 1);
                                } else {
                                    cadgVar2.i.e("Bugle.Etouffee.FileTransfer.Format", covi.a(1));
                                }
                                Optional of = Optional.of(chatMessage);
                                eopq eopqVar2 = awrjVar3.b().q;
                                if (eopqVar2 == null) {
                                    eopqVar2 = eopq.a;
                                }
                                return cadgVar2.f.b(d2, cadg.a(of, eopqVar2));
                            } catch (eikm e3) {
                                csjb e4 = cadg.a.e();
                                e4.I("Failed to deserialize the file transfer XML");
                                e4.h(a2);
                                e4.s(e3);
                                cadgVar2.n.c(a2, 27);
                                cadgVar2.i.e("Bugle.Etouffee.DecryptionAborted.Reason", bzwg.MALFORMED_XML.y);
                                return elfo.e(avui.FAIL_NO_RETRY);
                            }
                        } catch (eygu e5) {
                            csjb e6 = cadg.a.e();
                            e6.I("Unabled to parse the decrypted contents as a file transfer message");
                            e6.h(a2);
                            e6.s(e5);
                            cadgVar2.n.c(a2, 18);
                            cadgVar2.i.e("Bugle.Etouffee.DecryptionAborted.Reason", bzwg.INVALID_PROTOCOL_BUFFER.y);
                            return elfo.e(avui.FAIL_NO_RETRY);
                        }
                    }
                }, cadgVar.j);
            }
        }, this.j);
    }

    public final elfl f(final awrj awrjVar, Optional optional) {
        azhq a2;
        boolean i = i(awrjVar.b());
        ckeo C = ckep.C();
        ckay ckayVar = (ckay) C;
        ckayVar.a = bdhg.a(awrjVar.b().l);
        awui awuiVar = awrjVar.b().d;
        if (awuiVar == null) {
            awuiVar = awui.a;
        }
        C.l(awuiVar.d);
        awui awuiVar2 = awrjVar.b().d;
        if (awuiVar2 == null) {
            awuiVar2 = awui.a;
        }
        C.k(awuiVar2);
        eyja eyjaVar = awrjVar.b().p;
        if (eyjaVar == null) {
            eyjaVar = eyja.a;
        }
        C.o(eykm.b(eyjaVar));
        C.j(this.p.f().toEpochMilli());
        C.i();
        C.e(i);
        C.q(0);
        awuh awuhVar = awuh.BOT;
        awui awuiVar3 = awrjVar.b().d;
        if (awuiVar3 == null) {
            awuiVar3 = awui.a;
        }
        awuh b = awuh.b(awuiVar3.c);
        if (b == null) {
            b = awuh.UNKNOWN_TYPE;
        }
        C.f(awuhVar.equals(b));
        fayv fayvVar = awrjVar.b().n;
        if (fayvVar == null) {
            fayvVar = fayv.a;
        }
        ckayVar.g = fayvVar;
        C.h(113);
        eopq eopqVar = awrjVar.b().q;
        if (eopqVar == null) {
            eopqVar = eopq.a;
        }
        C.b(a(optional, eopqVar));
        C.c(false);
        awui awuiVar4 = awrjVar.b().j;
        if (awuiVar4 == null) {
            awuiVar4 = awui.a;
        }
        C.m(awuiVar4);
        C.d(false);
        C.g(false);
        if (this.s.a()) {
            azee azeeVar = awrjVar.b().f;
            if (azeeVar == null) {
                azeeVar = azee.a;
            }
            C.n(azcp.a(azeeVar));
            if (i) {
                azjw azjwVar = awrjVar.b().i;
                if (azjwVar == null) {
                    azjwVar = azjw.a;
                }
                a2 = azhf.a(azjwVar);
                ckayVar.c = a2;
            }
        } else {
            String str = awrjVar.b().e;
            azcr azcrVar = azcr.a;
            C.n(azcq.a(str));
            if (i) {
                a2 = azhp.a(awrjVar.b().h);
                ckayVar.c = a2;
            }
        }
        if (bzwf.g()) {
            awui awuiVar5 = awrjVar.b().g;
            if (awuiVar5 == null) {
                awuiVar5 = awui.a;
            }
            awuh b2 = awuh.b(awuiVar5.c);
            if (b2 == null) {
                b2 = awuh.UNKNOWN_TYPE;
            }
            if (b2.equals(awuh.GROUP)) {
                ckayVar.d = awrjVar.b().m;
                awui awuiVar6 = awrjVar.b().g;
                if (awuiVar6 == null) {
                    awuiVar6 = awui.a;
                }
                ckayVar.e = awuiVar6.d;
            }
        }
        eygk eygkVar = new eygk(awrjVar.b().s, awxk.a);
        C.c(optional.isPresent() || eygkVar.contains(awxj.POSITIVE_DELIVERY));
        if (((augx) this.r.b()).a()) {
            C.g(eygkVar.contains(awxj.NEGATIVE_DELIVERY));
        }
        return ((clbm) this.q.b()).a(C.r()).h(new emwl() { // from class: cadf
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                csjb c = cadg.a.c();
                awrj awrjVar2 = awrj.this;
                c.h(bdhg.a(awrjVar2.b().l));
                c.g(awrjVar2.b().m);
                c.I("Sent a receipt from Persistent Work Queue.");
                c.r();
                return avui.SUCCESS;
            }
        }, this.k);
    }

    public final void h(caes caesVar, bdhg bdhgVar) {
        ChatMessage chatMessage = ((bzvg) caesVar).a;
        if (chatMessage == null || !djbb.d(chatMessage.getContentType())) {
            return;
        }
        this.n.f(bdhgVar, bdhg.a, 10, 11, 1);
    }

    public final boolean j(awxk awxkVar) {
        if ((this.s.a() && (awxkVar.c & 4) == 0) || (!this.s.a() && (awxkVar.c & 2) == 0)) {
            this.n.c(bdhg.a(awxkVar.l), 56);
            return false;
        }
        if (!i(awxkVar)) {
            return true;
        }
        if (!(this.s.a() && (awxkVar.c & 32) == 0) && (this.s.a() || (awxkVar.c & 16) != 0)) {
            return true;
        }
        this.n.c(bdhg.a(awxkVar.l), 57);
        return false;
    }
}
