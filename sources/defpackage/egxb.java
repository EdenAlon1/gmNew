package defpackage;

import android.accounts.Account;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class egxb extends ffhv implements ffjm {
    final /* synthetic */ god a;
    final /* synthetic */ ada b;
    final /* synthetic */ egub c;
    final /* synthetic */ Account d;
    final /* synthetic */ egtq e;
    final /* synthetic */ String f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public egxb(god godVar, ada adaVar, egub egubVar, Account account, egtq egtqVar, String str, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = godVar;
        this.b = adaVar;
        this.c = egubVar;
        this.d = account;
        this.e = egtqVar;
        this.f = str;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((egxb) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        goa a = this.a.a();
        if (a != null) {
            a.a();
        }
        ada adaVar = this.b;
        Account account = this.d;
        egtq egtqVar = this.e;
        String str = this.f;
        ewom ewomVar = ewom.OBAKE_PICTURE_PICKER_CROP_SCREEN;
        ffga ffgaVar = new ffga();
        ffgaVar.put("cau", "true");
        ffgaVar.put("hostSurface", "pqe");
        egtl egtlVar = (egtl) egtqVar;
        ffgaVar.put("mediaKey", egtlVar.c);
        ffgaVar.put("photoUrl", egtlVar.d);
        ffgaVar.put("photoSource", egtlVar.e);
        ffgaVar.put("hostId", str);
        adaVar.c(egub.b(account, ewomVar, ffew.b(ffgaVar)));
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new egxb(this.a, this.b, this.c, this.d, this.e, this.f, ffguVar);
    }
}
