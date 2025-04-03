package defpackage;

import android.location.Location;
import com.google.android.gms.location.ILocationListener;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dhak extends ILocationListener.Stub {
    public final dhad a;

    public dhak(dhad dhadVar) {
        this.a = dhadVar;
    }

    @Override // com.google.android.gms.location.ILocationListener
    public final void onLocationChanged(Location location) {
        this.a.b().b(new dhai(location));
    }

    @Override // com.google.android.gms.location.ILocationListener
    public final void onRemoved() {
        this.a.b().b(new dhaj(this));
    }
}
