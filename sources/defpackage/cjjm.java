package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjjm extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cjhw b;
    final /* synthetic */ cjjq c;
    final /* synthetic */ MessageCoreData d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cjjm(ffgu ffguVar, cjhw cjhwVar, cjjq cjjqVar, MessageCoreData messageCoreData) {
        super(2, ffguVar);
        this.b = cjhwVar;
        this.c = cjjqVar;
        this.d = messageCoreData;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cjjm) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0045, code lost:
    
        if (r12 != r0) goto L17;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cjjm.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cjjm cjjmVar = new cjjm(ffguVar, this.b, this.c, this.d);
        cjjmVar.e = obj;
        return cjjmVar;
    }
}
