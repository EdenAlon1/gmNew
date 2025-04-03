package defpackage;

import android.content.Context;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dihw implements Runnable {
    private static final int a = Math.max(2, ermn.a(((Long) diyr.a().b.i.a()).longValue()));
    public final String b;
    public final Context c;
    public dihz d;
    private int e = 0;
    private int f = 1;

    public dihw(String str, Context context, dihz dihzVar) {
        this.b = str;
        this.c = context;
        this.d = dihzVar;
    }

    private static int g() {
        return Math.max(1, ermn.a(((Long) diyr.a().b.j.a()).longValue()));
    }

    private final void h(Integer num) {
        if (e()) {
            int intValue = num != null ? num.intValue() : -1;
            if (!dksy.h()) {
                dkty.d(dksy.a, "Analytics are disabled. Ignoring UMA histogram %s", "RcsEngine.BusinessInfo.Retrieval.Failed.Counts");
                return;
            }
            dfmc dfmcVar = dksy.b;
            dfmcVar.getClass();
            dfmcVar.d("RcsEngine.BusinessInfo.Retrieval.Failed.Counts").a(intValue, 1L, dfmc.b);
            dksy.f();
        }
    }

    private final void i(int i, Integer num) {
        if (!e() || i == Integer.MIN_VALUE) {
            return;
        }
        if (num == null || num.intValue() != 200) {
            dksy.c(i);
        } else {
            dksy.g(i);
        }
    }

    protected abstract dihz a(HttpsURLConnection httpsURLConnection);

    public abstract String b();

    public abstract String c();

    protected abstract void d(HttpsURLConnection httpsURLConnection);

    protected abstract boolean e();

    public HttpsURLConnection f(String str) {
        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) new URL(str).openConnection();
        httpsURLConnection.setReadTimeout(10000);
        httpsURLConnection.setConnectTimeout(15000);
        httpsURLConnection.setRequestMethod("GET");
        httpsURLConnection.setDoInput(true);
        return httpsURLConnection;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:(2:23|24)|(6:69|70|(2:72|(1:74))(1:77)|(1:76)|58|59)(2:26|(5:65|66|(1:68)|58|59)(3:28|(2:30|(3:32|150|38)(1:55))(1:64)|56))|60|61|58|59) */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0188, code lost:
    
        if (r5 != null) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01cb, code lost:
    
        if (r4 == 0) goto L77;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x01dc  */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [javax.net.ssl.HttpsURLConnection] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 517
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dihw.run():void");
    }
}
