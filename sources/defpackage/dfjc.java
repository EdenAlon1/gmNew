package defpackage;

import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class dfjc implements fdxe {
    public /* synthetic */ void h(dfjs dfjsVar, ffbc ffbcVar) {
        throw null;
    }

    public /* synthetic */ void i(dfkj dfkjVar, ffbc ffbcVar) {
        throw null;
    }

    @Override // defpackage.fdxe
    public final fedb w() {
        fedg fedgVar = dfje.a;
        if (fedgVar == null) {
            synchronized (dfje.class) {
                fedgVar = dfje.a;
                if (fedgVar == null) {
                    fedf fedfVar = new fedf("com.google.android.gms.backup.customd2dapi.CustomD2DTargetService");
                    fedfVar.a(dfje.a());
                    fedfVar.a(dfje.b());
                    fedgVar = new fedg(fedfVar);
                    dfje.a = fedgVar;
                }
            }
        }
        HashMap hashMap = new HashMap();
        febs a = dfje.a();
        ffbb ffbbVar = new ffbb(new dfjd(this, 0));
        String str = fedgVar.a;
        feda.b(a, ffbbVar, str, fedgVar, hashMap);
        feda.b(dfje.b(), new ffbb(new dfjd(this, 1)), str, fedgVar, hashMap);
        return feda.a(str, fedgVar, hashMap);
    }
}
