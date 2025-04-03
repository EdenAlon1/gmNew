package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yxy extends ffhv implements ffjm {
    final /* synthetic */ engw a;
    final /* synthetic */ yya b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yxy(ffgu ffguVar, engw engwVar, yya yyaVar) {
        super(2, ffguVar);
        this.a = engwVar;
        this.b = yyaVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((yxy) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        engw engwVar = this.a;
        ArrayList arrayList = new ArrayList(ffdx.n(engwVar, 10));
        int i = 0;
        for (Object obj2 : engwVar) {
            int i2 = i + 1;
            if (i < 0) {
                ffdx.l();
            }
            aqux aquxVar = (aqux) obj2;
            aquxVar.getClass();
            doie doieVar = new doie(ffol.c(i2), aquxVar.a());
            String o = aquxVar.o();
            String n = aquxVar.n();
            if (n == null) {
                n = aquxVar.q();
            }
            if (n == null) {
                n = "";
            }
            arrayList.add(new dmog(o, doieVar, n));
            i = i2;
        }
        return arrayList;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        yxy yxyVar = new yxy(ffguVar, this.a, this.b);
        yxyVar.c = obj;
        return yxyVar;
    }
}
