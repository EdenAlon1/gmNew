package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cqin extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cqfh b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cqin(ffgu ffguVar, cqfh cqfhVar) {
        super(2, ffguVar);
        this.b = cqfhVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cqin) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        cqfh cqfhVar = this.b;
        this.a = 1;
        Object a = cqfhVar.a(this);
        return a == ffhhVar ? ffhhVar : a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cqin cqinVar = new cqin(ffguVar, this.b);
        cqinVar.c = obj;
        return cqinVar;
    }
}
