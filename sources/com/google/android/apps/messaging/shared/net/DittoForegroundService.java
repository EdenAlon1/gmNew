package com.google.android.apps.messaging.shared.net;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.net.DittoForegroundService;
import com.google.android.apps.messaging.ui.ditto.DittoActivity;
import com.google.android.apps.messaging.ui.gaia.GaiaDittoActivity;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.akuv;
import defpackage.albq;
import defpackage.axnw;
import defpackage.bzgw;
import defpackage.cgcv;
import defpackage.cgww;
import defpackage.cgya;
import defpackage.chhm;
import defpackage.ciph;
import defpackage.cskc;
import defpackage.cthp;
import defpackage.ctid;
import defpackage.enru;
import defpackage.eroh;
import defpackage.erpp;
import defpackage.ffbr;
import defpackage.klz;
import defpackage.kma;
import defpackage.kml;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.concurrent.Executor;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class DittoForegroundService extends cgya {
    public static final cskc a = cskc.g("BugleServices", "DittoForegroundService");
    public static final enru b = enru.c("com/google/android/apps/messaging/shared/net/DittoForegroundService");
    public cthp c;
    public ffbr d;
    public ffbr e;
    public ffbr f;
    public ffbr g;
    public ffbr h;
    public ffbr i;
    public ffbr j;
    private boolean k;

    public static Intent a(Context context) {
        return akuv.c(context, DittoForegroundService.class, "android.intent.action.VIEW").a();
    }

    public final void b(Optional optional) {
        String id;
        if (optional.isEmpty()) {
            a.r("Intent not available");
            return;
        }
        id = this.c.a().getId();
        klz klzVar = new klz(R.drawable.quantum_ic_phonelink_off_black_18, getString(R.string.ditto_foreground_service_sign_out), (PendingIntent) optional.get());
        klzVar.d = true;
        kma a2 = klzVar.a();
        CharSequence text = getText(R.string.ditto_foreground_service_device_pairing_notification_title);
        CharSequence text2 = getText(R.string.ditto_foreground_service_device_pairing_notification_text);
        kml kmlVar = new kml(this, id);
        kmlVar.i(text);
        kmlVar.h(text2);
        kmlVar.r(R.drawable.quantum_ic_phonelink_white_24);
        kmlVar.l = 0;
        kmlVar.g = (PendingIntent) optional.get();
        if (ctid.b) {
            kmlVar.e(a2);
        }
        startForeground(1, kmlVar.a());
        ((albq) this.f.b()).b("Bugle.Ditto.Notification.Foreground.Duration");
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return new cgww();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        a.m("Destroying DittoForegroundService...");
        this.k = false;
        ((albq) this.f.b()).n("Bugle.Ditto.Notification.Foreground.Duration");
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        if (this.k) {
            return 2;
        }
        if (((Optional) this.d.b()).isEmpty()) {
            a.r("DittoForegroundService is not available in this device");
            return 2;
        }
        if (((Boolean) cgcv.a.e()).booleanValue() && ((Optional) this.g.b()).isPresent()) {
            axnw.i(((bzgw) this.h.b()).b().i(new eroh() { // from class: cgwu
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    bzgu bzguVar = (bzgu) obj;
                    boolean z = bzguVar.c;
                    String str = bzguVar.d;
                    final DittoForegroundService dittoForegroundService = DittoForegroundService.this;
                    if (!z || emxe.c(str)) {
                        return elfo.e(((ciph) dittoForegroundService.e.b()).c(dittoForegroundService));
                    }
                    ((enrr) ((enrr) DittoForegroundService.b.e()).h("com/google/android/apps/messaging/shared/net/DittoForegroundService", "getPendingIntentForManagingPairedDevices", 187, "DittoForegroundService.java")).q("Gaia device pairing is available");
                    return elfl.g(((ejar) dittoForegroundService.i.b()).c(str)).h(new emwl() { // from class: cgwr
                        @Override // defpackage.emwl
                        public final Object apply(Object obj2) {
                            return Optional.of((eisx) obj2);
                        }
                    }, erpp.a).e(eizq.class, new emwl() { // from class: cgws
                        @Override // defpackage.emwl
                        public final Object apply(Object obj2) {
                            return Optional.empty();
                        }
                    }, erpp.a).h(new emwl() { // from class: cgwt
                        @Override // defpackage.emwl
                        public final Object apply(Object obj2) {
                            Intent a2;
                            Optional optional = (Optional) obj2;
                            if (optional.isEmpty()) {
                                ((enrr) ((enrr) DittoForegroundService.b.j()).h("com/google/android/apps/messaging/shared/net/DittoForegroundService", "getPendingIntentForManagingPairedDevices", 198, "DittoForegroundService.java")).q("Not able to get accountId when generating Gaia device pairing notification");
                            } else {
                                ((enrr) ((enrr) DittoForegroundService.b.e()).h("com/google/android/apps/messaging/shared/net/DittoForegroundService", "getPendingIntentForManagingPairedDevices", BasePaymentResult.ERROR_REQUEST_CONNECTION_FAILED, "DittoForegroundService.java")).q("Retrieved accountId when generating Gaia device pairing notification");
                            }
                            DittoForegroundService dittoForegroundService2 = DittoForegroundService.this;
                            optional.getClass();
                            if (((Boolean) cgcv.a.e()).booleanValue() && optional.isPresent()) {
                                a2 = akuv.c(dittoForegroundService2, GaiaDittoActivity.class, "android.intent.action.VIEW").a();
                                eiuy.c(a2, (eisx) optional.get());
                            } else {
                                a2 = akuv.c(dittoForegroundService2, DittoActivity.class, "android.intent.action.VIEW").a();
                            }
                            a2.putExtra("started_from_notification", true);
                            return Optional.ofNullable(eepf.a(dittoForegroundService2, -1, a2, ctie.a(VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS)));
                        }
                    }, erpp.a);
                }
            }, (Executor) this.j.b()), new Consumer() { // from class: cgwv
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    DittoForegroundService.this.b((Optional) obj);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            }, erpp.a);
        } else {
            b(((ciph) this.e.b()).c(this));
        }
        ((chhm) ((Optional) this.d.b()).get()).c();
        this.k = true;
        return 2;
    }
}
