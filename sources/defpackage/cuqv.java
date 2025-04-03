package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cuqv extends ffhv implements ffjm {
    final /* synthetic */ cuqw a;
    final /* synthetic */ boolean b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cuqv(cuqw cuqwVar, boolean z, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = cuqwVar;
        this.b = z;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cuqv) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ((akzt) this.a.a.b()).e("Bugle.Spam.CrossCountry.Settings.Counts", true != this.b ? 2 : 1);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cuqv(this.a, this.b, ffguVar);
    }
}
