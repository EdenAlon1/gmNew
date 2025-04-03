package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.ims.rcsservice.chatsession.message.ChatMessage;
import com.google.android.rcs.client.messaging.data.ContentType;
import com.google.android.rcs.client.messaging.data.FileInformation;
import com.google.android.rcs.client.messaging.data.FileTransferInformation;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.communication.synapse.security.scytale.NativeMessageEncryptorV2;
import j$.time.Duration;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzyj implements cowk {
    private static final cskc k = cskc.g("BugleEtouffee", "EncryptedRcsFileTransferDetailsConverter");
    public final caga a;
    public final aolr b;
    public final ffbr c;
    public final caet d;
    public final caen e;
    public final ffbr f;
    public final eikl g;
    public final ffbr h;
    public final ffbr i;
    public final errl j;
    private final avtw l;
    private final avty m = new avty();
    private final errl n;
    private final ffbr o;
    private final asnv p;

    public bzyj(caga cagaVar, avtw avtwVar, aolr aolrVar, ffbr ffbrVar, caet caetVar, caen caenVar, ffbr ffbrVar2, eikl eiklVar, ffbr ffbrVar3, ffbr ffbrVar4, errl errlVar, errl errlVar2, ffbr ffbrVar5, asnv asnvVar) {
        this.a = cagaVar;
        this.l = avtwVar;
        this.b = aolrVar;
        this.c = ffbrVar;
        this.d = caetVar;
        this.e = caenVar;
        this.f = ffbrVar2;
        this.g = eiklVar;
        this.h = ffbrVar3;
        this.i = ffbrVar4;
        this.n = errlVar;
        this.j = errlVar2;
        this.o = ffbrVar5;
        this.p = asnvVar;
    }

    @Override // defpackage.cowk
    public final elfl a(final awvd awvdVar, final MessageCoreData messageCoreData, final avkl avklVar) {
        Throwable th;
        fayk faykVar;
        final awui w = messageCoreData.w();
        final elfl h = elfo.h(new erog() { // from class: bzyd
            @Override // defpackage.erog
            public final ListenableFuture a() {
                return bzyj.this.a.a(w.d);
            }
        }, this.n);
        int i = awvdVar.b & 2;
        MessagePartCoreData G = messageCoreData.G();
        G.getClass();
        awap z = G.z();
        if (!this.p.a() || z == null) {
            final bdhg D = messageCoreData.D();
            btch a = btck.a();
            a.z("getEtouffeeMessageByRcsId3");
            a.c(new Function() { // from class: bzyi
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    btcj btcjVar = (btcj) obj;
                    btcjVar.b(bdhg.this);
                    return btcjVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            btbk btbkVar = (btbk) a.b().o();
            try {
                try {
                    if (!btbkVar.moveToFirst()) {
                        ((bzzi) this.i.b()).e(messageCoreData.D(), 6);
                        throw new IllegalArgumentException("The etouffee metadata was missing.");
                    }
                    if (btbkVar.isClosed() || btbkVar.isBeforeFirst() || btbkVar.isAfterLast()) {
                        throw new IllegalArgumentException("Invalid cursor while reading etouffee metadata.");
                    }
                    fayj fayjVar = (fayj) fayk.a.createBuilder();
                    byte[] l = btbkVar.l();
                    if (l == null) {
                        ((bzzi) this.i.b()).e(btbkVar.f(), 7);
                        throw new IllegalArgumentException("The etouffee metadata is missing the attachment one time media key.");
                    }
                    byte[] k2 = btbkVar.k();
                    if (k2 == null) {
                        ((bzzi) this.i.b()).e(btbkVar.f(), 8);
                        throw new IllegalArgumentException("The etouffee metadata is missing attachment digest.");
                    }
                    fayh fayhVar = (fayh) fayi.a.createBuilder();
                    eyee x = eyee.x(l);
                    fayhVar.copyOnWrite();
                    fayi fayiVar = (fayi) fayhVar.instance;
                    fayiVar.b |= 1;
                    fayiVar.c = x;
                    eyee x2 = eyee.x(k2);
                    fayhVar.copyOnWrite();
                    fayi fayiVar2 = (fayi) fayhVar.instance;
                    fayiVar2.b |= 2;
                    fayiVar2.d = x2;
                    int c = btbkVar.c();
                    fayhVar.copyOnWrite();
                    fayi fayiVar3 = (fayi) fayhVar.instance;
                    fayiVar3.b |= 4;
                    fayiVar3.e = c;
                    String i2 = btbkVar.i();
                    if (i2 == null) {
                        ((bzzi) this.i.b()).e(btbkVar.f(), 9);
                        throw new IllegalArgumentException("The etouffee metadata is missing the name of the attachment.");
                    }
                    String h2 = btbkVar.h();
                    if (h2 == null) {
                        ((bzzi) this.i.b()).e(btbkVar.f(), 10);
                        throw new IllegalArgumentException("The etouffee metadata is missing the content type of the attachment.");
                    }
                    fayhVar.copyOnWrite();
                    fayi fayiVar4 = (fayi) fayhVar.instance;
                    fayiVar4.b = 8 | fayiVar4.b;
                    fayiVar4.f = i2;
                    awup awupVar = (awup) this.m.m().fP(ContentType.e(h2));
                    fayhVar.copyOnWrite();
                    fayi fayiVar5 = (fayi) fayhVar.instance;
                    awupVar.getClass();
                    fayiVar5.g = awupVar;
                    fayiVar5.b |= 16;
                    fayjVar.copyOnWrite();
                    fayk faykVar2 = (fayk) fayjVar.instance;
                    fayi fayiVar6 = (fayi) fayhVar.build();
                    fayiVar6.getClass();
                    faykVar2.d = fayiVar6;
                    faykVar2.b |= 2;
                    byte[] n = btbkVar.n();
                    byte[] m = btbkVar.m();
                    if (n != null && m != null) {
                        try {
                            fayh fayhVar2 = (fayh) fayi.a.createBuilder();
                            eyee x3 = eyee.x(n);
                            fayhVar2.copyOnWrite();
                            fayi fayiVar7 = (fayi) fayhVar2.instance;
                            fayiVar7.b |= 1;
                            fayiVar7.c = x3;
                            eyee x4 = eyee.x(m);
                            fayhVar2.copyOnWrite();
                            fayi fayiVar8 = (fayi) fayhVar2.instance;
                            fayiVar8.b |= 2;
                            fayiVar8.d = x4;
                            int e = btbkVar.e();
                            fayhVar2.copyOnWrite();
                            fayi fayiVar9 = (fayi) fayhVar2.instance;
                            fayiVar9.b |= 4;
                            fayiVar9.e = e;
                            String j = btbkVar.j();
                            if (j == null) {
                                ((bzzi) this.i.b()).e(btbkVar.f(), 11);
                                throw new IllegalArgumentException("The etouffee metadata is missing the content type of the thumbnail.");
                            }
                            awup awupVar2 = (awup) this.m.m().fP(ContentType.e(j));
                            fayhVar2.copyOnWrite();
                            fayi fayiVar10 = (fayi) fayhVar2.instance;
                            awupVar2.getClass();
                            fayiVar10.g = awupVar2;
                            fayiVar10.b |= 16;
                            fayjVar.copyOnWrite();
                            fayk faykVar3 = (fayk) fayjVar.instance;
                            fayi fayiVar11 = (fayi) fayhVar2.build();
                            fayiVar11.getClass();
                            faykVar3.c = fayiVar11;
                            faykVar3.b |= 1;
                        } catch (Throwable th2) {
                            th = th2;
                            try {
                                btbkVar.close();
                                throw th;
                            } catch (Throwable th3) {
                                th.addSuppressed(th3);
                                throw th;
                            }
                        }
                    }
                    faykVar = (fayk) fayjVar.build();
                    btbkVar.close();
                } catch (Throwable th4) {
                    th = th4;
                    th = th;
                    btbkVar.close();
                    throw th;
                }
            } catch (Throwable th5) {
                th = th5;
            }
        } else {
            fayi d = ((awcz) this.o.b()).d(z);
            if (d == null) {
                ((bzzi) this.i.b()).e(messageCoreData.D(), 6);
                throw new IllegalArgumentException("The etouffee metadata was missing.");
            }
            if (i == 0) {
                fayj fayjVar2 = (fayj) fayk.a.createBuilder();
                fayjVar2.copyOnWrite();
                fayk faykVar4 = (fayk) fayjVar2.instance;
                faykVar4.d = d;
                faykVar4.b |= 2;
                faykVar = (fayk) fayjVar2.build();
            } else {
                fayi e2 = ((awcz) this.o.b()).e(z);
                if (e2 == null) {
                    enrr k3 = k.k();
                    k3.Y(cqpo.j, z);
                    ((enrr) k3.h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/EncryptedRcsFileTransferDetailsConverter", "buildFileTransferWithoutChatMessageContent", 309, "EncryptedRcsFileTransferDetailsConverter.java")).q("Encryption metadata for thumbnail was missing.");
                    fayj fayjVar3 = (fayj) fayk.a.createBuilder();
                    fayjVar3.copyOnWrite();
                    fayk faykVar5 = (fayk) fayjVar3.instance;
                    faykVar5.d = d;
                    faykVar5.b |= 2;
                    faykVar = (fayk) fayjVar3.build();
                } else {
                    fayj fayjVar4 = (fayj) fayk.a.createBuilder();
                    fayjVar4.copyOnWrite();
                    fayk faykVar6 = (fayk) fayjVar4.instance;
                    faykVar6.d = d;
                    faykVar6.b |= 2;
                    fayjVar4.copyOnWrite();
                    fayk faykVar7 = (fayk) fayjVar4.instance;
                    faykVar7.c = e2;
                    faykVar7.b |= 1;
                    faykVar = (fayk) fayjVar4.build();
                }
            }
        }
        final elfl e3 = elfo.e(faykVar);
        return elfo.k(h, e3).b(new erog() { // from class: bzyf
            @Override // defpackage.erog
            public final ListenableFuture a() {
                final bzyj bzyjVar = bzyj.this;
                ((akzt) bzyjVar.h.b()).e("Bugle.Etouffee.FileTransfer.Format.Outgoing", covi.a(3));
                bzzi bzziVar = (bzzi) bzyjVar.i.b();
                final MessageCoreData messageCoreData2 = messageCoreData;
                bzziVar.f(messageCoreData2.E(), bdhg.a, 12, 11, 1);
                final String str = (String) erqt.q(h);
                final fayk faykVar8 = (fayk) erqt.q(e3);
                final fayv aa = messageCoreData2.aa();
                final bdhg E = messageCoreData2.E();
                elfl b = ((bzvx) bzyjVar.c.b()).b(messageCoreData2.w().d);
                final awvd awvdVar2 = awvdVar;
                final avkl avklVar2 = avklVar;
                return b.i(new eroh() { // from class: bzye
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj) {
                        boolean z2;
                        enpj c2;
                        NativeMessageEncryptorV2 nativeMessageEncryptorV2 = (NativeMessageEncryptorV2) obj;
                        fayv fayvVar = aa;
                        if (fayvVar == null) {
                            fayvVar = fayv.a;
                        }
                        avkl avklVar3 = avklVar2;
                        fayk faykVar9 = faykVar8;
                        String str2 = str;
                        fayr fayrVar = (fayr) fays.a.createBuilder();
                        fayrVar.copyOnWrite();
                        fays faysVar = (fays) fayrVar.instance;
                        boolean z3 = true;
                        faysVar.b |= 1;
                        faysVar.c = "application/vnd.gsma.rcs-ft-http+xml";
                        fayrVar.copyOnWrite();
                        fays faysVar2 = (fays) fayrVar.instance;
                        str2.getClass();
                        faysVar2.b |= 2;
                        faysVar2.d = str2;
                        eyee byteString = faykVar9.toByteString();
                        fayrVar.copyOnWrite();
                        fays faysVar3 = (fays) fayrVar.instance;
                        faysVar3.b |= 4;
                        faysVar3.e = byteString;
                        fayrVar.copyOnWrite();
                        fays faysVar4 = (fays) fayrVar.instance;
                        fayvVar.getClass();
                        faysVar4.f = fayvVar;
                        faysVar4.b |= 8;
                        fays faysVar5 = (fays) fayrVar.build();
                        if (bzwf.h() && avklVar3.d()) {
                            z2 = true;
                        } else {
                            z2 = true;
                            z3 = false;
                        }
                        MessageCoreData messageCoreData3 = messageCoreData2;
                        bzyj bzyjVar2 = bzyj.this;
                        if (z3) {
                            Stream stream = Collection.EL.stream(avklVar3.c());
                            final aolr aolrVar = bzyjVar2.b;
                            aolrVar.getClass();
                            Stream map = stream.map(new Function() { // from class: bzyc
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo448andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj2) {
                                    return aolr.this.b((awui) obj2);
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            });
                            int i3 = engw.d;
                            c2 = bzyjVar2.e.c((engw) map.collect(endq.a), z2);
                        } else {
                            c2 = bzyjVar2.e.c(bzyjVar2.b.y(((bczy) bzyjVar2.f.b()).L(messageCoreData3.z())), false);
                        }
                        enpj enpjVar = c2;
                        awvd awvdVar3 = awvdVar2;
                        bdhg bdhgVar = E;
                        faym c3 = bzyjVar2.d.c(faysVar5, bdhgVar, str2, enpjVar, false, z3, eote.ATTACHMENT, nativeMessageEncryptorV2);
                        avtz avtzVar = new avtz();
                        awvb awvbVar = awvdVar3.c;
                        if (awvbVar == null) {
                            awvbVar = awvb.a;
                        }
                        eifi c4 = ((FileInformation) avtzVar.fP(awvbVar)).c();
                        c4.e("encrypted_file");
                        c4.c(bzpp.a);
                        MessagePartCoreData G2 = messageCoreData3.G();
                        if (G2 != null && G2.ba()) {
                            c4.b(Duration.ofMillis(G2.k()));
                        }
                        eieg eiegVar = new eieg();
                        eiegVar.c(c4.i());
                        if ((awvdVar3.b & 2) != 0) {
                            awvb awvbVar2 = awvdVar3.d;
                            if (awvbVar2 == null) {
                                awvbVar2 = awvb.a;
                            }
                            eifi c5 = ((FileInformation) avtzVar.fP(awvbVar2)).c();
                            c5.c(bzpp.a);
                            eiegVar.e(c5.i());
                        }
                        eiegVar.b(c3.toByteString());
                        eijp b2 = bzyjVar2.g.b(FileTransferInformation.class).b(eiegVar.a());
                        ChatMessage.Type type = ChatMessage.Type.FILE_TRANSFER;
                        byte[] I = b2.b().I();
                        String str3 = bdhgVar.b;
                        str3.getClass();
                        return elfo.e(new ChatMessage(type, I, str3));
                    }
                }, bzyjVar.j);
            }
        }, this.n).h(new emwl() { // from class: bzyg
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return avtw.a((ChatMessage) obj);
            }
        }, this.n).e(IllegalStateException.class, new emwl() { // from class: bzyh
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                throw new cowg((IllegalStateException) obj);
            }
        }, this.n);
    }
}
