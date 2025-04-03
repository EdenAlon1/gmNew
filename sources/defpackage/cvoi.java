package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cvoi extends ffhv implements ffjm {
    final /* synthetic */ cvoj a;
    final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cvoi(cvoj cvojVar, int i, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = cvojVar;
        this.b = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cvoi) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ((akzt) this.a.f.b()).e("Bugle.Spam.UrlClick.Counts", this.b);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cvoi(this.a, this.b, ffguVar);
    }
}
