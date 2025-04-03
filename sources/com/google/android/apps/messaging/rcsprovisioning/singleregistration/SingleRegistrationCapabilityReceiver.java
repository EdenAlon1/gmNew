package com.google.android.apps.messaging.rcsprovisioning.singleregistration;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.messaging.rcsprovisioning.singleregistration.SingleRegistrationCapabilityReceiver;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.ajnw;
import defpackage.ajny;
import defpackage.ajoa;
import defpackage.ajob;
import defpackage.ajoz;
import defpackage.axnw;
import defpackage.cfud;
import defpackage.ckgb;
import defpackage.ckge;
import defpackage.cmne;
import defpackage.csjk;
import defpackage.cuae;
import defpackage.dizg;
import defpackage.djqz;
import defpackage.dkpm;
import defpackage.dkty;
import defpackage.ekzm;
import defpackage.elbx;
import defpackage.elfo;
import defpackage.enrr;
import defpackage.ensk;
import defpackage.ente;
import defpackage.eqws;
import defpackage.eroh;
import defpackage.eyxa;
import defpackage.ffbr;
import j$.util.Optional;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class SingleRegistrationCapabilityReceiver extends ajny {
    public ffbr a;
    public ffbr b;
    public ffbr c;
    public ffbr d;
    public ffbr e;
    public ffbr f;
    public ffbr g;
    public ffbr h;
    public ffbr i;

    @Override // defpackage.cniz
    public final ekzm a() {
        return ((elbx) this.a.b()).b("SingleRegistrationCapabilityReceiver Receive broadcast");
    }

    @Override // defpackage.cniz
    public final String b() {
        return "Bugle.Broadcast.SingleRegistrationCapabilityReceiver.Latency";
    }

    @Override // defpackage.cniz
    public final void c(Context context, Intent intent) {
        dkty.k("[SR]: Single Registration Capability Intent received!", new Object[0]);
        try {
            ajoa.a(intent, "android.telephony.ims.action.RCS_SINGLE_REGISTRATION_CAPABILITY_UPDATE");
            ajoa.b(intent, "android.telephony.ims.extra.STATUS");
            ajoa.b(intent, "android.telephony.ims.extra.SUBSCRIPTION_ID");
            int intExtra = intent.getIntExtra("android.telephony.ims.extra.SUBSCRIPTION_ID", 0);
            int intExtra2 = intent.getIntExtra("android.telephony.ims.extra.STATUS", 1);
            int i = intExtra2 != 0 ? intExtra2 != 1 ? intExtra2 != 2 ? 1 : 4 : 3 : 2;
            ensk e = ajob.d.e();
            e.Y(ente.a, "BugleRcsEngine");
            ((enrr) ((enrr) e).h("com/google/android/apps/messaging/rcsprovisioning/singleregistration/SingleRegistrationCapabilityInfo", "fromIntent", 53, "SingleRegistrationCapabilityInfo.java")).w("[SR]: Received intent with subId: %d and status: %s", intExtra, i != 1 ? i != 2 ? i != 3 ? "STATUS_CARRIER_NOT_CAPABLE" : "STATUS_DEVICE_NOT_CAPABLE" : "STATUS_CAPABLE" : "STATUS_UNKNOWN");
            ajnw ajnwVar = new ajnw(intExtra, i, i == 2);
            int a = ((dkpm) this.d.b()).a(context);
            boolean z = a == ajnwVar.a;
            ((djqz) this.f.b()).b(ajnwVar.c, z, !dizg.G());
            if (!z) {
                dkty.q("[SR]: The subscriptionId in the received ACTION_RCS_SINGLE_REGISTRATION_CAPABILITY_UPDATE intent: %d is different than the Call SIM's subscriptionId: %d. The provisioning process will not be started.", Integer.valueOf(ajnwVar.a), Integer.valueOf(a));
                return;
            }
            ((cfud) this.h.b()).b(context, cuae.PHENOTYPE_REGISTRATION_TRIGGER_SINGLE_REGISTRATION_CAPABILITY_UPDATE);
            ((ckge) ((csjk) this.c.b()).a()).o(ckgb.SINGLE_REGISTRATION_CAPABILITY_UPDATE);
            if (ajnwVar.b) {
                final int i2 = ajnwVar.a;
                axnw.h(((cmne) this.g.b()).a(eqws.SINGLE_REGISTRATION_CAPABILITY_UPDATE).i(new eroh() { // from class: ajod
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj) {
                        return ((ajoz) SingleRegistrationCapabilityReceiver.this.e.b()).a(i2, eyxa.TRIGGER_SINGLE_REGISTRATION_CAPABILITY_UPDATE_INTENT);
                    }
                }, (Executor) this.b.b()));
            } else {
                final int i3 = ajnwVar.a;
                final ajoz ajozVar = (ajoz) this.e.b();
                final eyxa eyxaVar = eyxa.TRIGGER_SINGLE_REGISTRATION_CAPABILITY_UPDATE_INTENT;
                dkty.d(ajoz.a, "[SR]: Enabled to run VendorImsCallQueue:cancelAllPending asynchronously", new Object[0]);
                axnw.h(elfo.f(new Runnable() { // from class: ajow
                    @Override // java.lang.Runnable
                    public final void run() {
                        ajoz ajozVar2 = ajoz.this;
                        ajozVar2.c.a();
                        ((ajon) ajozVar2.b.b()).a();
                    }
                }, (Executor) ajozVar.d.b()).i(new eroh() { // from class: ajox
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj) {
                        return ajoz.this.b(i3, eyxc.OPERATION_TYPE_TERMINATE_VENDOR_IMS, eyxaVar);
                    }
                }, (Executor) ajozVar.d.b()).i(new eroh() { // from class: ajoc
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj) {
                        ((cmne) SingleRegistrationCapabilityReceiver.this.g.b()).j(eqws.SINGLE_REGISTRATION_CAPABILITY_UPDATE);
                        return elfo.e(Optional.empty());
                    }
                }, (Executor) this.b.b()));
            }
        } catch (ajoa e2) {
            dkty.i(e2, "[SR]: Failed to parse an incoming intent to SingleRegistrationCapabilityInfo.", new Object[0]);
            ((djqz) this.f.b()).a();
        }
    }

    @Override // defpackage.cniz
    protected final int e() {
        return 13;
    }
}
