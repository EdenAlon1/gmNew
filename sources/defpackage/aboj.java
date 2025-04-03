package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aboj extends ffhv implements ffjn {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    final /* synthetic */ abok c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aboj(abok abokVar, ffgu ffguVar) {
        super(3, ffguVar);
        this.c = abokVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        aboj abojVar = new aboj(this.c, (ffgu) obj3);
        abojVar.a = (ablm) obj;
        abojVar.b = (cbnd) obj2;
        return abojVar.b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        Object obj2 = this.a;
        Object obj3 = this.b;
        if (obj2 == null) {
            return null;
        }
        abok abokVar = this.c;
        ablm ablmVar = (ablm) obj2;
        int size = ablmVar.b.size();
        Integer num = obj3 != null ? (Integer) ablmVar.c.get(((cbnd) obj3).a) : null;
        return new domr(size, size - (num != null ? num.intValue() : 0), new aboh(abokVar), new aboi(abokVar));
    }
}
