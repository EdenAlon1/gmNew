package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cail extends ffhv implements ffjm {
    Object a;
    int b;
    final /* synthetic */ cain c;
    final /* synthetic */ caii d;
    final /* synthetic */ ConversationIdType e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cail(cain cainVar, caii caiiVar, ConversationIdType conversationIdType, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = cainVar;
        this.d = caiiVar;
        this.e = conversationIdType;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cail) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00fa, code lost:
    
        if (r8.plusMillis(r4.longValue()).isBefore(((defpackage.cqoh) r3.e.b()).f()) != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x010d, code lost:
    
        if (r8 == r0) goto L56;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r8) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cail.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cail(this.c, this.d, this.e, ffguVar);
    }
}
