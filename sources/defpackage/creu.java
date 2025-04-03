package defpackage;

import android.text.TextUtils;
import com.google.android.rcs.client.messaging.data.ContentType;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class creu implements crcc {
    public final entd a = entd.c("BugleFileTransfer");
    public final errl b;
    public final ffbr c;
    private final errl d;
    private final ffbr e;
    private final ffbr f;
    private final asmn g;
    private final crdn h;

    public creu(errl errlVar, errl errlVar2, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, crdn crdnVar, asmn asmnVar) {
        this.d = errlVar;
        this.b = errlVar2;
        this.e = ffbrVar;
        this.f = ffbrVar2;
        this.c = ffbrVar3;
        this.h = crdnVar;
        this.g = asmnVar;
    }

    @Override // defpackage.crcc
    public final elfl a(final awbs awbsVar) {
        final crdz crdzVar = (crdz) this.f.b();
        return elfo.f(new Runnable() { // from class: crdp
            @Override // java.lang.Runnable
            public final void run() {
                awbs awbsVar2 = awbsVar;
                crdz crdzVar2 = crdz.this;
                synchronized (crdzVar2.g) {
                    fawj fawjVar = (fawj) crdzVar2.h.get(awbsVar2);
                    if (fawjVar != null) {
                        fawjVar.f();
                        ensz enszVar = (ensz) crdz.a.h();
                        enszVar.Y(cqpo.a, awbsVar2.a);
                        enszVar.Y(cqpo.j, awbsVar2.b);
                        ((ensz) enszVar.h("com/google/android/apps/messaging/shared/transfer/uploads/ScottyFileUploader", "pause", 159, "ScottyFileUploader.java")).q("Paused ongoing file upload.");
                        crdzVar2.h.remove(awbsVar2);
                    } else {
                        ensz enszVar2 = (ensz) crdz.a.h();
                        enszVar2.Y(cqpo.a, awbsVar2.a);
                        enszVar2.Y(cqpo.j, awbsVar2.b);
                        ((ensz) enszVar2.h("com/google/android/apps/messaging/shared/transfer/uploads/ScottyFileUploader", "pause", 166, "ScottyFileUploader.java")).q("Could not find ongoing file upload to pause.");
                    }
                }
            }
        }, crdzVar.b);
    }

    @Override // defpackage.crcc
    public final elfl b(final crbv crbvVar, final awbs awbsVar, final cqqb cqqbVar, final eyee eyeeVar, final awui awuiVar, boolean z) {
        final awbs awbsVar2;
        final elfl e;
        ekzz f;
        String a;
        if (((crbg) crbvVar).g.isPresent()) {
            f = eleg.f("TachygramFileUploadProvider#uploadThumbnail");
            try {
                if (z) {
                    e = d(crbvVar, awbsVar, eyeeVar, awuiVar);
                    awbsVar2 = awbsVar;
                } else {
                    awbsVar2 = awbsVar;
                    e = elfo.g(new Callable() { // from class: crel
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            awcx a2 = ((awcz) creu.this.c.b()).a(awbsVar);
                            if (a2.b() != 1) {
                                return new crfk(a2.c());
                            }
                            awvc awvcVar = (awvc) awvd.a.createBuilder();
                            awvb a3 = a2.a();
                            awvcVar.copyOnWrite();
                            awvd awvdVar = (awvd) awvcVar.instance;
                            awvdVar.d = a3;
                            awvdVar.b |= 2;
                            return new crfj(new crce((awvd) awvcVar.build()));
                        }
                    }, this.b).i(new eroh() { // from class: crem
                        @Override // defpackage.eroh
                        public final ListenableFuture a(Object obj) {
                            crfl crflVar = (crfl) obj;
                            boolean z2 = crflVar instanceof crfj;
                            awbs awbsVar3 = awbsVar2;
                            creu creuVar = creu.this;
                            if (!z2) {
                                if (((avuq) ((crfk) crflVar).a).a == cqpn.FILE_TRANSFER_FAILURE_REASON_FAILED_TO_READ_THUMBNAIL_INFO_IN_DB) {
                                    ((ensz) ((ensz) creuVar.a.j()).h("com/google/android/apps/messaging/shared/transfer/uploads/TachygramFileUploadProvider", "uploadThumbnail", 235, "TachygramFileUploadProvider.java")).q("Could not retrieve FileTransferEntry for reading thumbnail information.");
                                    return elfo.e(crflVar);
                                }
                                awui awuiVar2 = awuiVar;
                                return creuVar.d(crbvVar, awbsVar3, eyeeVar, awuiVar2);
                            }
                            ensz enszVar = (ensz) creuVar.a.h();
                            enszVar.Y(cqpo.a, awbsVar3.a);
                            enszVar.Y(cqpo.j, awbsVar3.b);
                            ((ensz) enszVar.h("com/google/android/apps/messaging/shared/transfer/uploads/TachygramFileUploadProvider", "uploadThumbnail", 230, "TachygramFileUploadProvider.java")).q("Thumbnail already uploaded, reusing persisted information.");
                            return elfo.e(crflVar);
                        }
                    }, this.d);
                }
                f.b(e);
                f.close();
            } finally {
            }
        } else {
            awbsVar2 = awbsVar;
            e = elfo.e(new crfj(new crce(awvd.a)));
        }
        f = eleg.f("TachygramFileUploadProvider#uploadFile");
        try {
            final crdz crdzVar = (crdz) this.f.b();
            final long a2 = ((ersq) ((arqj) this.g).a.b()).a("bugle.enable_non_resumable_uploads_for_retries") ? this.h.a() : z ? this.h.a() : 0L;
            if (crdzVar.f.a()) {
                a = awbsVar2.c;
            } else {
                crcd crcdVar = crdzVar.i;
                a = crcd.a();
            }
            fcjz fcjzVar = (fcjz) fcka.a.createBuilder();
            fcjzVar.copyOnWrite();
            ((fcka) fcjzVar.instance).b = fgtq.a(4);
            fcjzVar.copyOnWrite();
            fcka fckaVar = (fcka) fcjzVar.instance;
            a.getClass();
            fckaVar.c = a;
            fcjzVar.copyOnWrite();
            ((fcka) fcjzVar.instance).d = 1;
            final fcka fckaVar2 = (fcka) fcjzVar.build();
            Optional map = ((crfh) crdzVar.e.b()).a(Optional.of(awuiVar)).map(new Function() { // from class: crdr
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    final String str = (String) obj;
                    final crdz crdzVar2 = crdz.this;
                    final fcka fckaVar3 = fckaVar2;
                    final awbs awbsVar3 = awbsVar2;
                    final crbv crbvVar2 = crbvVar;
                    final cqqb cqqbVar2 = cqqbVar;
                    final eyee eyeeVar2 = eyeeVar;
                    final long j = a2;
                    return crdzVar2.a(awbsVar3, new emwl() { // from class: crdo
                        @Override // defpackage.emwl
                        public final Object apply(Object obj2) {
                            crbg crbgVar = (crbg) crbvVar2;
                            Optional optional = crbgVar.d;
                            Optional optional2 = crbgVar.b;
                            fcka fckaVar4 = fckaVar3;
                            final favp favpVar = (favp) obj2;
                            final crft crftVar = crdz.this.c;
                            elfl b = crftVar.b(fckaVar4, favpVar, optional2, optional, eyeeVar2, str, j);
                            final cqqb cqqbVar3 = cqqbVar2;
                            final awbs awbsVar4 = awbsVar3;
                            return b.h(new emwl() { // from class: crfo
                                @Override // defpackage.emwl
                                public final Object apply(Object obj3) {
                                    fawj fawjVar = (fawj) obj3;
                                    fawjVar.getClass();
                                    crft.this.e(awbsVar4, fawjVar, favpVar, cqqbVar3);
                                    return fawjVar;
                                }
                            }, crftVar.a);
                        }
                    }, crbvVar2, fckaVar3.c);
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            avvc g = avvd.g();
            g.f(cqpn.FILE_TRANSFER_FAILURE_REASON_INVALID_RCS_CONFIGURATION);
            g.g(fckaVar2.c);
            final elfl e2 = ((elfl) map.orElse(elfo.e(new crfk(g.a())))).e(CancellationException.class, new emwl() { // from class: creo
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    return crfi.a;
                }
            }, this.d);
            f.b(e2);
            f.close();
            return elfo.k(e, e2).a(new Callable() { // from class: crep
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    crfl crflVar = (crfl) erqt.q(e);
                    crfl crflVar2 = (crfl) erqt.q(e2);
                    boolean z2 = crflVar2 instanceof crfj;
                    creu creuVar = creu.this;
                    if (!z2) {
                        if (crflVar instanceof crfj) {
                            return crflVar2;
                        }
                        ((ensz) ((ensz) creuVar.a.h()).h("com/google/android/apps/messaging/shared/transfer/uploads/TachygramFileUploadProvider", "handleFileAndThumbnailUploads", 179, "TachygramFileUploadProvider.java")).q("File & thumbnail upload both failed. Using file upload failure.");
                        return crflVar2;
                    }
                    awvd awvdVar = ((crfj) crflVar2).a.a;
                    if (!(crflVar instanceof crfj)) {
                        if (crflVar instanceof crfk) {
                            ((ensz) ((ensz) creuVar.a.j()).h("com/google/android/apps/messaging/shared/transfer/uploads/TachygramFileUploadProvider", "handleFileAndThumbnailUploads", 198, "TachygramFileUploadProvider.java")).q("File upload succeeded, but thumbnail failed. Dropping thumbnail.");
                            return new crfj(new crce(awvdVar, Optional.of(((crfk) crflVar).a)));
                        }
                        if (!(crflVar instanceof crfi)) {
                            throw new IllegalStateException("Unreachable code.");
                        }
                        ((ensz) ((ensz) creuVar.a.j()).h("com/google/android/apps/messaging/shared/transfer/uploads/TachygramFileUploadProvider", "handleFileAndThumbnailUploads", 205, "TachygramFileUploadProvider.java")).q("Unexpected state. Thumbnail should never be cancelled (paused).");
                        return crflVar2;
                    }
                    awvd awvdVar2 = ((crfj) crflVar).a.a;
                    if ((awvdVar2.b & 2) == 0) {
                        return new crfj(new crce(awvdVar));
                    }
                    awvc awvcVar = (awvc) awvdVar.toBuilder();
                    awvb awvbVar = awvdVar2.d;
                    if (awvbVar == null) {
                        awvbVar = awvb.a;
                    }
                    awvcVar.copyOnWrite();
                    awvd awvdVar3 = (awvd) awvcVar.instance;
                    awvbVar.getClass();
                    awvdVar3.d = awvbVar;
                    awvdVar3.b |= 2;
                    return new crfj(new crce((awvd) awvcVar.build()));
                }
            }, this.d);
        } finally {
        }
    }

    @Override // defpackage.crcc
    public final elfl c(final crbv crbvVar, final awbs awbsVar, final cqqb cqqbVar, final String str) {
        if (TextUtils.isEmpty(str)) {
            avvc g = avvd.g();
            g.f(cqpn.FILE_TRANSFER_FAILURE_REASON_UNKNOWN);
            return elfo.e(new crfk(g.a()));
        }
        ekzz f = eleg.f("TachygramFileUploadProvider#resume");
        try {
            final crdz crdzVar = (crdz) this.f.b();
            final long a = this.h.a();
            elfl h = crdzVar.a(awbsVar, new emwl() { // from class: crdy
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    final favp favpVar = (favp) obj;
                    final long j = a;
                    final String str2 = str;
                    final crft crftVar = crdz.this.c;
                    elfl g2 = elfo.g(new Callable() { // from class: crfr
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            fawo fawoVar = new fawo();
                            fawoVar.a = cqqm.c().b;
                            fawp fawpVar = new fawp(fawoVar);
                            crft crftVar2 = crft.this;
                            boolean a2 = ((atxg) crftVar2.f.b()).a();
                            String str3 = str2;
                            favp favpVar2 = favpVar;
                            if (!a2) {
                                if (crft.f(favpVar2) > j) {
                                    return crftVar2.d.a(str3, favpVar2, fawpVar);
                                }
                            }
                            return crftVar2.e.a(str3, favpVar2, fawpVar);
                        }
                    }, crftVar.b);
                    final awbs awbsVar2 = awbsVar;
                    final cqqb cqqbVar2 = cqqbVar;
                    return g2.h(new emwl() { // from class: crfq
                        @Override // defpackage.emwl
                        public final Object apply(Object obj2) {
                            fawj fawjVar = (fawj) obj2;
                            fawjVar.getClass();
                            crft.this.e(awbsVar2, fawjVar, favpVar, cqqbVar2);
                            return fawjVar;
                        }
                    }, crftVar.a);
                }
            }, crbvVar, "").h(new emwl() { // from class: crer
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    crfl crflVar = (crfl) obj;
                    if (!(crflVar instanceof crfj)) {
                        return crflVar;
                    }
                    awbs awbsVar2 = awbsVar;
                    creu creuVar = creu.this;
                    crce crceVar = ((crfj) crflVar).a;
                    awcx a2 = ((awcz) creuVar.c.b()).a(awbsVar2);
                    if (a2.b() != 1) {
                        avvd c = a2.c();
                        if (((avuq) c).a == cqpn.FILE_TRANSFER_FAILURE_REASON_FAILED_TO_READ_THUMBNAIL_INFO_IN_DB) {
                            return new crfk(c);
                        }
                        String str2 = (String) ((crbg) crbvVar).b.map(new Function() { // from class: creq
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj2) {
                                return ((ContentType) obj2).toString();
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        }).orElse("");
                        return ((le.A(str2) || le.n(str2)) && !le.j(str2)) ? new crfj(new crce(crceVar.a, Optional.of(c))) : new crfj(crceVar);
                    }
                    awvc awvcVar = (awvc) crceVar.a.toBuilder();
                    awvb a3 = a2.a();
                    awvcVar.copyOnWrite();
                    awvd awvdVar = (awvd) awvcVar.instance;
                    awvdVar.d = a3;
                    awvdVar.b |= 2;
                    return new crfj(new crce((awvd) awvcVar.build()));
                }
            }, this.b);
            f.b(h);
            elfl e = h.e(CancellationException.class, new emwl() { // from class: cret
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    return crfi.a;
                }
            }, this.d);
            f.close();
            return e;
        } finally {
        }
    }

    public final elfl d(final crbv crbvVar, final awbs awbsVar, final eyee eyeeVar, awui awuiVar) {
        String a;
        final creh crehVar = (creh) this.e.b();
        if (crehVar.d.a()) {
            a = awbsVar.c;
        } else {
            crcd crcdVar = crehVar.e;
            a = crcd.a();
        }
        fcjz fcjzVar = (fcjz) fcka.a.createBuilder();
        fcjzVar.copyOnWrite();
        ((fcka) fcjzVar.instance).b = fgtq.a(3);
        fcjzVar.copyOnWrite();
        fcka fckaVar = (fcka) fcjzVar.instance;
        a.getClass();
        fckaVar.c = a;
        fcjzVar.copyOnWrite();
        ((fcka) fcjzVar.instance).d = 1;
        final fcka fckaVar2 = (fcka) fcjzVar.build();
        Optional map = ((crfh) crehVar.c.b()).a(Optional.of(awuiVar)).map(new Function() { // from class: crea
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                final String str = (String) obj;
                crfs crfsVar = new crfs() { // from class: crec
                    @Override // defpackage.crfs
                    public final favp a(crbk crbkVar, crbv crbvVar2) {
                        return new favz(((eyee) ((crbg) crbvVar2).g.get()).m(), r4.d(), ((Integer) crff.a.e()).intValue());
                    }
                };
                final creh crehVar2 = creh.this;
                crft crftVar = crehVar2.b;
                final crbv crbvVar2 = crbvVar;
                elfj a2 = crftVar.a(crbvVar2, crfsVar);
                final fcka fckaVar3 = fckaVar2;
                final eyee eyeeVar2 = eyeeVar;
                return a2.g(new erot() { // from class: cred
                    @Override // defpackage.erot
                    public final erph a(erpc erpcVar, Object obj2) {
                        favp favpVar = (favp) obj2;
                        favpVar.getClass();
                        emxf.b(favpVar.e() != -1, "Data stream size is unknown.");
                        creh crehVar3 = creh.this;
                        Object b = crehVar3.f.a.b();
                        b.getClass();
                        long longValue = ((Number) b).longValue();
                        fcka fckaVar4 = fckaVar3;
                        eyee eyeeVar3 = eyeeVar2;
                        String str2 = str;
                        crbg crbgVar = (crbg) crbvVar2;
                        return new erph(crehVar3.b.b(fckaVar4, favpVar, crbgVar.f, crbgVar.d, eyeeVar3, str2, longValue));
                    }
                }, crehVar2.a).g(new erot() { // from class: cree
                    @Override // defpackage.erot
                    public final erph a(erpc erpcVar, Object obj2) {
                        fawj fawjVar = (fawj) obj2;
                        fawjVar.getClass();
                        return new erph(fawjVar.b());
                    }
                }, crehVar2.a).h().h(new emwl() { // from class: cref
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        final creh crehVar3 = creh.this;
                        final crbv crbvVar3 = crbvVar2;
                        return crbs.a((fawm) obj2, new crbr() { // from class: creb
                            @Override // defpackage.crbr
                            public final crfj a(fcki fckiVar) {
                                awvc awvcVar = (awvc) awvd.a.createBuilder();
                                awvb h = crft.h(fckiVar, Optional.empty(), ((crbg) crbvVar3).f);
                                awvcVar.copyOnWrite();
                                awvd awvdVar = (awvd) awvcVar.instance;
                                h.getClass();
                                awvdVar.d = h;
                                awvdVar.b |= 2;
                                return new crfj(new crce((awvd) awvcVar.build()));
                            }
                        }, fckaVar3.c);
                    }
                }, crehVar2.a).e(IllegalArgumentException.class, new emwl() { // from class: creg
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        avvc g = avvd.g();
                        g.f(cqpn.FILE_TRANSFER_FAILURE_REASON_FAILED_TO_GET_FILE_SIZE);
                        g.g(fcka.this.c);
                        return new crfk(g.a());
                    }
                }, crehVar2.a);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        avvc g = avvd.g();
        g.f(cqpn.FILE_TRANSFER_FAILURE_REASON_INVALID_RCS_CONFIGURATION);
        g.g(fckaVar2.c);
        return ((elfl) map.orElse(elfo.e(new crfk(g.a())))).h(new emwl() { // from class: cren
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                crfl crflVar = (crfl) obj;
                if (crflVar instanceof crfj) {
                    final awbs awbsVar2 = awbsVar;
                    final creu creuVar = creu.this;
                    final awvd awvdVar = ((crfj) crflVar).a.a;
                    axnw.h(elfo.g(new Callable() { // from class: cres
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            creu creuVar2 = creu.this;
                            awcz awczVar = (awcz) creuVar2.c.b();
                            awvb awvbVar = awvdVar.d;
                            if (awvbVar == null) {
                                awvbVar = awvb.a;
                            }
                            awbs awbsVar3 = awbsVar2;
                            if (awczVar.o(awbsVar3, awvbVar)) {
                                return null;
                            }
                            ensz enszVar = (ensz) creuVar2.a.j();
                            enszVar.Y(cqpo.a, awbsVar3.a);
                            enszVar.Y(cqpo.j, awbsVar3.b);
                            ((ensz) enszVar.h("com/google/android/apps/messaging/shared/transfer/uploads/TachygramFileUploadProvider", "updateDatabaseWithThumbnailAsync", 282, "TachygramFileUploadProvider.java")).q("Failed to update FileTransferTable with thumbnail information.");
                            return null;
                        }
                    }, creuVar.b));
                }
                return crflVar;
            }
        }, this.d);
    }
}
