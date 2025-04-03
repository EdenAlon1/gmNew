package defpackage;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* compiled from: PG */
@Deprecated
/* loaded from: classes3.dex */
public final class dfdw extends dfra {
    static int a = 1;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public dfdw(android.content.Context r4, com.google.android.gms.auth.api.signin.GoogleSignInOptions r5) {
        /*
            r3 = this;
            dfqt r0 = defpackage.dfbc.c
            dfqy r1 = new dfqy
            r1.<init>()
            dfry r2 = new dfry
            r2.<init>()
            r1.a = r2
            dfqz r1 = r1.a()
            r3.<init>(r4, r0, r5, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dfdw.<init>(android.content.Context, com.google.android.gms.auth.api.signin.GoogleSignInOptions):void");
    }

    public final synchronized int a() {
        int i;
        i = a;
        if (i == 1) {
            Context context = this.c;
            dfpi dfpiVar = dfpi.a;
            int i2 = dfpiVar.i(context, 12451000);
            if (i2 == 0) {
                i = 4;
                a = 4;
            } else if (dfpiVar.j(context, i2, null) != null || DynamiteModule.a(context, "com.google.android.gms.auth.api.fallback") == 0) {
                i = 2;
                a = 2;
            } else {
                i = 3;
                a = 3;
            }
        }
        return i;
    }
}
