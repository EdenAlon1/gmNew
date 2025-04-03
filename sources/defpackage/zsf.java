package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zsf extends ffhv implements ffjm {
    int a;
    final /* synthetic */ zsg b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zsf(zsg zsgVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = zsgVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((zsf) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        if (this.a != 0) {
            ffci.b(obj);
        } else {
            ffci.b(obj);
            zsg zsgVar = this.b;
            zsd zsdVar = new zsd(new fgch(zsgVar.b.b, zsgVar.d.f, new zse(null)));
            zsa zsaVar = new zsa(this.b);
            this.a = 2;
            if (zsdVar.a(zsaVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new zsf(this.b, ffguVar);
    }
}
