package com.google.android.rcs.client.ims;

import android.content.Context;
import com.google.android.ims.rcsservice.ims.IImsConnectionTracker;
import com.google.android.ims.rcsservice.ims.ImsRegistrationState;
import defpackage.diyv;
import defpackage.diyy;
import defpackage.ehxc;
import defpackage.ehxd;
import defpackage.ehxg;
import defpackage.ehxi;
import defpackage.eyrs;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class ImsConnectionTrackerService extends ehxc<IImsConnectionTracker> {
    public static final diyy h = diyv.b("ims_connection_tracker_service_deprecated");

    public ImsConnectionTrackerService(Context context, ehxi ehxiVar, Optional<ehxd> optional) {
        super(IImsConnectionTracker.class, context, ehxiVar, 1, optional);
    }

    @Override // defpackage.ehxc
    protected final boolean f() {
        return ((Boolean) h.a()).booleanValue();
    }

    @Override // defpackage.ehxc
    public String getRcsServiceMetaDataKey() {
        return "ImsConnectionTrackerServiceVersions";
    }

    public ImsRegistrationState getRegistrationState() {
        b();
        try {
            return ((IImsConnectionTracker) a()).getRegistrationState();
        } catch (Exception e) {
            throw new ehxg(e.getMessage());
        }
    }

    @Override // defpackage.ehxc
    public eyrs getServiceNameLoggingEnum() {
        return eyrs.IMS_CONNECTION_TRACKER_SERVICE;
    }

    public boolean isRegistered() {
        b();
        try {
            return ((IImsConnectionTracker) a()).isRegistered();
        } catch (Exception e) {
            throw new ehxg(e.getMessage());
        }
    }
}
