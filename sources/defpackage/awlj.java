package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class awlj extends ffhv implements ffjm {
    int a;
    final /* synthetic */ awlk b;
    final /* synthetic */ awxc c;
    final /* synthetic */ ConversationIdType d;
    final /* synthetic */ awwc e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public awlj(awlk awlkVar, awxc awxcVar, ConversationIdType conversationIdType, awwc awwcVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = awlkVar;
        this.c = awxcVar;
        this.d = conversationIdType;
        this.e = awwcVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((awlj) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0028, code lost:
    
        if (r5 != r0) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x000a, code lost:
    
        if (r1 != 1) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x003c, code lost:
    
        if (r1.b.a(r5, r2, r4) == r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0044, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0043, code lost:
    
        return defpackage.ceyt.i();
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r5) {
        /*
            r4 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r4.a
            r2 = 1
            defpackage.ffci.b(r5)
            if (r1 == 0) goto Ld
            if (r1 == r2) goto L2a
            goto L3f
        Ld:
            awlk r5 = r4.b
            awxc r1 = r4.c
            awui r1 = r1.l
            if (r1 != 0) goto L17
            awui r1 = defpackage.awui.a
        L17:
            awmi r5 = r5.a
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r3 = r4.d
            elfl r5 = r5.h(r1, r3)
            r5.getClass()
            r4.a = r2
            java.lang.Object r5 = defpackage.fgfz.c(r5, r4)
            if (r5 == r0) goto L44
        L2a:
            awlk r1 = r4.b
            awkh r5 = (defpackage.awkh) r5
            r5.getClass()
            awwc r2 = r4.e
            r3 = 2
            r4.a = r3
            awnk r1 = r1.b
            java.lang.Object r5 = r1.a(r5, r2, r4)
            if (r5 != r0) goto L3f
            goto L44
        L3f:
            ceyt r5 = defpackage.ceyt.i()
            return r5
        L44:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.awlj.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new awlj(this.b, this.c, this.d, this.e, ffguVar);
    }
}
