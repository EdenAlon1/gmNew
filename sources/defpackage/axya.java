package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axya extends ffhv implements ffjm {
    int a;
    final /* synthetic */ axyy b;
    final /* synthetic */ List c;
    final /* synthetic */ axwz d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axya(ffgu ffguVar, axyy axyyVar, List list, axwz axwzVar) {
        super(2, ffguVar);
        this.b = axyyVar;
        this.c = list;
        this.d = axwzVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((axya) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        axyy axyyVar = this.b;
        List list = this.c;
        axwz axwzVar = this.d;
        this.a = 1;
        Object E = axyyVar.E(list, axwzVar, this);
        return E == ffhhVar ? ffhhVar : E;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        axya axyaVar = new axya(ffguVar, this.b, this.c, this.d);
        axyaVar.e = obj;
        return axyaVar;
    }
}
