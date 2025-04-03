package defpackage;

import android.content.Context;
import android.content.Intent;
import android.telephony.ims.ProvisioningManager;
import com.android.vcard.VCardConfig;
import com.google.android.ims.provisioning.config.Configuration;
import com.google.android.ims.provisioning.config.ImsConfiguration;
import com.google.android.ims.util.common.RcsIntents;
import j$.util.Map;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djrc extends ProvisioningManager.RcsProvisioningCallback {
    public final AtomicBoolean d = new AtomicBoolean(false);
    private final String f;
    private final dkcp g;
    private final dkbt h;
    private final Context i;
    private final djvk j;
    private final djra k;
    private final int l;
    private final dium m;
    private static final dktn e = new dktn("SingleRegistrationProvisioningListener[SR]");
    static final diyy a = dizd.a(190016284);
    static final diyy b = diyv.b("enable_single_reg_preprovisioning_without_tos");
    static final diyy c = diyv.b("disable_configuration_reset_on_callback_removed");

    public djrc(Context context, dkcp dkcpVar, dkbt dkbtVar, djvk djvkVar, dium diumVar, String str, int i, djra djraVar) {
        this.i = context;
        this.f = str;
        this.l = i;
        this.j = djvkVar;
        this.g = dkcpVar;
        this.m = diumVar;
        this.h = dkbtVar;
        this.k = djraVar;
    }

    private final void a() {
        this.g.t(this.f, null);
    }

    private final void b(boolean z) {
        Intent putExtra = new Intent(RcsIntents.ACTION_RCS_SINGLE_REGISTRATION_PROVISIONING_EVENT).putExtra(RcsIntents.EXTRA_SIM_ID, this.f).putExtra(RcsIntents.EXTRA_SUB_ID, this.l).putExtra(RcsIntents.EXTRA_SETUP_VENDOR_IMS, z);
        putExtra.setFlags(VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES);
        dkuk.b(this.i, putExtra, "com.google.android.apps.messaging.rcsprovisioning.singleregistration.SingleRegistrationProvisioningEventReceiver", dkuj.SINGLE_REGISTRATION_PROVISIONING_LISTENER);
        dkty.d(e, "RcsSingleRegistrationProvisioningEvent was sent for simId: %s, subId: %d, setupVendorIms: %b", dktx.SIM_ID.c(this.f), Integer.valueOf(this.l), Boolean.valueOf(z));
    }

    public final void onAutoConfigurationErrorReceived(int i, String str) {
        if (dizg.K() && this.g.A(this.f)) {
            dkty.r(e, "ignoring auto configuration error when SR is disabled: %d, %s", Integer.valueOf(i), str);
            return;
        }
        dkty.q("AutoConfiguration error received. Error Code: %d, Error Description: %s", Integer.valueOf(i), str);
        if (((Boolean) a.a()).booleanValue()) {
            this.k.c(i);
        }
    }

    public final void onConfigurationChanged(byte[] bArr) {
        if (dizg.K() && this.g.A(this.f)) {
            dkty.r(e, "ignoring RCS configuration update received when SR is disabled", new Object[0]);
            return;
        }
        dkty.l(e, "RCS configuration update is received.", new Object[0]);
        Configuration configuration = new Configuration();
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            Charset charset = StandardCharsets.UTF_8;
            ThreadLocal threadLocal = fhot.a;
            fhov fhovVar = new fhov();
            int i = fhoq.a;
            if (charset == null) {
                charset = Charset.defaultCharset();
            }
            InputStreamReader inputStreamReader = new InputStreamReader(byteArrayInputStream, charset);
            char[] cArr = (char[]) fhot.a.get();
            Arrays.fill(cArr, (char) 0);
            while (true) {
                int read = inputStreamReader.read(cArr);
                if (read == -1) {
                    break;
                } else {
                    fhovVar.write(cArr, 0, read);
                }
            }
            String fhovVar2 = fhovVar.toString();
            dkty.d(e, "%s", "RCS configuration XML:");
            for (String str : fhovVar2.split("(?<=>)", -1)) {
                dkty.d(e, "%s", dktx.GENERIC.c(str.trim()));
            }
            this.h.a(new ByteArrayInputStream(fhovVar2.getBytes(StandardCharsets.UTF_8)), configuration, true);
            dkty.l(e, "RCS config was parsed successfully.", new Object[0]);
            if (((Boolean) a.a()).booleanValue()) {
                this.k.e(true);
            }
        } catch (dkbs | IOException e2) {
            dkty.j(e2, e, "Failed to parse the config received from Provisioning AOSP.", new Object[0]);
            if (((Boolean) a.a()).booleanValue()) {
                this.k.e(false);
            }
        }
        djtp f = this.g.f(this.f);
        ImsConfiguration imsConfiguration = configuration.mImsConfiguration;
        ImsConfiguration n = f.n();
        imsConfiguration.mDomain = n.mDomain;
        imsConfiguration.f(n.mPublicIdentity, n.mUserName);
        imsConfiguration.mPcscfAddress = n.mPcscfAddress;
        imsConfiguration.mPcsfPort = n.mPcsfPort;
        djvk djvkVar = this.j;
        dkcp dkcpVar = this.g;
        String str2 = this.f;
        djvkVar.d(configuration, dkcpVar.f(str2), str2);
        this.d.set(true);
        b(false);
    }

    public final void onConfigurationReset() {
        if (dizg.K() && this.g.A(this.f)) {
            dkty.r(e, "ignoring RCS configuration reset when SR is disabled", new Object[0]);
            return;
        }
        dkty.l(e, "RCS configuration is not longer valid.", new Object[0]);
        if (((Boolean) a.a()).booleanValue()) {
            this.k.f();
        }
        a();
        b(false);
    }

    public final void onPreProvisioningReceived(byte[] bArr) {
        if (dizg.K() && this.g.A(this.f)) {
            dkty.r(e, "ignoring preprovisioning event when SR is disabled.", new Object[0]);
            return;
        }
        if (((Boolean) b.a()).booleanValue()) {
            dkty.l(e, "triggering MVS pre-provisioning reconfiguration", new Object[0]);
            Intent intent = new Intent(RcsIntents.ACTION_RCS_RECONFIGURATION_REQUIRED);
            intent.setFlags(VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES);
            dkuk.b(this.i, intent, "com.google.android.apps.messaging.rcsprovisioning.RcsProvisioningBroadcastReceiver", dkuj.SINGLE_REGISTRATION_PROVISIONING_LISTENER);
        } else {
            dkty.r(e, "Pre provisioning configuration received. This should never happen, because AM doesn't support self-provisioning.", new Object[0]);
        }
        if (((Boolean) a.a()).booleanValue()) {
            this.k.g();
        }
    }

    public final void onRemoved() {
        if (dizg.K() && this.g.A(this.f)) {
            dkty.r(e, "ignoring RCS configuration removed when SR is disabled", new Object[0]);
            return;
        }
        dkty.l(e, "The RcsProvisioningCallback instance is removed from AOSP.", new Object[0]);
        if (((Boolean) a.a()).booleanValue()) {
            this.k.d();
        }
        if (!((Boolean) c.a()).booleanValue()) {
            a();
        }
        b(true);
        dium diumVar = this.m;
        if (diumVar != null) {
            dkty.c("[SR]: onCallbackTermination", new Object[0]);
            Map.EL.remove(diumVar.a, Integer.valueOf(diumVar.b), diumVar.c);
        }
    }
}
