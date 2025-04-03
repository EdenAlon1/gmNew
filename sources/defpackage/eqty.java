package defpackage;

import androidx.car.app.hardware.info.EnergyProfile;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqty {
    public static final /* synthetic */ epwy a(epwx epwxVar) {
        eyfy build = epwxVar.build();
        build.getClass();
        return (epwy) build;
    }

    public static final void b(boolean z, epwx epwxVar) {
        epwxVar.copyOnWrite();
        epwy epwyVar = (epwy) epwxVar.instance;
        epwy epwyVar2 = epwy.a;
        epwyVar.b |= 1;
        epwyVar.e = z;
    }

    public static final void c(eyev eyevVar, epwx epwxVar) {
        epwxVar.copyOnWrite();
        epwy epwyVar = (epwy) epwxVar.instance;
        epwy epwyVar2 = epwy.a;
        epwyVar.f = eyevVar;
        epwyVar.b |= 2;
    }

    public static final void d(epxa epxaVar, epwx epwxVar) {
        epwxVar.copyOnWrite();
        epwy epwyVar = (epwy) epwxVar.instance;
        epwy epwyVar2 = epwy.a;
        epwyVar.d = epxaVar;
        epwyVar.c = EnergyProfile.EVCONNECTOR_TYPE_OTHER;
    }
}
