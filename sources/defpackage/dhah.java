package defpackage;

import com.google.android.gms.location.ILocationCallback;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dhah extends ILocationCallback.Stub {
    public final dhad a;

    public dhah(dhad dhadVar) {
        this.a = dhadVar;
    }

    @Override // com.google.android.gms.location.ILocationCallback
    public final void onLocationAvailability(LocationAvailability locationAvailability) {
        ((dgzy) this.a).a.b(new dhaf());
    }

    @Override // com.google.android.gms.location.ILocationCallback
    public final void onLocationResult(LocationResult locationResult) {
        ((dgzy) this.a).a.b(new dhae(locationResult));
    }

    @Override // com.google.android.gms.location.ILocationCallback
    public final void onRemoved() {
        ((dgzy) this.a).a.b(new dhag(this));
    }
}
