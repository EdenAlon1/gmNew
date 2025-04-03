package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nfe extends ndb {
    final /* synthetic */ ndn a;
    final /* synthetic */ nff b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nfe(nff nffVar, ndn ndnVar, ndn ndnVar2) {
        super(ndnVar);
        this.a = ndnVar2;
        this.b = nffVar;
    }

    @Override // defpackage.ndb, defpackage.ndn
    public final ndl b(long j) {
        ndl b = this.a.b(j);
        ndo ndoVar = b.a;
        ndo ndoVar2 = new ndo(ndoVar.b, ndoVar.c + this.b.a);
        ndo ndoVar3 = b.b;
        return new ndl(ndoVar2, new ndo(ndoVar3.b, ndoVar3.c + this.b.a));
    }
}
