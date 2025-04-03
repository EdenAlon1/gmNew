package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cykl extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cykn b;
    final /* synthetic */ int c;
    final /* synthetic */ fflb d;
    final /* synthetic */ crsn e;
    final /* synthetic */ eoko f;
    final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cykl(cykn cyknVar, int i, fflb fflbVar, crsn crsnVar, eoko eokoVar, int i2, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cyknVar;
        this.c = i;
        this.d = fflbVar;
        this.e = crsnVar;
        this.f = eokoVar;
        this.g = i2;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cykl) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            cykn cyknVar = this.b;
            String string = cyknVar.a.getString(this.c, this.d.a);
            string.getClass();
            final cykn cyknVar2 = this.b;
            final crsn crsnVar = this.e;
            final eoko eokoVar = this.f;
            final int i2 = this.g;
            ablt abltVar = new ablt(string, cyknVar2.a.getString(R.string.unblock_unspam_snack_bar_undo), false, 0, new ffix() { // from class: cykj
                @Override // defpackage.ffix
                public final Object invoke() {
                    cykn cyknVar3 = cykn.this;
                    axol.k(cyknVar3.c, cyknVar3.b, new cykk(cyknVar3, crsnVar, eokoVar, i2, null), 2);
                    return ffcu.a;
                }
            }, 57);
            this.a = 1;
            if (cyknVar.e.a(abltVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cykl(this.b, this.c, this.d, this.e, this.f, this.g, ffguVar);
    }
}
