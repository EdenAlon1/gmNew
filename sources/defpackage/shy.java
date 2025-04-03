package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class shy extends ffhv implements ffjm {
    Object a;
    Object b;
    int c;
    final /* synthetic */ shz d;
    final /* synthetic */ MessageCoreData e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public shy(shz shzVar, MessageCoreData messageCoreData, ffgu ffguVar) {
        super(2, ffguVar);
        this.d = shzVar;
        this.e = messageCoreData;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((shy) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x009f, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0025, code lost:
    
        if (r11 != r0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0096, code lost:
    
        if (r11 == r0) goto L20;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0051  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x0096 -> B:5:0x0099). Please report as a decompilation issue!!! */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r11) {
        /*
            r10 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r10.c
            r2 = 1
            if (r1 == 0) goto L16
            if (r1 == r2) goto L12
            java.lang.Object r1 = r10.b
            java.lang.Object r2 = r10.a
            defpackage.ffci.b(r11)
            goto L99
        L12:
            defpackage.ffci.b(r11)
            goto L27
        L16:
            defpackage.ffci.b(r11)
            shz r11 = r10.d
            entd r1 = defpackage.shz.a
            r10.c = r2
            sid r11 = r11.b
            java.lang.Object r11 = r11.b(r10)
            if (r11 == r0) goto L9f
        L27:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L9c
            com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r11 = r10.e
            java.util.List r11 = r11.ab()
            ffnl r11 = defpackage.ffdx.as(r11)
            shx r1 = new shx
            r1.<init>()
            ffng r3 = new ffng
            r3.<init>(r11, r2, r1)
            shz r11 = r10.d
            ffnf r1 = new ffnf
            r1.<init>(r3)
            r2 = r11
        L4b:
            boolean r11 = r1.hasNext()
            if (r11 == 0) goto L9c
            java.lang.Object r11 = r1.next()
            com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData r11 = (com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData) r11
            entd r3 = defpackage.shz.a
            ensk r3 = r3.h()
            ensz r3 = (defpackage.ensz) r3
            java.lang.String r4 = "Triggering automatic transcription of incoming message part."
            r3.q(r4)
            r3 = r2
            shz r3 = (defpackage.shz) r3
            ared r3 = r3.c
            aree r4 = new aree
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r5 = r11.A()
            r5.getClass()
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType r6 = r11.B()
            r6.getClass()
            java.lang.String r7 = r11.aa()
            r7.getClass()
            android.net.Uri r8 = r11.t()
            r8.getClass()
            r9 = 0
            r4.<init>(r5, r6, r7, r8, r9)
            r10.a = r2
            r10.b = r1
            r11 = 2
            r10.c = r11
            java.lang.Object r11 = r3.b(r4, r10)
            if (r11 != r0) goto L99
            goto L9f
        L99:
            arec r11 = (defpackage.arec) r11
            goto L4b
        L9c:
            ffcu r11 = defpackage.ffcu.a
            return r11
        L9f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.shy.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new shy(this.d, this.e, ffguVar);
    }
}
