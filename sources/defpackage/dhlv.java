package defpackage;

import android.content.Context;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.ComplianceOptions;
import com.google.android.gms.pseudonymous.internal.IPseudonymousIdService;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhlv extends dfra {
    public dhlv(Context context) {
        super(context, dhlr.c, dfqp.q, dfqz.a);
    }

    public final dhre a() {
        dfun dfunVar = new dfun();
        dfunVar.a = new dfuf() { // from class: dhls
            @Override // defpackage.dfuf
            public final void a(Object obj, Object obj2) {
                dhly dhlyVar = (dhly) obj;
                Context context = dhlyVar.c;
                ((IPseudonymousIdService) dhlyVar.w()).getToken(new dhlt((dhri) obj2), new ApiMetadata(new ComplianceOptions(-1, -1, 0, true)));
            }
        };
        dfunVar.c = 3901;
        return i(dfunVar.a());
    }
}
