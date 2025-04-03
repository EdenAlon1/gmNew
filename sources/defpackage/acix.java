package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class acix extends ffhv implements ffjm {
    int a;
    final /* synthetic */ aciy b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public acix(aciy aciyVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = aciyVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((acix) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        aciy aciyVar = this.b;
        this.a = 1;
        Object a = ffra.a(ekxi.a(aciyVar.c), new aciw(null, aciyVar), this);
        return a == ffhhVar ? ffhhVar : a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new acix(this.b, ffguVar);
    }
}
