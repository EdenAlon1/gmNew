package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zsh extends ffhv implements ffjm {
    final /* synthetic */ int a;
    final /* synthetic */ zsi b;
    final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zsh(int i, zsi zsiVar, int i2, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = i;
        this.b = zsiVar;
        this.c = i2;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((zsh) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        int i = this.a;
        if (i > 0) {
            this.b.a.d("Bugle.MessageUiDataCache.Hit", i);
        }
        int i2 = this.c;
        if (i2 > 0) {
            this.b.a.d("Bugle.MessageUiDataCache.Miss", i2);
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new zsh(this.a, this.b, this.c, ffguVar);
    }
}
