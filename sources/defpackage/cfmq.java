package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.rcs.client.messaging.data.AutoValue_FileTransferInformation;
import com.google.android.rcs.client.messaging.data.AutoValue_MessageReceipt;
import com.google.android.rcs.client.messaging.data.ContentType;
import com.google.android.rcs.client.messaging.data.FileInformation;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.communication.synapse.security.scytale.NativeMessageEncryptorV2;
import j$.util.Optional;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfmq implements awrh {
    private final awrh a;

    public cfmq(ffsk ffskVar, awrh awrhVar, asqi asqiVar) {
        ffskVar.getClass();
        asqiVar.getClass();
        this.a = awrhVar;
    }

    @Override // defpackage.awrh
    public final elfl a(final awrj awrjVar) {
        ekzz f = eleg.f("EncryptedSinglePartIncomingChatMessageProcessor::process");
        awrh awrhVar = this.a;
        try {
            awxk awxkVar = ((awnu) awrjVar).a;
            emxf.a((awxkVar.c & 64) != 0);
            final awui awuiVar = awxkVar.j;
            if (awuiVar == null) {
                awuiVar = awui.a;
            }
            final caan caanVar = (caan) awrhVar;
            elfl h = elfo.h(new erog() { // from class: caaj
                @Override // defpackage.erog
                public final ListenableFuture a() {
                    return ((bzqc) caan.this.i.b()).e(awuiVar.d);
                }
            }, ((caan) awrhVar).k);
            final caan caanVar2 = (caan) awrhVar;
            elfl i = h.i(new eroh() { // from class: caak
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    int i2;
                    elfl e;
                    elfl e2;
                    elfl e3;
                    boolean booleanValue = ((Boolean) obj).booleanValue();
                    final caan caanVar3 = caan.this;
                    final awrj awrjVar2 = awrjVar;
                    final eijp eijpVar = (eijp) caanVar3.b.m().fP(awrjVar2.e());
                    awnu awnuVar = (awnu) awrjVar2;
                    bdhg a = bdhg.a(awnuVar.a.l);
                    ensz enszVar = (ensz) caan.a.h();
                    enszVar.Y(csux.f, a);
                    ((ensz) enszVar.h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/EtouffeeSinglePartIncomingChatMessageProcessor", "processInternal", 139, "EtouffeeSinglePartIncomingChatMessageProcessor.java")).t("Processing incoming message with contentType: %s.", eijpVar.a().c());
                    boolean z = bzwd.d() && booleanValue;
                    awxk awxkVar2 = awnuVar.a;
                    awuh awuhVar = awuh.GROUP;
                    awui awuiVar2 = awxkVar2.g;
                    if (awuiVar2 == null) {
                        awuiVar2 = awui.a;
                    }
                    awuh b = awuh.b(awuiVar2.c);
                    if (b == null) {
                        b = awuh.UNKNOWN_TYPE;
                    }
                    boolean equals = awuhVar.equals(b);
                    boolean g = bzwf.g();
                    if (!z || (!(g && equals) && equals)) {
                        i2 = 0;
                    } else {
                        akzt akztVar = caanVar3.g;
                        ContentType a2 = eijpVar.a();
                        i2 = 0;
                        int i3 = djbb.g.f(a2) ? 2 : djbb.i.f(a2) ? 4 : djbb.h.f(a2) ? 3 : 1;
                        if (i3 != 1) {
                            akztVar.e("Bugle.Etouffee.Encryption.LegacyE2eeContentTypesUsage", i3 - 1);
                        }
                        if (djbb.c(eijpVar.a())) {
                            if (equals) {
                                ((ensz) ((ensz) caan.a.j()).h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/EtouffeeSinglePartIncomingChatMessageProcessor", "processInternal", 151, "EtouffeeSinglePartIncomingChatMessageProcessor.java")).q("Received an unexpected FTD in a group.");
                                ((bzzi) caanVar3.h.b()).c(a, 46);
                                return elfo.e(avui.FAIL_NO_RETRY);
                            }
                            caanVar3.g.e("Bugle.Etouffee.Ftd.Process.Status.Counts", 2);
                            emxf.a((awnuVar.a.c & 64) != 0);
                            final awui awuiVar3 = awnuVar.a.j;
                            if (awuiVar3 == null) {
                                awuiVar3 = awui.a;
                            }
                            String str = awuiVar3.d;
                            int length = str.length();
                            int i4 = 0;
                            while (i4 < length) {
                                int codePointAt = str.codePointAt(i4);
                                if (!Character.isWhitespace(codePointAt)) {
                                    covh covhVar = (covh) caanVar3.l.b();
                                    errl errlVar = caanVar3.j;
                                    eroh erohVar = new eroh() { // from class: caal
                                        @Override // defpackage.eroh
                                        public final ListenableFuture a(Object obj2) {
                                            final caan caanVar4 = caan.this;
                                            final awrj awrjVar3 = awrjVar2;
                                            final eijp eijpVar2 = eijpVar;
                                            final awui awuiVar4 = awuiVar3;
                                            return elfo.g(new Callable() { // from class: caam
                                                @Override // java.util.concurrent.Callable
                                                public final Object call() {
                                                    eijp eijpVar3 = eijpVar2;
                                                    String D = eijpVar3.b().D(StandardCharsets.US_ASCII);
                                                    String contentType = eijpVar3.a().toString();
                                                    awxk awxkVar3 = ((awnu) awrjVar3).a;
                                                    cadh cadhVar = caan.this.d;
                                                    awui awuiVar5 = awuiVar4;
                                                    awui awuiVar6 = awxkVar3.d;
                                                    if (awuiVar6 == null) {
                                                        awuiVar6 = awui.a;
                                                    }
                                                    boolean z2 = false;
                                                    if (djbb.d(contentType)) {
                                                        try {
                                                            faym a3 = cadi.a(D);
                                                            if (a3.d.isEmpty()) {
                                                                ((akzt) cadhVar.b.b()).e("Bugle.Etouffee.Ftd.Process.Status.Counts", 8);
                                                                throw new IllegalStateException("Empty senderDeviceIds retrieved while decrypting");
                                                            }
                                                            try {
                                                                bdhg a4 = bdhg.a(cady.a(a3.c).getMessageId());
                                                                cadhVar.c.f(a4, bdhg.a, 10, 3, 1);
                                                                z2 = cadhVar.a(a3, a4, awuiVar6, awuiVar5);
                                                            } catch (eygu e4) {
                                                                ((akzt) cadhVar.b.b()).e("Bugle.Etouffee.Ftd.Process.Status.Counts", 9);
                                                                cadh.a.o("Invalid receipt message", e4);
                                                            }
                                                        } catch (eygu e5) {
                                                            ((akzt) cadhVar.b.b()).e("Bugle.Etouffee.Ftd.Process.Status.Counts", 7);
                                                            csjb e6 = cadh.a.e();
                                                            e6.I("Failed to parse the MessageEnvelope.");
                                                            e6.A("errorMessage", e5.getMessage());
                                                            e6.r();
                                                            throw new IllegalArgumentException(e5);
                                                        }
                                                    }
                                                    bdhg a5 = bdhg.a(awxkVar3.l);
                                                    String str2 = awxkVar3.m;
                                                    if (z2) {
                                                        ensz enszVar2 = (ensz) caan.a.h();
                                                        enszVar2.Y(csux.f, a5);
                                                        enszVar2.Y(csux.p, bdgq.b(str2));
                                                        ((ensz) enszVar2.h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/EtouffeeSinglePartIncomingChatMessageProcessor", "processFailedToDecryptReceipt", 315, "EtouffeeSinglePartIncomingChatMessageProcessor.java")).q("Completed processing FTD receipt. The original message has been scheduled for resending. (The RCS message ID included with this log is for the FTD receipt.)");
                                                        return avui.SUCCESS;
                                                    }
                                                    ensz enszVar3 = (ensz) caan.a.j();
                                                    enszVar3.Y(csux.f, a5);
                                                    enszVar3.Y(csux.p, bdgq.b(str2));
                                                    ((ensz) enszVar3.h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/EtouffeeSinglePartIncomingChatMessageProcessor", "processFailedToDecryptReceipt", 326, "EtouffeeSinglePartIncomingChatMessageProcessor.java")).q("Completed processing FTD receipt. The original message will not be resent. (The RCS message ID included with this log is for the FTD receipt.)");
                                                    return avui.FAIL_NO_RETRY;
                                                }
                                            }, caanVar4.j);
                                        }
                                    };
                                    errlVar.getClass();
                                    return covhVar.b(a).i(erohVar, errlVar);
                                }
                                i4 += Character.charCount(codePointAt);
                            }
                            caanVar3.g.e("Bugle.Etouffee.Ftd.Process.Status.Counts", 4);
                            return elfo.e(avui.FAIL_RETRY);
                        }
                        if (djbb.a(eijpVar.a())) {
                            final cadg cadgVar = caanVar3.c;
                            awup awupVar = awrjVar2.e().c;
                            if (awupVar == null) {
                                awupVar = awup.a;
                            }
                            if (djbb.a((ContentType) cadgVar.d.fP(awupVar))) {
                                if (cadgVar.j(awnuVar.a)) {
                                    final elfl i5 = cadg.d(awnuVar.a).i(new eroh() { // from class: cace
                                        @Override // defpackage.eroh
                                        public final ListenableFuture a(Object obj2) {
                                            return ((bzvx) cadg.this.b.b()).b((String) obj2);
                                        }
                                    }, cadgVar.k);
                                    return i5.i(new eroh() { // from class: cacf
                                        @Override // defpackage.eroh
                                        public final ListenableFuture a(Object obj2) {
                                            final cadg cadgVar2 = cadg.this;
                                            final awrj awrjVar3 = awrjVar2;
                                            final NativeMessageEncryptorV2 nativeMessageEncryptorV2 = (NativeMessageEncryptorV2) obj2;
                                            ekzz f2 = eleg.f("IncomingEncryptedMessageProcessor::decryptChatMessage");
                                            try {
                                                final ckep b2 = cadgVar2.b(awrjVar3);
                                                elfl d = cadg.d(((awnu) awrjVar3).a);
                                                final caga cagaVar = cadgVar2.c;
                                                cagaVar.getClass();
                                                elfl e4 = d.i(new eroh() { // from class: cacm
                                                    @Override // defpackage.eroh
                                                    public final ListenableFuture a(Object obj3) {
                                                        return caga.this.a((String) obj3);
                                                    }
                                                }, cadgVar2.k).i(new eroh() { // from class: cacn
                                                    @Override // defpackage.eroh
                                                    public final ListenableFuture a(Object obj3) {
                                                        awrj awrjVar4 = awrjVar3;
                                                        faym a3 = cadi.a(awrjVar4.e().d.E());
                                                        cadg cadgVar3 = cadg.this;
                                                        caes a4 = cadgVar3.l.a((String) obj3, a3, b2, nativeMessageEncryptorV2);
                                                        cadgVar3.h(a4, bdhg.a(((awnu) awrjVar4).a.l));
                                                        return elfo.e(a4);
                                                    }
                                                }, cadgVar2.j).e(eygu.class, new emwl() { // from class: cacp
                                                    @Override // defpackage.emwl
                                                    public final Object apply(Object obj3) {
                                                        csjb e5 = cadg.a.e();
                                                        e5.I("Unable to parse the incoming chat message content as a MessageEnvelope.");
                                                        e5.A("errorMessage", ((eygu) obj3).getMessage());
                                                        e5.r();
                                                        return caes.e(bzwg.INVALID_PROTOCOL_BUFFER);
                                                    }
                                                }, cadgVar2.k).e(IllegalArgumentException.class, new emwl() { // from class: cacq
                                                    @Override // defpackage.emwl
                                                    public final Object apply(Object obj3) {
                                                        csjb e5 = cadg.a.e();
                                                        e5.I("Incoming chat message is not base 64 encoded.");
                                                        e5.A("errorMessage", ((IllegalArgumentException) obj3).getMessage());
                                                        e5.r();
                                                        return caes.e(bzwg.INVALID_PROTOCOL_BUFFER);
                                                    }
                                                }, cadgVar2.k);
                                                f2.b(e4);
                                                f2.close();
                                                return e4;
                                            } catch (Throwable th) {
                                                try {
                                                    f2.close();
                                                } catch (Throwable th2) {
                                                    th.addSuppressed(th2);
                                                }
                                                throw th;
                                            }
                                        }
                                    }, cadgVar.k).e(IllegalStateException.class, new emwl() { // from class: cacg
                                        @Override // defpackage.emwl
                                        public final Object apply(Object obj2) {
                                            cadg.g((IllegalStateException) obj2);
                                            return caes.e(bzwg.ENCRYPTOR_NOT_FOUND);
                                        }
                                    }, cadgVar.k).e(cagb.class, new emwl() { // from class: cach
                                        @Override // defpackage.emwl
                                        public final Object apply(Object obj2) {
                                            cadg.g((cagb) obj2);
                                            return caes.e(bzwg.ENCRYPTOR_NOT_FOUND);
                                        }
                                    }, cadgVar.k).i(new eroh() { // from class: caci
                                        @Override // defpackage.eroh
                                        public final ListenableFuture a(Object obj2) {
                                            return cadg.this.e(awrjVar2, (caes) obj2, i5);
                                        }
                                    }, cadgVar.k).e(caic.class, new emwl() { // from class: cacj
                                        @Override // defpackage.emwl
                                        public final Object apply(Object obj2) {
                                            cadg.a.s("Group retry message gets into an invalid state.", (caic) obj2);
                                            return avui.FAIL_NO_RETRY;
                                        }
                                    }, cadgVar.k);
                                }
                                enrr k = cadg.a.k();
                                k.Y(csux.e, awnuVar.a.l);
                                ((enrr) k.h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/IncomingEncryptedMessageProcessor", "processFullyEncryptedMessage", 199, "IncomingEncryptedMessageProcessor.java")).q("Skipping processing message because missing required group or destination token.");
                                return elfo.e(avui.FAIL_NO_RETRY);
                            }
                            csjb e4 = cadg.a.e();
                            e4.I("Ignoring an incoming message with unexpected MIME type");
                            e4.h(bdhg.a(awnuVar.a.l));
                            avty avtyVar = cadgVar.d;
                            awup awupVar2 = awrjVar2.e().c;
                            if (awupVar2 == null) {
                                awupVar2 = awup.a;
                            }
                            e4.A("contentType", avtyVar.fP(awupVar2));
                            e4.r();
                            return elfo.e(avui.FAIL_NO_RETRY);
                        }
                        if (eijq.d.equals(eijpVar.a())) {
                            final cadg cadgVar2 = caanVar3.c;
                            eijp eijpVar2 = (eijp) cadgVar2.m.m().fP(awrjVar2.e());
                            if (!eijpVar2.a().f(eijq.d)) {
                                cadg.a.p("Incoming message is not a message receipt.");
                                e2 = elfo.e(bzuz.a);
                            } else if (cadgVar2.j(awnuVar.a)) {
                                try {
                                    AutoValue_MessageReceipt autoValue_MessageReceipt = (AutoValue_MessageReceipt) eijw.c(eijpVar2);
                                    boolean equals2 = autoValue_MessageReceipt.a.equals(eigx.DELIVERY);
                                    boolean equals3 = autoValue_MessageReceipt.a.equals(eigx.DISPLAY);
                                    if (equals2 || equals3) {
                                        Optional optional = autoValue_MessageReceipt.c;
                                        if (optional.isEmpty()) {
                                            String str2 = autoValue_MessageReceipt.b;
                                            awxk awxkVar3 = awnuVar.a;
                                            final bdhg a3 = bdhg.a(str2);
                                            final bdhg a4 = bdhg.a(awxkVar3.l);
                                            e2 = (bdhg.l(a3) ? elfo.g(new Callable() { // from class: cacs
                                                @Override // java.util.concurrent.Callable
                                                public final Object call() {
                                                    MessageCoreData x = ((bdmq) cadg.this.o.b()).x(a3);
                                                    if (x != null) {
                                                        return Boolean.valueOf(x.cB());
                                                    }
                                                    return false;
                                                }
                                            }, cadgVar2.j) : elfo.e(false)).h(new emwl() { // from class: cack
                                                @Override // defpackage.emwl
                                                public final Object apply(Object obj2) {
                                                    if (((Boolean) obj2).booleanValue()) {
                                                        bdhg bdhgVar = a4;
                                                        bdhg bdhgVar2 = a3;
                                                        cadg cadgVar3 = cadg.this;
                                                        csjb c = cadg.a.c();
                                                        c.I("Message receipt does not contain the encrypted-data extension.");
                                                        c.I("Original message");
                                                        c.h(bdhgVar2);
                                                        c.I("Imdn message");
                                                        c.h(bdhgVar);
                                                        c.r();
                                                        cadgVar3.n.f(bdhgVar, bdhgVar2, 4, 24, 43);
                                                    }
                                                    return bzuz.a;
                                                }
                                            }, cadgVar2.k);
                                        } else {
                                            csjb c = cadg.a.c();
                                            c.I("Processing IMDN with encrypted data extension");
                                            c.h(bdhg.a(awnuVar.a.l));
                                            c.B("isDelivery", equals2);
                                            c.B("isDisplay", equals3);
                                            c.r();
                                            if (autoValue_MessageReceipt.a.equals(eigx.DELIVERY)) {
                                                cadgVar2.i.e("Bugle.Etouffee.DeliveryImdn.ChatApi.Format", bzwh.a(3));
                                            }
                                            if (bzwf.g() && cadg.i(awnuVar.a) && equals2) {
                                                try {
                                                    faym faymVar = (faym) eyfy.parseFrom(faym.a, (eyee) optional.get(), eyfc.a());
                                                    if (faymVar.e) {
                                                        cadg.a.m("The message is a group FTD IMDN.");
                                                        cadgVar2.i.e("Bugle.Etouffee.DeliveryImdn.ChatApi.Format", bzwh.a(4));
                                                        bdhg a5 = bdhg.a(cady.a(faymVar.c).getMessageId());
                                                        csjb c2 = cadg.a.c();
                                                        c2.I("Handling FTD.");
                                                        c2.h(a5);
                                                        c2.r();
                                                        awxk awxkVar4 = ((awnu) awrjVar2).a;
                                                        awui awuiVar4 = awxkVar4.j;
                                                        if (awuiVar4 == null) {
                                                            awuiVar4 = awui.a;
                                                        }
                                                        if ((awxkVar4.c & 64) != 0) {
                                                            String str3 = awuiVar4.d;
                                                            int length2 = str3.length();
                                                            int i6 = 0;
                                                            while (i6 < length2) {
                                                                int codePointAt2 = str3.codePointAt(i6);
                                                                if (Character.isWhitespace(codePointAt2)) {
                                                                    i6 += Character.charCount(codePointAt2);
                                                                    faymVar = faymVar;
                                                                    a5 = a5;
                                                                    awuiVar4 = awuiVar4;
                                                                } else {
                                                                    awui awuiVar5 = awxkVar4.d;
                                                                    if (awuiVar5 == null) {
                                                                        awuiVar5 = awui.a;
                                                                    }
                                                                    final awui awuiVar6 = awuiVar5;
                                                                    final faym faymVar2 = faymVar;
                                                                    final bdhg bdhgVar = a5;
                                                                    final awui awuiVar7 = awuiVar4;
                                                                    try {
                                                                        Callable callable = new Callable() { // from class: cacl
                                                                            @Override // java.util.concurrent.Callable
                                                                            public final Object call() {
                                                                                cadh cadhVar = cadg.this.g;
                                                                                faym faymVar3 = faymVar2;
                                                                                bdhg bdhgVar2 = bdhgVar;
                                                                                if (cadhVar.a(faymVar3, bdhgVar2, awuiVar6, awuiVar7)) {
                                                                                    csjb c3 = cadg.a.c();
                                                                                    c3.I("FTD handling was scheduled.");
                                                                                    c3.h(bdhgVar2);
                                                                                    c3.r();
                                                                                    return avui.SUCCESS;
                                                                                }
                                                                                csjb e5 = cadg.a.e();
                                                                                e5.I("Failed to schedule FTD handling.");
                                                                                e5.h(bdhgVar2);
                                                                                e5.r();
                                                                                return avui.FAIL_NO_RETRY;
                                                                            }
                                                                        };
                                                                        cadgVar2 = cadgVar2;
                                                                        e3 = elfo.g(callable, cadgVar2.j);
                                                                        e2 = e3.h(new emwl() { // from class: cadd
                                                                            @Override // defpackage.emwl
                                                                            public final Object apply(Object obj2) {
                                                                                return bzvb.a((avui) obj2);
                                                                            }
                                                                        }, cadgVar2.k);
                                                                    } catch (eygu e5) {
                                                                        e = e5;
                                                                        cadgVar2 = cadgVar2;
                                                                        csjb e6 = cadg.a.e();
                                                                        e6.I("Unable to parse the incoming chat message content as a MessageEnvelope.");
                                                                        e6.A("errorMessage", e.getMessage());
                                                                        e6.r();
                                                                        cadgVar2.n.c(bdhg.a(awnuVar.a.l), 18);
                                                                        cadgVar2.i.e("Bugle.Etouffee.DecryptionAborted.Reason", bzwg.INVALID_PROTOCOL_BUFFER.y);
                                                                        e2 = elfo.e(bzvb.a(avui.FAIL_NO_RETRY));
                                                                        return e2.i(new eroh() { // from class: caah
                                                                            @Override // defpackage.eroh
                                                                            public final ListenableFuture a(Object obj2) {
                                                                                caep caepVar = (caep) obj2;
                                                                                if (caepVar.b() == 1) {
                                                                                    return elfo.e(caepVar.a());
                                                                                }
                                                                                return caan.this.e.a(awrjVar2);
                                                                            }
                                                                        }, caanVar3.k);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        cadg.a.n("Local identity is absent in incoming chat message request.");
                                                        e3 = elfo.e(avui.FAIL_NO_RETRY);
                                                        e2 = e3.h(new emwl() { // from class: cadd
                                                            @Override // defpackage.emwl
                                                            public final Object apply(Object obj2) {
                                                                return bzvb.a((avui) obj2);
                                                            }
                                                        }, cadgVar2.k);
                                                    }
                                                } catch (eygu e7) {
                                                    e = e7;
                                                }
                                            }
                                            e2 = cadgVar2.c(awrjVar2, (eyee) optional.get()).h(new emwl() { // from class: cadd
                                                @Override // defpackage.emwl
                                                public final Object apply(Object obj2) {
                                                    return bzvb.a((avui) obj2);
                                                }
                                            }, cadgVar2.k);
                                        }
                                    } else {
                                        cadg.a.p("Incoming message is not a delivery or display receipt, skipping.");
                                        e2 = elfo.e(bzuz.a);
                                    }
                                } catch (eikm e8) {
                                    bdhg a6 = bdhg.a(awnuVar.a.l);
                                    csjb e9 = cadg.a.e();
                                    e9.I("Failed to deserialize contents of a message receipt.");
                                    e9.h(a6);
                                    e9.s(e8);
                                    cadgVar2.n.c(a6, 27);
                                    e2 = elfo.e(bzvb.a(avui.FAIL_NO_RETRY));
                                }
                            } else {
                                enrr k2 = cadg.a.k();
                                k2.Y(csux.e, awnuVar.a.l);
                                ((enrr) k2.h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/IncomingEncryptedMessageProcessor", "processImdnReceiptMessageWithEncryptedData", 369, "IncomingEncryptedMessageProcessor.java")).q("Skipping processing message because missing required group or destination token.");
                                e2 = elfo.e(bzvb.a(avui.FAIL_NO_RETRY));
                            }
                            return e2.i(new eroh() { // from class: caah
                                @Override // defpackage.eroh
                                public final ListenableFuture a(Object obj2) {
                                    caep caepVar = (caep) obj2;
                                    if (caepVar.b() == 1) {
                                        return elfo.e(caepVar.a());
                                    }
                                    return caan.this.e.a(awrjVar2);
                                }
                            }, caanVar3.k);
                        }
                        if (eijq.b.f(eijpVar.a())) {
                            cadg cadgVar3 = caanVar3.c;
                            eijp eijpVar3 = (eijp) cadgVar3.m.m().fP(awrjVar2.e());
                            if (!eijpVar3.a().f(eijq.b)) {
                                cadg.a.p("Incoming message is not a file transfer.");
                                e = elfo.e(bzuz.a);
                            } else if (cadgVar3.j(awnuVar.a)) {
                                try {
                                    AutoValue_FileTransferInformation autoValue_FileTransferInformation = (AutoValue_FileTransferInformation) eijr.c(eijpVar3);
                                    Optional optional2 = autoValue_FileTransferInformation.c;
                                    if (optional2.isEmpty()) {
                                        cadg.a.p("File transfer message does not contain the encrypted-data extension.");
                                        FileInformation fileInformation = autoValue_FileTransferInformation.a;
                                        if (bzpp.a((String) fileInformation.h().orElse(null), fileInformation.b().toString())) {
                                            cadgVar3.i.e("Bugle.Etouffee.FileTransfer.Format", covi.a(4));
                                            cadgVar3.n.c(bdhg.a(awnuVar.a.l), 36);
                                        } else {
                                            cadgVar3.i.e("Bugle.Etouffee.FileTransfer.Format", covi.a(5));
                                        }
                                        e = elfo.e(bzuz.a);
                                    } else {
                                        csjb c3 = cadg.a.c();
                                        c3.I("Processing file transfer with encrypted data extension");
                                        c3.h(bdhg.a(awnuVar.a.l));
                                        c3.r();
                                        e = cadgVar3.c(awrjVar2, (eyee) optional2.get()).h(new emwl() { // from class: cadd
                                            @Override // defpackage.emwl
                                            public final Object apply(Object obj2) {
                                                return bzvb.a((avui) obj2);
                                            }
                                        }, cadgVar3.k).e(caic.class, new emwl() { // from class: cade
                                            @Override // defpackage.emwl
                                            public final Object apply(Object obj2) {
                                                cadg.a.s("Group retry message gets into an invalid state.", (caic) obj2);
                                                return bzvb.a(avui.FAIL_NO_RETRY);
                                            }
                                        }, cadgVar3.k);
                                    }
                                } catch (eikm e10) {
                                    bdhg a7 = bdhg.a(awnuVar.a.l);
                                    csjb e11 = cadg.a.e();
                                    e11.I("Failed to deserialize contents of a file transfer message.");
                                    e11.h(a7);
                                    e11.s(e10);
                                    cadgVar3.n.c(a7, 27);
                                    e = elfo.e(bzvb.a(avui.FAIL_NO_RETRY));
                                }
                            } else {
                                enrr k3 = cadg.a.k();
                                k3.Y(csux.e, awnuVar.a.l);
                                ((enrr) k3.h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/IncomingEncryptedMessageProcessor", "processFileTransferMessageWithEncryptedData", 281, "IncomingEncryptedMessageProcessor.java")).q("Skipping processing message because missing required group or destination token.");
                                e = elfo.e(bzvb.a(avui.FAIL_NO_RETRY));
                            }
                            return e.i(new eroh() { // from class: caai
                                @Override // defpackage.eroh
                                public final ListenableFuture a(Object obj2) {
                                    caep caepVar = (caep) obj2;
                                    if (caepVar.b() == 1) {
                                        return elfo.e(caepVar.a());
                                    }
                                    return caan.this.e.a(awrjVar2);
                                }
                            }, caanVar3.k);
                        }
                    }
                    if (caanVar3.f.h() && cadj.a(eijpVar.a().toString())) {
                        caanVar3.b(a, awrjVar2, booleanValue, g);
                    } else if (cadj.a(eijpVar.a().toString())) {
                        caanVar3.b(a, awrjVar2, booleanValue, g);
                        awso awsoVar = caanVar3.e;
                        avty avtyVar2 = new avty();
                        awuk awukVar = (awuk) awrjVar2.e().toBuilder();
                        awup awupVar3 = (awup) avtyVar2.m().fP(eijq.e);
                        awukVar.copyOnWrite();
                        awul awulVar = (awul) awukVar.instance;
                        awupVar3.getClass();
                        awulVar.c = awupVar3;
                        awulVar.b |= 1;
                        awul awulVar2 = (awul) awukVar.build();
                        awxk awxkVar5 = awnuVar.a;
                        awri c4 = awrj.c();
                        awxh awxhVar = (awxh) awxkVar5.toBuilder();
                        awxhVar.copyOnWrite();
                        ((awxk) awxhVar.instance).o = awxk.emptyProtobufList();
                        awxhVar.c(awulVar2);
                        c4.c((awxk) awxhVar.build());
                        c4.b(i2);
                        return awsoVar.a(c4.d());
                    }
                    return caanVar3.e.a(awrjVar2);
                }
            }, ((caan) awrhVar).k);
            f.b(i);
            f.close();
            return i;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
