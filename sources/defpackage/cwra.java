package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cwra extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cwrd b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cwra(cwrd cwrdVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cwrdVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cwra) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        cwrd cwrdVar = this.b;
        this.a = 1;
        Object e = cwrdVar.e(this);
        return e == ffhhVar ? ffhhVar : e;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cwra(this.b, ffguVar);
    }
}
