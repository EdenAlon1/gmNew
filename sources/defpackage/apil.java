package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class apil extends ffhv implements ffjm {
    Object a;
    int b;
    final /* synthetic */ apim c;
    final /* synthetic */ MessageId d;
    final /* synthetic */ String e;
    final /* synthetic */ fjay f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public apil(apim apimVar, MessageId messageId, String str, fjay fjayVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = apimVar;
        this.d = messageId;
        this.e = str;
        this.f = fjayVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((apil) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x005c, code lost:
    
        if (r11 == r0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0063, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
    
        if (r11 != r0) goto L9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r11) {
        /*
            r10 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r10.b
            r2 = 1
            if (r1 == 0) goto L13
            if (r1 == r2) goto Ld
            defpackage.ffci.b(r11)
            goto L5f
        Ld:
            java.lang.Object r1 = r10.a
            defpackage.ffci.b(r11)
            goto L2e
        L13:
            defpackage.ffci.b(r11)
            apim r11 = r10.c
            apsb r1 = r11.p()
            aqge r11 = r11.c()
            elfl r11 = r11.b()
            r10.a = r1
            r10.b = r2
            java.lang.Object r11 = defpackage.fgfz.c(r11, r10)
            if (r11 == r0) goto L63
        L2e:
            com.google.android.apps.messaging.shared.api.messaging.MessageId r3 = r10.d
            apim r2 = r10.c
            alxg r11 = (defpackage.alxg) r11
            cqoh r2 = r2.b
            j$.time.Instant r2 = r2.f()
            long r4 = r2.toEpochMilli()
            apim r2 = r10.c
            java.lang.String r8 = r10.e
            fjay r9 = r10.f
            cqoh r2 = r2.b
            long r6 = r2.a()
            r2 = r11
            elfl r11 = r1.b(r2, r3, r4, r6, r8, r9)
            r11.getClass()
            r1 = 0
            r10.a = r1
            r1 = 2
            r10.b = r1
            java.lang.Object r11 = defpackage.fgfz.c(r11, r10)
            if (r11 != r0) goto L5f
            goto L63
        L5f:
            r11.getClass()
            return r11
        L63:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.apil.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new apil(this.c, this.d, this.e, this.f, ffguVar);
    }
}
