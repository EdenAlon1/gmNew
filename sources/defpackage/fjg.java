package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fjg extends ffhv implements ffjm {
    int a;
    final /* synthetic */ fkk b;
    final /* synthetic */ dwn c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fjg(dwn dwnVar, fkk fkkVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = dwnVar;
        this.b = fkkVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((fjg) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ffsk ffskVar = (ffsk) this.d;
            ArrayList arrayList = new ArrayList();
            dwn dwnVar = this.c;
            fjf fjfVar = new fjf(arrayList, ffskVar, this.b);
            this.a = 1;
            if (fgct.g((fgct) dwnVar.a, fjfVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        fjg fjgVar = new fjg(this.c, this.b, ffguVar);
        fjgVar.d = obj;
        return fjgVar;
    }
}
