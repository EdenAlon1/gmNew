package defpackage;

import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhce {
    public float a;
    public float b;
    public float c;
    private LatLng d;

    public final CameraPosition a() {
        return new CameraPosition(this.d, this.a, this.b, this.c);
    }

    public final void b(LatLng latLng) {
        dfwv.o(latLng, "location must not be null.");
        this.d = latLng;
    }
}
