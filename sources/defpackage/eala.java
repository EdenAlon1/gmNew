package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.auth.TokenData;
import com.google.android.gms.auth.UserRecoverableAuthException;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eala implements eaku {
    public static final entd a = entd.c("GnpSdk");
    private static final long d = TimeUnit.MINUTES.toMillis(5);
    private static final long e = TimeUnit.HOURS.toMillis(1);
    public final Map b;
    public final Map c;
    private final Context f;
    private final dlpw g;
    private final ffsk h;

    public eala(Context context, dlpw dlpwVar, ffsk ffskVar) {
        context.getClass();
        dlpwVar.getClass();
        ffskVar.getClass();
        this.f = context;
        this.g = dlpwVar;
        this.h = ffskVar;
        this.b = new LinkedHashMap();
        this.c = new LinkedHashMap();
    }

    private final eafh h(Throwable th) {
        return th instanceof UserRecoverableAuthException ? new eaks((UserRecoverableAuthException) th) : th instanceof IOException ? new eakt((IOException) th) : new eakr(th);
    }

    private final eakx i(Account account, String str) {
        Bundle bundle = Bundle.EMPTY;
        bundle.getClass();
        int i = dezv.a;
        TokenData b = dfac.b(this.f, account, str, bundle);
        b.getClass();
        String str2 = b.b;
        str2.getClass();
        return new eakx(str2, this.g.f().toEpochMilli(), b.c);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.eaku
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r8, java.lang.String r9, defpackage.ffgu r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof defpackage.eaky
            if (r0 == 0) goto L13
            r0 = r10
            eaky r0 = (defpackage.eaky) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            eaky r0 = new eaky
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            eala r8 = r0.d
            defpackage.ffci.b(r10)
            goto L76
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L31:
            defpackage.ffci.b(r10)
            java.lang.String r10 = "com.google"
            eakw r2 = new eakw
            android.accounts.Account r4 = new android.accounts.Account
            r4.<init>(r8, r10)
            r2.<init>(r4, r9)
            fflb r8 = new fflb
            r8.<init>()
            java.util.Map r9 = r7.c
            monitor-enter(r9)
            java.util.Map r10 = r7.c     // Catch: java.lang.Throwable -> L90
            java.lang.Object r10 = r10.get(r2)     // Catch: java.lang.Throwable -> L90
            ffss r10 = (defpackage.ffss) r10     // Catch: java.lang.Throwable -> L90
            if (r10 != 0) goto L64
            ffsk r10 = r7.h     // Catch: java.lang.Throwable -> L90
            eakz r4 = new eakz     // Catch: java.lang.Throwable -> L90
            r5 = 0
            r4.<init>(r7, r2, r5)     // Catch: java.lang.Throwable -> L90
            r6 = 3
            ffss r10 = defpackage.ffqy.c(r10, r5, r4, r6)     // Catch: java.lang.Throwable -> L90
            java.util.Map r4 = r7.c     // Catch: java.lang.Throwable -> L90
            r4.put(r2, r10)     // Catch: java.lang.Throwable -> L90
        L64:
            r8.a = r10     // Catch: java.lang.Throwable -> L90
            monitor-exit(r9)
            java.lang.Object r8 = r8.a
            ffss r8 = (defpackage.ffss) r8
            r0.d = r7
            r0.c = r3
            java.lang.Object r10 = r8.c(r0)
            if (r10 == r1) goto L8f
            r8 = r7
        L76:
            ffch r10 = (defpackage.ffch) r10
            java.lang.Object r9 = r10.a
            java.lang.Throwable r10 = defpackage.ffch.c(r9)
            if (r10 != 0) goto L8a
            eakx r9 = (defpackage.eakx) r9
            java.lang.String r8 = r9.a
            eafo r9 = new eafo
            r9.<init>(r8)
            return r9
        L8a:
            eafh r8 = r8.h(r10)
            return r8
        L8f:
            return r1
        L90:
            r8 = move-exception
            monitor-exit(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eala.a(java.lang.String, java.lang.String, ffgu):java.lang.Object");
    }

    @Override // defpackage.eaku
    public final String b(String str) {
        int i = dezv.a;
        String c = dfac.c(this.f, str);
        c.getClass();
        return c;
    }

    @Override // defpackage.eaku
    public final List c() {
        int i = dezv.a;
        return ffdo.L(dfac.k(this.f));
    }

    @Override // defpackage.eaku
    public final eafl d(String str) {
        eafo eafoVar;
        str.getClass();
        Account account = new Account(str, "com.google");
        synchronized (this.b) {
            try {
                eakx i = i(account, "oauth2:https://www.googleapis.com/auth/notifications");
                if (!g(i)) {
                    a.o().J("Token for [%s, %s] is invalid with expiration %s, refreshing...", account.name, "oauth2:https://www.googleapis.com/auth/notifications", i.c);
                    f(i);
                    i = i(account, "oauth2:https://www.googleapis.com/auth/notifications");
                }
                a.o().J("Returning valid token for [%s, %s] with expiration %s", account.name, "oauth2:https://www.googleapis.com/auth/notifications", i.c);
                eafoVar = new eafo(i.a);
            } catch (Exception e2) {
                return h(e2);
            }
        }
        return eafoVar;
    }

    public final eakx e(eakw eakwVar) {
        eakx i = i(eakwVar.a, eakwVar.b);
        this.b.put(eakwVar, i);
        return i;
    }

    public final void f(eakx eakxVar) {
        int i = dezv.a;
        dfac.f(this.f, eakxVar.a);
    }

    public final boolean g(eakx eakxVar) {
        Long l = eakxVar.c;
        return l != null ? TimeUnit.SECONDS.toMillis(l.longValue()) - this.g.f().toEpochMilli() > d : this.g.f().toEpochMilli() - eakxVar.b < e - d;
    }
}
