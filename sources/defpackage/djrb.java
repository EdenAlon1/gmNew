package defpackage;

import android.telephony.ims.ImsException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djrb implements dkvu {
    private final djqu a;

    public djrb(djqu djquVar) {
        this.a = djquVar;
    }

    private final dkvg d(int i) {
        if (!ctid.e || !dizg.G()) {
            dkty.k("[SR]: Single Registration is disabled. Skipping Single Registration capability check for subId: %s, OS.isAtLeastS:[%s], enableSingleRegistrationProvisioning:[%s]", Integer.valueOf(i), Boolean.valueOf(ctid.e), Boolean.valueOf(dizg.G()));
            return dkvg.DUAL_REG;
        }
        try {
            boolean isRcsVolteSingleRegistrationCapable = this.a.a(i).isRcsVolteSingleRegistrationCapable();
            dkty.k("[SR]: AOSP ProvisioningManager.isRcsVolteSingleRegistrationCapable:[%s] for subId: %d, OS.isAtLeastS:[%s], enableSingleRegistrationProvisioning:[%s]", Boolean.valueOf(isRcsVolteSingleRegistrationCapable), Integer.valueOf(i), Boolean.valueOf(ctid.e), Boolean.valueOf(dizg.G()));
            return isRcsVolteSingleRegistrationCapable ? dkvg.SINGLE_REG : dkvg.DUAL_REG;
        } catch (ImsException | RuntimeException e) {
            dkty.i(e, "[SR]: Failed to retrieve SR capability from IMS for subId: %d", Integer.valueOf(i));
            return dkvg.UNKNOWN;
        }
    }

    @Override // defpackage.dkvu
    public final dkvg a(int i) {
        return d(i);
    }

    @Override // defpackage.dkvu
    public final boolean b(int i) {
        return dkvg.SINGLE_REG.equals(d(i));
    }

    public final boolean c(int i) {
        if (!ctid.e || !dizg.G()) {
            dkty.q("[SR]: Single Registration is disabled. Skipping reconfiguration trigger for subId: %s", Integer.valueOf(i));
            return false;
        }
        Integer valueOf = Integer.valueOf(i);
        dkty.k("[SR]: Triggering Reconfiguration for subId: %s", valueOf);
        try {
            this.a.a(i).triggerRcsReconfiguration();
            dkty.c("[SR]: Reconfiguration Trigger for subId: %s succesful", valueOf);
            return true;
        } catch (ImsException | RuntimeException e) {
            dkty.i(e, "[SR]: Failed to trigger reconfiguration for subId: %d", Integer.valueOf(i));
            return false;
        }
    }
}
