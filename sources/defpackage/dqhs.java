package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import j$.util.Optional;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqhs {
    public static final ffbz a = ffca.a(new ffix() { // from class: dqgy
        @Override // defpackage.ffix
        public final Object invoke() {
            ffbz ffbzVar = dqhs.a;
            return eepm.a("com.android.providers.telephony");
        }
    });
    public static final ffbz b = ffca.a(new ffix() { // from class: dqgz
        @Override // defpackage.ffix
        public final Object invoke() {
            ffbz ffbzVar = dqhs.a;
            return new dqhg();
        }
    });
    public static final ffbz c = ffca.a(new ffix() { // from class: dqha
        @Override // defpackage.ffix
        public final Object invoke() {
            ffbz ffbzVar = dqhs.a;
            return new dqhf();
        }
    });
    public static final ffbz d = ffca.a(new ffix() { // from class: dqhb
        @Override // defpackage.ffix
        public final Object invoke() {
            ffbz ffbzVar = dqhs.a;
            return new dqhe();
        }
    });
    public static final ffbz e = ffca.a(new ffix() { // from class: dqhc
        @Override // defpackage.ffix
        public final Object invoke() {
            ffbz ffbzVar = dqhs.a;
            return ffdx.g("MOTOROLA", "LGE", "HUAWEI", "VIVO");
        }
    });
    public static final ffbz f = ffca.a(new ffix() { // from class: dqhd
        @Override // defpackage.ffix
        public final Object invoke() {
            ffbz ffbzVar = dqhs.a;
            eepm eepmVar = eepm.a;
            eepl eeplVar = new eepl();
            eeplVar.d();
            eeplVar.c();
            eeplVar.b((eepr) dqhs.b.a());
            eeplVar.b((eepr) dqhs.c.a());
            Iterator it = ((List) dqhs.e.a()).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (ffpc.j(Build.MANUFACTURER, (String) it.next(), true)) {
                    eeplVar.b((eepr) dqhs.d.a());
                    break;
                }
            }
            return eeplVar.a();
        }
    });
    public final Context g;
    private final ffsk h;
    private final ffbz i;

    public dqhs(Context context, ffsk ffskVar, final ffbr ffbrVar) {
        context.getClass();
        ffskVar.getClass();
        ffbrVar.getClass();
        this.g = context;
        this.h = ffskVar;
        this.i = ffca.a(new ffix() { // from class: dqgx
            @Override // defpackage.ffix
            public final Object invoke() {
                ffbz ffbzVar = dqhs.a;
                Object b2 = ffbr.this.b();
                b2.getClass();
                Boolean bool = (Boolean) fflm.a((Optional) b2, false);
                bool.booleanValue();
                return bool;
            }
        });
    }

    private final Object h(Uri uri, ffgu ffguVar) {
        return ffra.a(this.h.hT(), new dqhh(uri, this, null), ffguVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(android.net.Uri r6, defpackage.ffgu r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.dqhi
            if (r0 == 0) goto L13
            r0 = r7
            dqhi r0 = (defpackage.dqhi) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            dqhi r0 = new dqhi
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.ffci.b(r7)
            return r7
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            java.lang.Object r6 = r0.a
            dqhs r2 = r0.e
            defpackage.ffci.b(r7)
            goto L4a
        L3a:
            defpackage.ffci.b(r7)
            r0.e = r5
            r0.a = r6
            r0.d = r4
            java.lang.Object r7 = r5.g(r6, r0)
            if (r7 == r1) goto L5d
            r2 = r5
        L4a:
            eepm r7 = (defpackage.eepm) r7
            r4 = 0
            r0.e = r4
            r0.a = r4
            r0.d = r3
            android.net.Uri r6 = (android.net.Uri) r6
            java.lang.Object r6 = r2.b(r6, r7, r0)
            if (r6 != r1) goto L5c
            goto L5d
        L5c:
            return r6
        L5d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dqhs.a(android.net.Uri, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(android.net.Uri r6, defpackage.eepm r7, defpackage.ffgu r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.dqhj
            if (r0 == 0) goto L13
            r0 = r8
            dqhj r0 = (defpackage.dqhj) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dqhj r0 = new dqhj
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r8)
            goto L47
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            defpackage.ffci.b(r8)
            ffsk r8 = r5.h
            ffhd r8 = r8.hT()
            dqhk r2 = new dqhk
            r4 = 0
            r2.<init>(r5, r6, r7, r4)
            r0.c = r3
            java.lang.Object r8 = defpackage.ffra.a(r8, r2, r0)
            if (r8 != r1) goto L47
            return r1
        L47:
            r8.getClass()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dqhs.b(android.net.Uri, eepm, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(android.net.Uri r6, defpackage.ffgu r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.dqhl
            if (r0 == 0) goto L13
            r0 = r7
            dqhl r0 = (defpackage.dqhl) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            dqhl r0 = new dqhl
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.ffci.b(r7)
            return r7
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            java.lang.Object r6 = r0.a
            dqhs r2 = r0.e
            defpackage.ffci.b(r7)
            goto L4a
        L3a:
            defpackage.ffci.b(r7)
            r0.e = r5
            r0.a = r6
            r0.d = r4
            java.lang.Object r7 = r5.g(r6, r0)
            if (r7 == r1) goto L5d
            r2 = r5
        L4a:
            eepm r7 = (defpackage.eepm) r7
            r4 = 0
            r0.e = r4
            r0.a = r4
            r0.d = r3
            android.net.Uri r6 = (android.net.Uri) r6
            java.lang.Object r6 = r2.d(r6, r7, r0)
            if (r6 != r1) goto L5c
            goto L5d
        L5c:
            return r6
        L5d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dqhs.c(android.net.Uri, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(android.net.Uri r6, defpackage.eepm r7, defpackage.ffgu r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.dqhm
            if (r0 == 0) goto L13
            r0 = r8
            dqhm r0 = (defpackage.dqhm) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dqhm r0 = new dqhm
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r8)
            goto L47
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            defpackage.ffci.b(r8)
            ffsk r8 = r5.h
            ffhd r8 = r8.hT()
            dqhn r2 = new dqhn
            r4 = 0
            r2.<init>(r5, r6, r7, r4)
            r0.c = r3
            java.lang.Object r8 = defpackage.ffra.a(r8, r2, r0)
            if (r8 != r1) goto L47
            return r1
        L47:
            r8.getClass()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dqhs.d(android.net.Uri, eepm, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(android.net.Uri r6, defpackage.ffgu r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.dqho
            if (r0 == 0) goto L13
            r0 = r7
            dqho r0 = (defpackage.dqho) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            dqho r0 = new dqho
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.ffci.b(r7)
            return r7
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            java.lang.Object r6 = r0.a
            dqhs r2 = r0.e
            defpackage.ffci.b(r7)
            goto L4a
        L3a:
            defpackage.ffci.b(r7)
            r0.e = r5
            r0.a = r6
            r0.d = r4
            java.lang.Object r7 = r5.g(r6, r0)
            if (r7 == r1) goto L5d
            r2 = r5
        L4a:
            eepm r7 = (defpackage.eepm) r7
            r4 = 0
            r0.e = r4
            r0.a = r4
            r0.d = r3
            android.net.Uri r6 = (android.net.Uri) r6
            java.lang.Object r6 = r2.f(r6, r7, r0)
            if (r6 != r1) goto L5c
            goto L5d
        L5c:
            return r6
        L5d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dqhs.e(android.net.Uri, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(android.net.Uri r6, defpackage.eepm r7, defpackage.ffgu r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.dqhp
            if (r0 == 0) goto L13
            r0 = r8
            dqhp r0 = (defpackage.dqhp) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dqhp r0 = new dqhp
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r8)
            goto L47
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            defpackage.ffci.b(r8)
            ffsk r8 = r5.h
            ffhd r8 = r8.hT()
            dqhq r2 = new dqhq
            r4 = 0
            r2.<init>(r5, r6, r7, r4)
            r0.c = r3
            java.lang.Object r8 = defpackage.ffra.a(r8, r2, r0)
            if (r8 != r1) goto L47
            return r1
        L47:
            r8.getClass()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dqhs.f(android.net.Uri, eepm, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(android.net.Uri r6, defpackage.ffgu r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.dqhr
            if (r0 == 0) goto L13
            r0 = r7
            dqhr r0 = (defpackage.dqhr) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dqhr r0 = new dqhr
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            dqhs r6 = r0.d
            defpackage.ffci.b(r7)
            goto L7c
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            dqhs r6 = r0.d
            defpackage.ffci.b(r7)
            goto L56
        L3a:
            defpackage.ffci.b(r7)
            ffbz r7 = r5.i
            java.lang.Object r7 = r7.a()
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L71
            r0.d = r5
            r0.c = r4
            java.lang.Object r7 = r5.h(r6, r0)
            if (r7 == r1) goto Ld1
            r6 = r5
        L56:
            android.content.Context r6 = r6.g
            java.lang.String r6 = r6.getPackageName()
            boolean r6 = defpackage.ffkj.e(r7, r6)
            if (r6 == 0) goto L65
            eepm r6 = defpackage.eepm.c
            goto L6d
        L65:
            ffbz r6 = defpackage.dqhs.f
            java.lang.Object r6 = r6.a()
            eepm r6 = (defpackage.eepm) r6
        L6d:
            r6.getClass()
            return r6
        L71:
            r0.d = r5
            r0.c = r3
            java.lang.Object r7 = r5.h(r6, r0)
            if (r7 == r1) goto Ld1
            r6 = r5
        L7c:
            java.lang.String r7 = (java.lang.String) r7
            android.content.Context r0 = r6.g
            java.lang.String r0 = r0.getPackageName()
            boolean r0 = defpackage.ffkj.e(r7, r0)
            if (r0 == 0) goto L8d
            eepm r6 = defpackage.eepm.c
            goto Lcd
        L8d:
            java.lang.String r0 = "com.android.providers.telephony"
            boolean r7 = defpackage.ffkj.e(r7, r0)
            if (r7 == 0) goto Lcb
            android.content.Context r6 = r6.g
            int r7 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r7 < r0) goto Lb0
            java.lang.Class r7 = defpackage.abk$$ExternalSyntheticApiModelOutline0.m50m()
            java.lang.Object r6 = r6.getSystemService(r7)
            android.app.role.RoleManager r6 = defpackage.abk$$ExternalSyntheticApiModelOutline0.m(r6)
            java.lang.String r7 = "android.app.role.SMS"
            boolean r6 = defpackage.abk$$ExternalSyntheticApiModelOutline0.m55m(r6, r7)
            goto Lc0
        Lb0:
            java.lang.String r7 = android.provider.Telephony.Sms.getDefaultSmsPackage(r6)
            android.content.Context r6 = r6.getApplicationContext()
            java.lang.String r6 = r6.getPackageName()
            boolean r6 = defpackage.ffkj.e(r7, r6)
        Lc0:
            if (r6 == 0) goto Lcb
            ffbz r6 = defpackage.dqhs.a
            java.lang.Object r6 = r6.a()
            eepm r6 = (defpackage.eepm) r6
            goto Lcd
        Lcb:
            eepm r6 = defpackage.eepm.a
        Lcd:
            r6.getClass()
            return r6
        Ld1:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dqhs.g(android.net.Uri, ffgu):java.lang.Object");
    }
}
