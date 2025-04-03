package com.google.android.rcs.client.provisioning.singleregistration;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.ims.rcs.singleregistration.ISingleRegistrationVendorImsController;
import com.google.android.ims.rcs.singleregistration.SingleRegistrationVendorImsServiceResult;
import defpackage.diyv;
import defpackage.diyy;
import defpackage.ehxc;
import defpackage.ehxg;
import defpackage.ehxi;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class SingleRegistrationVendorImsService extends ehxc<ISingleRegistrationVendorImsController> {
    public static final diyy h = diyv.b("single_registration_vendor_ims_service_connection_deprecated");

    public SingleRegistrationVendorImsService(Context context, ehxi ehxiVar) {
        super(ISingleRegistrationVendorImsController.class, context, ehxiVar, 1, Optional.empty());
    }

    @Override // defpackage.ehxc
    protected final boolean f() {
        return ((Boolean) h.a()).booleanValue();
    }

    @Override // defpackage.ehxc
    public String getRcsServiceMetaDataKey() {
        return "RcsSingleRegistrationVendomImsServiceVersions";
    }

    public SingleRegistrationVendorImsServiceResult setupVendorIms(int i) {
        b();
        try {
            return ((ISingleRegistrationVendorImsController) a()).setupVendorIms(i);
        } catch (RemoteException | IllegalStateException e) {
            throw new ehxg("Error while notifying location: ".concat(String.valueOf(e.getMessage())), e);
        }
    }

    public SingleRegistrationVendorImsServiceResult terminateVendorIms(int i) {
        b();
        try {
            return ((ISingleRegistrationVendorImsController) a()).terminateVendorIms(i);
        } catch (RemoteException | IllegalStateException e) {
            throw new ehxg("Error while notifying location: ".concat(String.valueOf(e.getMessage())), e);
        }
    }
}
