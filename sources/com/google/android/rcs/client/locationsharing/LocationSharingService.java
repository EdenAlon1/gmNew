package com.google.android.rcs.client.locationsharing;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.ims.rcsservice.locationsharing.ILocationSharing;
import com.google.android.ims.rcsservice.locationsharing.LocationInformation;
import com.google.android.ims.rcsservice.locationsharing.LocationSharingResult;
import defpackage.diyv;
import defpackage.diyy;
import defpackage.ehxc;
import defpackage.ehxg;
import defpackage.ehxi;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class LocationSharingService extends ehxc<ILocationSharing> {
    public static final diyy h = diyv.b("location_sharing_service_connection_deprecated");

    public LocationSharingService(Context context, ehxi ehxiVar) {
        super(ILocationSharing.class, context, ehxiVar, 1, Optional.empty());
    }

    @Override // defpackage.ehxc
    protected final boolean f() {
        return ((Boolean) h.a()).booleanValue();
    }

    @Override // defpackage.ehxc
    public String getRcsServiceMetaDataKey() {
        return "LocationSharingServiceVersions";
    }

    public LocationSharingResult pushLocation(String str, LocationInformation locationInformation, String str2) {
        b();
        try {
            return ((ILocationSharing) a()).pushLocation(str, locationInformation, str2);
        } catch (RemoteException | IllegalStateException e) {
            throw new ehxg("Error while pushing location: ".concat(String.valueOf(e.getMessage())), e);
        }
    }

    public LocationSharingResult[] pushLocationToGroup(long j, LocationInformation locationInformation, String str) {
        b();
        try {
            return ((ILocationSharing) a()).pushLocationToGroup(j, locationInformation, str);
        } catch (RemoteException | IllegalStateException e) {
            throw new ehxg("Error while pushing location to group: ".concat(String.valueOf(e.getMessage())), e);
        }
    }
}
