package defpackage;

import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class dero extends fevz {
    public dero() {
        super(ffhe.a);
    }

    public Object c(deqw deqwVar, ffgu ffguVar) {
        throw null;
    }

    @Override // defpackage.fdxe
    public final fedb w() {
        fedg fedgVar = derm.a;
        if (fedgVar == null) {
            synchronized (derm.class) {
                fedgVar = derm.a;
                if (fedgVar == null) {
                    fedf fedfVar = new fedf("stargate.SatelliteSessionStateNotificationService");
                    fedfVar.a(derm.a());
                    fedgVar = new fedg(fedfVar);
                    derm.a = fedgVar;
                }
            }
        }
        HashMap hashMap = new HashMap();
        fecz a = fexe.a(this.c, derm.a(), new dern(this));
        String str = fedgVar.a;
        feda.c(a, str, hashMap);
        return feda.a(str, fedgVar, hashMap);
    }

    public dero(ffhd ffhdVar) {
        super(ffhdVar);
    }
}
