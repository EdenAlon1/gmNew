package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axsh extends ffhv implements ffjm {
    final /* synthetic */ boolean[] a;
    final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axsh(boolean[] zArr, int i, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = zArr;
        this.b = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((axsh) c(obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        this.a[this.b] = true;
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new axsh(this.a, this.b, ffguVar);
    }
}
