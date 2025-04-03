package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hqp extends ffkk implements ffji {
    final /* synthetic */ hrh a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hqp(hrh hrhVar) {
        super(1);
        this.a = hrhVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2;
        hho hhoVar = (hho) obj;
        if (!(hhoVar instanceof hso)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (hhoVar.a() != null) {
            hrh hrhVar = this.a;
            Object a = hhoVar.a();
            a.getClass();
            obj2 = hrhVar.a(a);
        } else {
            obj2 = null;
        }
        return new hic(obj2, ((hso) hhoVar).f());
    }
}
