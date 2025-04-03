package defpackage;

import androidx.constraintlayout.widget.ConstraintLayout;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahqn extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ffxx b;
    final /* synthetic */ ConstraintLayout c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahqn(ffxx ffxxVar, ConstraintLayout constraintLayout, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ffxxVar;
        this.c = constraintLayout;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ahqn) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ffxx ffxxVar = this.b;
            ahqm ahqmVar = new ahqm(this.c);
            this.a = 1;
            if (ffxxVar.a(ahqmVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ahqn(this.b, this.c, ffguVar);
    }
}
