package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class apxc extends ffhv implements ffjm {
    final /* synthetic */ apxd a;
    final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public apxc(apxd apxdVar, String str, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = apxdVar;
        this.b = str;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((apxc) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ((bdwr) this.a.a.b()).g(this.b);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new apxc(this.a, this.b, ffguVar);
    }
}
