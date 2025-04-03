package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cyki extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cykn b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cyki(cykn cyknVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cyknVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cyki) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            cykn cyknVar = this.b;
            String string = cyknVar.a.getString(R.string.unarchive_conversation_snackbar);
            string.getClass();
            final cykn cyknVar2 = this.b;
            ablt abltVar = new ablt(string, cyknVar2.a.getString(R.string.unblock_unspam_snack_bar_undo), false, 0, new ffix() { // from class: cykh
                @Override // defpackage.ffix
                public final Object invoke() {
                    cykn cyknVar3 = cykn.this;
                    cyku cykuVar = cyknVar3.f;
                    axol.k(cykuVar.c, null, new cyks(cykuVar, cyknVar3.d, null), 3);
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
        return new cyki(this.b, ffguVar);
    }
}
