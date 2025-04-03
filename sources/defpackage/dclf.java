package defpackage;

import androidx.car.app.hardware.info.EnergyProfile;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class dclf extends dcle {
    public static final /* synthetic */ int b = 0;

    @Override // defpackage.dcle
    public final void a(eppq eppqVar) {
        eptv c = c();
        eppqVar.copyOnWrite();
        eppr epprVar = (eppr) eppqVar.instance;
        eppr epprVar2 = eppr.a;
        epprVar.d = c;
        epprVar.c = EnergyProfile.EVCONNECTOR_TYPE_OTHER;
    }

    public abstract eptv c();
}
