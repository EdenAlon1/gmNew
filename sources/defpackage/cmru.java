package defpackage;

import androidx.car.app.hardware.info.EnergyProfile;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmru {
    public static final /* synthetic */ cmrl a(cmrk cmrkVar) {
        eyfy build = cmrkVar.build();
        build.getClass();
        return (cmrl) build;
    }

    public static final void b(draj drajVar, cmrk cmrkVar) {
        cmrkVar.copyOnWrite();
        cmrl cmrlVar = (cmrl) cmrkVar.instance;
        cmrl cmrlVar2 = cmrl.a;
        cmrlVar.c = drajVar;
        cmrlVar.b = EnergyProfile.EVCONNECTOR_TYPE_OTHER;
    }

    public static final void c(String str, cmrk cmrkVar) {
        str.getClass();
        cmrkVar.copyOnWrite();
        cmrl cmrlVar = (cmrl) cmrkVar.instance;
        cmrl cmrlVar2 = cmrl.a;
        cmrlVar.d = str;
    }

    public static final void d(cmrv cmrvVar, cmrk cmrkVar) {
        cmrvVar.getClass();
        cmrkVar.copyOnWrite();
        cmrl cmrlVar = (cmrl) cmrkVar.instance;
        cmrl cmrlVar2 = cmrl.a;
        cmrlVar.e = cmrvVar.a();
    }
}
