package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.communication.synapse.security.scytale.MediaDecryptionParams;
import com.google.communication.synapse.security.scytale.MediaEncryptor;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzxq implements covj {
    private static final cskc a = cskc.g("BugleEtouffee", "EncryptedFileReceiver");
    private final fazb b;
    private final Context c;
    private final ffbr d;
    private final Optional e;
    private final ffbr f;
    private final bzzi g;
    private final atua h;
    private final ffbr i;
    private final asmj j;
    private final ffbr k;

    public bzxq(Context context, fazb fazbVar, ffbr ffbrVar, Optional optional, ffbr ffbrVar2, bzzi bzziVar, atua atuaVar, ffbr ffbrVar3, asmj asmjVar, ffbr ffbrVar4) {
        this.c = context;
        this.b = fazbVar;
        this.d = ffbrVar;
        this.e = optional;
        this.f = ffbrVar2;
        this.g = bzziVar;
        this.h = atuaVar;
        this.i = ffbrVar3;
        this.j = asmjVar;
        this.k = ffbrVar4;
    }

    private static boolean b(final bdhg bdhgVar) {
        btch a2 = btck.a();
        a2.z("isEncrypted");
        a2.c(new Function() { // from class: bzxm
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
        return a2.b().T();
    }

    private static final eyee c(byte[] bArr) {
        bArr.getClass();
        return eyee.x(bArr);
    }

    @Override // defpackage.covj
    public final Uri a(final bdhg bdhgVar, Uri uri, int i) {
        int i2;
        MediaDecryptionParams mediaDecryptionParams;
        InputStream esosVar;
        Object cfmjVar;
        cfmh cfmhVar;
        final Uri uri2 = uri;
        ekzz f = eleg.f("EtouffeeFileReceiver#convertFile");
        try {
            if (!this.h.a()) {
                this.b.b();
            }
            if (b(bdhgVar)) {
                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                try {
                    InputStream openInputStream = this.c.getContentResolver().openInputStream(uri2);
                    try {
                        if (openInputStream == null) {
                            ((akzt) this.f.b()).e("Bugle.Etouffee.FileDecryptionFailed.Status", 1);
                            throw new FileNotFoundException(a.C(uri2, "fileUri was not found, fileUri="));
                        }
                        ekzz f2 = eleg.f("EtouffeeFileReceiver#convertStream");
                        try {
                            if (b(bdhgVar)) {
                                btch a2 = btck.a();
                                a2.z("getEtouffeeMessageByRcsId1");
                                a2.c(new Function() { // from class: bzxn
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
                                btbk btbkVar = (btbk) a2.b().o();
                                try {
                                    if (!btbkVar.moveToFirst()) {
                                        this.g.c(bdhgVar, 39);
                                        atomicBoolean.set(true);
                                        ((akzt) this.f.b()).e("Bugle.Etouffee.FileDecryptionFailed.Status", 3);
                                        throw new IllegalStateException("Can't open encrypted stream.");
                                    }
                                    try {
                                        if (this.h.a()) {
                                            espe g = btbkVar.g();
                                            if (g == null) {
                                                fayh fayhVar = (fayh) fayi.a.createBuilder();
                                                if (i == 2) {
                                                    eyee c = c(btbkVar.l());
                                                    fayhVar.copyOnWrite();
                                                    fayi fayiVar = (fayi) fayhVar.instance;
                                                    fayiVar.b |= 1;
                                                    fayiVar.c = c;
                                                    eyee c2 = c(btbkVar.k());
                                                    fayhVar.copyOnWrite();
                                                    fayi fayiVar2 = (fayi) fayhVar.instance;
                                                    fayiVar2.b |= 2;
                                                    fayiVar2.d = c2;
                                                    int c3 = btbkVar.c();
                                                    fayhVar.copyOnWrite();
                                                    fayi fayiVar3 = (fayi) fayhVar.instance;
                                                    fayiVar3.b |= 4;
                                                    fayiVar3.e = c3;
                                                } else {
                                                    eyee c4 = c(btbkVar.n());
                                                    fayhVar.copyOnWrite();
                                                    fayi fayiVar4 = (fayi) fayhVar.instance;
                                                    fayiVar4.b |= 1;
                                                    fayiVar4.c = c4;
                                                    eyee c5 = c(btbkVar.m());
                                                    fayhVar.copyOnWrite();
                                                    fayi fayiVar5 = (fayi) fayhVar.instance;
                                                    fayiVar5.b |= 2;
                                                    fayiVar5.d = c5;
                                                    int e = btbkVar.e();
                                                    fayhVar.copyOnWrite();
                                                    fayi fayiVar6 = (fayi) fayhVar.instance;
                                                    fayiVar6.b |= 4;
                                                    fayiVar6.e = e;
                                                }
                                                cfmjVar = new cfmj((fayi) fayhVar.build());
                                            } else if (i == 2) {
                                                espg espgVar = g.b;
                                                if (espgVar == null) {
                                                    espgVar = espg.a;
                                                }
                                                cfmjVar = new cfmi(espgVar);
                                            } else {
                                                espg espgVar2 = g.c;
                                                if (espgVar2 == null) {
                                                    espgVar2 = espg.a;
                                                }
                                                cfmjVar = new cfmi(espgVar2);
                                            }
                                            cfml cfmlVar = (cfml) this.i.b();
                                            if (cfmjVar instanceof cfmi) {
                                                cfmhVar = cfmh.c;
                                            } else {
                                                if (!(cfmjVar instanceof cfmj)) {
                                                    throw new ffcd();
                                                }
                                                cfmhVar = cfmh.b;
                                            }
                                            cfmhVar.getClass();
                                            Object obj = cfmlVar.a.get(1L);
                                            obj.getClass();
                                            bzre bzreVar = (bzre) obj;
                                            if (!(cfmjVar instanceof cfmj)) {
                                                throw new IllegalArgumentException("Scytale decryption requested, but the metadata provided is not scytale");
                                            }
                                            fayi fayiVar7 = ((cfmj) cfmjVar).a;
                                            bzreVar.a.b();
                                            Object a3 = cafo.a(MediaEncryptor.createDecryptorInstance(new MediaDecryptionParams(fayiVar7.c.I(), fayiVar7.d.I(), fayiVar7.e)));
                                            a3.getClass();
                                            esos esosVar2 = new esos(openInputStream, (MediaEncryptor) a3, 2);
                                            btbkVar.close();
                                            esosVar = esosVar2;
                                        } else {
                                            if (i == 2) {
                                                byte[] l = btbkVar.l();
                                                l.getClass();
                                                byte[] k = btbkVar.k();
                                                k.getClass();
                                                mediaDecryptionParams = new MediaDecryptionParams(l, k, btbkVar.c());
                                            } else {
                                                byte[] n = btbkVar.n();
                                                n.getClass();
                                                byte[] m = btbkVar.m();
                                                m.getClass();
                                                mediaDecryptionParams = new MediaDecryptionParams(n, m, btbkVar.e());
                                            }
                                            MediaEncryptor mediaEncryptor = (MediaEncryptor) cafo.a(MediaEncryptor.createDecryptorInstance(mediaDecryptionParams));
                                            i2 = 4;
                                            try {
                                                esosVar = new esos(openInputStream, mediaEncryptor, 2, esos.a(), false);
                                                btbkVar.close();
                                            } catch (fedn e2) {
                                                e = e2;
                                                this.g.c(bdhgVar, 40);
                                                atomicBoolean.set(true);
                                                ((akzt) this.f.b()).e("Bugle.Etouffee.FileDecryptionFailed.Status", i2);
                                                throw e;
                                            }
                                        }
                                    } catch (fedn e3) {
                                        e = e3;
                                        i2 = 4;
                                    }
                                } finally {
                                }
                            } else {
                                esosVar = openInputStream;
                            }
                            f2.close();
                            try {
                                Uri g2 = cbgi.g(esosVar, this.c);
                                if (g2 == null) {
                                    this.g.c(bdhgVar, 38);
                                    atomicBoolean.set(true);
                                    ((akzt) this.f.b()).e("Bugle.Etouffee.FileDecryptionFailed.Status", 2);
                                    throw new IOException("Failed to store decrypted data to internal storage.");
                                }
                                final int delete = this.c.getContentResolver().delete(uri2, null, null);
                                if (this.j.a()) {
                                    ((azei) this.k.b()).d(new Consumer() { // from class: bzxo
                                        @Override // java.util.function.Consumer
                                        /* renamed from: accept */
                                        public final void o(Object obj2) {
                                            ((cpdd) obj2).a(uri2, null, null, delete);
                                        }

                                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                            return Consumer$CC.$default$andThen(this, consumer);
                                        }
                                    });
                                } else {
                                    this.e.ifPresent(new Consumer() { // from class: bzxp
                                        @Override // java.util.function.Consumer
                                        /* renamed from: accept */
                                        public final void o(Object obj2) {
                                            ((cpdd) ((ffbr) obj2).b()).a(uri2, null, null, delete);
                                        }

                                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                            return Consumer$CC.$default$andThen(this, consumer);
                                        }
                                    });
                                }
                                esosVar.close();
                                openInputStream.close();
                                uri2 = g2;
                            } finally {
                            }
                        } finally {
                        }
                    } finally {
                    }
                } catch (Throwable th) {
                    csjb e4 = a.e();
                    e4.I("Unable to decrypt stream");
                    e4.A("rcsMessageId", bdhgVar);
                    e4.s(th);
                    if (!atomicBoolean.get()) {
                        if (th instanceof FileNotFoundException) {
                            this.g.c(bdhgVar, 37);
                        } else {
                            this.g.c(bdhgVar, 41);
                        }
                    }
                    eolu eoluVar = (eolu) eolv.a.createBuilder();
                    eolt eoltVar = eolt.BUGLE_E2EE_ATTACHMENT_FAILED_TO_DECRYPT_USING_OTMK;
                    eoluVar.copyOnWrite();
                    eolv eolvVar = (eolv) eoluVar.instance;
                    eolvVar.j = eoltVar.dk;
                    eolvVar.b |= 1;
                    eozr eozrVar = (eozr) eozs.a.createBuilder();
                    String b = emxe.b(bdhgVar.b);
                    eozrVar.copyOnWrite();
                    eozs eozsVar = (eozs) eozrVar.instance;
                    eozsVar.b = 1 | eozsVar.b;
                    eozsVar.c = b;
                    eoluVar.copyOnWrite();
                    eolv eolvVar2 = (eolv) eoluVar.instance;
                    eozs eozsVar2 = (eozs) eozrVar.build();
                    eozsVar2.getClass();
                    eolvVar2.af = eozsVar2;
                    eolvVar2.c |= 536870912;
                    ((akxl) this.d.b()).j(eoluVar);
                    throw th;
                }
            }
            f.close();
            return uri2;
        } finally {
        }
    }
}
