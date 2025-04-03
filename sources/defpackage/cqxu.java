package defpackage;

import androidx.car.app.hardware.info.EnergyProfile;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Duration;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.concurrent.Callable;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cqxu extends ceut {
    public static final entd a = entd.c("BugleFileTransfer");
    public static final cfup b = cfvl.e(cfvl.b, "file_download_failed_handler_max_retry", 3);
    public static final cfup c = cfvl.e(cfvl.b, "file_download_failed_handler_retry_delay", 2000);
    public final errl d;
    public final errl e;
    public final ffbr f;
    public final Optional g;
    public final awgl h;
    public final ffbr i;
    private final crab j;
    private final ffbr k;

    public cqxu(errl errlVar, errl errlVar2, ffbr ffbrVar, crab crabVar, Optional optional, ffbr ffbrVar2, awgl awglVar, ffbr ffbrVar3) {
        this.d = errlVar;
        this.e = errlVar2;
        this.f = ffbrVar;
        this.j = crabVar;
        this.g = optional;
        this.k = ffbrVar2;
        this.h = awglVar;
        this.i = ffbrVar3;
    }

    @Override // defpackage.ceut, defpackage.ceve
    public final cety a() {
        if (((Boolean) ((cfup) avyb.a.get()).e()).booleanValue()) {
            return cety.l().h();
        }
        cetx l = cety.l();
        l.c(((Integer) b.e()).intValue());
        l.g(((Integer) c.e()).intValue());
        return l.h();
    }

    @Override // defpackage.ceve
    public final ekzz b() {
        return eleg.f("FileDownloadFailedHandler");
    }

    @Override // defpackage.ceve
    public final eyhz d() {
        return cqxw.a.getParserForType();
    }

    @Override // defpackage.ceut
    protected final /* bridge */ /* synthetic */ elfl j(ceuw ceuwVar, eyhs eyhsVar) {
        final cqxw cqxwVar = (cqxw) eyhsVar;
        final bdhg a2 = bdhg.a(cqxwVar.c);
        elfl i = this.j.a(a2).i(new eroh() { // from class: cqxr
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                Optional optional = (Optional) obj;
                if (optional.isEmpty()) {
                    return elfo.e(ceyt.k());
                }
                final MessageCoreData messageCoreData = (MessageCoreData) optional.get();
                if (messageCoreData.cy()) {
                    ensz enszVar = (ensz) cqxu.a.h();
                    enszVar.Y(csux.p, messageCoreData.z());
                    enszVar.Y(csux.b, messageCoreData.B());
                    enszVar.Y(csux.f, messageCoreData.E());
                    ((ensz) enszVar.h("com/google/android/apps/messaging/shared/transfer/incoming/FileDownloadFailedHandler", "processPendingWorkItemAsync", 132, "FileDownloadFailedHandler.java")).q("Message has already finished downloading. Skipping failure handler.");
                    return elfo.e(ceyt.i());
                }
                cqxw cqxwVar2 = cqxwVar;
                final cqxu cqxuVar = cqxu.this;
                if (!((Boolean) ((cfup) avyb.a.get()).e()).booleanValue()) {
                    final eopq eopqVar = cqxwVar2.e;
                    if (eopqVar == null) {
                        eopqVar = eopq.a;
                    }
                    final String str = cqxwVar2.f;
                    if (messageCoreData.k() == 105) {
                        ensz enszVar2 = (ensz) cqxu.a.h();
                        enszVar2.Y(csux.p, messageCoreData.z());
                        enszVar2.Y(csux.b, messageCoreData.B());
                        enszVar2.Y(csux.f, messageCoreData.E());
                        ((ensz) enszVar2.h("com/google/android/apps/messaging/shared/transfer/incoming/FileDownloadFailedHandler", "updateMessageFailedInDb", 209, "FileDownloadFailedHandler.java")).q("Message failed in auto download state. Updating message to manual download state.");
                        messageCoreData.bV(EnergyProfile.EVCONNECTOR_TYPE_OTHER);
                    } else {
                        ensz enszVar3 = (ensz) cqxu.a.h();
                        enszVar3.Y(csux.p, messageCoreData.z());
                        enszVar3.Y(csux.b, messageCoreData.B());
                        enszVar3.Y(csux.f, messageCoreData.E());
                        ((ensz) enszVar3.h("com/google/android/apps/messaging/shared/transfer/incoming/FileDownloadFailedHandler", "updateMessageFailedInDb", 217, "FileDownloadFailedHandler.java")).q("Message failed in manual download state. Updating message to download failed state.");
                        messageCoreData.bV(106);
                    }
                    cqxuVar.g.ifPresent(new Consumer() { // from class: cqxo
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void o(Object obj2) {
                            entd entdVar = cqxu.a;
                            MessageCoreData messageCoreData2 = MessageCoreData.this;
                            ((akni) obj2).a(messageCoreData2.u(), messageCoreData2.k());
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                    return elfo.g(new Callable() { // from class: cqxp
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return Boolean.valueOf(((bdmq) cqxu.this.f.b()).T(messageCoreData));
                        }
                    }, cqxuVar.e).h(new emwl() { // from class: cqxq
                        @Override // defpackage.emwl
                        public final Object apply(Object obj2) {
                            eopq eopqVar2 = eopqVar;
                            ceyr c2 = cisl.c();
                            epyb epybVar = eopqVar2.an;
                            if (epybVar == null) {
                                epybVar = epyb.a;
                            }
                            String str2 = str;
                            cqxu.this.k(messageCoreData, epybVar, str2);
                            return ceyt.j(engw.r(c2));
                        }
                    }, cqxuVar.e);
                }
                eopq eopqVar2 = cqxwVar2.e;
                if (eopqVar2 == null) {
                    eopqVar2 = eopq.a;
                }
                epyb epybVar = eopqVar2.an;
                if (epybVar == null) {
                    epybVar = epyb.a;
                }
                String str2 = cqxwVar2.f;
                long a3 = messageCoreData.a();
                long longValue = ((Long) cqxuVar.i.b()).longValue();
                int a4 = messageCoreData.a() + 1;
                epxw epxwVar = (epxw) epybVar.toBuilder();
                epxwVar.copyOnWrite();
                epyb epybVar2 = (epyb) epxwVar.instance;
                epybVar2.b |= 16;
                epybVar2.i = a4;
                if (a3 >= longValue) {
                    epye epyeVar = (epye) epyh.a.createBuilder();
                    epyeVar.copyOnWrite();
                    epyh epyhVar = (epyh) epyeVar.instance;
                    epyhVar.c = 1;
                    epyhVar.b |= 1;
                    epyh epyhVar2 = (epyh) epyeVar.build();
                    epxwVar.copyOnWrite();
                    epyb epybVar3 = (epyb) epxwVar.instance;
                    epyhVar2.getClass();
                    epybVar3.h = epyhVar2;
                    epybVar3.b |= 8;
                }
                cqxuVar.k(messageCoreData, (epyb) epxwVar.build(), str2);
                epyh epyhVar3 = ((epyb) epxwVar.instance).h;
                if (epyhVar3 == null) {
                    epyhVar3 = epyh.a;
                }
                ensz enszVar4 = (ensz) cqxu.a.h();
                enszVar4.Y(csux.f, messageCoreData.E());
                ensz enszVar5 = (ensz) enszVar4.h("com/google/android/apps/messaging/shared/transfer/incoming/FileDownloadFailedHandler", "executeRetryStrategy", 187, "FileDownloadFailedHandler.java");
                int a5 = epyg.a(epyhVar3.c);
                enszVar5.J("Executing retry strategy [%s] for failed file download after a delay %d seconds. Attempt count: %d", (a5 == 0 || a5 == 1) ? "UNKNOWN_RETRY_TYPE" : a5 != 2 ? a5 != 3 ? a5 != 4 ? "RETRY_AFTER_REGISTRATION_REFRESH" : "RETRY_AFTER_REPROVISIONING" : "RETRY_AFTER_DELAY" : "NO_RETRY", Long.valueOf(epyhVar3.d), Integer.valueOf(a4));
                awgl awglVar = cqxuVar.h;
                int a6 = epyg.a(epyhVar3.c);
                if (a6 == 0) {
                    a6 = 1;
                }
                int i2 = a6 - 1;
                return (i2 != 1 ? i2 != 2 ? i2 != 3 ? awglVar.c.a(Duration.ZERO, cqxuVar) : awglVar.b : awglVar.c.a(Duration.ofSeconds(epyhVar3.d), cqxuVar) : awglVar.a).a(messageCoreData).h(new emwl() { // from class: cqxt
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        entd entdVar = cqxu.a;
                        return ceyt.i();
                    }
                }, cqxuVar.d);
            }
        }, this.e);
        return ((Boolean) ((cfup) avyb.a.get()).e()).booleanValue() ? i : i.f(cquo.class, new eroh() { // from class: cqxs
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                cquo cquoVar = (cquo) obj;
                ensz enszVar = (ensz) ((ensz) cqxu.a.j()).g(cquoVar);
                enszVar.Y(csux.f, bdhg.this);
                ((ensz) enszVar.h("com/google/android/apps/messaging/shared/transfer/incoming/FileDownloadFailedHandler", "processPendingWorkItemAsync", 158, "FileDownloadFailedHandler.java")).q("Failed to complete file transfer failed processing.");
                return cquoVar.d().booleanValue() ? elfo.e(ceyt.m()) : elfo.e(ceyt.k());
            }
        }, this.d);
    }

    public final void k(MessageCoreData messageCoreData, final epyb epybVar, final String str) {
        final cqvy cqvyVar = (cqvy) this.k.b();
        cqvyVar.b(messageCoreData, "Bugle.Download.Failure.Attachment.Size.Bucket.Rcs");
        cqvyVar.e(messageCoreData, 7, new Consumer() { // from class: cqvv
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                eoop eoopVar = (eoop) obj;
                eoopVar.copyOnWrite();
                eopq eopqVar = (eopq) eoopVar.instance;
                eopq eopqVar2 = eopq.a;
                epyb epybVar2 = epybVar;
                epybVar2.getClass();
                eopqVar.an = epybVar2;
                eopqVar.d |= 4;
                epxt epxtVar = (epxt) epxv.a.createBuilder();
                String a2 = cqvy.a(str);
                epxtVar.copyOnWrite();
                epxv epxvVar = (epxv) epxtVar.instance;
                a2.getClass();
                epxvVar.b |= 2;
                epxvVar.d = a2;
                int a3 = epxs.a(((Long) cqvy.this.e.b()).intValue());
                if (a3 == 0) {
                    a3 = 1;
                }
                epxtVar.copyOnWrite();
                epxv epxvVar2 = (epxv) epxtVar.instance;
                epxvVar2.e = a3 - 1;
                epxvVar2.b |= 4;
                epxv epxvVar3 = (epxv) epxtVar.build();
                eoopVar.copyOnWrite();
                eopq eopqVar3 = (eopq) eoopVar.instance;
                epxvVar3.getClass();
                eopqVar3.at = epxvVar3;
                eopqVar3.d |= 256;
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }
}
