package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amta implements amsm {
    public final ffsk a;
    public final becj b;
    public final BugleConversationId c;
    public final aqge d;
    public ctbx e;
    public final ctbl f;
    private final ffsk g;
    private final ctbk h;
    private final ffbr i;
    private final ffbr j;
    private final ffbr k;

    public amta(ffsk ffskVar, ffsk ffskVar2, ctbk ctbkVar, becj becjVar, ffbr ffbrVar, ffbr ffbrVar2, BugleConversationId bugleConversationId, aqge aqgeVar, ffbr ffbrVar3) {
        this.g = ffskVar;
        this.a = ffskVar2;
        this.h = ctbkVar;
        this.b = becjVar;
        this.i = ffbrVar;
        this.j = ffbrVar2;
        this.c = bugleConversationId;
        this.d = aqgeVar;
        this.k = ffbrVar3;
        this.f = ctbkVar.a(new amsu(this));
    }

    public static final bthu j(final ConversationIdType conversationIdType) {
        Object apply;
        String[] strArr = bthy.a;
        bthv bthvVar = new bthv(bthy.a);
        bthvVar.z("loadPenpalState");
        apply = new Function() { // from class: amsn
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bthx bthxVar = (bthx) obj;
                bthxVar.aq(new dtrt("gemini.conversation_id", 1, Long.valueOf(bdgq.a(ConversationIdType.this))));
                return bthxVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }.apply(new bthx());
        bthvVar.k(new bthw((bthx) apply));
        return bthvVar.b();
    }

    @Override // defpackage.aqge
    public final ctbx a(final aqgd aqgdVar) {
        return this.f.a(new ctbf() { // from class: amsp
            @Override // defpackage.ctbf
            public final elfl a(Object obj) {
                return aqgd.this.a();
            }
        }, "PenpalObservableSupplier::register", "PenpalObservableSupplier::callback", "PenpalObservableSupplier::unregister");
    }

    @Override // defpackage.aqge
    public final /* bridge */ /* synthetic */ elfl b() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.aqge
    public final /* bridge */ /* synthetic */ Object c() {
        throw new UnsupportedOperationException();
    }

    public final elfl d() {
        elfl c;
        c = axol.c(this.g, ffhe.a, ffsm.a, new amsy(this, null));
        return c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006c, code lost:
    
        if (r8 == r1) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r8, defpackage.aqux r9, defpackage.ffgu r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof defpackage.amsr
            if (r0 == 0) goto L13
            r0 = r10
            amsr r0 = (defpackage.amsr) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            amsr r0 = new amsr
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3f
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            defpackage.ffci.b(r10)
            ffch r10 = (defpackage.ffch) r10
            java.lang.Object r8 = r10.a
            goto L6e
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            java.lang.Object r8 = r0.a
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r9 = r0.e
            defpackage.ffci.b(r10)
            goto L60
        L3f:
            defpackage.ffci.b(r10)
            ffbr r10 = r7.i
            java.lang.Object r10 = r10.b()
            j$.util.Optional r10 = (j$.util.Optional) r10
            java.lang.Object r10 = r10.get()
            cjed r10 = (defpackage.cjed) r10
            r0.e = r8
            r0.a = r10
            r0.d = r4
            java.lang.Object r9 = r7.f(r9, r0)
            if (r9 == r1) goto L74
            r6 = r9
            r9 = r8
            r8 = r10
            r10 = r6
        L60:
            azsu r10 = (defpackage.azsu) r10
            r0.e = r5
            r0.a = r5
            r0.d = r3
            java.lang.Object r8 = r8.b(r10, r9, r0)
            if (r8 == r1) goto L74
        L6e:
            boolean r9 = r8 instanceof defpackage.ffcg
            if (r9 == 0) goto L73
            return r5
        L73:
            return r8
        L74:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amta.e(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType, aqux, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.aqux r5, defpackage.ffgu r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.amss
            if (r0 == 0) goto L13
            r0 = r6
            amss r0 = (defpackage.amss) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            amss r0 = new amss
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r6)
            goto L5f
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.ffci.b(r6)
            j$.util.Optional r5 = r5.m()
            java.lang.Object r5 = r5.get()
            aoku r5 = (defpackage.aoku) r5
            java.lang.String r5 = r5.o()
            ffbr r6 = r4.j
            java.lang.Object r6 = r6.b()
            avkc r6 = (defpackage.avkc) r6
            awui r5 = r6.c(r5)
            ffbr r6 = r4.k
            java.lang.Object r6 = r6.b()
            azoq r6 = (defpackage.azoq) r6
            r5.getClass()
            r0.c = r3
            java.lang.Object r6 = r6.a(r5, r0)
            if (r6 == r1) goto L70
        L5f:
            azop r6 = (defpackage.azop) r6
            if (r6 == 0) goto L68
            azsu r5 = r6.b()
            return r5
        L68:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "My identity not found while retrieving MyIdentityToken"
            r5.<init>(r6)
            throw r5
        L70:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amta.f(aqux, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.ffgu r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.amsv
            if (r0 == 0) goto L13
            r0 = r5
            amsv r0 = (defpackage.amsv) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            amsv r0 = new amsv
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r5)
            goto L40
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.ffci.b(r5)
            aqge r5 = r4.d
            elfl r5 = r5.b()
            r0.c = r3
            java.lang.Object r5 = defpackage.fgfz.c(r5, r0)
            if (r5 == r1) goto L7a
        L40:
            r5.getClass()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            boolean r0 = r5 instanceof java.util.Collection
            r1 = 0
            if (r0 == 0) goto L55
            r0 = r5
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L55
        L53:
            r3 = r1
            goto L75
        L55:
            java.util.Iterator r5 = r5.iterator()
        L59:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L53
            java.lang.Object r0 = r5.next()
            com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r0 = (com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient) r0
            aoku r0 = r0.g()
            java.lang.String r0 = r0.o()
            java.lang.String r2 = "+18339913448"
            boolean r0 = defpackage.ffkj.e(r0, r2)
            if (r0 == 0) goto L59
        L75:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        L7a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amta.g(ffgu):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v5, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r18, defpackage.aqux r19, int r20, defpackage.ffgu r21) {
        /*
            Method dump skipped, instructions count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amta.h(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType, aqux, int, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(defpackage.bthu r5, defpackage.ffgu r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.amsz
            if (r0 == 0) goto L13
            r0 = r6
            amsz r0 = (defpackage.amsz) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            amsz r0 = new amsz
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r6)
            goto L41
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.ffci.b(r6)
            elfl r5 = r5.w()
            r5.getClass()
            r0.c = r3
            java.lang.Object r6 = defpackage.fgfz.c(r5, r0)
            if (r6 == r1) goto L5c
        L41:
            r6.getClass()
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r5 = defpackage.ffdx.U(r6)
            bthd r5 = (defpackage.bthd) r5
            if (r5 == 0) goto L56
            java.lang.String r6 = "desired_gemini_state"
            r5.az(r3, r6)
            boolean r5 = r5.b
            goto L57
        L56:
            r5 = 0
        L57:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        L5c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amta.i(bthu, ffgu):java.lang.Object");
    }
}
