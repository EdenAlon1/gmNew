package defpackage;

import android.os.RemoteException;
import com.google.android.gms.maps.model.internal.IMarkerDelegate;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhcp {
    public final IMarkerDelegate a;

    public dhcp(IMarkerDelegate iMarkerDelegate) {
        dfwv.n(iMarkerDelegate);
        this.a = iMarkerDelegate;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dhcp)) {
            return false;
        }
        try {
            return this.a.equalsRemote(((dhcp) obj).a);
        } catch (RemoteException e) {
            throw new dhcw(e);
        }
    }

    public final int hashCode() {
        try {
            return this.a.hashCodeRemote();
        } catch (RemoteException e) {
            throw new dhcw(e);
        }
    }
}
