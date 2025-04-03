package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class apcd extends ffhv implements ffjm {
    final /* synthetic */ apce a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public apcd(apce apceVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = apceVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((apcd) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        return this.a.c();
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new apcd(this.a, ffguVar);
    }
}
