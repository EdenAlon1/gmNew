package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cugk extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cugm b;
    final /* synthetic */ ConversationIdType c;
    final /* synthetic */ cugj d;
    final /* synthetic */ erfe e;
    final /* synthetic */ eres f;
    final /* synthetic */ int g;
    final /* synthetic */ int h;
    final /* synthetic */ int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cugk(cugm cugmVar, ConversationIdType conversationIdType, cugj cugjVar, int i, erfe erfeVar, int i2, int i3, eres eresVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cugmVar;
        this.c = conversationIdType;
        this.d = cugjVar;
        this.g = i;
        this.e = erfeVar;
        this.h = i2;
        this.i = i3;
        this.f = eresVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cugk) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
    
        if (r0.d == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0056, code lost:
    
        return defpackage.ffcu.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0051, code lost:
    
        if (r0.d != false) goto L27;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r6) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cugk.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cugk(this.b, this.c, this.d, this.g, this.e, this.h, this.i, this.f, ffguVar);
    }
}
