package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class yfl extends ffhv implements ffjm {
    final /* synthetic */ yfu a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yfl(yfu yfuVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = yfuVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((yfl) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        this.a.b();
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new yfl(this.a, ffguVar);
    }
}
