package defpackage;

import android.app.Activity;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drum {
    private static final enru b = enru.c("com/google/android/libraries/compose/photos/ui/requirements/MissingPhotosAppRequirementRecovery");
    public final eg a;
    private final drte c;
    private final ffbz d;
    private final aesp e;

    public drum(Activity activity, drte drteVar, aesp aespVar) {
        drteVar.getClass();
        this.c = drteVar;
        this.e = aespVar;
        if (!(activity instanceof eg)) {
            throw new IllegalStateException("Check failed.");
        }
        this.a = (eg) activity;
        this.d = ffca.a(new ffix() { // from class: druh
            @Override // defpackage.ffix
            public final Object invoke() {
                Intent launchIntentForPackage = drum.this.a.getPackageManager().getLaunchIntentForPackage("com.google.android.apps.photos");
                launchIntentForPackage.getClass();
                return launchIntentForPackage;
            }
        });
    }

    private final Intent d() {
        return (Intent) this.d.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(int r8, int r9, int r10, defpackage.drsq r11, defpackage.ffgu r12) {
        /*
            r7 = this;
            boolean r0 = r12 instanceof defpackage.druj
            if (r0 == 0) goto L13
            r0 = r12
            druj r0 = (defpackage.druj) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            druj r0 = new druj
            r0.<init>(r7, r12)
        L18:
            r6 = r0
            java.lang.Object r12 = r6.a
            ffhh r0 = defpackage.ffhh.a
            int r1 = r6.c
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L28
            defpackage.ffci.b(r12)
            goto L56
        L28:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L30:
            defpackage.ffci.b(r12)
            eg r12 = r7.a
            java.lang.String r8 = r12.getString(r8)
            r8.getClass()
            java.lang.String r3 = r12.getString(r9)
            r3.getClass()
            java.lang.String r4 = r12.getString(r10)
            r4.getClass()
            r6.c = r2
            r1 = r7
            r2 = r8
            r5 = r11
            java.lang.Object r12 = r1.b(r2, r3, r4, r5, r6)
            if (r12 != r0) goto L56
            return r0
        L56:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            r12.booleanValue()
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.drum.a(int, int, int, drsq, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(final java.lang.String r8, java.lang.String r9, java.lang.String r10, defpackage.drsq r11, defpackage.ffgu r12) {
        /*
            r7 = this;
            boolean r0 = r12 instanceof defpackage.druk
            if (r0 == 0) goto L13
            r0 = r12
            druk r0 = (defpackage.druk) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            druk r0 = new druk
            r0.<init>(r7, r12)
        L18:
            r5 = r0
            java.lang.Object r12 = r5.a
            ffhh r0 = defpackage.ffhh.a
            int r1 = r5.c
            r2 = 1
            if (r1 == 0) goto L34
            if (r1 != r2) goto L2c
            drsq r11 = r5.e
            drum r8 = r5.d
            defpackage.ffci.b(r12)
            goto L58
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L34:
            defpackage.ffci.b(r12)
            aesp r12 = r7.e
            drtw r1 = new drtw
            r1.<init>(r11)
            r12.c(r1)
            eg r1 = r7.a
            drui r4 = new drui
            r4.<init>()
            r5.d = r7
            r5.e = r11
            r5.c = r2
            r6 = 4
            r2 = r9
            r3 = r10
            java.lang.Object r12 = defpackage.dsko.b(r1, r2, r3, r4, r5, r6)
            if (r12 == r0) goto L77
            r8 = r7
        L58:
            r9 = r12
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L6c
            aesp r8 = r8.e
            drtu r9 = new drtu
            r9.<init>(r11)
            r8.c(r9)
            return r12
        L6c:
            aesp r8 = r8.e
            drtv r9 = new drtv
            r9.<init>(r11)
            r8.c(r9)
            return r12
        L77:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.drum.b(java.lang.String, java.lang.String, java.lang.String, drsq, ffgu):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c3, code lost:
    
        if (defpackage.dski.b(r15, r14, r6) == r0) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x018a, code lost:
    
        if (r15 == r0) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0120, code lost:
    
        if (defpackage.dski.b(r15, r14, r6) == r0) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0178, code lost:
    
        if (defpackage.dski.a(r15, "com.google.android.apps.photos", r6) != r0) goto L42;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.doxj r13, defpackage.drsq r14, defpackage.ffgu r15) {
        /*
            Method dump skipped, instructions count: 476
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.drum.c(doxj, drsq, ffgu):java.lang.Object");
    }
}
