package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cuwa extends ffhv implements ffjm {
    int a;
    final /* synthetic */ String b;
    final /* synthetic */ ConversationIdType c;
    final /* synthetic */ cuwf d;
    final /* synthetic */ int e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cuwa(ffgu ffguVar, String str, ConversationIdType conversationIdType, cuwf cuwfVar, int i) {
        super(2, ffguVar);
        this.b = str;
        this.c = conversationIdType;
        this.d = cuwfVar;
        this.e = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cuwa) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x005f, code lost:
    
        if (r9 != r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0046, code lost:
    
        if (r9 != r0) goto L19;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cuwa.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cuwa cuwaVar = new cuwa(ffguVar, this.b, this.c, this.d, this.e);
        cuwaVar.f = obj;
        return cuwaVar;
    }
}
