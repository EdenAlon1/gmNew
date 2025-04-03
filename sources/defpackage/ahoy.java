package defpackage;

import com.google.android.gms.maps.model.LatLng;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahoy extends ahow {
    final /* synthetic */ ahoz a;
    private final elfl c;

    public ahoy(ahoz ahozVar, LatLng latLng) {
        this.a = ahozVar;
        if (latLng == null) {
            this.c = null;
            ahoz.a.m("Cannot do reverse geocode query with empty map center.");
        } else {
            elfl a = ((ctxw) ahozVar.e.get()).a(latLng);
            this.c = a;
            erqj ahoxVar = new ahox(this);
            erqt.r(a, ((Boolean) ahozVar.g.b()).booleanValue() ? ahoxVar : axou.a(ahoxVar), ahozVar.f);
        }
    }

    @Override // defpackage.ahow
    public final void a() {
        super.a();
        elfl elflVar = this.c;
        if (elflVar != null) {
            elflVar.cancel(false);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
    }
}
