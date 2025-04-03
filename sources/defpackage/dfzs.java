package defpackage;

import android.content.Context;
import com.google.android.gms.common.Feature;
import com.google.android.gms.constellation.VerifyPhoneNumberRequest;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dfzs extends dfra {
    public static final dfxq a = new dfxq("constellation", "client");
    private static final dfqs b;
    private static final dfqj m;
    private static final dfqt n;

    static {
        dfqs dfqsVar = new dfqs();
        b = dfqsVar;
        dfzk dfzkVar = new dfzk();
        m = dfzkVar;
        n = new dfqt("Constellation.API", dfzkVar, dfqsVar);
    }

    public dfzs(Context context) {
        super(context, n, dfqp.q, dfqz.a);
    }

    public final dhre a(VerifyPhoneNumberRequest verifyPhoneNumberRequest) {
        dfun dfunVar = new dfun();
        dfunVar.a = new dfzo(verifyPhoneNumberRequest);
        dfunVar.b = verifyPhoneNumberRequest.g == 3 ? new Feature[]{dfzt.d, dfzt.g} : new Feature[]{dfzt.d};
        dfunVar.c = 11901;
        return i(dfunVar.a());
    }
}
