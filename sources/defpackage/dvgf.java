package defpackage;

import android.content.Context;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvgf implements dvfu {
    public final ealf a;
    public final fazb b;
    public final Context c;
    public final ealb d;
    public final ealb e;
    public final ealb f;
    public final ealb g;
    private final ffhd h;

    public dvgf(ealf ealfVar, fazb fazbVar, ffhd ffhdVar, Context context, Map map) {
        ealfVar.getClass();
        fazbVar.getClass();
        ffhdVar.getClass();
        context.getClass();
        this.a = ealfVar;
        this.b = fazbVar;
        this.h = ffhdVar;
        this.c = context;
        Object obj = map.get("GK_ONEOFF_SYNC");
        if (obj == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        this.d = (ealb) obj;
        Object obj2 = map.get("GK_PERIODIC_SYNC");
        if (obj2 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        this.e = (ealb) obj2;
        Object obj3 = map.get("GK_STORAGE_CLEANUP");
        if (obj3 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        this.f = (ealb) obj3;
        this.g = (ealb) map.get("GK_PERMISSIONS_STATE_LOGGING");
    }

    @Override // defpackage.dvfu
    public final Object a(ffgu ffguVar) {
        Object a = ffra.a(this.h, new dvgb(this, null), ffguVar);
        return a == ffhh.a ? a : ffcu.a;
    }

    @Override // defpackage.dvfu
    public final Object b(ffgu ffguVar) {
        Object a = ffra.a(this.h, new dvgc(this, null), ffguVar);
        return a == ffhh.a ? a : ffcu.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(android.content.SharedPreferences r10, android.content.SharedPreferences.Editor r11, defpackage.ffgu r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof defpackage.dvgd
            if (r0 == 0) goto L13
            r0 = r12
            dvgd r0 = (defpackage.dvgd) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            dvgd r0 = new dvgd
            r0.<init>(r9, r12)
        L18:
            r5 = r0
            java.lang.Object r12 = r5.b
            ffhh r0 = defpackage.ffhh.a
            int r1 = r5.d
            java.lang.String r7 = "FIRST_STARTUP"
            r8 = 1
            if (r1 == 0) goto L34
            if (r1 != r8) goto L2c
            java.lang.Object r11 = r5.a
            defpackage.ffci.b(r12)
            goto L5d
        L2c:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L34:
            defpackage.ffci.b(r12)
            fdoq r12 = defpackage.fdoq.a
            fdor r12 = r12.get()
            boolean r12 = r12.g()
            if (r12 == 0) goto L66
            r12 = 0
            boolean r10 = r10.getBoolean(r7, r12)
            if (r10 != 0) goto L66
            ealf r1 = r9.a
            ealb r2 = r9.d
            r5.a = r11
            r5.d = r8
            r4 = 0
            r6 = 14
            r3 = 0
            java.lang.Object r12 = defpackage.eale.b(r1, r2, r3, r4, r5, r6)
            if (r12 != r0) goto L5d
            return r0
        L5d:
            eafl r12 = (defpackage.eafl) r12
            android.content.SharedPreferences$Editor r10 = r11.putBoolean(r7, r8)
            r10.apply()
        L66:
            ffcu r10 = defpackage.ffcu.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dvgf.c(android.content.SharedPreferences, android.content.SharedPreferences$Editor, ffgu):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x009d, code lost:
    
        if (r13 != r0) goto L30;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(android.content.SharedPreferences.Editor r12, defpackage.ffgu r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof defpackage.dvge
            if (r0 == 0) goto L13
            r0 = r13
            dvge r0 = (defpackage.dvge) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            dvge r0 = new dvge
            r0.<init>(r11, r13)
        L18:
            r5 = r0
            java.lang.Object r13 = r5.c
            ffhh r0 = defpackage.ffhh.a
            int r1 = r5.e
            r7 = 3
            r8 = 2
            r9 = 1
            if (r1 == 0) goto L50
            if (r1 == r9) goto L45
            if (r1 == r8) goto L3b
            if (r1 != r7) goto L33
            java.lang.Object r12 = r5.a
            android.content.SharedPreferences$Editor r12 = (android.content.SharedPreferences.Editor) r12
            defpackage.ffci.b(r13)
            goto L9f
        L33:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L3b:
            java.lang.Object r12 = r5.b
            java.lang.Object r1 = r5.a
            dvgf r1 = (defpackage.dvgf) r1
            defpackage.ffci.b(r13)
            goto L7f
        L45:
            java.lang.Object r12 = r5.b
            java.lang.Object r1 = r5.a
            dvgf r1 = (defpackage.dvgf) r1
            defpackage.ffci.b(r13)
            r10 = r1
            goto L68
        L50:
            defpackage.ffci.b(r13)
            ealf r1 = r11.a
            ealb r2 = r11.e
            r5.a = r11
            r5.b = r12
            r5.e = r9
            r4 = 0
            r6 = 14
            r3 = 0
            java.lang.Object r13 = defpackage.eale.b(r1, r2, r3, r4, r5, r6)
            if (r13 == r0) goto La9
            r10 = r11
        L68:
            eafl r13 = (defpackage.eafl) r13
            ealf r1 = r10.a
            ealb r2 = r10.f
            r5.a = r10
            r5.b = r12
            r5.e = r8
            r4 = 0
            r6 = 14
            r3 = 0
            java.lang.Object r13 = defpackage.eale.b(r1, r2, r3, r4, r5, r6)
            if (r13 == r0) goto La9
            r1 = r10
        L7f:
            eafl r13 = (defpackage.eafl) r13
            ealb r13 = r1.g
            if (r13 == 0) goto La1
            boolean r13 = defpackage.dvmp.a
            if (r13 == 0) goto La1
            r10 = r1
            ealf r1 = r10.a
            ealb r2 = r10.g
            r5.a = r12
            r13 = 0
            r5.b = r13
            r5.e = r7
            r4 = 0
            r6 = 14
            r3 = 0
            java.lang.Object r13 = defpackage.eale.b(r1, r2, r3, r4, r5, r6)
            if (r13 == r0) goto La9
        L9f:
            eafl r13 = (defpackage.eafl) r13
        La1:
            java.lang.String r13 = "GNP_JOBS_WERE_SCHEDULED"
            r12.putBoolean(r13, r9)
            ffcu r12 = defpackage.ffcu.a
            return r12
        La9:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dvgf.d(android.content.SharedPreferences$Editor, ffgu):java.lang.Object");
    }
}
