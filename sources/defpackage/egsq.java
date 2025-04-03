package defpackage;

import android.accounts.Account;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egsq extends ffhv implements ffjm {
    int a;
    final /* synthetic */ egsw b;
    final /* synthetic */ Account c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public egsq(egsw egswVar, Account account, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = egswVar;
        this.c = account;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((egsq) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00ff, code lost:
    
        if (r0.b(r4, r3, r17) == r2) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00d5, code lost:
    
        if (r3.b(r5, r7, r17) == r2) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00e4  */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.egsq.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        egsq egsqVar = new egsq(this.b, this.c, ffguVar);
        egsqVar.d = obj;
        return egsqVar;
    }
}
