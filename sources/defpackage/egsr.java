package defpackage;

import android.accounts.Account;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class egsr extends ffhv implements ffjm {
    int a;
    final /* synthetic */ egsw b;
    final /* synthetic */ Account c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public egsr(egsw egswVar, Account account, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = egswVar;
        this.c = account;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((egsr) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        try {
            if (this.a != 0) {
                ffci.b(obj);
            } else {
                ffci.b(obj);
                egsk egskVar = this.b.b;
                String str = this.c.name;
                str.getClass();
                this.a = 1;
                obj = egskVar.a(str, this);
                if (obj == ffhhVar) {
                    return ffhhVar;
                }
            }
            egsj egsjVar = (egsj) obj;
            fgcm fgcmVar = this.b.e;
            egtc egtcVar = egtc.a;
            String str2 = egsjVar.a;
            Object obj2 = egsjVar.b;
            String str3 = this.c.name;
            str3.getClass();
            fgcmVar.g(egtcVar, new egtb(str2, obj2, str3, ewke.MESSAGE_UNDEFINED, true, false, egsjVar.c, this.b.j.a() && !this.b.i.a(), false));
        } catch (Exception e) {
            ((enrr) ((enrr) egsw.a.i()).g(e).h("com/google/android/libraries/user/profile/quickeditor/data/ProfileRepositoryImpl$launchAccountInfoLoad$1", "invokeSuspend", 113, "ProfileRepositoryImpl.kt")).q("failed to load owner state");
            this.b.e.f(new egsx(e));
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new egsr(this.b, this.c, ffguVar);
    }
}
