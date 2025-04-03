package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zwd extends ffhv implements ffjm {
    int a;
    final /* synthetic */ zwe b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zwd(zwe zweVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = zweVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((zwd) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            this.a = 1;
            if (ffsw.c(1000L, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        this.b.b();
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new zwd(this.b, ffguVar);
    }
}
