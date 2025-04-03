package defpackage;

import androidx.car.app.hardware.info.EnergyProfile;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class equd {
    public static final /* synthetic */ eqfq a(eqfp eqfpVar) {
        eyfy build = eqfpVar.build();
        build.getClass();
        return (eqfq) build;
    }

    public static final void b(eqfs eqfsVar, eqfp eqfpVar) {
        eqfpVar.copyOnWrite();
        eqfq eqfqVar = (eqfq) eqfpVar.instance;
        eqfq eqfqVar2 = eqfq.a;
        eqfqVar.d = eqfsVar;
        eqfqVar.c = EnergyProfile.EVCONNECTOR_TYPE_OTHER;
    }

    public static final void c(boolean z, eqfp eqfpVar) {
        eqfpVar.copyOnWrite();
        eqfq eqfqVar = (eqfq) eqfpVar.instance;
        eqfq eqfqVar2 = eqfq.a;
        eqfqVar.b |= 1;
        eqfqVar.e = z;
    }
}
