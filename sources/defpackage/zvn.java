package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zvn extends ffhv implements ffjm {
    int a;
    final /* synthetic */ aoyh b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zvn(aoyh aoyhVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = aoyhVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((zvn) c((ffxe) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ffxe ffxeVar = (ffxe) this.c;
            ffxeVar.b(this.b);
            aoyh aoyhVar = this.b;
            final ctbx f = aoyhVar.f(new zvl(ffxeVar, aoyhVar));
            ffix ffixVar = new ffix() { // from class: zvm
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
        zvn zvnVar = new zvn(this.b, ffguVar);
        zvnVar.c = obj;
        return zvnVar;
    }
}
