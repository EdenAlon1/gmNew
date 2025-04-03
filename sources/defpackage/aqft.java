package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aqft extends ffhv implements ffjm {
    int a;
    final /* synthetic */ aqge b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aqft(aqge aqgeVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = aqgeVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aqft) c((ffxe) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            final ffxe ffxeVar = (ffxe) this.c;
            ffxeVar.b(this.b);
            final aqge aqgeVar = this.b;
            final ctbx a = aqgeVar.a(new aqgd() { // from class: aqfr
                @Override // defpackage.aqgd
                public final elfl a() {
                    ffxe.this.b(aqgeVar);
                    return elfo.e(null);
                }
            });
            ffix ffixVar = new ffix() { // from class: aqfs
                @Override // defpackage.ffix
                public final Object invoke() {
                    ctbx.this.a();
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
        aqft aqftVar = new aqft(this.b, ffguVar);
        aqftVar.c = obj;
        return aqftVar;
    }
}
