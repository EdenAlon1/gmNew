package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
@ffbs
/* loaded from: classes6.dex */
public final class alrr {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/analytics/statistics/MessageStatusEventLogger");
    public final ffbr b;
    public final ffbr c;
    private final ffsk d;
    private final ffhd e;
    private final cqoh f;
    private final ffbr g;

    public alrr(ffsk ffskVar, ffhd ffhdVar, cqoh cqohVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3) {
        ffskVar.getClass();
        ffhdVar.getClass();
        cqohVar.getClass();
        ffbrVar.getClass();
        ffbrVar3.getClass();
        this.d = ffskVar;
        this.e = ffhdVar;
        this.f = cqohVar;
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.g = ffbrVar3;
    }

    public final elfl a(MessageIdType messageIdType, int i) {
        elfl c;
        c = axol.c(this.d, ffhe.a, ffsm.a, new alrq(this, messageIdType, i, akzn.a(this.f), null));
        return c;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType r6, int r7, defpackage.akzo r8, defpackage.ffgu r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof defpackage.alrp
            if (r0 == 0) goto L13
            r0 = r9
            alrp r0 = (defpackage.alrp) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            alrp r0 = new alrp
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            akzo r8 = r0.e
            alrr r6 = r0.d
            defpackage.ffci.b(r9)
            goto L4f
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            defpackage.ffci.b(r9)
            r0.d = r5
            r0.e = r8
            r0.c = r3
            ffhd r9 = r5.e
            ffhd r9 = defpackage.ekxi.a(r9)
            alro r2 = new alro
            r4 = 0
            r2.<init>(r4, r5, r6, r7)
            java.lang.Object r9 = defpackage.ffra.a(r9, r2, r0)
            if (r9 == r1) goto L9e
            r6 = r5
        L4f:
            eolv r9 = (defpackage.eolv) r9
            if (r9 == 0) goto L9b
            eyfq r7 = r9.toBuilder()
            eolu r7 = (defpackage.eolu) r7
            if (r7 != 0) goto L5c
            goto L9b
        L5c:
            ffbr r6 = r6.g
            java.lang.Object r6 = r6.b()
            akyb r6 = (defpackage.akyb) r6
            akxn r6 = r6.a()
            r6.f(r8)
            epyw r9 = defpackage.epyw.BUGLE_MESSAGE
            r6.d(r9)
            alal r9 = defpackage.alal.LOG_SPEC_MESSAGE_DELIVERY_NORTHSTAR_EVENTS
            r6.j(r7, r9)
            MessageType extends eyfy<MessageType, BuilderType> r6 = r7.instance
            eolv r6 = (defpackage.eolv) r6
            eopq r6 = r6.l
            if (r6 != 0) goto L7f
            eopq r6 = defpackage.eopq.a
        L7f:
            long r0 = r6.n
            MessageType extends eyfy<MessageType, BuilderType> r6 = r7.instance
            eolv r6 = (defpackage.eolv) r6
            eopq r6 = r6.l
            if (r6 != 0) goto L8b
            eopq r6 = defpackage.eopq.a
        L8b:
            int r6 = r6.h
            int r6 = defpackage.eook.b(r6)
            if (r6 != 0) goto L94
            goto L95
        L94:
            r3 = r6
        L95:
            defpackage.alrn.a(r0, r3, r8)
            ffcu r6 = defpackage.ffcu.a
            return r6
        L9b:
            ffcu r6 = defpackage.ffcu.a
            return r6
        L9e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alrr.b(com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType, int, akzo, ffgu):java.lang.Object");
    }
}
