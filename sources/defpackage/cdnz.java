package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Duration;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdnz implements cdnd {
    public static final cskc a = cskc.g("BugleCms", "CmsMediaUploadSchedulerImpl");
    public final cdoa b;
    public final eisx c;
    public final ffbr d;
    public final axdf e;
    public final ffbr f;
    public final cbwj g;
    private final ffbr h;
    private final errl i;
    private final errl j;
    private final cqoh k;
    private final ffbr l;
    private final ffbr m;
    private final ffbr n;
    private final ffbr o;
    private final ffbr p;
    private final ffbr q;
    private final ffbr r;
    private final ffbr s;
    private final ffbr t;
    private final ffbr u;

    public cdnz(cdoa cdoaVar, eisx eisxVar, ffbr ffbrVar, errl errlVar, errl errlVar2, cqoh cqohVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, ffbr ffbrVar8, ffbr ffbrVar9, ffbr ffbrVar10, ffbr ffbrVar11, axdf axdfVar, cbwj cbwjVar, ffbr ffbrVar12, ffbr ffbrVar13) {
        this.b = cdoaVar;
        this.c = eisxVar;
        this.h = ffbrVar;
        this.i = errlVar;
        this.j = errlVar2;
        this.k = cqohVar;
        this.l = ffbrVar3;
        this.m = ffbrVar4;
        this.n = ffbrVar2;
        this.o = ffbrVar5;
        this.p = ffbrVar7;
        this.q = ffbrVar8;
        this.r = ffbrVar6;
        this.s = ffbrVar9;
        this.t = ffbrVar10;
        this.u = ffbrVar11;
        this.e = axdfVar;
        this.g = cbwjVar;
        this.f = ffbrVar12;
        this.d = ffbrVar13;
    }

    public static ceyr k(boolean z, boolean z2, boolean z3, boolean z4, ccck ccckVar, cfkl cfklVar) {
        if (!z) {
            return z3 ? ceyr.h("cms_incremental_sync_media_upload_requiring_wifi", ccckVar, cfklVar) : ceyr.h("cms_incremental_sync_media_upload", ccckVar, cfklVar);
        }
        if (z4) {
            if (z3) {
                return z2 ? ceyr.h("cms_initial_sync_media_upload_requiring_wifi_and_battery_not_low_foreground", ccckVar, cfklVar) : ceyr.h("cms_initial_sync_media_upload_requiring_wifi_and_battery_not_low", ccckVar, cfklVar);
            }
            z3 = false;
        }
        return z4 ? z2 ? ceyr.h("cms_initial_sync_media_upload_requiring_battery_not_low_foreground", ccckVar, cfklVar) : ceyr.h("cms_initial_sync_media_upload_requiring_battery_not_low", ccckVar, cfklVar) : z3 ? z2 ? ceyr.h("cms_initial_sync_media_upload_requiring_wifi_foreground", ccckVar, cfklVar) : ceyr.h("cms_initial_sync_media_upload_requiring_wifi", ccckVar, cfklVar) : z2 ? ceyr.h("cms_initial_sync_media_upload_foreground", ccckVar, cfklVar) : ceyr.h("cms_initial_sync_media_upload", ccckVar, cfklVar);
    }

    public static boolean o(axez axezVar, boolean z) {
        if (!csgj.a() || !((Boolean) ((cfup) csgj.z.get()).e()).booleanValue()) {
            return false;
        }
        axeu b = axeu.b(axezVar.l);
        if (b == null) {
            b = axeu.UNSPECIFIED_STATUS;
        }
        return b != axeu.ENABLED && z;
    }

    @Override // defpackage.cdnd
    public final elfl a() {
        return ((axkm) this.h.b()).k().i(new eroh() { // from class: cdnu
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                final axez axezVar = (axez) obj;
                final cdnz cdnzVar = cdnz.this;
                return cdnzVar.g.b("resetQueuesAndMoveToBackground", new Runnable() { // from class: cdny
                    @Override // java.lang.Runnable
                    public final void run() {
                        cdnz cdnzVar2 = cdnz.this;
                        axez axezVar2 = axezVar;
                        boolean z = axezVar2.d;
                        List m = cdnzVar2.m(true);
                        int size = m.size();
                        engr engrVar = new engr();
                        Iterator it = m.iterator();
                        int i = 0;
                        while (it.hasNext()) {
                            ccck ccckVar = (ccck) ((cetr) it.next()).a;
                            boolean o = cdnz.o(axezVar2, ccckVar.f);
                            int i2 = ccckVar.g;
                            String str = ccckVar.e;
                            csgh a2 = csgh.a(ccckVar.d);
                            eyja eyjaVar = ccckVar.h;
                            if (eyjaVar == null) {
                                eyjaVar = eyja.a;
                            }
                            engrVar.h(cdnzVar2.j(i2, str, a2, Optional.of(eyjaVar), Optional.empty(), ccckVar.f, false, z, o));
                            if (o) {
                                i++;
                            }
                        }
                        ((cevh) cdnzVar2.d.b()).d(engrVar.g());
                        csjb c = cdnz.a.c();
                        c.I("Re-enqueued media upload work to background service queue");
                        c.y("count of re-enqueued items", size);
                        c.B("requireWifi", z);
                        c.y("count of work requireBatteryNotLow", i);
                        c.r();
                    }
                });
            }
        }, this.i).f(Exception.class, new eroh() { // from class: cdnv
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                final Exception exc = (Exception) obj;
                return cdnz.this.l(epdw.UNSPECIFIED_BACKUP_TYPE, null, epeg.MEDIA_UPLOAD_SCHEDULER_RE_ENQUEUE_AFTER_WIFI_CHANGE_FAILED).i(new eroh() { // from class: cdnt
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        return elfo.d(exc);
                    }
                }, erpp.a);
            }
        }, erpp.a);
    }

    @Override // defpackage.cdnd
    public final elfl b(final ccck ccckVar) {
        return ((axkm) this.h.b()).k().h(new emwl() { // from class: cdno
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                axez axezVar = (axez) obj;
                boolean z = axezVar.d;
                ccck ccckVar2 = ccckVar;
                boolean z2 = ccckVar2.f;
                boolean o = cdnz.o(axezVar, z2);
                int i = ccckVar2.g;
                int i2 = i + 1;
                int intValue = ((Integer) csgj.f.e()).intValue();
                cdnz cdnzVar = cdnz.this;
                if (i2 < intValue) {
                    if (!((asid) cdnzVar.f.b()).a()) {
                        cdnzVar.c(ccckVar2.e, csgh.a(ccckVar2.d), ccckVar2.f, z, o, i2);
                        return null;
                    }
                    eyja eyjaVar = ccckVar2.h;
                    if (eyjaVar == null) {
                        eyjaVar = eyja.a;
                    }
                    cdnzVar.d(ccckVar2.e, csgh.a(ccckVar2.d), ccckVar2.f, z, o, i2, eyjaVar);
                    return null;
                }
                epds epdsVar = (epds) epdt.a.createBuilder();
                epdw b = csgh.b(csgh.a(ccckVar2.d));
                epdsVar.copyOnWrite();
                epdt epdtVar = (epdt) epdsVar.instance;
                epdtVar.c = b.w;
                epdtVar.b |= 1;
                int i3 = true != z2 ? 3 : 2;
                epdsVar.copyOnWrite();
                epdt epdtVar2 = (epdt) epdsVar.instance;
                epdtVar2.g = i3 - 1;
                epdtVar2.b |= 16;
                epdsVar.copyOnWrite();
                epdt epdtVar3 = (epdt) epdsVar.instance;
                epdtVar3.d = 3;
                epdtVar3.b |= 2;
                epdsVar.copyOnWrite();
                epdt epdtVar4 = (epdt) epdsVar.instance;
                epdtVar4.b |= 8;
                epdtVar4.f = i;
                epeg epegVar = epeg.BACKUP_REACHES_MAX_RETRY;
                epdsVar.copyOnWrite();
                epdt epdtVar5 = (epdt) epdsVar.instance;
                epdtVar5.e = epegVar.bs;
                epdtVar5.b |= 4;
                cdnzVar.e.f((epdt) epdsVar.build());
                return null;
            }
        }, this.i);
    }

    @Override // defpackage.cdnd
    @Deprecated
    public final void c(String str, csgh csghVar, boolean z, boolean z2, boolean z3, int i) {
        ((cevh) this.d.b()).a(j(i, str, csghVar, Optional.empty(), Optional.empty(), z, false, z2, z3));
    }

    @Override // defpackage.cdnd
    public final void d(String str, csgh csghVar, boolean z, boolean z2, boolean z3, int i, eyja eyjaVar) {
        ((cevh) this.d.b()).a(j(i, str, csghVar, Optional.of(eyjaVar), Optional.empty(), z, p(eyjaVar), z2, z3));
    }

    @Override // defpackage.cdnd
    public final void e(final boolean z) {
        ((axkm) this.h.b()).k().i(new eroh() { // from class: cdnw
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                final axez axezVar = (axez) obj;
                final cdnz cdnzVar = cdnz.this;
                final boolean z2 = z;
                return cdnzVar.g.b("resetQueuesForWifiSettingChange", new Runnable() { // from class: cdni
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean z3;
                        boolean z4;
                        cdnz cdnzVar2 = cdnz.this;
                        List m = cdnzVar2.m(false);
                        int size = m.size();
                        engr engrVar = new engr();
                        Iterator it = m.iterator();
                        int i = 0;
                        while (true) {
                            z3 = z2;
                            if (!it.hasNext()) {
                                break;
                            }
                            axez axezVar2 = axezVar;
                            ccck ccckVar = (ccck) ((cetr) it.next()).a;
                            boolean z5 = ccckVar.f;
                            boolean o = cdnz.o(axezVar2, z5);
                            if (((asid) cdnzVar2.f.b()).a()) {
                                int i2 = ccckVar.g;
                                String str = ccckVar.e;
                                csgh a2 = csgh.a(ccckVar.d);
                                eyja eyjaVar = ccckVar.h;
                                if (eyjaVar == null) {
                                    eyjaVar = eyja.a;
                                }
                                z4 = o;
                                engrVar.h(cdnzVar2.j(i2, str, a2, Optional.of(eyjaVar), Optional.empty(), ccckVar.f, ccckVar.j, z3, z4));
                            } else {
                                z4 = o;
                                cdnzVar2.c(ccckVar.e, csgh.a(ccckVar.d), z5, z3, o, 0);
                            }
                            if (z4) {
                                i++;
                            }
                        }
                        engw g = engrVar.g();
                        if (!g.isEmpty()) {
                            ((cevh) cdnzVar2.d.b()).d(g);
                        }
                        csjb c = cdnz.a.c();
                        c.I("Re-enqueued media upload work after Wi-Fi settings constraint change");
                        c.y("count of re-enqueued items", size);
                        c.B("requireWifi", z3);
                        c.y("count of work requiring requireBatteryNotLow", i);
                        c.r();
                    }
                });
            }
        }, this.i).f(Exception.class, new eroh() { // from class: cdnx
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                final Exception exc = (Exception) obj;
                return cdnz.this.l(epdw.UNSPECIFIED_BACKUP_TYPE, null, epeg.MEDIA_UPLOAD_SCHEDULER_RE_ENQUEUE_AFTER_WIFI_CHANGE_FAILED).i(new eroh() { // from class: cdne
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        return elfo.d(exc);
                    }
                }, erpp.a);
            }
        }, erpp.a).k(axnw.b(), erpp.a);
    }

    @Override // defpackage.cdnd
    public final void f(MessageCoreData messageCoreData, final boolean z, final eyja eyjaVar) {
        final List ab = messageCoreData.ab();
        if (ab.isEmpty()) {
            return;
        }
        ((axkm) this.h.b()).k().h(new emwl() { // from class: cdnm
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                axez axezVar = (axez) obj;
                boolean z2 = axezVar.d;
                boolean z3 = z;
                boolean o = cdnz.o(axezVar, z3);
                for (MessagePartCoreData messagePartCoreData : ab) {
                    cdnz cdnzVar = cdnz.this;
                    if (cdnzVar.b.a(messagePartCoreData)) {
                        if (((asid) cdnzVar.f.b()).a() && z3) {
                            cdnzVar.d(messagePartCoreData.aa(), csgh.COMPRESSED_IMAGE, true, z2, o, 0, eyjaVar);
                        } else {
                            if (cdnzVar.n(z3, axezVar)) {
                                return true;
                            }
                            cdnzVar.c(messagePartCoreData.aa(), csgh.COMPRESSED_IMAGE, z3, z2, o, 0);
                        }
                    }
                }
                return true;
            }
        }, this.i).f(Exception.class, new eroh() { // from class: cdns
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                final Exception exc = (Exception) obj;
                return cdnz.this.l(epdw.MEDIA_COMPRESSED_SIZE_BACKUP, Boolean.valueOf(z), epeg.MEDIA_UPLOAD_SCHEDULER_FIRST_ENQUEUE_FAILED).i(new eroh() { // from class: cdnf
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        return elfo.d(exc);
                    }
                }, erpp.a);
            }
        }, erpp.a).k(axnw.b(), erpp.a);
    }

    @Override // defpackage.cdnd
    public final void g(MessageCoreData messageCoreData, final boolean z, final eyja eyjaVar) {
        final List ab = messageCoreData.ab();
        if (ab.isEmpty()) {
            return;
        }
        ((axkm) this.h.b()).k().h(new emwl() { // from class: cdnq
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                axez axezVar = (axez) obj;
                boolean z2 = axezVar.d;
                boolean z3 = z;
                boolean o = cdnz.o(axezVar, z3);
                for (MessagePartCoreData messagePartCoreData : ab) {
                    if (cdoa.c(messagePartCoreData)) {
                        cdnz cdnzVar = cdnz.this;
                        if (((asid) cdnzVar.f.b()).a() && z3) {
                            cdnzVar.d(messagePartCoreData.aa(), csgh.MEDIA, true, z2, o, 0, eyjaVar);
                        } else {
                            if (cdnzVar.n(z3, axezVar)) {
                                return true;
                            }
                            cdnzVar.c(messagePartCoreData.aa(), csgh.MEDIA, z3, z2, o, 0);
                        }
                    }
                }
                return true;
            }
        }, this.i).f(Exception.class, new eroh() { // from class: cdnr
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                final Exception exc = (Exception) obj;
                return cdnz.this.l(epdw.MEDIA_FULL_SIZE_BACKUP, Boolean.valueOf(z), epeg.MEDIA_UPLOAD_SCHEDULER_FIRST_ENQUEUE_FAILED).i(new eroh() { // from class: cdnk
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        return elfo.d(exc);
                    }
                }, erpp.a);
            }
        }, erpp.a).k(axnw.b(), erpp.a);
    }

    @Override // defpackage.cdnd
    public final void h(final ParticipantsTable.BindData bindData) {
        ((axkm) this.h.b()).k().h(new emwl() { // from class: cdnl
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                axez axezVar = (axez) obj;
                boolean z = axezVar.d;
                boolean o = cdnz.o(axezVar, false);
                cdnz cdnzVar = cdnz.this;
                cdoa cdoaVar = cdnzVar.b;
                ParticipantsTable.BindData bindData2 = bindData;
                if (!cdoaVar.b(bindData2) || cdnzVar.n(false, axezVar)) {
                    return true;
                }
                cdnzVar.c(bindData2.S(), csgh.PROFILE_PHOTO, false, z, o, 0);
                return true;
            }
        }, this.i).f(Exception.class, new eroh() { // from class: cdnn
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                final Exception exc = (Exception) obj;
                return cdnz.this.l(epdw.MEDIA_PROFILE_PHOTO_BACKUP, false, epeg.MEDIA_UPLOAD_SCHEDULER_FIRST_ENQUEUE_FAILED).i(new eroh() { // from class: cdnp
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        return elfo.d(exc);
                    }
                }, erpp.a);
            }
        }, erpp.a).k(axnw.b(), erpp.a);
    }

    @Override // defpackage.cdnd
    public final elfl i(final int i, final eyja eyjaVar, final int i2, final boolean z) {
        if (i == 0) {
            throw null;
        }
        if (i == 2 || i == 3) {
            return ((axkm) this.h.b()).k().h(new emwl() { // from class: cdnj
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    axez axezVar = (axez) obj;
                    boolean z2 = axezVar.d;
                    boolean o = cdnz.o(axezVar, true);
                    cdnz cdnzVar = cdnz.this;
                    eyja eyjaVar2 = eyjaVar;
                    csgh csghVar = csgh.UNDEFINED;
                    boolean p = cdnzVar.p(eyjaVar2);
                    cccg cccgVar = (cccg) ccch.a.createBuilder();
                    cccgVar.copyOnWrite();
                    ccch ccchVar = (ccch) cccgVar.instance;
                    ccchVar.b |= 1;
                    ccchVar.c = i2;
                    cccgVar.copyOnWrite();
                    ccch ccchVar2 = (ccch) cccgVar.instance;
                    int i3 = i;
                    ccchVar2.d = i3 - 1;
                    ccchVar2.b |= 2;
                    cccgVar.copyOnWrite();
                    ccch ccchVar3 = (ccch) cccgVar.instance;
                    ccchVar3.b |= 4;
                    ccchVar3.e = z;
                    ccch ccchVar4 = (ccch) cccgVar.build();
                    cccf cccfVar = (cccf) ccck.a.createBuilder();
                    int a2 = cdnzVar.c.a();
                    cccfVar.copyOnWrite();
                    ccck ccckVar = (ccck) cccfVar.instance;
                    ccckVar.b |= 1;
                    ccckVar.c = a2;
                    int i4 = csghVar.e;
                    cccfVar.copyOnWrite();
                    ccck ccckVar2 = (ccck) cccfVar.instance;
                    ccckVar2.b |= 2;
                    ccckVar2.d = i4;
                    cccfVar.copyOnWrite();
                    ccck ccckVar3 = (ccck) cccfVar.instance;
                    ccckVar3.b |= 8;
                    ccckVar3.f = true;
                    cccfVar.copyOnWrite();
                    ccck ccckVar4 = (ccck) cccfVar.instance;
                    ccckVar4.b |= 32;
                    ccckVar4.g = 0;
                    cccfVar.copyOnWrite();
                    ccck ccckVar5 = (ccck) cccfVar.instance;
                    eyjaVar2.getClass();
                    ccckVar5.h = eyjaVar2;
                    ccckVar5.b |= 64;
                    cccfVar.copyOnWrite();
                    ccck ccckVar6 = (ccck) cccfVar.instance;
                    ccchVar4.getClass();
                    ccckVar6.i = ccchVar4;
                    ccckVar6.b |= 128;
                    cccfVar.copyOnWrite();
                    ccck ccckVar7 = (ccck) cccfVar.instance;
                    ccckVar7.b |= 256;
                    ccckVar7.j = p;
                    ccck ccckVar8 = (ccck) cccfVar.build();
                    cetp cetpVar = new cetp();
                    cetpVar.b = cdrs.a(cdnzVar.c.toString(), cccj.a(i3), csghVar, p);
                    ((cevh) cdnzVar.d.b()).a(cdnz.k(true, p, z2, o, ccckVar8, cetpVar.a()));
                    return null;
                }
            }, this.j);
        }
        ((enrr) a.k().h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/media/CmsMediaUploadSchedulerImpl", "queueLogMediaUploadStage", 711, "CmsMediaUploadSchedulerImpl.java")).t("Not queueing %s event log for media upload metrics because it is not a valid stage.", cccj.a(i));
        throw new IllegalArgumentException(String.format("%s is an invalid stage to log during media upload.", cccj.a(i)));
    }

    public final ceyr j(int i, String str, csgh csghVar, Optional optional, Optional optional2, boolean z, boolean z2, boolean z3, boolean z4) {
        final cccf cccfVar = (cccf) ccck.a.createBuilder();
        int a2 = this.c.a();
        cccfVar.copyOnWrite();
        ccck ccckVar = (ccck) cccfVar.instance;
        ccckVar.b |= 1;
        ccckVar.c = a2;
        cccfVar.copyOnWrite();
        ccck ccckVar2 = (ccck) cccfVar.instance;
        str.getClass();
        ccckVar2.b |= 4;
        ccckVar2.e = str;
        int i2 = csghVar.e;
        cccfVar.copyOnWrite();
        ccck ccckVar3 = (ccck) cccfVar.instance;
        ccckVar3.b |= 2;
        ccckVar3.d = i2;
        cccfVar.copyOnWrite();
        ccck ccckVar4 = (ccck) cccfVar.instance;
        ccckVar4.b |= 8;
        ccckVar4.f = z;
        cccfVar.copyOnWrite();
        ccck ccckVar5 = (ccck) cccfVar.instance;
        ccckVar5.b |= 32;
        ccckVar5.g = i;
        cccfVar.copyOnWrite();
        ccck ccckVar6 = (ccck) cccfVar.instance;
        ccckVar6.b |= 256;
        ccckVar6.j = z2;
        optional.ifPresent(new Consumer() { // from class: cdng
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                cccf cccfVar2 = cccf.this;
                eyja eyjaVar = (eyja) obj;
                cccfVar2.copyOnWrite();
                ccck ccckVar7 = (ccck) cccfVar2.instance;
                ccck ccckVar8 = ccck.a;
                eyjaVar.getClass();
                ccckVar7.h = eyjaVar;
                ccckVar7.b |= 64;
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        optional2.ifPresent(new Consumer() { // from class: cdnh
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                cccf cccfVar2 = cccf.this;
                ccch ccchVar = (ccch) obj;
                cccfVar2.copyOnWrite();
                ccck ccckVar7 = (ccck) cccfVar2.instance;
                ccck ccckVar8 = ccck.a;
                ccchVar.getClass();
                ccckVar7.i = ccchVar;
                ccckVar7.b |= 128;
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        Duration duration = Duration.ZERO;
        if (i > 0) {
            duration = cccm.a(i, 1);
        }
        eisx eisxVar = this.c;
        cetp cetpVar = new cetp();
        cetpVar.b = cdrs.a(eisxVar.toString(), str, csghVar, z2);
        cetpVar.c = duration;
        return k(z, z2, z3, z4, (ccck) cccfVar.build(), cetpVar.a());
    }

    public final elfl l(epdw epdwVar, Boolean bool, epeg epegVar) {
        epds epdsVar = (epds) epdt.a.createBuilder();
        epdsVar.copyOnWrite();
        epdt epdtVar = (epdt) epdsVar.instance;
        epdtVar.c = epdwVar.w;
        epdtVar.b |= 1;
        int i = bool != null ? bool.booleanValue() ? 2 : 3 : 1;
        epdsVar.copyOnWrite();
        epdt epdtVar2 = (epdt) epdsVar.instance;
        epdtVar2.g = i - 1;
        epdtVar2.b |= 16;
        epdsVar.copyOnWrite();
        epdt epdtVar3 = (epdt) epdsVar.instance;
        epdtVar3.d = 3;
        epdtVar3.b |= 2;
        epdsVar.copyOnWrite();
        epdt epdtVar4 = (epdt) epdsVar.instance;
        epdtVar4.e = epegVar.bs;
        epdtVar4.b |= 4;
        epdt epdtVar5 = (epdt) epdsVar.build();
        final axdf axdfVar = this.e;
        epdx epdxVar = (epdx) epgf.a.createBuilder();
        epdxVar.copyOnWrite();
        epgf epgfVar = (epgf) epdxVar.instance;
        epdtVar5.getClass();
        epgfVar.d = epdtVar5;
        epgfVar.b |= 2;
        return axdfVar.a((epgf) epdxVar.build()).h(new axcy(), axdfVar.e).h(new emwl() { // from class: axcs
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                axdf.this.q((epgf) obj);
                return null;
            }
        }, axdfVar.f);
    }

    public final List m(boolean z) {
        ArrayList arrayList = new ArrayList();
        if (!z) {
            arrayList.addAll(((cdrk) this.o.b()).a());
            arrayList.addAll(((cdrq) this.n.b()).a());
            arrayList.addAll(((cdrh) this.t.b()).a());
            arrayList.addAll(((cdri) this.u.b()).a());
            arrayList.addAll(((cdro) this.m.b()).a());
            arrayList.addAll(((cdrm) this.l.b()).a());
        }
        arrayList.addAll(((cevh) ((cdrj) this.s.b()).a.b()).c("cms_initial_sync_media_upload_foreground"));
        arrayList.addAll(((cevh) ((cdrp) this.r.b()).a.b()).c("cms_initial_sync_media_upload_requiring_wifi_foreground"));
        arrayList.addAll(((cevh) ((cdrn) this.q.b()).a.b()).c("cms_initial_sync_media_upload_requiring_wifi_and_battery_not_low_foreground"));
        arrayList.addAll(((cevh) ((cdrl) this.p.b()).a.b()).c("cms_initial_sync_media_upload_requiring_battery_not_low_foreground"));
        return arrayList;
    }

    public final boolean n(boolean z, axez axezVar) {
        if (!((Boolean) ((cfup) csgj.Y.get()).e()).booleanValue() || z) {
            return false;
        }
        axkl axklVar = ((axkm) this.h.b()).n;
        axeu b = axeu.b(axezVar.l);
        if (b == null) {
            b = axeu.UNSPECIFIED_STATUS;
        }
        return !axkl.f(b);
    }

    public final boolean p(eyja eyjaVar) {
        return ((asid) this.f.b()).a() && this.k.f().minusMillis(eykm.b(eyjaVar)).toEpochMilli() <= ((Long) csgj.O.e()).longValue();
    }
}
