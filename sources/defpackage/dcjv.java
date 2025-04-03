package defpackage;

import android.location.LocationManager;
import com.google.android.apps.messaging.ui.mediapicker.c2o.ContentGridView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcjv implements dcaz {
    private final ffbr a;
    private final ffbr b;
    private final ffbr c;
    private final ffbr d;
    private final ffbr e;

    public dcjv(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6) {
        ffbrVar.getClass();
        this.a = ffbrVar;
        ffbrVar2.getClass();
        this.b = ffbrVar2;
        this.c = ffbrVar3;
        this.d = ffbrVar4;
        this.e = ffbrVar5;
    }

    @Override // defpackage.dcaz
    public final /* synthetic */ dcae a(dcbc dcbcVar) {
        cskx cskxVar = (cskx) this.a.b();
        cskxVar.getClass();
        LocationManager locationManager = (LocationManager) this.b.b();
        locationManager.getClass();
        ctud ctudVar = (ctud) this.c.b();
        ctudVar.getClass();
        dcjr dcjrVar = (dcjr) this.e.b();
        dcjrVar.getClass();
        dcav dcavVar = (dcav) dcbcVar;
        eg G = dcavVar.a.G();
        bcpw bcpwVar = dcavVar.e;
        int i = dcavVar.h;
        ContentGridView contentGridView = dcavVar.i;
        return new dcju(cskxVar, locationManager, ctudVar, this.d, dcjrVar, G, dcavVar.d, contentGridView, i, bcpwVar);
    }
}
