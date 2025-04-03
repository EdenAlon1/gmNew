package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aydc extends ffhv implements ffjm {
    int a;
    final /* synthetic */ aydd b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aydc(aydd ayddVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ayddVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aydc) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            aydd ayddVar = this.b;
            this.a = 1;
            if (ayddVar.a.a(this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ceyt.i();
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new aydc(this.b, ffguVar);
    }
}
