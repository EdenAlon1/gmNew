package defpackage;

import android.content.Context;
import com.google.android.gms.asterism.SetAsterismConsentRequest;
import com.google.android.gms.common.Feature;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class deys extends dfra {
    private static final dfqs a;
    private static final dfqj b;
    private static final dfqt m;

    static {
        dfqs dfqsVar = new dfqs();
        a = dfqsVar;
        deym deymVar = new deym();
        b = deymVar;
        m = new dfqt("Asterism.API", deymVar, dfqsVar);
    }

    public deys(Context context) {
        super(context, m, dfqp.q, dfqz.a);
    }

    public final dhre a(SetAsterismConsentRequest setAsterismConsentRequest) {
        dfun dfunVar = new dfun();
        dfunVar.a = new deyq(setAsterismConsentRequest);
        dfunVar.b = new Feature[]{dfzt.a};
        dfunVar.c = 11302;
        return i(dfunVar.a());
    }
}
