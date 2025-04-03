package defpackage;

import android.content.Context;
import android.content.Intent;
import android.telephony.ims.ImsException;
import android.telephony.ims.ProvisioningManager;
import android.telephony.ims.RcsClientConfiguration;
import com.google.android.ims.util.common.RcsIntents;
import j$.util.function.Consumer$CC;
import java.util.UUID;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckgt implements ckgc {
    static final emyl a = cfvl.x(202332654, "enable_vendor_ims_master_switch_broadcast");
    public static final cskc b = cskc.g("BugleRcsProvisioning", "SingleRegistrationVendorImsAvailabilityNotifier");
    static final cfup c = cfvl.e(cfvl.b, "single_registration_vendor_ims_availability_notifier_debounce_millis", 50);
    private final Context d;
    private final ckgs e;
    private final akzt f;
    private final djqu g;

    public ckgt(Context context, ckgs ckgsVar, akzt akztVar, djqu djquVar) {
        this.d = context;
        this.e = ckgsVar;
        this.f = akztVar;
        this.g = djquVar;
    }

    private static boolean b(ckgd ckgdVar) {
        return ckgb.USER_SETTING_ENABLED.equals(ckgdVar.a());
    }

    public final void a(ckgd ckgdVar) {
        int intValue = ((Integer) ckgdVar.d().get()).intValue();
        boolean b2 = b(ckgdVar);
        if (!ctid.f) {
            csjb a2 = b.a();
            a2.I("[SR]: broadcasting RCS master switch change event to VendorIMS");
            a2.B("isEnabled", b2);
            a2.m(intValue);
            a2.r();
            Intent intent = new Intent(RcsIntents.ACTION_TOGGLE_RCS_MASTER_SWITCH);
            intent.putExtra(RcsIntents.EXTRA_SUBSCRIPTION_ID, intValue);
            intent.putExtra(RcsIntents.EXTRA_RCS_MASTER_SWITCH_STATE, b2 ? 1 : 0);
            this.d.sendBroadcast(intent, "android.permission.READ_PRIVILEGED_PHONE_STATE");
            this.f.c("Bugle.RcsEngine.SingleRegistration.VendorImsMasterSwitchBroadcast.Count");
            return;
        }
        if (b2) {
            return;
        }
        try {
            ProvisioningManager a3 = this.g.a(intValue);
            RcsClientConfiguration rcsClientConfiguration = new RcsClientConfiguration(dizg.t(), dizg.s(), dizg.q(), dizg.r(), false);
            csjb a4 = b.a();
            a4.I("[SR]: disabling RCS by setting RCS configuration using ProvisioningManager");
            a4.m(intValue);
            a4.r();
            a3.setRcsClientConfiguration(rcsClientConfiguration);
        } catch (ImsException e) {
            b.o("[SR]: ImsException caught while setting RCS client configuration", e);
        }
    }

    @Override // defpackage.ckgc
    public final void al(final ckgd ckgdVar) {
        if (((Boolean) ((cfup) a.get()).e()).booleanValue()) {
            ckgdVar.d().isPresent();
            if (ckgb.USER_SETTING_DISABLED.equals(ckgdVar.a()) || b(ckgdVar)) {
                final ckgs ckgsVar = this.e;
                final Runnable runnable = new Runnable() { // from class: ckgo
                    @Override // java.lang.Runnable
                    public final void run() {
                        ckgt.this.a(ckgdVar);
                    }
                };
                final ckfa ckfaVar = new ckfa(ckgdVar, ckgsVar.c.f().toEpochMilli(), UUID.randomUUID());
                elfo.f(new Runnable() { // from class: ckgp
                    @Override // java.lang.Runnable
                    public final void run() {
                        ckgs ckgsVar2 = ckgs.this;
                        ckgr ckgrVar = (ckgr) ckgsVar2.b.get();
                        ckgr ckgrVar2 = ckfaVar;
                        if (ckgrVar != null) {
                            ckfa ckfaVar2 = (ckfa) ckgrVar2;
                            emxf.b(ckgrVar.a() <= ckfaVar2.b, "prevExecution should not have a later trigger time than nextExecution");
                            long a2 = ckfaVar2.b - ckgrVar.a();
                            long intValue = ((Integer) ckgt.c.e()).intValue();
                            if (ckgrVar.b().equals(ckfaVar2.a) && a2 <= intValue) {
                                csjb e = ckgt.b.e();
                                e.I("[SR]: skipping processing duplicate RcsAvailabilityUpdate");
                                e.A("execId", ckfaVar2.c);
                                e.r();
                                return;
                            }
                        }
                        Runnable runnable2 = runnable;
                        csjb c2 = ckgt.b.c();
                        c2.I("[SR]: processing RcsAvailabilityUpdate for VendorIms broadcast");
                        c2.A("execId", ((ckfa) ckgrVar2).c);
                        c2.r();
                        runnable2.run();
                        ckgsVar2.b.set(ckgrVar2);
                    }
                }, ckgsVar.a).k(axnw.c(new Consumer() { // from class: ckgq
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj) {
                        csjb a2 = ckgt.b.a();
                        a2.I("[SR]: completed future for RcsAvailabilityUpdate");
                        a2.A("execId", ((ckfa) ckgr.this).c);
                        a2.r();
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                }), erpp.a);
            }
        }
    }
}
