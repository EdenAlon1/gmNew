package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nxx extends ffkk implements ffji {
    final /* synthetic */ nyj a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nxx(nyj nyjVar) {
        super(1);
        this.a = nyjVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ((nzh) obj).getClass();
        return Boolean.valueOf(!this.a.i.containsKey(Integer.valueOf(r2.j)));
    }
}
