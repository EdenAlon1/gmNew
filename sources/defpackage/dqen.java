package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dqen extends ffhv implements ffjm {
    Object a;
    int b;
    final /* synthetic */ dqfw c;
    final /* synthetic */ dqfc d;
    final /* synthetic */ uij e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqen(dqfw dqfwVar, uij uijVar, dqfc dqfcVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = dqfwVar;
        this.e = uijVar;
        this.d = dqfcVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dqen) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object obj2;
        ffhh ffhhVar = ffhh.a;
        View view = null;
        if (this.b != 0) {
            obj2 = this.a;
            ffci.b(obj);
        } else {
            ffci.b(obj);
            dqfw dqfwVar = this.c;
            this.a = dqfwVar;
            this.b = 1;
            if (ffhhVar == null) {
                return null;
            }
            obj2 = dqfwVar;
            obj = null;
        }
        View view2 = (View) obj;
        if (view2 != null) {
            this.d.bg(true);
            view = view2;
        }
        ((dqfw) obj2).e.d(dqfw.a[0], view);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dqen(this.c, this.e, this.d, ffguVar);
    }
}
