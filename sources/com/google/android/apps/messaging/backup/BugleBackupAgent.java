package com.google.android.apps.messaging.backup;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.backup.BackupDataInput;
import android.app.backup.BackupDataOutput;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.telephony.SubscriptionManager;
import android.text.TextUtils;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.backup.BugleBackupAgent;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.akb$$ExternalSyntheticApiModelOutline0;
import defpackage.asic;
import defpackage.asik;
import defpackage.axeu;
import defpackage.axez;
import defpackage.axkm;
import defpackage.axmm;
import defpackage.axnw;
import defpackage.babf;
import defpackage.csgj;
import defpackage.csix;
import defpackage.ctba;
import defpackage.ctho;
import defpackage.cthp;
import defpackage.ctia;
import defpackage.ctwb;
import defpackage.ctyw;
import defpackage.ctyx;
import defpackage.ctzc;
import defpackage.dlpc;
import defpackage.eixo;
import defpackage.ejvb;
import defpackage.ekzm;
import defpackage.elbx;
import defpackage.elfl;
import defpackage.elfo;
import defpackage.emwl;
import defpackage.enhd;
import defpackage.enhk;
import defpackage.enip;
import defpackage.enoz;
import defpackage.enpx;
import defpackage.enrr;
import defpackage.enru;
import defpackage.ensk;
import defpackage.ente;
import defpackage.eroh;
import defpackage.errl;
import defpackage.eykm;
import defpackage.snz;
import defpackage.sol;
import defpackage.sqp;
import defpackage.sqr;
import j$.util.Optional;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class BugleBackupAgent extends dlpc {
    public static final enru a = enru.c("com/google/android/apps/messaging/backup/BugleBackupAgent");
    public ctyx b;
    public ctwb c;
    public babf d;
    public axkm e;
    public errl f;
    public errl g;
    public ejvb h;
    public eixo i;
    public ctyw j;
    private cthp m;
    private ctia n;
    private sqp o;
    private sqr p;
    private asic q;
    private asik r;
    private elbx s;
    private final Object k = new Object();
    private Set l = null;
    private boolean t = false;

    /* compiled from: PG */
    public interface a {
        Optional a();
    }

    /* compiled from: PG */
    public interface b {
        elbx b();

        sqp c();

        sqr d();

        asic e();

        asik f();

        axkm g();

        axmm h();

        babf i();

        cthp j();

        ctia k();

        ctwb l();

        ctyx m();

        eixo n();

        ejvb o();

        errl p();

        errl q();

        ctyw r();
    }

    private final void k() {
        Set set = this.l;
        if (set == null) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            e((String) it.next());
        }
        this.l = null;
    }

    private final void l() {
        synchronized (this.k) {
            if (!this.t) {
                b bVar = (b) ctba.a(b.class);
                this.b = bVar.m();
                this.m = bVar.j();
                this.n = bVar.k();
                this.c = bVar.l();
                this.j = bVar.r();
                this.o = bVar.c();
                this.p = bVar.d();
                this.d = bVar.i();
                this.e = bVar.g();
                this.f = bVar.p();
                this.g = bVar.q();
                this.h = bVar.o();
                this.i = bVar.n();
                this.q = bVar.e();
                this.r = bVar.f();
                this.s = bVar.b();
                this.t = true;
                bVar.h();
                ensk h = a.h();
                h.Y(ente.a, "BugleBackup");
                ((enrr) ((enrr) h).h("com/google/android/apps/messaging/backup/BugleBackupAgent", "init", 194, "BugleBackupAgent.java")).q("Dependencies initialized.");
            }
        }
    }

    private final void m() {
        ensk h = a.h();
        h.Y(ente.a, "BugleBackup");
        ((enrr) ((enrr) h).h("com/google/android/apps/messaging/backup/BugleBackupAgent", "restoreCmsTimestamp", 534, "BugleBackupAgent.java")).q("Restoring CmsTimestamp.");
        String f = this.b.f(getString(R.string.cms_d2d_timestamp_pref_key), null);
        if (f != null) {
            try {
                this.e.V(eykm.h(f));
            } catch (ParseException e) {
                ensk j = a.j();
                j.Y(ente.a, "BugleBackup");
                ((enrr) ((enrr) ((enrr) j).g(e)).h("com/google/android/apps/messaging/backup/BugleBackupAgent", "restoreCmsTimestamp", (char) 541, "BugleBackupAgent.java")).q("Failed to parse timestamp. Skipping restore the D2D Value");
            }
        }
    }

    private final void n(boolean z) {
        ensk h = a.h();
        h.Y(ente.a, "BugleBackup");
        ((enrr) ((enrr) h).h("com/google/android/apps/messaging/backup/BugleBackupAgent", "setEnableOptimizedRestoreWithD2dFlag", 381, "BugleBackupAgent.java")).t("Writing D2d flag value %s to preferences.", Boolean.valueOf(z));
        this.b.h(getString(R.string.cms_d2d_flag_pref_key), z);
    }

    private final void o() {
        n(true);
        Boolean bool = false;
        try {
            bool = (Boolean) a().i(new eroh() { // from class: soa
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    if (!((Boolean) obj).booleanValue()) {
                        return elfo.e(false);
                    }
                    final BugleBackupAgent bugleBackupAgent = BugleBackupAgent.this;
                    return bugleBackupAgent.e.n().h(new emwl() { // from class: soj
                        @Override // defpackage.emwl
                        public final Object apply(Object obj2) {
                            Optional optional = (Optional) obj2;
                            if (!optional.isPresent()) {
                                ensk j = BugleBackupAgent.a.j();
                                j.Y(ente.a, "BugleBackup");
                                ((enrr) ((enrr) j).h("com/google/android/apps/messaging/backup/BugleBackupAgent", "writePriorToD2dDeviceId", 399, "BugleBackupAgent.java")).q("Device Id is empty. Skipping back up of priorToD2dDeviceId");
                                return false;
                            }
                            BugleBackupAgent bugleBackupAgent2 = BugleBackupAgent.this;
                            ensk h = BugleBackupAgent.a.h();
                            h.Y(ente.a, "BugleBackup");
                            ((enrr) ((enrr) h).h("com/google/android/apps/messaging/backup/BugleBackupAgent", "writePriorToD2dDeviceId", 392, "BugleBackupAgent.java")).t("Backing up priorToD2dDeviceId with device id: %s", optional.get());
                            bugleBackupAgent2.b.l(bugleBackupAgent2.getString(R.string.prior_to_d2d_device_id_pref_key), (String) optional.get());
                            return true;
                        }
                    }, bugleBackupAgent.f);
                }
            }, this.g).i(new eroh() { // from class: soc
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    if (!((Boolean) obj).booleanValue()) {
                        return elfo.e(false);
                    }
                    final BugleBackupAgent bugleBackupAgent = BugleBackupAgent.this;
                    return bugleBackupAgent.d.a().i(new eroh() { // from class: sof
                        /* JADX WARN: Type inference failed for: r5v5, types: [crty, java.lang.Object] */
                        @Override // defpackage.eroh
                        public final ListenableFuture a(Object obj2) {
                            Optional a2 = ((BugleBackupAgent.a) ekhv.a(BugleBackupAgent.this, BugleBackupAgent.a.class, (eisx) obj2)).a();
                            if (!a2.isEmpty()) {
                                return a2.get().l();
                            }
                            ensk j = BugleBackupAgent.a.j();
                            j.Y(ente.a, "BugleBackup");
                            ((enrr) ((enrr) j).h("com/google/android/apps/messaging/backup/BugleBackupAgent", "setCmsD2dTimestamp", 418, "BugleBackupAgent.java")).q("CloudMessageStoreClient is not present. Will fall back to dailyRetrievedCmsD2dTimestamp if possible");
                            return elfo.e(eykm.c);
                        }
                    }, bugleBackupAgent.g).f(fedn.class, new eroh() { // from class: sog
                        @Override // defpackage.eroh
                        public final ListenableFuture a(Object obj2) {
                            ensk j = BugleBackupAgent.a.j();
                            j.Y(ente.a, "BugleBackup");
                            ((enrr) ((enrr) ((enrr) j).g((fedn) obj2)).h("com/google/android/apps/messaging/backup/BugleBackupAgent", "setCmsD2dTimestamp", 429, "BugleBackupAgent.java")).q("Failed to get timestamp, Will fall back to dailyRetrievedCmsD2dTimestamp if possible");
                            return elfo.e(eykm.c);
                        }
                    }, bugleBackupAgent.g).i(new eroh() { // from class: soh
                        /* JADX WARN: Type inference failed for: r1v2, types: [comc, java.lang.Object] */
                        @Override // defpackage.eroh
                        public final ListenableFuture a(Object obj2) {
                            BugleBackupAgent bugleBackupAgent2 = BugleBackupAgent.this;
                            final eyja eyjaVar = (eyja) obj2;
                            return bugleBackupAgent2.e.e.get().h().h(new emwl() { // from class: axjp
                                @Override // defpackage.emwl
                                public final Object apply(Object obj3) {
                                    eyja eyjaVar2 = ((axez) obj3).H;
                                    return eyjaVar2 == null ? eyja.a : eyjaVar2;
                                }
                            }, erpp.a).h(new emwl() { // from class: sok
                                @Override // defpackage.emwl
                                public final Object apply(Object obj3) {
                                    eyja eyjaVar2 = eyja.this;
                                    eyja eyjaVar3 = (eyja) obj3;
                                    enru enruVar = BugleBackupAgent.a;
                                    eyja eyjaVar4 = eykm.a;
                                    eyja eyjaVar5 = eykl.a(eyjaVar2, eyjaVar3) > 0 ? eyjaVar2 : eyjaVar3;
                                    ensk h = BugleBackupAgent.a.h();
                                    h.Y(ente.a, "BugleBackup");
                                    ((enrr) ((enrr) h).h("com/google/android/apps/messaging/backup/BugleBackupAgent", "getMostRecentTimestamp", 458, "BugleBackupAgent.java")).J("Between fetched timestamp: %s and dailyRetrievedTimestamp: %s, the mostRecentTimistamp is: %s", eykm.i(eyjaVar2), eykm.i(eyjaVar3), eykm.i(eyjaVar5));
                                    return eyjaVar5;
                                }
                            }, bugleBackupAgent2.g);
                        }
                    }, bugleBackupAgent.g).h(new emwl() { // from class: soi
                        @Override // defpackage.emwl
                        public final Object apply(Object obj2) {
                            BugleBackupAgent bugleBackupAgent2 = BugleBackupAgent.this;
                            bugleBackupAgent2.b.l(bugleBackupAgent2.getString(R.string.cms_d2d_timestamp_pref_key), eykm.i((eyja) obj2));
                            return Boolean.valueOf(!r4.equals(eykm.c));
                        }
                    }, bugleBackupAgent.g);
                }
            }, this.g).get(((Integer) csgj.K.e()).intValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            ensk j = a.j();
            j.Y(ente.a, "BugleBackup");
            ((enrr) ((enrr) ((enrr) j).g(e)).h("com/google/android/apps/messaging/backup/BugleBackupAgent", "setOptimizedRestoreWithD2dValues", (char) 369, "BugleBackupAgent.java")).q("Failed to completely set D2d values for Optimized Restore");
        }
        if (bool.booleanValue()) {
            ensk h = a.h();
            h.Y(ente.a, "BugleBackup");
            ((enrr) ((enrr) h).h("com/google/android/apps/messaging/backup/BugleBackupAgent", "setOptimizedRestoreWithD2dValues", 373, "BugleBackupAgent.java")).q("Successfully set optimized CMS Restore Settings");
        } else {
            ensk h2 = a.h();
            h2.Y(ente.a, "BugleBackup");
            ((enrr) ((enrr) h2).h("com/google/android/apps/messaging/backup/BugleBackupAgent", "setOptimizedRestoreWithD2dValues", 375, "BugleBackupAgent.java")).q("Failed to set optimized CMS Restore Settings");
        }
    }

    final elfl a() {
        return this.d.a().i(new eroh() { // from class: sod
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                eisx eisxVar = (eisx) obj;
                if (eisxVar != null) {
                    BugleBackupAgent bugleBackupAgent = BugleBackupAgent.this;
                    return elfl.g(bugleBackupAgent.h.b(bugleBackupAgent.i.a(eisxVar), ejwa.DONT_CARE));
                }
                ensk j = BugleBackupAgent.a.j();
                j.Y(ente.a, "BugleBackup");
                ((enrr) ((enrr) j).h("com/google/android/apps/messaging/backup/BugleBackupAgent", "writeAccountNameToPreferences", 309, "BugleBackupAgent.java")).q("Failed to get linked account. Skipping backing up BnR Account and setting the D2D");
                return elfo.e(eixz.a);
            }
        }, this.f).h(new emwl() { // from class: soe
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                eixz eixzVar = (eixz) obj;
                if (eixzVar.equals(eixz.a)) {
                    ensk j = BugleBackupAgent.a.j();
                    j.Y(ente.a, "BugleBackup");
                    ((enrr) ((enrr) j).h("com/google/android/apps/messaging/backup/BugleBackupAgent", "writeAccountNameToPreferences", 322, "BugleBackupAgent.java")).q("Failed to get accountInfo. Skipping backing up BnR Account and setting the D2D");
                    return false;
                }
                BugleBackupAgent bugleBackupAgent = BugleBackupAgent.this;
                bugleBackupAgent.b.l(bugleBackupAgent.getString(R.string.bnr_gaia_account_user_id_pref_key), eixzVar.c);
                return true;
            }
        }, this.f);
    }

    final Map b() {
        l();
        if (SubscriptionManager.from(this) == null) {
            ensk j = a.j();
            j.Y(ente.a, "BugleBackup");
            ((enrr) ((enrr) j).h("com/google/android/apps/messaging/backup/BugleBackupAgent", "buildSubscriptionBackupPreferenceMap", 724, "BugleBackupAgent.java")).q("Couldn't get a subscription manager. Per-subscription preferences won't be backed up/restored.");
            return enoz.a;
        }
        try {
            Charset forName = Charset.forName("UTF-8");
            enhd enhdVar = new enhd();
            this.c.o(new sol(this, forName, enhdVar));
            return enhdVar.c();
        } catch (UnsupportedCharsetException e) {
            csix.p("Device doesn't support UTF-8 encoding. Per-subscription preferences won't be backed up/restored.", e);
            return enoz.a;
        }
    }

    @Override // defpackage.dlpc
    protected final Map c() {
        l();
        enhd enhdVar = new enhd();
        enhdVar.k(this.b.a(), snz.a(this, new enpx(this.o)));
        ctzc b2 = snz.b(this);
        Set set = this.l;
        if (set != null) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                enhdVar.k((String) it.next(), b2);
            }
        }
        return enhdVar.c();
    }

    final void d(String str, String str2) {
        l();
        ensk e = a.e();
        e.Y(ente.a, "BugleBackup");
        ((enrr) ((enrr) e).h("com/google/android/apps/messaging/backup/BugleBackupAgent", "copyPreferences", 786, "BugleBackupAgent.java")).D("Copying shared preferences from \"%s\" to \"%s\".", str, str2);
        SharedPreferences sharedPreferences = getSharedPreferences(str, 0);
        SharedPreferences.Editor edit = getSharedPreferences(str2, 0).edit();
        for (Map.Entry<String, ?> entry : sharedPreferences.getAll().entrySet()) {
            Object value = entry.getValue();
            if (value != null) {
                i(edit, entry.getKey(), value);
            }
        }
        edit.apply();
    }

    final void e(String str) {
        l();
        enru enruVar = a;
        ensk e = enruVar.e();
        e.Y(ente.a, "BugleBackup");
        ((enrr) ((enrr) e).h("com/google/android/apps/messaging/backup/BugleBackupAgent", "deletePreferences", 803, "BugleBackupAgent.java")).t("Deleting shared preferences \"%s\".", str);
        if (!getSharedPreferences(str, 0).edit().clear().commit()) {
            ensk j = enruVar.j();
            j.Y(ente.a, "BugleBackup");
            ((enrr) ((enrr) j).h("com/google/android/apps/messaging/backup/BugleBackupAgent", "deletePreferences", 808, "BugleBackupAgent.java")).t("Failed to clear shared preferences \"%s\".", str);
        }
        if (deleteSharedPreferences(str)) {
            return;
        }
        ensk j2 = enruVar.j();
        j2.Y(ente.a, "BugleBackup");
        ((enrr) ((enrr) j2).h("com/google/android/apps/messaging/backup/BugleBackupAgent", "deletePreferencesFile", 816, "BugleBackupAgent.java")).t("Failed to delete shared preferences \"%s\".", str);
    }

    final void f() {
        try {
            ((Boolean) a().get(((Integer) csgj.J.e()).intValue(), TimeUnit.MILLISECONDS)).booleanValue();
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            ensk j = a.j();
            j.Y(ente.a, "BugleBackup");
            ((enrr) ((enrr) ((enrr) j).g(e)).h("com/google/android/apps/messaging/backup/BugleBackupAgent", "writeAccountNameToPreferencesSync", (char) 295, "BugleBackupAgent.java")).q("Failed to set gaia user id. Skipping backing up BnR Account and setting the D2D value\"");
        }
    }

    @Override // defpackage.dlpc
    protected final void g(Set set) {
        l();
        ensk h = a.h();
        h.Y(ente.a, "BugleBackup");
        ((enrr) ((enrr) h).h("com/google/android/apps/messaging/backup/BugleBackupAgent", "onPreferencesRestored", 677, "BugleBackupAgent.java")).q("onPreferencesRestored started.");
        Map b2 = b();
        int i = 0;
        int i2 = 0;
        for (Map.Entry entry : ((enhk) b2).entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            if (set.contains(str2)) {
                d(str2, str);
                i2++;
            }
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str3 = (String) it.next();
            if (str3.startsWith("bugleuniqsub_")) {
                e(str3);
                i++;
            }
        }
        enru enruVar = a;
        ensk h2 = enruVar.h();
        h2.Y(ente.a, "BugleBackup");
        ((enrr) ((enrr) h2).h("com/google/android/apps/messaging/backup/BugleBackupAgent", "restoreSubscriptionPreferences", 707, "BugleBackupAgent.java")).r("Backup data for %d SIM card(s) was retrieved from the cloud.", i);
        ensk h3 = enruVar.h();
        h3.Y(ente.a, "BugleBackup");
        ((enrr) ((enrr) h3).h("com/google/android/apps/messaging/backup/BugleBackupAgent", "restoreSubscriptionPreferences", 709, "BugleBackupAgent.java")).u("%d out of %d active SIM card(s) was/were restored.", i2, ((enoz) b2).d);
        ensk h4 = enruVar.h();
        h4.Y(ente.a, "BugleBackup");
        ((enrr) ((enrr) h4).h("com/google/android/apps/messaging/backup/BugleBackupAgent", "onPreferencesRestored", 680, "BugleBackupAgent.java")).q("onPreferencesRestored finished.");
    }

    @Override // defpackage.dlpc, android.app.backup.BackupAgentHelper, android.app.backup.BackupAgent
    public final void onBackup(ParcelFileDescriptor parcelFileDescriptor, BackupDataOutput backupDataOutput, ParcelFileDescriptor parcelFileDescriptor2) {
        int transportFlags;
        NotificationChannel f;
        boolean shouldVibrate;
        Uri sound;
        Uri sound2;
        String uri;
        enru enruVar = a;
        ensk h = enruVar.h();
        h.Y(ente.a, "BugleBackup");
        ((enrr) ((enrr) h).h("com/google/android/apps/messaging/backup/BugleBackupAgent", "onBackup", BasePaymentResult.ERROR_BOT_DOMAIN_NOT_WHITELISTED, "BugleBackupAgent.java")).q("onBackup started.");
        l();
        this.p.a(2);
        l();
        ensk h2 = enruVar.h();
        h2.Y(ente.a, "BugleBackup");
        ((enrr) ((enrr) h2).h("com/google/android/apps/messaging/backup/BugleBackupAgent", "writeDefaultNotificationChannelToPreferences", 254, "BugleBackupAgent.java")).q("Writing default notification settings to preferences.");
        boolean l = this.m.l(true);
        this.b.h(getString(R.string.notifications_enabled_pref_key), l);
        if (l && (f = this.m.f()) != null) {
            ctyx ctyxVar = this.b;
            String string = getString(R.string.notification_vibration_pref_key);
            shouldVibrate = f.shouldVibrate();
            ctyxVar.h(string, shouldVibrate);
            sound = f.getSound();
            if (sound == null) {
                uri = null;
            } else {
                sound2 = f.getSound();
                uri = sound2.toString();
            }
            this.b.l(getString(R.string.notification_sound_pref_key), uri);
        }
        csix.i(this.l);
        Map b2 = b();
        enhk enhkVar = (enhk) b2;
        for (Map.Entry entry : enhkVar.entrySet()) {
            d((String) entry.getKey(), (String) entry.getValue());
        }
        enru enruVar2 = a;
        ensk h3 = enruVar2.h();
        h3.Y(ente.a, "BugleBackup");
        ((enrr) ((enrr) h3).h("com/google/android/apps/messaging/backup/BugleBackupAgent", "createSubscriptionBackupPreferences", 633, "BugleBackupAgent.java")).r("%d active SIM card(s) will be backed up.", ((enoz) b2).d);
        this.l = enip.o(enhkVar.values());
        if (this.r.a()) {
            if (axmm.n(this.e.c())) {
                ensk h4 = enruVar2.h();
                h4.Y(ente.a, "BugleBackup");
                ((enrr) ((enrr) h4).h("com/google/android/apps/messaging/backup/BugleBackupAgent", "onBackup", 216, "BugleBackupAgent.java")).q("CMS Initial Sync is complete, setting optimized restore values");
                o();
            } else {
                ensk h5 = enruVar2.h();
                h5.Y(ente.a, "BugleBackup");
                ((enrr) ((enrr) h5).h("com/google/android/apps/messaging/backup/BugleBackupAgent", "onBackup", 219, "BugleBackupAgent.java")).q("CMS Initial Sync is not complete, clearing optimized restore values.");
                n(false);
                this.b.n(getString(R.string.prior_to_d2d_device_id_pref_key));
                this.b.n(getString(R.string.bnr_gaia_account_user_id_pref_key));
                this.b.n(getString(R.string.cms_d2d_timestamp_pref_key));
            }
        }
        if (this.q.a() && Build.VERSION.SDK_INT >= 28 && backupDataOutput != null) {
            transportFlags = backupDataOutput.getTransportFlags();
            if ((transportFlags & 1) != 0) {
                ekzm b3 = this.s.b("writeCmsSettingsToPreferences");
                try {
                    try {
                        axez axezVar = (axez) this.e.k().get();
                        ctyx ctyxVar2 = this.b;
                        String string2 = getString(R.string.bnr_enabled_status_pref_key);
                        axeu b4 = axeu.b(axezVar.r);
                        if (b4 == null) {
                            b4 = axeu.UNSPECIFIED_STATUS;
                        }
                        ctyxVar2.j(string2, b4.h);
                        ctyx ctyxVar3 = this.b;
                        String string3 = getString(R.string.multi_device_enabled_status_pref_key);
                        axeu b5 = axeu.b(axezVar.l);
                        if (b5 == null) {
                            b5 = axeu.UNSPECIFIED_STATUS;
                        }
                        ctyxVar3.j(string3, b5.h);
                    } finally {
                    }
                } catch (InterruptedException | ExecutionException e) {
                    ensk j = a.j();
                    j.Y(ente.a, "BugleBackup");
                    ((enrr) ((enrr) ((enrr) j).g(e)).h("com/google/android/apps/messaging/backup/BugleBackupAgent", "writeCmsEnabledStatusToPreferencesSync", (char) 283, "BugleBackupAgent.java")).q("Failed to get cms settings data. Skipping backing up Cms related enabled statuses");
                }
                f();
                b3.close();
            }
        }
        try {
            super.onBackup(parcelFileDescriptor, backupDataOutput, parcelFileDescriptor2);
            k();
            if (this.q.a()) {
                ensk h6 = a.h();
                h6.Y(ente.a, "BugleBackup");
                ((enrr) ((enrr) h6).h("com/google/android/apps/messaging/backup/BugleBackupAgent", "onBackup", 239, "BugleBackupAgent.java")).q("onBackup finished.");
            } else {
                ensk h7 = a.h();
                h7.Y(ente.a, "BugleBackup");
                ((enrr) ((enrr) h7).h("com/google/android/apps/messaging/backup/BugleBackupAgent", "onBackup", 241, "BugleBackupAgent.java")).q("onBackup finished.");
            }
        } catch (Throwable th) {
            k();
            if (this.q.a()) {
                ensk h8 = a.h();
                h8.Y(ente.a, "BugleBackup");
                ((enrr) ((enrr) h8).h("com/google/android/apps/messaging/backup/BugleBackupAgent", "onBackup", 239, "BugleBackupAgent.java")).q("onBackup finished.");
            } else {
                ensk h9 = a.h();
                h9.Y(ente.a, "BugleBackup");
                ((enrr) ((enrr) h9).h("com/google/android/apps/messaging/backup/BugleBackupAgent", "onBackup", 241, "BugleBackupAgent.java")).q("onBackup finished.");
            }
            throw th;
        }
    }

    @Override // defpackage.dlpc, android.app.backup.BackupAgentHelper, android.app.backup.BackupAgent
    public final void onRestore(BackupDataInput backupDataInput, int i, ParcelFileDescriptor parcelFileDescriptor) {
        List notificationChannels;
        List notificationChannels2;
        String group;
        String id;
        super.onRestore(backupDataInput, i, parcelFileDescriptor);
        l();
        this.p.a(3);
        l();
        ensk h = a.h();
        h.Y(ente.a, "BugleBackup");
        ((enrr) ((enrr) h).h("com/google/android/apps/messaging/backup/BugleBackupAgent", "restoreNotificationChannels", 558, "BugleBackupAgent.java")).q("Restoring notification channels.");
        if (this.m.f() != null) {
            cthp cthpVar = this.m;
            notificationChannels = ((NotificationManager) cthpVar.a.b()).getNotificationChannels();
            if (notificationChannels != null) {
                notificationChannels2 = ((NotificationManager) cthpVar.a.b()).getNotificationChannels();
                ArrayList arrayList = new ArrayList(notificationChannels2);
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    NotificationChannel m = akb$$ExternalSyntheticApiModelOutline0.m(arrayList.get(i2));
                    group = m.getGroup();
                    if (TextUtils.equals(group, ctho.CONVERSATIONS.e)) {
                        NotificationManager notificationManager = (NotificationManager) cthpVar.a.b();
                        id = m.getId();
                        notificationManager.deleteNotificationChannel(id);
                    }
                }
            }
        } else if (this.b.q(getString(R.string.notifications_enabled_pref_key), getResources().getBoolean(R.bool.notifications_enabled_pref_default))) {
            this.m.b(this.n.c(), this.b.f(getString(R.string.notification_sound_pref_key), null));
        }
        if (this.b.q(getString(R.string.cms_d2d_flag_pref_key), false)) {
            this.e.P();
            enru enruVar = a;
            ensk h2 = enruVar.h();
            h2.Y(ente.a, "BugleBackup");
            ((enrr) ((enrr) h2).h("com/google/android/apps/messaging/backup/BugleBackupAgent", "restorePriorToCmsGaiaId", 511, "BugleBackupAgent.java")).q("Restoring gaia Id.");
            String f = this.b.f(getString(R.string.bnr_gaia_account_user_id_pref_key), null);
            if (f != null) {
                this.e.ag(f);
            }
            ensk h3 = enruVar.h();
            h3.Y(ente.a, "BugleBackup");
            ((enrr) ((enrr) h3).h("com/google/android/apps/messaging/backup/BugleBackupAgent", "restorePriorToDeviceId", 520, "BugleBackupAgent.java")).q("Restoring priorToDeviceId.");
            String f2 = this.b.f(getString(R.string.prior_to_d2d_device_id_pref_key), null);
            if (f2 != null) {
                ensk h4 = enruVar.h();
                h4.Y(ente.a, "BugleBackup");
                ((enrr) ((enrr) h4).h("com/google/android/apps/messaging/backup/BugleBackupAgent", "restorePriorToDeviceId", 524, "BugleBackupAgent.java")).t("Restoring priorToDeviceId with device id: %s", f2);
                this.e.ah(f2);
            } else {
                ensk h5 = enruVar.h();
                h5.Y(ente.a, "BugleBackup");
                ((enrr) ((enrr) h5).h("com/google/android/apps/messaging/backup/BugleBackupAgent", "restorePriorToDeviceId", 529, "BugleBackupAgent.java")).q("Device Id is empty. Skipping restoring of priorToD2dDeviceId");
            }
            m();
        }
        if (!this.q.a() || Build.VERSION.SDK_INT < 28) {
            return;
        }
        ekzm b2 = this.s.b("restoreCmsSettingsToPreferences");
        try {
            enru enruVar2 = a;
            ensk h6 = enruVar2.h();
            h6.Y(ente.a, "BugleBackup");
            ((enrr) ((enrr) h6).h("com/google/android/apps/messaging/backup/BugleBackupAgent", "restoreLinkedAccount", 583, "BugleBackupAgent.java")).q("Restoring linked account.");
            final String f3 = this.b.f(getString(R.string.bnr_gaia_account_user_id_pref_key), null);
            axnw.h(f3 != null ? elfl.g(this.i.f()).h(new emwl() { // from class: sob
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    for (eixn eixnVar : (List) obj) {
                        String str = f3;
                        if (eixnVar.b().c.equals(str) && eixnVar.b().k.equals("google")) {
                            BugleBackupAgent bugleBackupAgent = BugleBackupAgent.this;
                            ensk h7 = BugleBackupAgent.a.h();
                            h7.Y(ente.a, "BugleBackup");
                            ((enrr) ((enrr) h7).h("com/google/android/apps/messaging/backup/BugleBackupAgent", "restoreLinkedAccount", 593, "BugleBackupAgent.java")).q("Found account with matching userId");
                            bugleBackupAgent.d.c(eixnVar.a());
                            return null;
                        }
                    }
                    return null;
                }
            }, this.f) : elfo.e(null));
            ensk h7 = enruVar2.h();
            h7.Y(ente.a, "BugleBackup");
            ((enrr) ((enrr) h7).h("com/google/android/apps/messaging/backup/BugleBackupAgent", "restoreCmsEnabledStatuses", 606, "BugleBackupAgent.java")).q("Restoring cms enabled statuses.");
            axeu b3 = axeu.b(this.b.d(getString(R.string.bnr_enabled_status_pref_key), 0));
            if (b3 != null) {
                this.e.S(b3);
            }
            axeu b4 = axeu.b(this.b.d(getString(R.string.multi_device_enabled_status_pref_key), 0));
            if (b4 != null) {
                this.e.af(b4);
            }
            b2.close();
        } catch (Throwable th) {
            try {
                b2.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
