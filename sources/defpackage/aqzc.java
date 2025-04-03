package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aqzc extends ffhv implements ffjm {
    final /* synthetic */ aqzd a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aqzc(aqzd aqzdVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = aqzdVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aqzc) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        return this.a.c();
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new aqzc(this.a, ffguVar);
    }
}
