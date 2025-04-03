package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dclo {
    public static eppr a(appw appwVar, dcle dcleVar) {
        eppq eppqVar = (eppq) eppr.a.createBuilder();
        if (appwVar instanceof ufb) {
            dclc.l(eppqVar, 2);
        } else if (appwVar instanceof ufe) {
            epqg epqgVar = epqg.a;
            eppqVar.copyOnWrite();
            eppr epprVar = (eppr) eppqVar.instance;
            epqgVar.getClass();
            epprVar.f = epqgVar;
            epprVar.e = BasePaymentResult.ERROR_REQUEST_CONNECTION_FAILED;
        } else {
            if (!(appwVar instanceof ufp)) {
                throw new IllegalArgumentException("Invalid text content: ".concat(appwVar.toString()));
            }
            dclc.i(eppqVar);
        }
        dcleVar.a(eppqVar);
        return (eppr) eppqVar.build();
    }
}
