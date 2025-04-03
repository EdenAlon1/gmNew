package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ffyu extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ffxx b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ffyu(ffxx ffxxVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ffxxVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ffyu) c((ffxe) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ffxe ffxeVar = (ffxe) this.c;
            ffxx ffxxVar = this.b;
            ffyt ffytVar = new ffyt(ffxeVar);
            this.a = 1;
            if (ffxxVar.a(ffytVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ffyu ffyuVar = new ffyu(this.b, ffguVar);
        ffyuVar.c = obj;
        return ffyuVar;
    }
}
