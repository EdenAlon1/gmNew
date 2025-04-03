package defpackage;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dski {
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0061, code lost:
    
        if (r6 != r1) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0067, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004e, code lost:
    
        if (defpackage.dsks.a(r8, r2, r5, r0) != r1) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(final defpackage.eg r6, final java.lang.String r7, defpackage.ffgu r8) {
        /*
            boolean r0 = r8 instanceof defpackage.dskf
            if (r0 == 0) goto L13
            r0 = r8
            dskf r0 = (defpackage.dskf) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dskf r0 = new dskf
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.ffci.b(r8)
            goto L64
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            java.lang.Object r6 = r0.a
            defpackage.ffci.b(r8)
            goto L50
        L38:
            defpackage.ffci.b(r8)
            lkk r8 = r6.P()
            lki r2 = defpackage.lki.ON_PAUSE
            dske r5 = new dske
            r5.<init>()
            r0.a = r6
            r0.c = r4
            java.lang.Object r7 = defpackage.dsks.a(r8, r2, r5, r0)
            if (r7 == r1) goto L67
        L50:
            hl r6 = (defpackage.hl) r6
            lkk r6 = r6.P()
            lki r7 = defpackage.lki.ON_RESUME
            r8 = 0
            r0.a = r8
            r0.c = r3
            java.lang.Object r6 = defpackage.dsks.b(r6, r7, r0)
            if (r6 != r1) goto L64
            goto L67
        L64:
            ffcu r6 = defpackage.ffcu.a
            return r6
        L67:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dski.a(eg, java.lang.String, ffgu):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0061, code lost:
    
        if (r6 != r1) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0067, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004e, code lost:
    
        if (defpackage.dsks.a(r8, r2, r5, r0) != r1) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(final defpackage.eg r6, final android.content.Intent r7, defpackage.ffgu r8) {
        /*
            boolean r0 = r8 instanceof defpackage.dskg
            if (r0 == 0) goto L13
            r0 = r8
            dskg r0 = (defpackage.dskg) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dskg r0 = new dskg
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.ffci.b(r8)
            goto L64
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            java.lang.Object r6 = r0.a
            defpackage.ffci.b(r8)
            goto L50
        L38:
            defpackage.ffci.b(r8)
            lkk r8 = r6.P()
            lki r2 = defpackage.lki.ON_PAUSE
            dskd r5 = new dskd
            r5.<init>()
            r0.a = r6
            r0.c = r4
            java.lang.Object r7 = defpackage.dsks.a(r8, r2, r5, r0)
            if (r7 == r1) goto L67
        L50:
            hl r6 = (defpackage.hl) r6
            lkk r6 = r6.P()
            lki r7 = defpackage.lki.ON_RESUME
            r8 = 0
            r0.a = r8
            r0.c = r3
            java.lang.Object r6 = defpackage.dsks.b(r6, r7, r0)
            if (r6 != r1) goto L64
            goto L67
        L64:
            ffcu r6 = defpackage.ffcu.a
            return r6
        L67:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dski.b(eg, android.content.Intent, ffgu):java.lang.Object");
    }

    public static final ffcu c(eg egVar, String str) {
        try {
            egVar.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(a.t(str, "market://details?id="))));
        } catch (ActivityNotFoundException unused) {
            egVar.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=".concat(String.valueOf(str)))));
        }
        return ffcu.a;
    }

    public static final boolean d(Activity activity) {
        boolean isLaunchedFromBubble;
        if (Build.VERSION.SDK_INT == 30) {
            return dskj.d(activity).getDisplayId() > 0;
        }
        if (Build.VERSION.SDK_INT < 31) {
            return false;
        }
        isLaunchedFromBubble = activity.isLaunchedFromBubble();
        return isLaunchedFromBubble;
    }

    public static /* synthetic */ Object e(eg egVar, String str, adu aduVar, Object obj, ffgu ffguVar) {
        ffrh ffrhVar = new ffrh(ffhi.c(ffguVar), 1);
        ffrhVar.B();
        egVar.h.b(str, aduVar, new dskh(ffrhVar)).a(obj, null);
        Object m = ffrhVar.m();
        if (m == ffhh.a) {
            ffguVar.getClass();
        }
        return m;
    }
}
