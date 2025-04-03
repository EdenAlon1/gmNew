package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ycm extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ycn b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ycm(ycn ycnVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ycnVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ycm) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ffsk ffskVar = (ffsk) this.c;
            ycn ycnVar = this.b;
            ffhe ffheVar = ffhe.a;
            ffsm ffsmVar = ffsm.a;
            ycn ycnVar2 = this.b;
            ffss[] ffssVarArr = {ffra.b(ffskVar, ekxi.a(ffheVar), ffsmVar, new yck(null, ycnVar)), ffra.b(ffskVar, ekxi.a(ffhe.a), ffsm.a, new ycl(null, ycnVar2))};
            this.a = 1;
            obj = ffqv.b(ffssVarArr, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        List list = (List) obj;
        this.b.a((xhu) list.get(0), (xhu) list.get(1));
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ycm ycmVar = new ycm(this.b, ffguVar);
        ycmVar.c = obj;
        return ycmVar;
    }
}
