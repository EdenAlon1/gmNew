package defpackage;

import com.google.android.gms.maps.internal.IOnMapClickListener;
import com.google.android.gms.maps.model.LatLng;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhbi extends IOnMapClickListener.Stub {
    final /* synthetic */ dckg a;

    public dhbi(dckg dckgVar) {
        this.a = dckgVar;
    }

    @Override // com.google.android.gms.maps.internal.IOnMapClickListener
    public final void onMapClick(LatLng latLng) {
        this.a.a.R.f(latLng);
    }
}
