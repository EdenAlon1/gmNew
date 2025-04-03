package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zyn extends ffhv implements ffjm {
    int a;
    final /* synthetic */ zyq b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zyn(zyq zyqVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = zyqVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((zyn) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        try {
            if (this.a != 0) {
                ffci.b(obj);
            } else {
                ffci.b(obj);
                zym zymVar = new zym(this.b.g);
                this.a = 1;
                obj = fgbj.a(zymVar, this);
                if (obj == ffhhVar) {
                    return ffhhVar;
                }
            }
            ((Boolean) obj).booleanValue();
            this.b.i();
            return ffcu.a;
        } catch (Throwable th) {
            this.b.i();
            throw th;
        }
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new zyn(this.b, ffguVar);
    }
}
