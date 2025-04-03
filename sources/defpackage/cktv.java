package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cktv {
    public final dtuu a;
    public final ffhd b;
    public final ffsk c;
    public final ffbr d;
    public final cqoh e;

    public cktv(dtuu dtuuVar, ffhd ffhdVar, ffsk ffskVar, ffbr ffbrVar, cqoh cqohVar) {
        dtuuVar.getClass();
        ffhdVar.getClass();
        ffskVar.getClass();
        ffbrVar.getClass();
        cqohVar.getClass();
        this.a = dtuuVar;
        this.b = ffhdVar;
        this.c = ffskVar;
        this.d = ffbrVar;
        this.e = cqohVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Integer c(final ConversationIdType conversationIdType) {
        bsob e = bsom.e();
        e.z("MmsGroupUpgradeDatabaseOperations#getMmsGroupUpgradeRetriesBlocking");
        e.g(new Function() { // from class: cktf
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((bskp) obj).at;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        e.i(new Function() { // from class: cktg
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bsol bsolVar = (bsol) obj;
                bsolVar.q(ConversationIdType.this);
                return bsolVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        e.x(1);
        engw y = e.b().y();
        y.getClass();
        ArrayList arrayList = new ArrayList(ffdx.n(y, 10));
        enqv it = y.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((bseh) it.next()).n()));
        }
        return (Integer) ffdx.U(arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r6, defpackage.ffgu r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.cktm
            if (r0 == 0) goto L13
            r0 = r7
            cktm r0 = (defpackage.cktm) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cktm r0 = new cktm
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r7)
            goto L47
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            defpackage.ffci.b(r7)
            ffhd r7 = r5.b
            ffhd r7 = defpackage.ekxi.a(r7)
            cktl r2 = new cktl
            r4 = 0
            r2.<init>(r4, r5, r6)
            r0.c = r3
            java.lang.Object r7 = defpackage.ffra.a(r7, r2, r0)
            if (r7 != r1) goto L47
            return r1
        L47:
            r7.getClass()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cktv.a(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r16, java.lang.String r17, java.lang.String r18, defpackage.cknh r19, java.lang.String r20, defpackage.aoku r21, com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId r22, java.util.List r23, defpackage.ffgu r24) {
        /*
            r15 = this;
            r0 = r24
            boolean r1 = r0 instanceof defpackage.cktq
            if (r1 == 0) goto L15
            r1 = r0
            cktq r1 = (defpackage.cktq) r1
            int r3 = r1.c
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L15
            int r3 = r3 - r4
            r1.c = r3
            goto L1a
        L15:
            cktq r1 = new cktq
            r1.<init>(r15, r0)
        L1a:
            r11 = r1
            java.lang.Object r0 = r11.a
            ffhh r12 = defpackage.ffhh.a
            int r1 = r11.c
            r13 = 1
            if (r1 == 0) goto L32
            if (r1 != r13) goto L2a
            defpackage.ffci.b(r0)
            goto L5b
        L2a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L32:
            defpackage.ffci.b(r0)
            ffhd r0 = r15.b
            ffhd r14 = defpackage.ekxi.a(r0)
            cktp r0 = new cktp
            r1 = 0
            r2 = r15
            r8 = r16
            r3 = r17
            r4 = r18
            r6 = r19
            r9 = r20
            r7 = r21
            r5 = r22
            r10 = r23
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r11.c = r13
            java.lang.Object r0 = defpackage.ffra.a(r14, r0, r11)
            if (r0 != r12) goto L5b
            return r12
        L5b:
            r0.getClass()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cktv.b(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType, java.lang.String, java.lang.String, cknh, java.lang.String, aoku, com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId, java.util.List, ffgu):java.lang.Object");
    }
}
