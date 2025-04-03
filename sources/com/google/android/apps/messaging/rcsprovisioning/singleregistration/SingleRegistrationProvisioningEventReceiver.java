package com.google.android.apps.messaging.rcsprovisioning.singleregistration;

import android.content.Context;
import android.content.Intent;
import com.google.android.ims.util.common.RcsIntents;
import defpackage.ajnx;
import defpackage.ajnz;
import defpackage.ajoa;
import defpackage.ajof;
import defpackage.ajoj;
import defpackage.csjy;
import defpackage.dktx;
import defpackage.dkty;
import defpackage.ekzm;
import defpackage.elbx;
import defpackage.elfl;
import defpackage.elfo;
import defpackage.enrr;
import defpackage.ensk;
import defpackage.ente;
import defpackage.ffbr;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class SingleRegistrationProvisioningEventReceiver extends ajnz {
    public ffbr a;
    public ffbr b;

    @Override // defpackage.cniz
    public final ekzm a() {
        return ((elbx) this.a.b()).b("SingleRegistrationProvisioningEventReceiver Receive broadcast");
    }

    @Override // defpackage.cniz
    public final String b() {
        return "Bugle.Broadcast.SingleRegistrationProvisioningEventReceiver.Latency";
    }

    @Override // defpackage.cniz
    protected final int e() {
        return 14;
    }

    @Override // defpackage.cnhy
    protected final String f() {
        return null;
    }

    @Override // defpackage.cnhy
    protected final elfl j(Context context, Intent intent) {
        if (dkty.c <= 3) {
            dkty.c("[SR]: SingleRegistrationProvisioningInfoEvent intent details:\n%s", dktx.GENERIC.c("SingleRegistration provisioning intent details:" + String.format("\ntype: %s", intent.getType()) + String.format("\nextras: %s", csjy.a(intent))));
        }
        try {
            ajoa.a(intent, RcsIntents.ACTION_RCS_SINGLE_REGISTRATION_PROVISIONING_EVENT);
            ajoa.b(intent, RcsIntents.EXTRA_SIM_ID);
            String stringExtra = intent.getStringExtra(RcsIntents.EXTRA_SIM_ID);
            stringExtra.getClass();
            ajoa.b(intent, RcsIntents.EXTRA_SUB_ID);
            int intExtra = intent.getIntExtra(RcsIntents.EXTRA_SUB_ID, -1);
            boolean booleanExtra = intent.getBooleanExtra(RcsIntents.EXTRA_SETUP_VENDOR_IMS, false);
            ensk e = ajoj.d.e();
            e.Y(ente.a, "BugleRcsEngine");
            ((enrr) ((enrr) e).h("com/google/android/apps/messaging/rcsprovisioning/singleregistration/SingleRegistrationProvisioningEventInfo", "fromIntent", 57, "SingleRegistrationProvisioningEventInfo.java")).J("[SR]: Received SingleRegistrationProvisioningEvent intent with simId: %s, subId: %d, shouldSetupVendorIms: %b", dktx.SIM_ID.c(stringExtra), Integer.valueOf(intExtra), Boolean.valueOf(booleanExtra));
            return ((ajof) this.b.b()).a(new ajnx(stringExtra, intExtra, booleanExtra));
        } catch (ajoa e2) {
            dkty.i(e2, "[SR]: Failed to parse an incoming intent.", new Object[0]);
            return elfo.e(null);
        }
    }
}
