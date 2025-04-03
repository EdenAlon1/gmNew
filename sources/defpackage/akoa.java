package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.provider.Telephony;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class akoa implements ekoq {
    public static final /* synthetic */ int a = 0;
    private static final entd b = entd.c("Bugle");
    private static final cfup c = cfvl.n(cfvl.b, "enable_retail_mode_handling", true);
    private final ffsk d;
    private final ffbr e;
    private final ffbr f;
    private final ffbr g;
    private final ffbz h;

    public akoa(ffsk ffskVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3) {
        ffskVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        this.d = ffskVar;
        this.e = ffbrVar;
        this.f = ffbrVar2;
        this.g = ffbrVar3;
        this.h = ffca.a(new ffix() { // from class: aknv
            @Override // defpackage.ffix
            public final Object invoke() {
                int i = akoa.a;
                ArrayList arrayList = new ArrayList();
                Uri uri = Telephony.Sms.CONTENT_URI;
                uri.getClass();
                arrayList.add(new aknw(uri, "type != 2 AND type != 1"));
                Uri uri2 = Telephony.Mms.CONTENT_URI;
                uri2.getClass();
                arrayList.add(new aknw(uri2, null));
                return ffdx.ak(arrayList);
            }
        });
    }

    @Override // defpackage.ekoq
    public final /* bridge */ /* synthetic */ ListenableFuture a(Intent intent) {
        elfl c2;
        c2 = axol.c(this.d, ffhe.a, ffsm.a, new akny(this, intent, null));
        return c2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x00ad -> B:10:0x00ae). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.ffgu r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.aknx
            if (r0 == 0) goto L13
            r0 = r8
            aknx r0 = (defpackage.aknx) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            aknx r0 = new aknx
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.d
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.f
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r2 = r0.c
            java.lang.Object r4 = r0.b
            java.lang.Object r5 = r0.a
            ejtr r6 = r0.g
            defpackage.ffci.b(r8)
            goto Lae
        L30:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L38:
            defpackage.ffci.b(r8)
            ffbr r8 = r7.e
            java.lang.Object r8 = r8.b()
            ctud r8 = (defpackage.ctud) r8
            boolean r8 = r8.r()
            if (r8 != 0) goto L59
            entd r8 = defpackage.akoa.b
            ensk r8 = r8.j()
            ensz r8 = (defpackage.ensz) r8
            java.lang.String r0 = "No SMS permission (likely not the default SMS app), only clearing internal data for retail mode."
            r8.q(r0)
            ffcu r8 = defpackage.ffcu.a
            return r8
        L59:
            entd r8 = defpackage.akoa.b
            ensk r8 = r8.h()
            ensz r8 = (defpackage.ensz) r8
            java.lang.String r2 = "Clearing telephony data."
            r8.q(r2)
            ffbr r8 = r7.f
            java.lang.Object r8 = r8.b()
            ejtr r8 = (defpackage.ejtr) r8
            ffbz r2 = r7.h
            java.lang.Object r2 = r2.a()
            java.util.List r2 = (java.util.List) r2
            java.util.ArrayList r4 = new java.util.ArrayList
            r5 = 10
            int r5 = defpackage.ffdx.n(r2, r5)
            r4.<init>(r5)
            java.util.Iterator r2 = r2.iterator()
            r6 = r4
            r4 = r2
            r2 = r6
            r6 = r8
        L89:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto Lb6
            java.lang.Object r8 = r4.next()
            aknw r8 = (defpackage.aknw) r8
            android.net.Uri r5 = r8.a
            java.lang.String r8 = r8.b
            com.google.common.util.concurrent.ListenableFuture r8 = r6.g(r5, r8)
            r0.g = r6
            r0.a = r2
            r0.b = r4
            r0.c = r2
            r0.f = r3
            java.lang.Object r8 = defpackage.fgfz.c(r8, r0)
            if (r8 == r1) goto Lb5
            r5 = r2
        Lae:
            java.lang.Integer r8 = (java.lang.Integer) r8
            r2.add(r8)
            r2 = r5
            goto L89
        Lb5:
            return r1
        Lb6:
            ffcu r8 = defpackage.ffcu.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akoa.b(ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(android.content.Intent r6, defpackage.ffgu r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.aknz
            if (r0 == 0) goto L13
            r0 = r7
            aknz r0 = (defpackage.aknz) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            aknz r0 = new aknz
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            akoa r6 = r0.e
            defpackage.ffci.b(r7)
            goto L9f
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            java.lang.Object r6 = r0.a
            akoa r2 = r0.e
            defpackage.ffci.b(r7)
            goto L56
        L3d:
            defpackage.ffci.b(r7)
            cfup r7 = defpackage.akoa.c
            elfl r7 = r7.b()
            r7.getClass()
            r0.e = r5
            r0.a = r6
            r0.d = r4
            java.lang.Object r7 = defpackage.fgfz.c(r7, r0)
            if (r7 == r1) goto Lad
            r2 = r5
        L56:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L61
            ffcu r6 = defpackage.ffcu.a
            return r6
        L61:
            r7 = 0
            if (r6 == 0) goto L6b
            android.content.Intent r6 = (android.content.Intent) r6
            java.lang.String r6 = r6.getAction()
            goto L6c
        L6b:
            r6 = r7
        L6c:
            java.lang.String r4 = "com.samsung.sea.rm.DEMO_RESET_STARTED"
            boolean r6 = defpackage.ffkj.e(r6, r4)
            if (r6 != 0) goto L84
            entd r6 = defpackage.akoa.b
            ensk r6 = r6.j()
            ensz r6 = (defpackage.ensz) r6
            java.lang.String r7 = "Received unknown intent in RetailModeReceiver, skipping."
            r6.q(r7)
            ffcu r6 = defpackage.ffcu.a
            return r6
        L84:
            entd r6 = defpackage.akoa.b
            ensk r6 = r6.h()
            ensz r6 = (defpackage.ensz) r6
            java.lang.String r4 = "Received Samsung retail mode intent"
            r6.q(r4)
            r0.e = r2
            r0.a = r7
            r0.d = r3
            java.lang.Object r6 = r2.b(r0)
            if (r6 != r1) goto L9e
            goto Lad
        L9e:
            r6 = r2
        L9f:
            ffbr r6 = r6.g
            java.lang.Object r6 = r6.b()
            csrf r6 = (defpackage.csrf) r6
            r6.a()
            ffcu r6 = defpackage.ffcu.a
            return r6
        Lad:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akoa.c(android.content.Intent, ffgu):java.lang.Object");
    }
}
