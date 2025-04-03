package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dtys extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dtyq b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dtys(dtyq dtyqVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dtyqVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dtys) c((ffxe) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ffxe ffxeVar = (ffxe) this.c;
            final dtyt dtytVar = new dtyt(ffxeVar);
            this.b.L(dtytVar);
            ffwv.a(ffxeVar, this.b);
            final dtyq dtyqVar = this.b;
            ffix ffixVar = new ffix() { // from class: dtyr
                @Override // defpackage.ffix
                public final Object invoke() {
                    dtyq.this.P(dtytVar);
                    return ffcu.a;
                }
            };
            this.a = 1;
            if (ffxd.b(ffxeVar, ffixVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        dtys dtysVar = new dtys(this.b, ffguVar);
        dtysVar.c = obj;
        return dtysVar;
    }
}
