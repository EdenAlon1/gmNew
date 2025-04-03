package defpackage;

import android.content.Context;
import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlnc {
    private static volatile efgc a;

    public static synchronized efgc a(Context context) {
        efgc b;
        synchronized (dlnc.class) {
            efbm efbmVar = new efbm(Collections.singletonList(new efbp(new efbo(context))));
            dgxv dgxvVar = dgxw.a;
            b = b(efbmVar, dgxv.d(4));
        }
        return b;
    }

    public static synchronized efgc b(efbm efbmVar, Executor executor) {
        efgc efgcVar;
        synchronized (dlnc.class) {
            if (a == null) {
                efim efimVar = efim.a;
                HashMap hashMap = new HashMap();
                efgd.a(efho.a, hashMap);
                a = new efgc(executor, efbmVar, efimVar, hashMap);
            }
            efgcVar = a;
        }
        return efgcVar;
    }
}
