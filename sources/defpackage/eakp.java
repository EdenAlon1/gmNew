package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eakp {
    private static eumr a;

    public static synchronized eumr a(Context context, eako eakoVar, eagn eagnVar) {
        synchronized (eakp.class) {
            if (a == null) {
                if (((eagl) eagnVar).f) {
                    eumr a2 = eakoVar.a(context);
                    a = a2;
                    return a2;
                }
                dfwv.m("AIzaSyC8UYZpvA2eknNex0Pjid0_eTLJoDu6los", "ApiKey must be set.");
                dfwv.m("1:747654520220:android:0000000000000000", "ApplicationId must be set.");
                a = eakoVar.c(context, new eunc("1:747654520220:android:0000000000000000", "AIzaSyC8UYZpvA2eknNex0Pjid0_eTLJoDu6los", null, null, ((eagl) eagnVar).b, null, "chime-sdk"));
            }
            return a;
        }
    }
}
