package defpackage;

import android.accounts.Account;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class egtw extends ffhv implements ffjm {
    int a;
    final /* synthetic */ egub b;
    final /* synthetic */ Account c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public egtw(egub egubVar, Account account, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = egubVar;
        this.c = account;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((egtw) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object obj2 = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            this.b.f.f(null);
            egub egubVar = this.b;
            Account account = this.c;
            this.a = 1;
            egsw egswVar = (egsw) egubVar.a;
            Object a = ffra.a(egswVar.d, new egsq(egswVar, account, null), this);
            if (a != ffhh.a) {
                a = ffcu.a;
            }
            if (a == obj2) {
                return obj2;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new egtw(this.b, this.c, ffguVar);
    }
}
