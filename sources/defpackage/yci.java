package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class yci extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ycn b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yci(ycn ycnVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ycnVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((yci) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
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
            ffss[] ffssVarArr = {ffra.b(ffskVar, ekxi.a(ffheVar), ffsm.a, new ycg(null, ycnVar)), ffra.b(ffskVar, ekxi.a(ffhe.a), ffsm.a, new ych(null, this.b))};
            this.a = 1;
            obj = ffqv.b(ffssVarArr, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        List list = (List) obj;
        xhu xhuVar = (xhu) list.get(0);
        ycu ycuVar = (ycu) list.get(1);
        this.b.a(xhuVar, ycuVar != null ? ycuVar.a : null);
        ycn ycnVar2 = this.b;
        xid xidVar = ycuVar != null ? ycuVar.b : null;
        ensk h = ycn.a.h();
        h.Y(ente.a, "BugleComposeRow2");
        ((enrr) h.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/data/DraftOpener", "openInput", 136, "DraftOpener.kt")).t("DraftOpener opening input %s", xidVar);
        if (xidVar != null) {
            ((xie) ycnVar2.j.b()).c(xidVar);
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        yci yciVar = new yci(this.b, ffguVar);
        yciVar.c = obj;
        return yciVar;
    }
}
