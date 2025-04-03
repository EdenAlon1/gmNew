package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wzm extends ffhv implements ffjm {
    int a;
    final /* synthetic */ wzs b;
    final /* synthetic */ alxr c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wzm(wzs wzsVar, alxr alxrVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = wzsVar;
        this.c = alxrVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((wzm) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            wzs wzsVar = this.b;
            String string = wzsVar.a.getString(R.string.star_badge_on_click_snackbar_message);
            string.getClass();
            final wzs wzsVar2 = this.b;
            final alxr alxrVar = this.c;
            ablt abltVar = new ablt(string, wzsVar2.a.getString(R.string.star_badge_on_click_snackbar_action), false, 0, new ffix() { // from class: wzl
                @Override // defpackage.ffix
                public final Object invoke() {
                    wzs.this.c(alxrVar);
                    return ffcu.a;
                }
            }, 57);
            this.a = 1;
            if (wzsVar.e.a(abltVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new wzm(this.b, this.c, ffguVar);
    }
}
