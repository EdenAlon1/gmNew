package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ywg extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ywq b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ywg(ywq ywqVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ywqVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ywg) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            dtgp a = this.b.a();
            this.a = 1;
            if (a.d(this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ywg(this.b, ffguVar);
    }
}
