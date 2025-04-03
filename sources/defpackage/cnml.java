package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cnml extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cnmm b;
    final /* synthetic */ MessageCoreData c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cnml(cnmm cnmmVar, MessageCoreData messageCoreData, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cnmmVar;
        this.c = messageCoreData;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cnml) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0088  */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r14) {
        /*
            r13 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r13.a
            defpackage.ffci.b(r14)
            if (r1 == 0) goto Lb
            goto Lda
        Lb:
            com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r14 = r13.c
            fayv r1 = r14.aa()
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L18
        L15:
            r6 = r3
            goto L86
        L18:
            bdhg r4 = defpackage.cnmg.a(r1)
            boolean r5 = defpackage.bdhg.l(r4)
            if (r2 == r5) goto L24
            r10 = r3
            goto L25
        L24:
            r10 = r4
        L25:
            if (r10 != 0) goto L28
            goto L15
        L28:
            bdhg r4 = r14.E()
            boolean r5 = defpackage.bdhg.l(r4)
            if (r2 == r5) goto L34
            r9 = r3
            goto L35
        L34:
            r9 = r4
        L35:
            if (r9 != 0) goto L69
            entd r1 = defpackage.cnmm.a
            ensk r1 = r1.j()
            ensz r1 = (defpackage.ensz) r1
            ensn r4 = defpackage.ajro.a
            ensn r4 = defpackage.ajro.a
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType r5 = r14.B()
            java.lang.String r5 = r5.b()
            r1.Y(r4, r5)
            ensn r4 = defpackage.ajro.c
            cnmd r14 = r14.U()
            if (r14 == 0) goto L5e
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType r14 = r14.b
            java.lang.String r14 = r14.b()
            if (r14 != 0) goto L60
        L5e:
            java.lang.String r14 = ""
        L60:
            r1.Y(r4, r14)
            java.lang.String r14 = "RepliesOnRcsMessageReceivedListener skipping logging for reply without RCS message ID"
            r1.q(r14)
            goto L15
        L69:
            ajqd r6 = new ajqd
            long r7 = r14.t()
            cnmd r14 = r14.U()
            if (r14 == 0) goto L78
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType r14 = r14.b
            goto L7a
        L78:
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType r14 = defpackage.bdhb.a
        L7a:
            r11 = r14
            bdhg r14 = defpackage.cnmg.b(r1)
            boolean r12 = r14.k()
            r6.<init>(r7, r9, r10, r11, r12)
        L86:
            if (r6 == 0) goto Lda
            cnmm r14 = r13.b
            com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r1 = r13.c
            ffbr r4 = r14.b
            java.lang.Object r4 = r4.b()
            ajpy r4 = (defpackage.ajpy) r4
            java.util.List r1 = r1.ab()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r1 = r1.iterator()
        La1:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto Lc0
            java.lang.Object r7 = r1.next()
            com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData r7 = (com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData) r7
            ffbr r8 = r14.c
            java.lang.Object r8 = r8.b()
            cstx r8 = (defpackage.cstx) r8
            engw r7 = defpackage.dclm.b(r8, r7)
            r7.getClass()
            defpackage.ffdx.w(r5, r7)
            goto La1
        Lc0:
            r13.a = r2
            ffhd r14 = r4.a
            ffhd r14 = defpackage.ekxi.a(r14)
            ajpx r1 = new ajpx
            r1.<init>(r3, r4, r6, r5)
            java.lang.Object r14 = defpackage.ffra.a(r14, r1, r13)
            ffhh r1 = defpackage.ffhh.a
            if (r14 == r1) goto Ld7
            ffcu r14 = defpackage.ffcu.a
        Ld7:
            if (r14 != r0) goto Lda
            return r0
        Lda:
            ffcu r14 = defpackage.ffcu.a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cnml.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cnml(this.b, this.c, ffguVar);
    }
}
