package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egtx extends ffhv implements ffjm {
    final /* synthetic */ egub a;
    final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public egtx(egub egubVar, String str, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = egubVar;
        this.b = str;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((egtx) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        this.a.g.f(this.b);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new egtx(this.a, this.b, ffguVar);
    }
}
