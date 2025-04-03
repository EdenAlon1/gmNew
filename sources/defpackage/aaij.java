package defpackage;

import android.content.Context;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaij implements aabj {
    public static final enru a = enru.c("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/reactions/doubletap/DoubleTapCallbackUiAdapterImpl");
    public final Context b;
    public final ffsk c;
    public final ffbr d;
    public final ffbr e;
    public final ffbr f;
    public final ffbr g;
    public final ffbr h;
    private final ffsk i;
    private final alye j;
    private final ffxx k;
    private final ffbr l;
    private final ffbr m;
    private final ffbz n;
    private final ffbz o;

    public aaij(Context context, ffsk ffskVar, ffsk ffskVar2, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, alye alyeVar, ffxx ffxxVar, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7) {
        context.getClass();
        ffskVar.getClass();
        ffskVar2.getClass();
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        ffbrVar4.getClass();
        alyeVar.getClass();
        ffbrVar7.getClass();
        this.b = context;
        this.i = ffskVar;
        this.c = ffskVar2;
        this.d = ffbrVar;
        this.e = ffbrVar2;
        this.f = ffbrVar3;
        this.g = ffbrVar4;
        this.j = alyeVar;
        this.k = ffxxVar;
        this.l = ffbrVar5;
        this.h = ffbrVar6;
        this.m = ffbrVar7;
        this.n = ffca.a(new ffix() { // from class: aahy
            @Override // defpackage.ffix
            public final Object invoke() {
                return (String) ((Optional) aaij.this.d.b()).get();
            }
        });
        this.o = ffca.a(new ffix() { // from class: aahz
            @Override // defpackage.ffix
            public final Object invoke() {
                return apzb.a(aaij.this.f());
            }
        });
    }

    @Override // defpackage.aabj
    public final ffxx a(alxr alxrVar) {
        alxrVar.getClass();
        return new aaif(((abcf) this.l.b()).a(alxrVar, cmsk.a()), this, alxrVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.alxr r7, defpackage.ffgu r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.aaib
            if (r0 == 0) goto L13
            r0 = r8
            aaib r0 = (defpackage.aaib) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            aaib r0 = new aaib
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            aaij r7 = r0.e
            defpackage.ffci.b(r8)
            goto L63
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            java.lang.Object r7 = r0.a
            aaij r7 = r0.f
            aaij r2 = r0.e
            defpackage.ffci.b(r8)
            goto L51
        L3e:
            defpackage.ffci.b(r8)
            r0.e = r6
            r0.f = r6
            r0.a = r7
            r0.d = r4
            java.lang.Object r8 = r6.d(r7, r0)
            if (r8 == r1) goto L9a
            r7 = r6
            r2 = r7
        L51:
            apza r8 = (defpackage.apza) r8
            r0.e = r2
            r5 = 0
            r0.f = r5
            r0.a = r5
            r0.d = r3
            java.lang.Object r8 = r7.h(r8)
            if (r8 == r1) goto L9a
            r7 = r2
        L63:
            cmrm r0 = defpackage.cmrm.REMOVE_REACTION
            r1 = 0
            if (r8 != r0) goto L81
            android.content.Context r8 = r7.b
            android.content.res.Resources r8 = r8.getResources()
            java.lang.String r7 = r7.f()
            java.lang.Object[] r0 = new java.lang.Object[r4]
            r0[r1] = r7
            r7 = 2132083969(0x7f150501, float:1.9808095E38)
            java.lang.String r7 = r8.getString(r7, r0)
            r7.getClass()
            return r7
        L81:
            android.content.Context r8 = r7.b
            android.content.res.Resources r8 = r8.getResources()
            java.lang.String r7 = r7.f()
            java.lang.Object[] r0 = new java.lang.Object[r4]
            r0[r1] = r7
            r7 = 2132083967(0x7f1504ff, float:1.9808091E38)
            java.lang.String r7 = r8.getString(r7, r0)
            r7.getClass()
            return r7
        L9a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aaij.b(alxr, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.alxr r8, defpackage.ffgu r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.aaic
            if (r0 == 0) goto L13
            r0 = r9
            aaic r0 = (defpackage.aaic) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            aaic r0 = new aaic
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            axpr r8 = r0.d
            defpackage.ffci.b(r9)
            goto L55
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L31:
            defpackage.ffci.b(r9)
            com.google.android.apps.messaging.shared.api.messaging.MessageId r9 = r8.b()
            aaia r2 = new aaia
            r2.<init>()
            r4 = 500(0x1f4, double:2.47E-321)
            ffsk r9 = r7.i
            ffji r9 = defpackage.axqa.a(r2, r4, r9)
            r2 = r9
            axpr r2 = (defpackage.axpr) r2
            r0.d = r2
            r0.c = r3
            java.lang.Object r8 = r7.b(r8, r0)
            if (r8 == r1) goto L5d
            r6 = r9
            r9 = r8
            r8 = r6
        L55:
            java.lang.String r9 = (java.lang.String) r9
            aail r0 = new aail
            r0.<init>(r8, r9)
            return r0
        L5d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aaij.c(alxr, ffgu):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0056, code lost:
    
        if (r8 != r1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0072, code lost:
    
        if (r8 != r1) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.alxr r7, defpackage.ffgu r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.aaig
            if (r0 == 0) goto L13
            r0 = r8
            aaig r0 = (defpackage.aaig) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            aaig r0 = new aaig
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3b
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r7 = r0.a
            defpackage.ffci.b(r8)
            goto L74
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            java.lang.Object r7 = r0.a
            defpackage.ffci.b(r8)
            goto L58
        L3b:
            defpackage.ffci.b(r8)
            ffbr r8 = r6.m
            java.lang.Object r8 = r8.b()
            auqo r8 = (defpackage.auqo) r8
            boolean r8 = r8.a()
            if (r8 == 0) goto L68
            ffxx r8 = r6.k
            r0.a = r7
            r0.d = r4
            java.lang.Object r8 = defpackage.fgbj.a(r8, r0)
            if (r8 == r1) goto L8d
        L58:
            aqux r8 = (defpackage.aqux) r8
            if (r8 == 0) goto L67
            apyd r7 = r7.i()
            if (r7 == 0) goto L67
            apza r7 = r7.c(r8)
            return r7
        L67:
            return r5
        L68:
            ffxx r8 = r6.k
            r0.a = r7
            r0.d = r3
            java.lang.Object r8 = defpackage.fgbj.a(r8, r0)
            if (r8 == r1) goto L8d
        L74:
            aqux r8 = (defpackage.aqux) r8
            if (r8 == 0) goto L83
            apyd r7 = r7.i()
            if (r7 == 0) goto L83
            apyv r7 = r7.b(r8)
            goto L84
        L83:
            r7 = r5
        L84:
            if (r7 != 0) goto L87
            return r5
        L87:
            apza r8 = new apza
            r8.<init>(r7, r5)
            return r8
        L8d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aaij.d(alxr, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(com.google.android.apps.messaging.shared.api.messaging.MessageId r5, defpackage.ffgu r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.aaih
            if (r0 == 0) goto L13
            r0 = r6
            aaih r0 = (defpackage.aaih) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            aaih r0 = new aaih
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r6)
            goto L43
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.ffci.b(r6)
            alye r6 = r4.j
            elfl r5 = r6.u(r5)
            r5.getClass()
            r0.c = r3
            java.lang.Object r6 = defpackage.fgfz.c(r5, r0)
            if (r6 == r1) goto L69
        L43:
            r5 = r6
            alxr r5 = (defpackage.alxr) r5
            if (r5 != 0) goto L68
            enru r5 = defpackage.aaij.a
            ensk r5 = r5.j()
            ensn r0 = defpackage.ente.a
            java.lang.String r1 = "BugleDoubleTap"
            r5.Y(r0, r1)
            java.lang.String r0 = "loadMessage"
            r1 = 133(0x85, float:1.86E-43)
            java.lang.String r2 = "com/google/android/apps/messaging/conversation2/messagelist/message/bubble/reactions/doubletap/DoubleTapCallbackUiAdapterImpl"
            java.lang.String r3 = "DoubleTapCallbackUiAdapterImpl.kt"
            ensk r5 = r5.h(r2, r0, r1, r3)
            enrr r5 = (defpackage.enrr) r5
            java.lang.String r0 = "message is null"
            r5.q(r0)
        L68:
            return r6
        L69:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aaij.e(com.google.android.apps.messaging.shared.api.messaging.MessageId, ffgu):java.lang.Object");
    }

    public final String f() {
        return (String) this.n.a();
    }

    public final apxx g() {
        return (apxx) this.o.a();
    }

    public final Object h(apza apzaVar) {
        apyv apyvVar = apzaVar != null ? apzaVar.a : null;
        return apyvVar == null ? cmrm.ADD_REACTION : ffkj.e(apyvVar, g()) ? cmrm.REMOVE_REACTION : cmrm.REPLACE_REACTION;
    }
}
