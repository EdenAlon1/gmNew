package com.google.android.apps.messaging.shared.receiver;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.messaging.shared.receiver.RcsProvisioningEventReceiver;
import com.google.android.ims.util.common.RcsIntents;
import defpackage.alhk;
import defpackage.alwu;
import defpackage.ckds;
import defpackage.ckge;
import defpackage.cmfj;
import defpackage.cnft;
import defpackage.csjb;
import defpackage.csjk;
import defpackage.cskc;
import defpackage.ctud;
import defpackage.ctyx;
import defpackage.ctyz;
import defpackage.cuai;
import defpackage.diuo;
import defpackage.djro;
import defpackage.djtb;
import defpackage.dkvj;
import defpackage.efbd;
import defpackage.ekzm;
import defpackage.elbx;
import defpackage.eldl;
import defpackage.enrr;
import defpackage.enru;
import defpackage.eqwf;
import defpackage.eyfc;
import defpackage.eyfy;
import defpackage.eygu;
import defpackage.fazb;
import defpackage.ffbr;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class RcsProvisioningEventReceiver extends cnft {
    private static final cskc k = cskc.g("BugleRcsProvisioning", "RcsProvisioningEventReceiver");
    private static final enru l = enru.c("com/google/android/apps/messaging/shared/receiver/RcsProvisioningEventReceiver");
    public ffbr a;
    public ffbr b;
    public ffbr c;
    public ffbr d;
    public ffbr e;
    public fazb f;
    public ffbr g;
    public ffbr h;
    public ffbr i;
    public ffbr j;

    @Override // defpackage.cniz
    public final ekzm a() {
        return ((elbx) this.g.b()).b("RcsProvisioningEventReceiver Receive broadcast");
    }

    @Override // defpackage.cniz
    public final String b() {
        return "Bugle.Broadcast.ProvisioningEvent.Latency";
    }

    @Override // defpackage.cniz
    protected final int e() {
        return 4;
    }

    @Override // defpackage.cnhy
    protected final String f() {
        return "Bugle.Broadcast.ForegroundService.ProvisioningEvent.Latency";
    }

    @Override // defpackage.cnhy
    protected final void g(Context context, Intent intent) {
        if (!((ckds) this.e.b()).C(intent)) {
            k.r("ProvisioningEvent not from an authorized source.");
        }
        if ("com.google.android.ims.provisioning.engine.provisioningEventAction".equals(intent.getAction())) {
            int intExtra = intent.getIntExtra("com.google.android.ims.provisioning.engine.provisioning_event_code_key", -1);
            Bundle bundleExtra = intent.getBundleExtra("com.google.android.ims.provisioning.engine.provisioning_event_bundle_key");
            cskc cskcVar = k;
            csjb c = cskcVar.c();
            c.A("Received ProvisioningEvent", djtb.a(intExtra));
            c.r();
            if (intExtra == 0) {
                context.sendBroadcast(new Intent(RcsIntents.ACTION_NOTIFY_RECEIVED_RCS_PROMO_REQUEST));
                return;
            }
            if (intExtra == 3) {
                if (bundleExtra == null) {
                    cskcVar.n("No extras for ProvisioningEvent.PROVISIONING_WELCOME_MESSAGE_KEY");
                    return;
                }
                byte[] byteArray = bundleExtra.getByteArray("com.google.android.ims.provisioning.enginge.welcome_message");
                if (byteArray == null) {
                    cskcVar.n("Message is not set for ProvisioningEvent.PROVISIONING_WELCOME_MESSAGE_KEY");
                    return;
                }
                try {
                    diuo diuoVar = (diuo) eyfy.parseFrom(diuo.a, byteArray, eyfc.a());
                    String string = bundleExtra.getString("com.google.android.ims.provisioning.sim.id.key");
                    if (string == null) {
                        ((enrr) ((enrr) l.i()).h("com/google/android/apps/messaging/shared/receiver/RcsProvisioningEventReceiver", "handleProvisioningEvent", 199, "RcsProvisioningEventReceiver.java")).q("simId is not set for ProvisioningEvent.PROVISIONING_EVENT_WELCOME_MESSAGE");
                        return;
                    } else {
                        ((cmfj) this.j.b()).h(new djro(string), diuoVar);
                        context.sendBroadcast(new Intent(RcsIntents.ACTION_NOTIFY_RECEIVED_PROVISIONING_WELCOME_MESSAGE));
                        return;
                    }
                } catch (eygu e) {
                    k.o("Unable to parse Welcome Message", e);
                    return;
                }
            }
            int i = 1;
            if (intExtra == 5) {
                ((ctyx) this.a.b()).h("should_show_google_tos_prompt", true);
                context.sendBroadcast(new Intent(RcsIntents.ACTION_NOTIFY_RECEIVED_GOOGLE_TOS_REQUEST));
                return;
            }
            if (intExtra == 9) {
                byte[] byteArray2 = bundleExtra != null ? bundleExtra.getByteArray("com.google.android.ims.provisioning.enginge.provisioning_alert_server_message") : null;
                if (byteArray2 == null) {
                    cskcVar.n("BugleServerMessage was not set for ProvisioningEvent.PROVISIONING_EVENT_TERMS_AND_CONDITIONS, can not set Terms and Conditions message.");
                    return;
                }
                try {
                    diuo diuoVar2 = (diuo) eyfy.parseFrom(diuo.a, byteArray2);
                    String string2 = bundleExtra.getString("com.google.android.ims.provisioning.sim.id.key");
                    if (string2 == null) {
                        ((enrr) ((enrr) l.i()).h("com/google/android/apps/messaging/shared/receiver/RcsProvisioningEventReceiver", "handleProvisioningEvent", 165, "RcsProvisioningEventReceiver.java")).q("simId is not set for ProvisioningEvent.PROVISIONING_EVENT_TERMS_AND_CONDITIONS");
                        return;
                    } else {
                        ((cmfj) this.j.b()).g(new djro(string2), diuoVar2);
                        context.sendBroadcast(new Intent(RcsIntents.ACTION_NOTIFY_RECEIVED_CARRIER_TOS_REQUEST));
                        return;
                    }
                } catch (eygu e2) {
                    csjb b = k.b();
                    b.I("Unable to parse Terms and Conditions BugleServerMessage from PEv2, event will be ignored");
                    b.s(e2);
                    return;
                }
            }
            if (intExtra == 15) {
                ((ckds) this.e.b()).t();
                return;
            }
            if (intExtra == 18) {
                if (bundleExtra == null) {
                    cskcVar.n("No extras for ProvisioningEvent.PROVISIONING_EVENT_SESSION_ID");
                    return;
                } else {
                    ((ctyx) this.a.b()).l("provisioning_session_id", bundleExtra.getString("com.google.android.ims.provisioning.session.id.key"));
                    return;
                }
            }
            int i2 = 0;
            if (intExtra == 22) {
                ctyx ctyxVar = (ctyx) ((cuai) this.h.b()).a.b();
                ctyxVar.n("rcs_tos_state");
                ctyxVar.h("fast_track_prompt_dismissed", false);
                ctyxVar.h("did_show_google_tos_prompt", false);
                ((ctyx) this.a.b()).h("should_show_google_tos_prompt", true);
                context.sendBroadcast(new Intent(RcsIntents.ACTION_NOTIFY_RECEIVED_GOOGLE_TOS_REQUEST));
                return;
            }
            if (intExtra == 24) {
                ((ctyx) this.a.b()).h("should_show_rcs_default_on_prompt", true);
                context.sendBroadcast(new Intent(RcsIntents.ACTION_NOTIFY_RECEIVED_LEGAL_FYI_REQUEST));
                return;
            }
            switch (intExtra) {
                case 11:
                    if (bundleExtra != null) {
                        int i3 = new int[]{1, 2, 3, 4}[bundleExtra.getInt("com.google.android.ims.provisioning.engine.update_provisioning_status_key")];
                        ctyz ctyzVar = (ctyz) this.b.b();
                        if (i3 != 0) {
                            i = i3;
                            i2 = i;
                        }
                        ctyzVar.a.j("rcs_provisioning_status_pev2", i - 1);
                        if (i2 == 3 || i2 == 4) {
                            alhk alhkVar = (alhk) this.c.b();
                            long longValue = dkvj.a().longValue();
                            if (!alhkVar.f().isPresent()) {
                                alhkVar.a.k("first_rcs_eligibility_time", longValue);
                            }
                        }
                        if (i2 == 4) {
                            alhk alhkVar2 = (alhk) this.c.b();
                            long longValue2 = dkvj.a().longValue();
                            if (!alhkVar2.d().isPresent()) {
                                alhkVar2.a.k("first_time_rcs_provisioned_millis", longValue2);
                                break;
                            }
                        }
                    } else {
                        cskcVar.n("No extras for ProvisioningEvent.PROVISIONING_EVENT_UPDATE_PROVISIONING_STATUS");
                        break;
                    }
                    break;
                case 12:
                    if (bundleExtra != null) {
                        eqwf b2 = eqwf.b(bundleExtra.getInt("com.google.android.ims.provisioning.rcs.availability.update.key"));
                        if (bundleExtra.getString("com.google.android.ims.provisioning.sim.id.key") != null) {
                            Optional.ofNullable(bundleExtra.getString("com.google.android.ims.provisioning.sim.iccid.key"));
                            csjb c2 = cskcVar.c();
                            c2.A("Bugle receives rcs availability update to", b2);
                            c2.r();
                            if (((ctud) this.i.b()).l()) {
                                ((alwu) this.f.b()).c(b2);
                            }
                            ((ckge) ((csjk) this.d.b()).a()).y();
                            break;
                        } else {
                            cskcVar.n("simId is not set for ProvisioningEvent.PROVISIONING_EVENT_RCS_AVAILABILITY_UPDATED");
                            break;
                        }
                    } else {
                        cskcVar.n("No extras for ProvisioningEvent.PROVISIONING_EVENT_RCS_AVAILABILITY_UPDATED");
                        break;
                    }
                case 13:
                    efbd.e(eldl.l(new Runnable() { // from class: cngq
                        @Override // java.lang.Runnable
                        public final void run() {
                            ((ckge) ((csjk) RcsProvisioningEventReceiver.this.d.b()).a()).k();
                        }
                    }));
                    break;
                default:
                    cskcVar.n("Unknown provisioning event " + String.valueOf(intent.getSerializableExtra("com.google.android.ims.provisioning.engine.provisioning_event_code_key")) + " possible version mismatch?");
                    break;
            }
        }
    }

    @Override // defpackage.cnhy
    public final boolean i(Intent intent) {
        return true;
    }
}
