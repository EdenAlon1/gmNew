package defpackage;

import android.content.Context;
import android.os.Process;
import android.os.UserManager;
import android.util.Base64;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class delf implements dekx {
    private static final enru c = enru.c("com/google/android/apps/messaging/welcome/v1/consent/AsterismProfilesConsentClientProxyImpl");
    public final ffbr a;
    public final ffbr b;
    private final Context d;
    private final ffhd e;
    private final eisx f;
    private final ejar g;
    private final ffbr h;
    private final ffbr i;
    private final AtomicInteger j;
    private final ffbz k;

    public delf(Context context, ffhd ffhdVar, ffbr ffbrVar, eisx eisxVar, ejar ejarVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4) {
        context.getClass();
        ffhdVar.getClass();
        eisxVar.getClass();
        ejarVar.getClass();
        this.d = context;
        this.e = ffhdVar;
        this.a = ffbrVar;
        this.f = eisxVar;
        this.g = ejarVar;
        this.h = ffbrVar2;
        this.i = ffbrVar3;
        this.b = ffbrVar4;
        this.j = new AtomicInteger();
        this.k = ffca.a(new ffix() { // from class: deky
            @Override // defpackage.ffix
            public final Object invoke() {
                evuc evucVar = (evuc) evud.a.createBuilder();
                evum evumVar = (evum) evun.a.createBuilder();
                evup a = dezf.a();
                evumVar.copyOnWrite();
                evun evunVar = (evun) evumVar.instance;
                a.getClass();
                evunVar.c = a;
                evunVar.b |= 1;
                evucVar.copyOnWrite();
                evud evudVar = (evud) evucVar.instance;
                evun evunVar2 = (evun) evumVar.build();
                evunVar2.getClass();
                evudVar.c = evunVar2;
                evudVar.b |= 1;
                return Base64.encodeToString(((evud) evucVar.build()).toByteArray(), 0);
            }
        });
    }

    private final Long f() {
        UserManager userManager = (UserManager) this.d.getSystemService("user");
        if (userManager != null) {
            return Long.valueOf(userManager.getSerialNumberForUser(Process.myUserHandle()));
        }
        return null;
    }

    private final Object g(ffgu ffguVar) {
        return ffra.a(ekxi.a(this.e), new delb(null, this), ffguVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x008a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.dekx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r6, defpackage.dekw r7, defpackage.ffgu r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.dele
            if (r0 == 0) goto L13
            r0 = r8
            dele r0 = (defpackage.dele) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dele r0 = new dele
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.ffci.b(r8)
            return r8
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            java.lang.String r6 = r0.e
            delf r7 = r0.d
            defpackage.ffci.b(r8)
            goto L75
        L3a:
            defpackage.ffci.b(r8)
            r0.d = r5
            r0.e = r6
            r0.c = r4
            ffbr r8 = r5.i
            java.lang.Object r8 = r8.b()
            delm r8 = (defpackage.delm) r8
            java.lang.String r8 = r8.a()
            boolean r8 = defpackage.ffkj.e(r6, r8)
            if (r8 == 0) goto L5b
            java.lang.Object r7 = r5.c(r6, r4, r7, r0)
        L59:
            r8 = r7
            goto L72
        L5b:
            ffbr r8 = r5.i
            java.lang.Object r8 = r8.b()
            delm r8 = (defpackage.delm) r8
            java.lang.String r8 = r8.b()
            boolean r8 = defpackage.ffkj.e(r6, r8)
            if (r8 == 0) goto L8c
            java.lang.Object r7 = r5.b(r4, r7, r0)
            goto L59
        L72:
            if (r8 == r1) goto L8b
            r7 = r5
        L75:
            com.google.android.gms.asterism.SetAsterismConsentRequest r8 = (com.google.android.gms.asterism.SetAsterismConsentRequest) r8
            r8.getClass()
            r2 = 0
            r0.d = r2
            r0.e = r2
            r0.c = r3
            java.lang.String r2 = "setConsented"
            java.lang.Object r6 = r7.d(r8, r6, r2, r0)
            if (r6 != r1) goto L8a
            goto L8b
        L8a:
            return r6
        L8b:
            return r1
        L8c:
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "ToS Message ID is unknown: "
            java.lang.String r6 = r8.concat(r6)
            r7.<init>(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.delf.a(java.lang.String, dekw, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(int r7, defpackage.dekw r8, defpackage.ffgu r9) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.delf.b(int, dekw, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r8, int r9, defpackage.dekw r10, defpackage.ffgu r11) {
        /*
            Method dump skipped, instructions count: 321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.delf.c(java.lang.String, int, dekw, ffgu):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(com.google.android.gms.asterism.SetAsterismConsentRequest r17, java.lang.String r18, java.lang.String r19, defpackage.ffgu r20) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.delf.d(com.google.android.gms.asterism.SetAsterismConsentRequest, java.lang.String, java.lang.String, ffgu):java.lang.Object");
    }

    public final String e() {
        return (String) this.k.a();
    }
}
