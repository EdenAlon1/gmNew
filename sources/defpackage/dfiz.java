package defpackage;

import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class dfiz implements fdxe {
    public /* synthetic */ void d(dfjg dfjgVar, ffbc ffbcVar) {
        throw null;
    }

    public /* synthetic */ void e(dfjk dfjkVar, ffbc ffbcVar) {
        throw null;
    }

    public /* synthetic */ void f(dfjo dfjoVar, ffbc ffbcVar) {
        throw null;
    }

    @Override // defpackage.fdxe
    public final fedb w() {
        fedg fedgVar = dfjb.a;
        if (fedgVar == null) {
            synchronized (dfjb.class) {
                fedgVar = dfjb.a;
                if (fedgVar == null) {
                    fedf fedfVar = new fedf("com.google.android.gms.backup.customd2dapi.CustomD2DSourceService");
                    fedfVar.a(dfjb.c());
                    fedfVar.a(dfjb.b());
                    fedfVar.a(dfjb.a());
                    fedgVar = new fedg(fedfVar);
                    dfjb.a = fedgVar;
                }
            }
        }
        HashMap hashMap = new HashMap();
        febs c = dfjb.c();
        ffbb ffbbVar = new ffbb(new dfja(this, 0));
        String str = fedgVar.a;
        feda.b(c, ffbbVar, str, fedgVar, hashMap);
        feda.b(dfjb.b(), new ffbb(new dfja(this, 1)), str, fedgVar, hashMap);
        feda.b(dfjb.a(), new ffbb(new dfja(this, 2)), str, fedgVar, hashMap);
        return feda.a(str, fedgVar, hashMap);
    }
}
