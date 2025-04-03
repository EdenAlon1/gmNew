package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cyjj extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cyjk b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cyjj(cyjk cyjkVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cyjkVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cyjj) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ablq ablqVar = (ablq) this.b.d.b();
            String string = this.b.a.getString(R.string.cross_country_banner_confirm_snackbar_to_inbox);
            string.getClass();
            final cyjk cyjkVar = this.b;
            ablt abltVar = new ablt(string, cyjkVar.a.getString(R.string.cross_country_banner_confirm_snackbar_undo_label), false, 0, new ffix() { // from class: cyji
                @Override // defpackage.ffix
                public final Object invoke() {
                    cyjk cyjkVar2 = cyjk.this;
                    ((cyjl) cyjkVar2.b.b()).b(cyjkVar2.e);
                    return ffcu.a;
                }
            }, 57);
            this.a = 1;
            if (ablqVar.a(abltVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cyjj(this.b, ffguVar);
    }
}
