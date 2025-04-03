package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class apkd extends ffhv implements ffjm {
    final /* synthetic */ apkl a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public apkd(apkl apklVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = apklVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((apkd) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        return this.a.j.get();
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new apkd(this.a, ffguVar);
    }
}
