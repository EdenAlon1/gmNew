package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dnrs extends ffhv implements ffjm {
    /* synthetic */ long a;
    final /* synthetic */ dnto b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnrs(dnto dntoVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dntoVar;
    }

    @Override // defpackage.ffjm
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dnrs) c(new kaa(((kaa) obj).a), (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        dnto dntoVar = this.b;
        long j = this.a;
        ffji ffjiVar = ((dnsl) dntoVar).d;
        if (ffjiVar != null) {
            ffjiVar.invoke(new kaa(j));
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        dnrs dnrsVar = new dnrs(this.b, ffguVar);
        dnrsVar.a = ((kaa) obj).a;
        return dnrsVar;
    }
}
