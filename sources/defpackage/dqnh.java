package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dqnh extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dqrp b;
    final /* synthetic */ dqnj c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqnh(dqrp dqrpVar, dqnj dqnjVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dqrpVar;
        this.c = dqnjVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dqnh) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            dqrp dqrpVar = this.b;
            dqro dqroVar = dqrpVar.d;
            String str = dqroVar instanceof dqrn ? ((dqrn) dqroVar).a : null;
            dqnj dqnjVar = this.c;
            dqqj dqqjVar = dqrpVar.a;
            dqgm dqgmVar = dqnjVar.e;
            if (dqgmVar == null) {
                dqgmVar = dqnj.a;
            }
            dqki dqkiVar = dqnjVar.d;
            Instant a = dqnjVar.b.a();
            a.getClass();
            dqij dqijVar = new dqij(dqqjVar, dqgmVar, a, str);
            this.a = 1;
            if (dqkiVar.a(dqijVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dqnh(this.b, this.c, ffguVar);
    }
}
