package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.ims.rcsservice.chatsession.message.ChatMessage;
import com.google.android.rcs.client.messaging.data.ContentType;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.communication.synapse.security.scytale.NativeMessageEncryptorV2;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzzb implements cown {
    public static final cskc a = cskc.g("BugleRcs", "EncryptedRcsMessageReceiptConverter");
    public final bzyx b;
    public final aolr c;
    private final cozu d;
    private final caga e;
    private final avtw f;
    private final augx g;
    private final avty h = new avty();
    private final errl i;

    public bzzb(cozu cozuVar, caga cagaVar, bzyx bzyxVar, avtw avtwVar, aolr aolrVar, augx augxVar, errl errlVar) {
        this.d = cozuVar;
        this.e = cagaVar;
        this.b = bzyxVar;
        this.f = avtwVar;
        this.c = aolrVar;
        this.g = augxVar;
        this.i = errlVar;
    }

    private final elfl d(awzn awznVar, MessageCoreData messageCoreData, avkl avklVar) {
        if (messageCoreData.am() == null) {
            csjb e = a.e();
            e.I("Sending IMDN plaintext delivery receipt for an etouffee 1 to 1 message");
            e.d(messageCoreData.B());
            e.h(messageCoreData.E());
            e.r();
            return this.d.c(awznVar, messageCoreData, avklVar);
        }
        awuk awukVar = (awuk) awul.a.createBuilder();
        awup awupVar = (awup) this.h.m().fP(ContentType.e(messageCoreData.am()));
        awukVar.copyOnWrite();
        awul awulVar = (awul) awukVar.instance;
        awupVar.getClass();
        awulVar.c = awupVar;
        awulVar.b |= 1;
        eyee x = eyee.x(messageCoreData.dl());
        awukVar.copyOnWrite();
        awul awulVar2 = (awul) awukVar.instance;
        awulVar2.b |= 2;
        awulVar2.d = x;
        return elfo.e((awul) awukVar.build());
    }

    @Override // defpackage.cown
    public final awul a(awzn awznVar, bdhg bdhgVar, Instant instant) {
        csjb c = a.c();
        c.I("Sending IMDN plaintext receipt because the message is missing");
        c.h(bdhgVar);
        c.r();
        return this.g.a() ? this.d.a(awznVar, bdhgVar, instant) : this.d.a(awzn.DELIVERY, bdhgVar, instant);
    }

    @Override // defpackage.cown
    public final elfl b(final bdhg bdhgVar, final fayv fayvVar, final Instant instant, final awui awuiVar, final avkl avklVar) {
        fayn faynVar = (fayn) fayq.a.createBuilder();
        String e = bdhg.e(bdhgVar);
        faynVar.copyOnWrite();
        fayq fayqVar = (fayq) faynVar.instance;
        fayqVar.b |= 1;
        fayqVar.c = e;
        fayp faypVar = fayp.READ;
        faynVar.copyOnWrite();
        fayq fayqVar2 = (fayq) faynVar.instance;
        fayqVar2.d = faypVar.f;
        fayqVar2.b |= 2;
        final byte[] byteArray = ((fayq) faynVar.build()).toByteArray();
        return this.e.a(awuiVar.d).i(new eroh() { // from class: bzyy
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                bzzb bzzbVar = bzzb.this;
                final String str = (String) obj;
                final awui awuiVar2 = awuiVar;
                final bdhg bdhgVar2 = bdhgVar;
                fayv fayvVar2 = fayvVar;
                final Instant instant2 = instant;
                avkl avklVar2 = avklVar;
                final byte[] bArr = byteArray;
                if (!bzwf.h() || !avklVar2.d()) {
                    return bzzbVar.b.b(bArr, str, awuiVar2, bdhgVar2, engw.r(bzzbVar.c.b(avklVar2.a())), "application/vnd.google.rcs.success", true, eote.READ_REPORT, false, fayvVar2);
                }
                engw z = bzzbVar.c.z(avklVar2);
                boolean z2 = true;
                if (((enou) z).c == 1) {
                    final bzyx bzyxVar = bzzbVar.b;
                    final aoku aokuVar = (aoku) z.get(0);
                    ekzz f = eleg.f("EtouffeeMessageConverter#encryptDisplayReceiptInXmlFormat");
                    if (fayvVar2 == null) {
                        try {
                            fayvVar2 = fayv.a;
                        } finally {
                        }
                    }
                    final fayv fayvVar3 = fayvVar2;
                    elfl f2 = bzyxVar.c(engw.r(aokuVar), true).i(new eroh() { // from class: bzyp
                        @Override // defpackage.eroh
                        public final ListenableFuture a(Object obj2) {
                            final enpj enpjVar = (enpj) obj2;
                            final bzyx bzyxVar2 = bzyx.this;
                            elfl b = ((bzvx) bzyxVar2.b.b()).b(awuiVar2.d);
                            final String str2 = str;
                            final byte[] bArr2 = bArr;
                            final fayv fayvVar4 = fayvVar3;
                            final bdhg bdhgVar3 = bdhgVar2;
                            final Instant instant3 = instant2;
                            return b.h(new emwl() { // from class: bzyn
                                @Override // defpackage.emwl
                                public final Object apply(Object obj3) {
                                    NativeMessageEncryptorV2 nativeMessageEncryptorV2 = (NativeMessageEncryptorV2) obj3;
                                    fayr fayrVar = (fayr) fays.a.createBuilder();
                                    fayrVar.copyOnWrite();
                                    fays faysVar = (fays) fayrVar.instance;
                                    String str3 = str2;
                                    str3.getClass();
                                    faysVar.b |= 2;
                                    faysVar.d = str3;
                                    fayrVar.copyOnWrite();
                                    fays faysVar2 = (fays) fayrVar.instance;
                                    faysVar2.b |= 1;
                                    faysVar2.c = "application/vnd.google.rcs.success";
                                    eyee x = eyee.x(bArr2);
                                    fayrVar.copyOnWrite();
                                    fays faysVar3 = (fays) fayrVar.instance;
                                    faysVar3.b |= 4;
                                    faysVar3.e = x;
                                    fayrVar.copyOnWrite();
                                    fays faysVar4 = (fays) fayrVar.instance;
                                    fayv fayvVar5 = fayvVar4;
                                    fayvVar5.getClass();
                                    faysVar4.f = fayvVar5;
                                    faysVar4.b |= 8;
                                    fays faysVar5 = (fays) fayrVar.build();
                                    eote eoteVar = eote.READ_REPORT;
                                    bzyx bzyxVar3 = bzyx.this;
                                    faym c = bzyxVar3.h.c(faysVar5, bdhgVar3, str3, enpjVar, true, false, eoteVar, nativeMessageEncryptorV2);
                                    bdhg a2 = bzyxVar3.j.a();
                                    eies eiesVar = new eies();
                                    eiesVar.j(eigx.DISPLAY);
                                    eiesVar.g(a2.f());
                                    eiesVar.h(eigx.DISPLAY.f);
                                    eiesVar.i(instant3);
                                    eiesVar.e(c.toByteString());
                                    try {
                                        return new ChatMessage(ChatMessage.Type.MESSAGE_RECEIPT, ((eijk) eijw.d(eiesVar.k())).a.I(), a2.f());
                                    } catch (eikm e2) {
                                        throw new cowg(e2);
                                    }
                                }
                            }, bzyxVar2.e);
                        }
                    }, bzyxVar.e).f(Throwable.class, new eroh() { // from class: bzyq
                        @Override // defpackage.eroh
                        public final ListenableFuture a(Object obj2) {
                            csjb e2 = bzyx.a.e();
                            e2.I("Failed to create encrypted display IMDN in XML extension format.");
                            e2.M("remote messaging identity destination", aoku.this.toString());
                            e2.A("rcsMessageId", bdhgVar2);
                            e2.r();
                            return elfo.d((Throwable) obj2);
                        }
                    }, bzyxVar.f);
                    f.b(f2);
                    f.close();
                    return f2;
                }
                csjb e2 = bzzb.a.e();
                e2.I("Trying to encrypt IMDN display to multiple recipients in etouffee group message.");
                e2.I("{");
                enqv it = z.iterator();
                while (it.hasNext()) {
                    aoku aokuVar2 = (aoku) it.next();
                    if (!z2) {
                        e2.v(", ");
                    }
                    e2.p(aokuVar2);
                    e2.v(e2);
                    z2 = false;
                }
                e2.v("}");
                e2.r();
                throw new IllegalStateException("Cannot encrypt IMDN display receipt to multiple recipients in group messaging.");
            }
        }, this.i).h(new emwl() { // from class: bzyz
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return avtw.a((ChatMessage) obj);
            }
        }, this.i).e(IllegalStateException.class, new emwl() { // from class: bzza
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                throw new cowg((IllegalStateException) obj);
            }
        }, this.i);
    }

    @Override // defpackage.cown
    public final elfl c(awzn awznVar, MessageCoreData messageCoreData, avkl avklVar) {
        emxf.b(messageCoreData.cB(), "Message receipt should not be encrypted");
        int ordinal = awznVar.ordinal();
        if (ordinal == 1) {
            return this.g.a() ? d(awznVar, messageCoreData, avklVar) : d(awzn.DELIVERY, messageCoreData, avklVar);
        }
        if (ordinal != 2) {
            if (ordinal != 3) {
                return elfo.d(new IllegalArgumentException("Encrypted message receipts not supported to type " + awznVar.e));
            }
            if (this.g.a()) {
                return d(awznVar, messageCoreData, avklVar);
            }
            ((enrr) a.k().h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/EncryptedRcsMessageReceiptConverter", "toChatMessageContent", 95, "EncryptedRcsMessageReceiptConverter.java")).q("Encrypted message receipts not supported negative delivery report as the flag is off");
            return elfo.e(awul.a);
        }
        if (!avklVar.d() || bzwf.h()) {
            return b(messageCoreData.E(), messageCoreData.aa(), Instant.ofEpochMilli(messageCoreData.r()), messageCoreData.w(), avklVar);
        }
        csjb e = a.e();
        e.I("Sending IMDN plaintext display receipt for an etouffee group message");
        e.d(messageCoreData.B());
        e.h(messageCoreData.E());
        e.r();
        return this.d.c(awzn.DISPLAYED, messageCoreData, avklVar);
    }
}
