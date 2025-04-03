package defpackage;

import android.os.RemoteException;
import com.google.android.gms.maps.internal.IOnMarkerDragListener;
import com.google.android.gms.maps.model.internal.IMarkerDelegate;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhbg extends IOnMarkerDragListener.Stub {
    final /* synthetic */ dckm a;

    public dhbg(dckm dckmVar) {
        this.a = dckmVar;
    }

    @Override // com.google.android.gms.maps.internal.IOnMarkerDragListener
    public final void onMarkerDrag(IMarkerDelegate iMarkerDelegate) {
        new dhcp(iMarkerDelegate);
    }

    @Override // com.google.android.gms.maps.internal.IOnMarkerDragListener
    public final void onMarkerDragEnd(IMarkerDelegate iMarkerDelegate) {
        try {
            this.a.a.R.f(new dhcp(iMarkerDelegate).a.getPosition());
        } catch (RemoteException e) {
            throw new dhcw(e);
        }
    }

    @Override // com.google.android.gms.maps.internal.IOnMarkerDragListener
    public final void onMarkerDragStart(IMarkerDelegate iMarkerDelegate) {
        new dhcp(iMarkerDelegate);
    }
}
