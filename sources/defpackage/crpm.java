package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class crpm extends ffhv implements ffjm {
    final /* synthetic */ crpn a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public crpm(ffgu ffguVar, crpn crpnVar) {
        super(2, ffguVar);
        this.a = crpnVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((crpm) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        crpn crpnVar = this.a;
        return Boolean.valueOf(crpnVar.c.i(crpnVar.b, 221200000) == 0);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        crpm crpmVar = new crpm(ffguVar, this.a);
        crpmVar.b = obj;
        return crpmVar;
    }
}
