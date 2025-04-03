package defpackage;

import com.google.android.gms.maps.internal.IGoogleMapDelegate;
import com.google.android.gms.maps.internal.IOnMapReadyCallback;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dhbu extends IOnMapReadyCallback.Stub {
    final /* synthetic */ dhbq a;

    public dhbu(dhbq dhbqVar) {
        this.a = dhbqVar;
    }

    @Override // com.google.android.gms.maps.internal.IOnMapReadyCallback
    public final void onMapReady(IGoogleMapDelegate iGoogleMapDelegate) {
        this.a.c(new dhbj(iGoogleMapDelegate));
    }
}
