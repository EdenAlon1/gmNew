package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.api.messaging.MessageId;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aabi implements aaaq {
    private static final enru g = enru.c("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/content/MessageBubbleContentUiAdapterImpl");
    private final ffbr A;
    private final aabt B;
    private final cstx C;
    private final atup D;
    private final auol E;
    public final Context a;
    public final ffsk b;
    public final ffsk c;
    public final alye d;
    public final asnh e;
    public final athc f;
    private final zxk h;
    private final zwk i;
    private final aaee j;
    private final aafq k;
    private final aans l;
    private final zxb m;
    private final aapg n;
    private final aalh o;
    private final aaam p;
    private final aalm q;
    private final fazb r;
    private final aaka s;
    private final ffbr t;
    private final ffbr u;
    private final aabx v;
    private final aakf w;
    private final aspz x;
    private final askd y;
    private final cnpd z;

    public aabi(Context context, ffsk ffskVar, ffsk ffskVar2, alye alyeVar, zxk zxkVar, zwk zwkVar, aaee aaeeVar, aafq aafqVar, aans aansVar, zxb zxbVar, aapg aapgVar, aalh aalhVar, aaam aaamVar, aalm aalmVar, fazb fazbVar, aaka aakaVar, ffbr ffbrVar, ffbr ffbrVar2, aabx aabxVar, aakf aakfVar, aspz aspzVar, askd askdVar, cnpd cnpdVar, ffbr ffbrVar3, asnh asnhVar, aabt aabtVar, cstx cstxVar, atup atupVar, athc athcVar, auol auolVar) {
        context.getClass();
        ffskVar.getClass();
        ffskVar2.getClass();
        alyeVar.getClass();
        zxkVar.getClass();
        aaeeVar.getClass();
        aapgVar.getClass();
        fazbVar.getClass();
        ffbrVar.getClass();
        ffbrVar2.getClass();
        askdVar.getClass();
        cnpdVar.getClass();
        ffbrVar3.getClass();
        cstxVar.getClass();
        auolVar.getClass();
        this.a = context;
        this.b = ffskVar;
        this.c = ffskVar2;
        this.d = alyeVar;
        this.h = zxkVar;
        this.i = zwkVar;
        this.j = aaeeVar;
        this.k = aafqVar;
        this.l = aansVar;
        this.m = zxbVar;
        this.n = aapgVar;
        this.o = aalhVar;
        this.p = aaamVar;
        this.q = aalmVar;
        this.r = fazbVar;
        this.s = aakaVar;
        this.t = ffbrVar;
        this.u = ffbrVar2;
        this.v = aabxVar;
        this.w = aakfVar;
        this.x = aspzVar;
        this.y = askdVar;
        this.z = cnpdVar;
        this.A = ffbrVar3;
        this.e = asnhVar;
        this.B = aabtVar;
        this.C = cstxVar;
        this.D = atupVar;
        this.f = athcVar;
        this.E = auolVar;
    }

    private static final boolean e(apqd apqdVar) {
        String b = apqdVar.b();
        b.getClass();
        return ffpc.t(b, "image");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    @Override // defpackage.aaaq
    public final defpackage.axrc a(defpackage.ffsk r46, defpackage.aaap r47) {
        /*
            Method dump skipped, instructions count: 2303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aabi.a(ffsk, aaap):axrc");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b2, code lost:
    
        if (defpackage.fgfz.c(r10, r0) != r1) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.alxr r9, defpackage.ffgu r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.aabf
            if (r0 == 0) goto L13
            r0 = r10
            aabf r0 = (defpackage.aabf) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            aabf r0 = new aabf
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.c
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L41
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r9 = r0.a
            alxr r9 = (defpackage.alxr) r9
            defpackage.ffci.b(r10)
            goto Lb4
        L2f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L37:
            java.lang.Object r9 = r0.b
            java.lang.Object r2 = r0.a
            aabi r2 = (defpackage.aabi) r2
            defpackage.ffci.b(r10)
            goto L78
        L41:
            defpackage.ffci.b(r10)
            int r10 = r9.B()
            if (r10 == r4) goto Lc1
            fazb r10 = r8.r
            java.lang.Object r10 = r10.b()
            algm r10 = (defpackage.algm) r10
            effy r10 = r10.a
            com.google.common.util.concurrent.ListenableFuture r10 = r10.a()
            alfq r2 = new alfq
            r2.<init>()
            erpp r5 = defpackage.erpp.a
            com.google.common.util.concurrent.ListenableFuture r10 = defpackage.elfr.j(r10, r2, r5)
            elfl r10 = defpackage.elfl.g(r10)
            r10.getClass()
            r0.a = r8
            r0.b = r9
            r0.e = r4
            java.lang.Object r10 = defpackage.fgfz.c(r10, r0)
            if (r10 != r1) goto L77
            goto Lc0
        L77:
            r2 = r8
        L78:
            java.lang.Long r10 = (java.lang.Long) r10
            long r4 = defpackage.zsr.a(r9)
            long r6 = r10.longValue()
            int r10 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r10 < 0) goto L87
            goto Lc1
        L87:
            fazb r10 = r2.r
            java.lang.Object r10 = r10.b()
            algm r10 = (defpackage.algm) r10
            effy r10 = r10.a
            algd r2 = new algd
            r2.<init>()
            emwl r2 = defpackage.eldl.a(r2)
            erpp r4 = defpackage.erpp.a
            com.google.common.util.concurrent.ListenableFuture r10 = r10.b(r2, r4)
            elfl r10 = defpackage.elfl.g(r10)
            r10.getClass()
            r0.a = r9
            r2 = 0
            r0.b = r2
            r0.e = r3
            java.lang.Object r10 = defpackage.fgfz.c(r10, r0)
            if (r10 == r1) goto Lc0
        Lb4:
            boolean r9 = defpackage.zsr.r(r9)
            if (r9 == 0) goto Lbd
            czmi r9 = defpackage.czmi.c
            return r9
        Lbd:
            czmi r9 = defpackage.czmi.b
            return r9
        Lc0:
            return r1
        Lc1:
            czmi r9 = defpackage.czmi.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aabi.b(alxr, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.alxr r5, defpackage.ffgu r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.aabh
            if (r0 == 0) goto L13
            r0 = r6
            aabh r0 = (defpackage.aabh) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            aabh r0 = new aabh
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            aabi r5 = r0.d
            defpackage.ffci.b(r6)
            goto L3f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.ffci.b(r6)
            r0.d = r4
            r0.c = r3
            java.lang.Object r6 = r4.b(r5, r0)
            if (r6 == r1) goto L63
            r5 = r4
        L3f:
            czmi r6 = (defpackage.czmi) r6
            czmi r0 = defpackage.czmi.b
            if (r6 != r0) goto L51
            ffbr r5 = r5.t
            java.lang.Object r5 = r5.b()
            czmh r5 = (defpackage.czmh) r5
            r5.a()
            goto L60
        L51:
            czmi r0 = defpackage.czmi.c
            if (r6 != r0) goto L60
            ffbr r5 = r5.t
            java.lang.Object r5 = r5.b()
            czmh r5 = (defpackage.czmh) r5
            r5.b()
        L60:
            ffcu r5 = defpackage.ffcu.a
            return r5
        L63:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aabi.c(alxr, ffgu):java.lang.Object");
    }

    public final void d(MessageId messageId) {
        axol.k(this.b, null, new aabg(this, messageId, null), 3);
    }
}
