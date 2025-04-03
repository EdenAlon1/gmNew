package com.google.android.apps.messaging.rcsprovisioning;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.ims.util.common.RcsIntents;
import defpackage.ajnt;
import defpackage.asvc;
import defpackage.asve;
import defpackage.axnw;
import defpackage.cevh;
import defpackage.ceyr;
import defpackage.ckaj;
import defpackage.cmne;
import defpackage.cmqc;
import defpackage.cmqd;
import defpackage.cmqe;
import defpackage.csjb;
import defpackage.csjc;
import defpackage.cskc;
import defpackage.ctid;
import defpackage.ekzm;
import defpackage.elbx;
import defpackage.enrr;
import defpackage.enru;
import defpackage.ensk;
import defpackage.ente;
import defpackage.eqws;
import defpackage.ffbr;
import j$.lang.Iterable$EL;
import j$.time.Duration;
import j$.util.Objects;
import j$.util.function.Consumer$CC;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class RcsProvisioningBroadcastReceiver extends ajnt {
    private static final cskc i = cskc.g("Bugle", "RcsProvisioningBroadcastReceiver");
    private static final enru j = enru.c("com/google/android/apps/messaging/rcsprovisioning/RcsProvisioningBroadcastReceiver");
    public ffbr a;
    public ffbr b;
    public ffbr c;
    public ffbr d;
    public ffbr e;
    public ffbr f;
    public ffbr g;
    public ffbr h;

    private static String m(Intent intent) {
        return o(intent, RcsIntents.EXTRA_PREVIOUS_SIM_ID);
    }

    private static String n(Intent intent) {
        return o(intent, RcsIntents.EXTRA_SIM_ID);
    }

    private static String o(Intent intent, String str) {
        Bundle extras = intent.getExtras();
        return extras != null ? Objects.toString(extras.getString(str), "") : "";
    }

    @Override // defpackage.cniz
    public final ekzm a() {
        return ((elbx) this.a.b()).b("RcsProvisioningBroadcastReceiver Receive broadcast");
    }

    @Override // defpackage.cniz
    public final String b() {
        return "Bugle.Broadcast.Provisioning.Latency";
    }

    @Override // defpackage.cniz
    protected final int e() {
        return 17;
    }

    @Override // defpackage.cnhy
    protected final String f() {
        return "Bugle.Broadcast.ForegroundService.Provisioning.Latency";
    }

    @Override // defpackage.cnhy
    protected final void g(Context context, Intent intent) {
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            return;
        }
        if (RcsIntents.ACTION_RCS_CONFIG_REFRESH.equals(action)) {
            ((cmne) this.b.b()).e(n(intent), Duration.ZERO, eqws.CSLIB_PHENOTYPE_UPDATE);
            return;
        }
        if (((asve) this.g.b()).a() && action.equals("com.google.android.apps.messaging.ACTION_RCS_PROVISIONING")) {
            if (ctid.h) {
                ((ckaj) this.d.b()).g(intent.getIntExtra("sub_id", -1));
                return;
            }
            ensk h = j.h();
            h.Y(ente.a, "Bugle");
            ((enrr) ((enrr) h).h("com/google/android/apps/messaging/rcsprovisioning/RcsProvisioningBroadcastReceiver", "handleIntentProcessing", 138, "RcsProvisioningBroadcastReceiver.java")).q("RCS Provisioning cannot be scheduled for Fi sim with this intent because it is not supported on SDK versions less than U");
            return;
        }
        if (RcsIntents.ACTION_RCS_CANCEL_PROVISIONING_WORK.equals(action)) {
            ((cmne) this.b.b()).a(eqws.CSLIB_PHENOTYPE_UPDATE).k(axnw.b(), (Executor) this.c.b());
            return;
        }
        if (RcsIntents.ACTION_RCS_SIM_SWAP.equals(action)) {
            ((ckaj) this.d.b()).l(m(intent), n(intent));
            return;
        }
        if (action.equals(RcsIntents.ACTION_DEFAULT_VOICE_SIM_REMOVED)) {
            ((ckaj) this.d.b()).k(m(intent));
            return;
        }
        if (RcsIntents.ACTION_RCS_RECONFIGURATION_REQUIRED.equals(action)) {
            ((ckaj) this.d.b()).j(eqws.SIP_403_RESPONSE);
            return;
        }
        if (RcsIntents.ACTION_RCS_SYSTEM_BINDING.equals(action)) {
            Iterable$EL.forEach((Set) this.f.b(), new Consumer() { // from class: ajnu
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    ((dihl) obj).u();
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            return;
        }
        if (!action.equals(RcsIntents.ACTION_JIBE_DEPROVISION)) {
            if (action.equals(RcsIntents.ACTION_RCS_SIM_REMOVED)) {
                ((ckaj) this.d.b()).k(m(intent));
                return;
            }
            return;
        }
        csjb c = i.c();
        c.I("[SR]: Enqueueing UnregisterGoogleRcs Work Handler.");
        c.r();
        cmqe cmqeVar = (cmqe) this.e.b();
        cmqc cmqcVar = (cmqc) cmqd.a.createBuilder();
        int intExtra = intent.getIntExtra(RcsIntents.EXTRA_SUB_ID, -1);
        cmqcVar.copyOnWrite();
        cmqd cmqdVar = (cmqd) cmqcVar.instance;
        cmqdVar.b |= 1;
        cmqdVar.c = intExtra;
        String n = n(intent);
        cmqcVar.copyOnWrite();
        cmqd cmqdVar2 = (cmqd) cmqcVar.instance;
        n.getClass();
        cmqdVar2.b |= 2;
        cmqdVar2.d = n;
        ((cevh) cmqeVar.a.b()).a(ceyr.g("unregister_google_rcs_call", (cmqd) cmqcVar.build()));
    }

    @Override // defpackage.cnhy
    protected final boolean h(Context context, Intent intent) {
        String sentFromPackage;
        if (((asve) this.g.b()).a() && ((asvc) this.h.b()).a()) {
            String action = intent.getAction();
            if (TextUtils.isEmpty(action)) {
                return false;
            }
            if (action.equals("com.google.android.apps.messaging.ACTION_RCS_PROVISIONING") && ctid.h) {
                if (!csjc.h() && ((sentFromPackage = getSentFromPackage()) == null || !sentFromPackage.equals("com.google.android.apps.tycho"))) {
                    return false;
                }
                Bundle bundle = new Bundle();
                bundle.putBoolean("acknowledged_broadcast", true);
                setResultExtras(bundle);
            }
        }
        return true;
    }

    @Override // defpackage.cnhy
    public final boolean i(Intent intent) {
        return true;
    }
}
