package defpackage;

import com.google.android.apps.messaging.conversation2.viewmodel.ConversationViewModel;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abqb extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ConversationViewModel b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abqb(ConversationViewModel conversationViewModel, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = conversationViewModel;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((abqb) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0017, code lost:
    
        if (r4 != r0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x000a, code lost:
    
        if (r1 != 1) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0040, code lost:
    
        if (r4.a(r2, r3) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0046, code lost:
    
        return r0;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r4) {
        /*
            r3 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r3.a
            r2 = 1
            defpackage.ffci.b(r4)
            if (r1 == 0) goto Ld
            if (r1 == r2) goto L19
            goto L43
        Ld:
            com.google.android.apps.messaging.conversation2.viewmodel.ConversationViewModel r4 = r3.b
            r3.a = r2
            ffxx r4 = r4.n
            java.lang.Object r4 = defpackage.fgbj.a(r4, r3)
            if (r4 == r0) goto L46
        L19:
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L43
            com.google.android.apps.messaging.conversation2.viewmodel.ConversationViewModel r4 = r3.b
            aigx r4 = r4.m
            fgdj r4 = r4.a()
            abqa r1 = new abqa
            r1.<init>(r4)
            ffxx r4 = defpackage.fgaj.b(r1, r2)
            com.google.android.apps.messaging.conversation2.viewmodel.ConversationViewModel r1 = r3.b
            abpx r2 = new abpx
            r2.<init>(r1)
            r1 = 2
            r3.a = r1
            java.lang.Object r4 = r4.a(r2, r3)
            if (r4 != r0) goto L43
            goto L46
        L43:
            ffcu r4 = defpackage.ffcu.a
            return r4
        L46:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abqb.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new abqb(this.b, ffguVar);
    }
}
