package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cysi extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cysj b;
    final /* synthetic */ Uri c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cysi(cysj cysjVar, Uri uri, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cysjVar;
        this.c = uri;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cysi) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002a, code lost:
    
        if (r10 != r0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x000a, code lost:
    
        if (r1 != 1) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x006f, code lost:
    
        if (r10.a(r2, r9) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0075, code lost:
    
        return r0;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r10) {
        /*
            r9 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r9.a
            r2 = 1
            defpackage.ffci.b(r10)
            if (r1 == 0) goto Ld
            if (r1 == r2) goto L2c
            goto L72
        Ld:
            cysj r10 = r9.b
            ffbr r10 = r10.l
            java.lang.Object r10 = r10.b()
            alxl r10 = (defpackage.alxl) r10
            cysj r1 = r9.b
            android.net.Uri r3 = r9.c
            com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId r1 = r1.c
            elfl r10 = r10.A(r1, r3)
            r10.getClass()
            r9.a = r2
            java.lang.Object r10 = defpackage.fgfz.c(r10, r9)
            if (r10 == r0) goto L75
        L2c:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 != 0) goto L72
            cysj r10 = r9.b
            ffbr r10 = r10.e
            java.lang.Object r10 = r10.b()
            ablq r10 = (defpackage.ablq) r10
            cysj r1 = r9.b
            android.content.Context r1 = r1.b
            ablt r2 = new ablt
            r3 = 2132084011(0x7f15052b, float:1.980818E38)
            java.lang.String r3 = r1.getString(r3)
            r3.getClass()
            cysj r1 = r9.b
            android.net.Uri r4 = r9.c
            android.content.Context r5 = r1.b
            r6 = 2132084012(0x7f15052c, float:1.9808183E38)
            java.lang.String r5 = r5.getString(r6)
            cysh r7 = new cysh
            r7.<init>()
            r8 = 41
            r4 = r5
            r5 = 0
            r6 = 2
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r1 = 2
            r9.a = r1
            java.lang.Object r10 = r10.a(r2, r9)
            if (r10 != r0) goto L72
            goto L75
        L72:
            ffcu r10 = defpackage.ffcu.a
            return r10
        L75:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cysi.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cysi(this.b, this.c, ffguVar);
    }
}
