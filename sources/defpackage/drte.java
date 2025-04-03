package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drte {
    private final Context a;
    private final drst b;

    public drte(Context context, drst drstVar) {
        context.getClass();
        this.a = context;
        this.b = drstVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0079 A[Catch: drrt -> 0x0028, TRY_LEAVE, TryCatch #0 {drrt -> 0x0028, blocks: (B:10:0x0024, B:11:0x005b, B:19:0x006a, B:20:0x0075, B:21:0x0076, B:23:0x0079, B:34:0x0051), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.doxj r6, defpackage.ffgu r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.drtd
            if (r0 == 0) goto L13
            r0 = r7
            drtd r0 = (defpackage.drtd) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            drtd r0 = new drtd
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2a
            defpackage.ffci.b(r7)     // Catch: defpackage.drrt -> L28
            goto L5b
        L28:
            r6 = move-exception
            goto L7d
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            defpackage.ffci.b(r7)
            android.content.Context r7 = r5.a
            java.lang.String r2 = "com.google.android.apps.photos"
            android.content.pm.PackageManager r7 = r7.getPackageManager()     // Catch: java.lang.IllegalArgumentException -> L98
            int r7 = r7.getApplicationEnabledSetting(r2)     // Catch: java.lang.IllegalArgumentException -> L98
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.IllegalArgumentException -> L98
            int r2 = r7.intValue()     // Catch: java.lang.IllegalArgumentException -> L98
            if (r2 == 0) goto L4e
            if (r2 == r4) goto L4e
            r7 = r3
        L4e:
            if (r7 != 0) goto L51
            goto L98
        L51:
            drst r7 = r5.b     // Catch: defpackage.drrt -> L28
            r0.c = r4     // Catch: defpackage.drrt -> L28
            java.lang.Object r7 = r7.a(r6, r0)     // Catch: defpackage.drrt -> L28
            if (r7 == r1) goto L7c
        L5b:
            eddv r7 = (defpackage.eddv) r7     // Catch: defpackage.drrt -> L28
            int r6 = r7.ordinal()     // Catch: defpackage.drrt -> L28
            if (r6 == r4) goto L79
            r0 = 2
            if (r6 == r0) goto L76
            r0 = 3
            if (r6 != r0) goto L6a
            return r3
        L6a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch: defpackage.drrt -> L28
            java.lang.String r0 = "Unhandled account state "
            java.lang.String r7 = defpackage.a.n(r7, r0)     // Catch: defpackage.drrt -> L28
            r6.<init>(r7)     // Catch: defpackage.drrt -> L28
            throw r6     // Catch: defpackage.drrt -> L28
        L76:
            drsq r6 = defpackage.drsq.ONBOARDING_INCOMPLETE     // Catch: defpackage.drrt -> L28
            return r6
        L79:
            drsq r6 = defpackage.drsq.ACCOUNT_NOT_SIGNED_IN     // Catch: defpackage.drrt -> L28
            return r6
        L7c:
            return r1
        L7d:
            boolean r7 = r6 instanceof defpackage.drrs
            if (r7 == 0) goto L84
            drsq r6 = defpackage.drsq.SERVICE_NOT_AVAILABLE
            goto L96
        L84:
            boolean r7 = r6 instanceof defpackage.drrp
            if (r7 == 0) goto L97
            java.lang.String r7 = r6.a
            if (r7 == 0) goto L97
            java.lang.String r0 = "Invalid account name provided: "
            boolean r7 = defpackage.ffpc.M(r7, r0)
            if (r7 != r4) goto L97
            drsq r6 = defpackage.drsq.ACCOUNT_NOT_SIGNED_IN
        L96:
            return r6
        L97:
            throw r6
        L98:
            drsq r6 = defpackage.drsq.NOT_INSTALLED
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.drte.a(doxj, ffgu):java.lang.Object");
    }
}
