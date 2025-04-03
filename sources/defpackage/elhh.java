package defpackage;

import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elhh {
    public static void a(ea eaVar, Intent intent) {
        Intent intent2 = new Intent(intent);
        elcz u = eldl.u(intent2);
        try {
            eaVar.aD(intent2);
            u.close();
        } catch (Throwable th) {
            try {
                u.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
