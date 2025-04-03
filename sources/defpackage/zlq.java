package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zlq extends ffhv implements ffjm {
    int a;
    final /* synthetic */ zmw b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zlq(zmw zmwVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = zmwVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((zlq) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ablq ablqVar = (ablq) this.b.x.b();
            String string = this.b.n.getString(R.string.message_list_paging_error_title);
            string.getClass();
            final zmw zmwVar = this.b;
            ablt abltVar = new ablt(string, zmwVar.n.getString(R.string.message_list_paging_error_action_label), true, 3, new ffix() { // from class: zlp
                @Override // defpackage.ffix
                public final Object invoke() {
                    zmw.this.y.h(aink.a);
                    return ffcu.a;
                }
            }, 33);
            this.a = 1;
            if (ablqVar.a(abltVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new zlq(this.b, ffguVar);
    }
}
