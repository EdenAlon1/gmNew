package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahzk extends ffhv implements ffjm {
    /* synthetic */ Object a;
    final /* synthetic */ ahzo b;
    final /* synthetic */ ahut c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahzk(ahzo ahzoVar, ahut ahutVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ahzoVar;
        this.c = ahutVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ahzk) c((cvvc) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        return this.b.c.a((cvvc) this.a, this.c);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ahzk ahzkVar = new ahzk(this.b, this.c, ffguVar);
        ahzkVar.a = obj;
        return ahzkVar;
    }
}
