package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dpzr extends ffhv implements ffjm {
    int a;
    final /* synthetic */ fgdj b;
    final /* synthetic */ drnm c;
    final /* synthetic */ ffji d;
    final /* synthetic */ dpzo e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpzr(fgdj fgdjVar, drnm drnmVar, ffji ffjiVar, dpzo dpzoVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = fgdjVar;
        this.c = drnmVar;
        this.d = ffjiVar;
        this.e = dpzoVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dpzr) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            if (((List) this.b.c()).contains(this.c)) {
                this.d.invoke(this.c);
            } else {
                dpzo dpzoVar = this.e;
                drnm drnmVar = this.c;
                this.a = 1;
                if (dpzoVar.a(drnmVar, this) == ffhhVar) {
                    return ffhhVar;
                }
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dpzr(this.b, this.c, this.d, this.e, ffguVar);
    }
}
