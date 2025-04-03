package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aenj extends ffhv implements ffjm {
    int a;
    final /* synthetic */ aenq b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aenj(aenq aenqVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = aenqVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aenj) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        aenq aenqVar = this.b;
        this.a = 1;
        Object a = fgbj.a(aenqVar.h, this);
        return a == ffhhVar ? ffhhVar : a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new aenj(this.b, ffguVar);
    }
}
