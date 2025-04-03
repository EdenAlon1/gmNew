package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aatr extends ffhv implements ffjn {
    final /* synthetic */ aatu a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aatr(aatu aatuVar, ffgu ffguVar) {
        super(3, ffguVar);
        this.a = aatuVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        return new aatr(this.a, (ffgu) obj3).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        aasu aasuVar = this.a.e;
        if (aasuVar != null) {
            aasuVar.close();
        }
        return ffcu.a;
    }
}
