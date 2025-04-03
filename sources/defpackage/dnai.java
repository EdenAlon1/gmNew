package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dnai extends ffhv implements ffjm {
    final /* synthetic */ boolean a;
    final /* synthetic */ hho b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnai(boolean z, hho hhoVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = z;
        this.b = hhoVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dnai) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        this.b.b(Boolean.valueOf(this.a));
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dnai(this.a, this.b, ffguVar);
    }
}
