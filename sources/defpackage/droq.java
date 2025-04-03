package defpackage;

import androidx.car.app.hardware.info.EnergyProfile;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class droq {
    public static final /* synthetic */ droa a(drnx drnxVar) {
        eyfy build = drnxVar.build();
        build.getClass();
        return (droa) build;
    }

    public static final void b(drnw drnwVar, drnx drnxVar) {
        drnxVar.copyOnWrite();
        droa droaVar = (droa) drnxVar.instance;
        droa droaVar2 = droa.a;
        droaVar.c = drnwVar;
        droaVar.b = EnergyProfile.EVCONNECTOR_TYPE_OTHER;
    }

    public static final void c(drnz drnzVar, drnx drnxVar) {
        drnxVar.copyOnWrite();
        droa droaVar = (droa) drnxVar.instance;
        droa droaVar2 = droa.a;
        droaVar.c = drnzVar;
        droaVar.b = 100;
    }
}
