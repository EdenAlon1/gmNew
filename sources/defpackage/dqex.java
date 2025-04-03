package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dqex extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dqfc b;
    final /* synthetic */ List c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqex(dqfc dqfcVar, List list, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dqfcVar;
        this.c = list;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dqex) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            dqfc dqfcVar = this.b;
            List list = this.c;
            this.a = 1;
            if (dqfcVar.aT(list, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dqex(this.b, this.c, ffguVar);
    }
}
