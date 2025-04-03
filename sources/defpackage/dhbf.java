package defpackage;

import com.google.android.gms.maps.internal.IOnMarkerClickListener;
import com.google.android.gms.maps.model.internal.IMarkerDelegate;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhbf extends IOnMarkerClickListener.Stub {
    @Override // com.google.android.gms.maps.internal.IOnMarkerClickListener
    public final boolean onMarkerClick(IMarkerDelegate iMarkerDelegate) {
        new dhcp(iMarkerDelegate);
        return true;
    }
}
