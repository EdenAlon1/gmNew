package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import androidx.car.app.model.Alert;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Duration;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;
import java.util.function.Supplier;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avgr {
    public static final cskc a = cskc.g("Bugle", "RbmBusinessInfoDownloadHelper");
    public static final enru b = enru.c("com/google/android/apps/messaging/shared/business/RbmBusinessInfoDownloadHelper");
    public static final evkn c;
    static final cfva d;
    static final cfva e;
    public final avhf f;
    public final errl g;
    public final errl h;
    public final ffbr i;
    public final fazb j;
    public final fazb k;
    public final Context l;
    public final avff m;
    public final cqoh n;
    public final avjf o;
    public final albq p;
    public final avhl q;
    public final errm r;
    public final ffbr s;

    static {
        evko evkoVar = new evko();
        evkoVar.b();
        c = evkoVar.a();
        d = cfvl.h(cfvl.b, "rbm_domain_regex_for_default_hero_image_eligibility", "@.+[.]vodafone[.]com$");
        e = cfvl.h(cfvl.b, "rbm_default_hero_image_url", "https://storage.googleapis.com/agent-logos/default_hero_image.png");
    }

    public avgr(avhf avhfVar, errl errlVar, errl errlVar2, ffbr ffbrVar, fazb fazbVar, fazb fazbVar2, Context context, avff avffVar, cqoh cqohVar, avjf avjfVar, albq albqVar, avhl avhlVar, errm errmVar, ffbr ffbrVar2) {
        this.f = avhfVar;
        this.g = errlVar;
        this.h = errlVar2;
        this.i = ffbrVar;
        this.j = fazbVar;
        this.k = fazbVar2;
        this.l = context;
        this.m = avffVar;
        this.n = cqohVar;
        this.o = avjfVar;
        this.p = albqVar;
        this.q = avhlVar;
        new cbgp();
        this.r = errmVar;
        this.s = ffbrVar2;
    }

    public static avfh a() {
        avfg avfgVar = (avfg) avfh.a.createBuilder();
        avfgVar.copyOnWrite();
        ((avfh) avfgVar.instance).b = false;
        avfgVar.copyOnWrite();
        ((avfh) avfgVar.instance).c = false;
        return (avfh) avfgVar.build();
    }

    public static avfh b(boolean z, String str, String str2, String str3) {
        avfg avfgVar = (avfg) avfh.a.createBuilder();
        avfgVar.copyOnWrite();
        ((avfh) avfgVar.instance).b = true;
        avfgVar.copyOnWrite();
        ((avfh) avfgVar.instance).c = z;
        avfgVar.copyOnWrite();
        avfh avfhVar = (avfh) avfgVar.instance;
        str.getClass();
        avfhVar.d = str;
        avfgVar.copyOnWrite();
        avfh avfhVar2 = (avfh) avfgVar.instance;
        str2.getClass();
        avfhVar2.e = str2;
        avfgVar.copyOnWrite();
        avfh avfhVar3 = (avfh) avfgVar.instance;
        str3.getClass();
        avfhVar3.f = str3;
        return (avfh) avfgVar.build();
    }

    static ceyt c(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("botId", str);
        cetn cetnVar = new cetn(ceyt.i());
        cetnVar.c = bundle;
        return cetnVar.a();
    }

    public final elfl d(final String str) {
        return elfo.g(new Callable() { // from class: avfm
            @Override // java.util.concurrent.Callable
            public final Object call() {
                csjb a2 = avgr.a.a();
                a2.I("Checking for pre-existing business info...");
                final String str2 = str;
                a2.A("RBM bot id", str2);
                a2.r();
                return (Boolean) bwso.e(str2, new Function() { // from class: avfi
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        cskc cskcVar = avgr.a;
                        return true;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }, new Supplier() { // from class: avft
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        csjb c2 = avgr.a.c();
                        c2.I("Business info does not exist in database");
                        c2.A("RBM bot id", str2);
                        c2.r();
                        return false;
                    }
                });
            }
        }, this.h);
    }

    public final elfl e(final String str, final Optional optional) {
        ensk h = b.h();
        h.Y(ente.a, "Bugle");
        ((enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/business/RbmBusinessInfoDownloadHelper", "downloadBusinessInfoByShortCodeIfMissingOrExpired", 228, "RbmBusinessInfoDownloadHelper.java")).t("Checking missing/expired bot, short code: %s...", cskt.b(str));
        return elfo.g(new Callable() { // from class: avfy
            @Override // java.util.concurrent.Callable
            public final Object call() {
                cskc cskcVar = avgr.a;
                return avhf.c(str);
            }
        }, this.h).i(new eroh() { // from class: avgl
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                engw engwVar = (engw) obj;
                enip enipVar = (enip) Collection.EL.stream(engwVar).map(new avgq()).collect(endq.b);
                int size = engwVar.size();
                avgr avgrVar = avgr.this;
                String str2 = str;
                if (size > 1) {
                    ensk j = avgr.b.j();
                    j.Y(ente.a, "Bugle");
                    ((enrr) ((enrr) j).h("com/google/android/apps/messaging/shared/business/RbmBusinessInfoDownloadHelper", "checkIfBusinessInfoDownloadIsNeededForShortCode", 267, "RbmBusinessInfoDownloadHelper.java")).D("Many bots for short code %s: %s", cskt.b(str2), enipVar);
                } else if (engwVar.isEmpty()) {
                    ensk h2 = avgr.b.h();
                    h2.Y(ente.a, "Bugle");
                    ((enrr) ((enrr) h2).h("com/google/android/apps/messaging/shared/business/RbmBusinessInfoDownloadHelper", "checkIfBusinessInfoDownloadIsNeededForShortCode", 271, "RbmBusinessInfoDownloadHelper.java")).t("No bots for short code: %s", cskt.b(str2));
                } else {
                    bwqm bwqmVar = (bwqm) Collection.EL.stream(engwVar).findFirst().get();
                    String n = bwqmVar.n();
                    long k = bwqmVar.k();
                    if (k >= avgrVar.n.f().toEpochMilli()) {
                        ensk h3 = avgr.b.h();
                        h3.Y(ente.a, "Bugle");
                        ((enrr) ((enrr) h3).h("com/google/android/apps/messaging/shared/business/RbmBusinessInfoDownloadHelper", "checkIfBusinessInfoDownloadIsNeededForShortCode", 281, "RbmBusinessInfoDownloadHelper.java")).J("Bot %s (code: %s) is not expired: %s", n, cskt.b(str2), Long.valueOf(k));
                        return elfo.e(avgr.c(((bwqm) engwVar.get(0)).n()));
                    }
                    ensk h4 = avgr.b.h();
                    h4.Y(ente.a, "Bugle");
                    ((enrr) ((enrr) h4).h("com/google/android/apps/messaging/shared/business/RbmBusinessInfoDownloadHelper", "checkIfBusinessInfoDownloadIsNeededForShortCode", 278, "RbmBusinessInfoDownloadHelper.java")).C("Bot %s expired: %s", n, k);
                }
                Optional optional2 = optional;
                Optional findFirst = Collection.EL.stream(engwVar).findFirst();
                ensk h5 = avgr.b.h();
                h5.Y(ente.a, "Bugle");
                ((enrr) ((enrr) h5).h("com/google/android/apps/messaging/shared/business/RbmBusinessInfoDownloadHelper", "retrieveAndStoreBusinessInfoByShortCode", 290, "RbmBusinessInfoDownloadHelper.java")).t("Downloading bot by short code: %s", cskt.b(str2));
                avgs avgsVar = new avgs("", 4, null, "tel:".concat(String.valueOf(aver.a(str2))));
                avgrVar.p.b("Bugle.Rbm.ChatbotDirectory.BotInfoDownloadLatency");
                return avgrVar.h(optional2.isPresent() ? avgrVar.f.b(str2, (Duration) optional2.get()) : avgrVar.f.b(str2, Duration.ofMillis(((Integer) avhf.c.e()).intValue())), avgsVar, findFirst);
            }
        }, this.g);
    }

    public final elfl f(final avgs avgsVar) {
        final String str = avgsVar.a;
        cskc cskcVar = a;
        cskcVar.p("Request made for ".concat(str));
        csjb c2 = cskcVar.c();
        c2.I("Initiating business info retrieval handler...");
        c2.A("RBM bot id", str);
        c2.r();
        return d(str).i(new eroh() { // from class: avge
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                if (!Boolean.TRUE.equals((Boolean) obj)) {
                    avgs avgsVar2 = avgsVar;
                    avgr avgrVar = avgr.this;
                    avgrVar.p.b("Bugle.Rbm.ChatbotDirectory.BotInfoDownloadLatency");
                    return avgrVar.j(avgsVar2);
                }
                String str2 = str;
                csjb c3 = avgr.a.c();
                c3.I("Business info already exists, and operation mode downloads only if info is unavailable. Skipping download of business info.");
                c3.A("RBM bot id", str2);
                c3.r();
                return elfo.e(avgr.c(str2));
            }
        }, this.g).h(new emwl() { // from class: avgk
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                ceyt ceytVar = (ceyt) obj;
                avgr.this.p.n("Bugle.Rbm.ChatbotDirectory.BotInfoDownloadLatency");
                return ceytVar;
            }
        }, this.g);
    }

    public final elfl g(final String str, final String str2) {
        return elfo.g(new Callable() { // from class: avgn
            @Override // java.util.concurrent.Callable
            public final Object call() {
                csjb c2 = avgr.a.c();
                c2.I("Beginning download for ".concat(str2));
                c2.A("url", str);
                c2.r();
                return true;
            }
        }, this.g).i(new eroh() { // from class: avgo
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                boolean booleanValue = ((Boolean) ((cfup) avyb.a.get()).e()).booleanValue();
                avgr avgrVar = avgr.this;
                final String str3 = str2;
                final String str4 = str;
                if (booleanValue) {
                    return ((avya) avgrVar.k.b()).a(str4, Alert.DURATION_SHOW_INDEFINITELY, UUID.randomUUID().toString(), Optional.empty(), Optional.empty()).i(new eroh() { // from class: avgm
                        @Override // defpackage.eroh
                        public final ListenableFuture a(Object obj2) {
                            avxs avxsVar = (avxs) obj2;
                            cskc cskcVar = avgr.a;
                            int b2 = avxsVar.b();
                            String str5 = str3;
                            String str6 = str4;
                            if (b2 == 1) {
                                csjb c2 = avgr.a.c();
                                c2.I("Download succeeded for ".concat(str5));
                                c2.M("url", str6);
                                c2.r();
                                return elfo.e(avxsVar.c());
                            }
                            csjb e2 = avgr.a.e();
                            e2.I("File transfer download failed for ".concat(str5));
                            e2.M("url", str6);
                            e2.A("failureReason", avxsVar.a());
                            e2.r();
                            return cquo.a("File transfer download failed");
                        }
                    }, avgrVar.g);
                }
                final cqui cquiVar = (cqui) avgrVar.j.b();
                final String uuid = UUID.randomUUID().toString();
                return elfo.h(new erog() { // from class: cquh
                    @Override // defpackage.erog
                    public final ListenableFuture a() {
                        final Optional empty = Optional.empty();
                        Optional.empty().isPresent();
                        final cqui cquiVar2 = cqui.this;
                        final String str5 = uuid;
                        final Uri d2 = cbgi.d("file_".concat(String.valueOf(str5)), cquiVar2.d);
                        File i = cbgi.i(d2, cquiVar2.d);
                        empty.isPresent();
                        final AtomicReference atomicReference = new AtomicReference();
                        try {
                            final FileOutputStream fileOutputStream = new FileOutputStream(i, false);
                            String str6 = str4;
                            elfl g = elfl.g(kfg.a(new kfd() { // from class: cque
                                @Override // defpackage.kfd
                                public final Object a(kfb kfbVar) {
                                    entd entdVar = cqui.a;
                                    cquk cqukVar = new cquk(str5, fileOutputStream, cqqm.a(), kfbVar, empty);
                                    AtomicReference atomicReference2 = atomicReference;
                                    atomicReference2.set(cqukVar);
                                    return atomicReference2;
                                }
                            }));
                            avvz a2 = ((avwb) cquiVar2.b.b()).a(str6, (UrlRequest.Callback) atomicReference.get()).a();
                            a2.b();
                            ensz enszVar = (ensz) cqui.a.h();
                            enszVar.Y(cqpo.a, str5);
                            ((ensz) enszVar.h("com/google/android/apps/messaging/shared/transfer/downloads/CronetFileDownloader", "downloadInternal", 191, "CronetFileDownloader.java")).q("File download request is started.");
                            cquiVar2.e.put(str5, a2);
                            if (!empty.isEmpty()) {
                                ekzz f = eleg.f("CronetFileDownloader-TG::download");
                                try {
                                    f.b(g);
                                    f.close();
                                } catch (Throwable th) {
                                    try {
                                        f.close();
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                    throw th;
                                }
                            }
                            return g.i(new eroh() { // from class: cquf
                                @Override // defpackage.eroh
                                public final ListenableFuture a(Object obj2) {
                                    UrlResponseInfo urlResponseInfo = (UrlResponseInfo) obj2;
                                    if (urlResponseInfo == null) {
                                        return elfo.d(new cquo(true, cqpn.FILE_TRANSFER_FAILURE_REASON_EMPTY_HTTP_RESPONSE_BODY, "Download failed with empty server response."));
                                    }
                                    if (urlResponseInfo.getHttpStatusCode() != 200 && urlResponseInfo.getHttpStatusCode() != 206) {
                                        boolean contains = true ^ cquk.a.contains(Integer.valueOf(urlResponseInfo.getHttpStatusCode()));
                                        urlResponseInfo.getHttpStatusCode();
                                        return elfo.d(new cquo(contains, "Download failed with invalid server response.", (byte[]) null));
                                    }
                                    Uri uri = d2;
                                    FileOutputStream fileOutputStream2 = fileOutputStream;
                                    cqui.this.a(str5, fileOutputStream2);
                                    return elfo.e(uri);
                                }
                            }, cquiVar2.c).f(Throwable.class, new eroh() { // from class: cqug
                                @Override // defpackage.eroh
                                public final ListenableFuture a(Object obj2) {
                                    Throwable th3 = (Throwable) obj2;
                                    try {
                                        cqui.this.a(str5, fileOutputStream);
                                    } catch (IOException e2) {
                                        th3.addSuppressed(e2);
                                    }
                                    return elfo.d(th3);
                                }
                            }, cquiVar2.c);
                        } catch (FileNotFoundException e2) {
                            throw new cquo(false, "Failed to open a new output stream.", cqpn.FILE_TRANSFER_FAILURE_REASON_WRITING_TO_FILE_FAILED, (Throwable) e2);
                        }
                    }
                }, cquiVar.c).h(new emwl() { // from class: avgj
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        Uri uri = (Uri) obj2;
                        csjb c2 = avgr.a.c();
                        c2.I("Download finished for ".concat(str3));
                        c2.A("url", str4);
                        c2.r();
                        return uri;
                    }
                }, avgrVar.g);
            }
        }, this.h).f(Throwable.class, new eroh() { // from class: avgp
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                csjb e2 = avgr.a.e();
                e2.I("Download failed for ".concat(str2));
                e2.A("url", str);
                e2.r();
                return elfo.d((Throwable) obj);
            }
        }, this.g);
    }

    public final elfl h(elfl elflVar, final avgs avgsVar, Optional optional) {
        final String str = (String) optional.map(new avgq()).orElseGet(new Supplier() { // from class: avfu
            @Override // java.util.function.Supplier
            public final Object get() {
                return avgs.this.a;
            }
        });
        return elflVar.i(new eroh() { // from class: avfv
            /* JADX WARN: Removed duplicated region for block: B:41:0x01e4  */
            /* JADX WARN: Removed duplicated region for block: B:43:0x01f2  */
            @Override // defpackage.eroh
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final com.google.common.util.concurrent.ListenableFuture a(java.lang.Object r12) {
                /*
                    Method dump skipped, instructions count: 738
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.avfv.a(java.lang.Object):com.google.common.util.concurrent.ListenableFuture");
            }
        }, this.g).f(Throwable.class, new eroh() { // from class: avfw
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                Throwable th = (Throwable) obj;
                boolean z = th instanceof avhg;
                avgr avgrVar = avgr.this;
                avgs avgsVar2 = avgsVar;
                if (z) {
                    return avgrVar.i((avhg) th, avgsVar2);
                }
                avgr.a.s("Business Info retrieval error with unknown reason", th);
                return avgrVar.i(new avhg("Error reason unknown", 1), avgsVar2);
            }
        }, this.g).h(new emwl() { // from class: avfx
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                ceyt ceytVar = (ceyt) obj;
                if (ceytVar != null && ceytVar.e()) {
                    avgs avgsVar2 = avgsVar;
                    akxl akxlVar = (akxl) avgr.this.o.b.b();
                    eolu eoluVar = (eolu) eolv.a.createBuilder();
                    eolt eoltVar = eolt.RBM_EVENT;
                    eoluVar.copyOnWrite();
                    eolv eolvVar = (eolv) eoluVar.instance;
                    eolvVar.j = eoltVar.dk;
                    eolvVar.b |= 1;
                    eqeb eqebVar = (eqeb) eqec.a.createBuilder();
                    eqda eqdaVar = (eqda) eqdb.a.createBuilder();
                    eqdaVar.copyOnWrite();
                    eqdb eqdbVar = (eqdb) eqdaVar.instance;
                    eqdbVar.c = avgsVar2.c - 1;
                    eqdbVar.b |= 1;
                    eqebVar.copyOnWrite();
                    eqec eqecVar = (eqec) eqebVar.instance;
                    eqdb eqdbVar2 = (eqdb) eqdaVar.build();
                    eqdbVar2.getClass();
                    eqecVar.d = eqdbVar2;
                    eqecVar.c = 5;
                    String a2 = avjf.a(avgsVar2.a);
                    eqebVar.copyOnWrite();
                    eqec eqecVar2 = (eqec) eqebVar.instance;
                    a2.getClass();
                    eqecVar2.b |= 1;
                    eqecVar2.e = a2;
                    eoluVar.copyOnWrite();
                    eolv eolvVar2 = (eolv) eoluVar.instance;
                    eqec eqecVar3 = (eqec) eqebVar.build();
                    eqecVar3.getClass();
                    eolvVar2.aO = eqecVar3;
                    eolvVar2.e |= 2048;
                    akxlVar.j(eoluVar);
                }
                return ceytVar;
            }
        }, this.h);
    }

    public final elfl i(final avhg avhgVar, final avgs avgsVar) {
        return elfo.g(new Callable() { // from class: avgc
            /* JADX WARN: Code restructure failed: missing block: B:20:0x0145, code lost:
            
                if (((java.lang.Boolean) ((defpackage.cfup) defpackage.avic.a.get()).e()).booleanValue() != false) goto L41;
             */
            @Override // java.util.concurrent.Callable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object call() {
                /*
                    Method dump skipped, instructions count: 424
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.avgc.call():java.lang.Object");
            }
        }, this.g);
    }

    public final elfl j(avgs avgsVar) {
        this.p.b("Bugle.Rbm.BusinessInfo.BotMetadataDownloadLatency");
        return h(this.f.a(avgsVar.a, true), avgsVar, Optional.empty());
    }
}
