package defpackage;

import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class depy extends fevz {
    public depy() {
        super(ffhe.a);
    }

    public Object d(deqo deqoVar, ffgu ffguVar) {
        throw null;
    }

    public Object e(deqs deqsVar, ffgu ffguVar) {
        throw null;
    }

    @Override // defpackage.fdxe
    public final fedb w() {
        fedg fedgVar = depv.a;
        if (fedgVar == null) {
            synchronized (depv.class) {
                fedgVar = depv.a;
                if (fedgVar == null) {
                    fedf fedfVar = new fedf("stargate.DatagramNotificationService");
                    fedfVar.a(depv.a());
                    fedfVar.a(depv.b());
                    fedgVar = new fedg(fedfVar);
                    depv.a = fedgVar;
                }
            }
        }
        HashMap hashMap = new HashMap();
        fecz a = fexe.a(this.c, depv.a(), new depw(this));
        String str = fedgVar.a;
        feda.c(a, str, hashMap);
        feda.c(fexe.a(this.c, depv.b(), new depx(this)), str, hashMap);
        return feda.a(str, fedgVar, hashMap);
    }

    public depy(ffhd ffhdVar) {
        super(ffhdVar);
    }
}
