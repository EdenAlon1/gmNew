package defpackage;

import android.location.Location;
import android.os.RemoteException;
import com.google.android.gms.location.LocationResult;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dgzx extends dgys {
    final /* synthetic */ dhri a;
    final /* synthetic */ dhal b;

    public dgzx(dhal dhalVar, dhri dhriVar) {
        this.a = dhriVar;
        this.b = dhalVar;
    }

    @Override // defpackage.dgys
    public final void a(LocationResult locationResult) {
        int size = locationResult.b.size();
        this.a.d(size == 0 ? null : (Location) locationResult.b.get(size - 1));
        try {
            this.b.M(dftq.a(this, "GetCurrentLocation"), false, new dhri());
        } catch (RemoteException unused) {
        }
    }
}
