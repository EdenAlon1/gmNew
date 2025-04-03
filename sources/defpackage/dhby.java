package defpackage;

import android.os.RemoteException;
import com.google.android.gms.maps.internal.IUiSettingsDelegate;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhby {
    public final IUiSettingsDelegate a;

    public dhby(IUiSettingsDelegate iUiSettingsDelegate) {
        this.a = iUiSettingsDelegate;
    }

    public final void a() {
        try {
            this.a.setMyLocationButtonEnabled(false);
        } catch (RemoteException e) {
            throw new dhcw(e);
        }
    }
}
