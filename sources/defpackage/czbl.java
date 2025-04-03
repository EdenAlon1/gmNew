package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class czbl extends ffhv implements ffjm {
    final /* synthetic */ czbe a;
    final /* synthetic */ czaj b;
    final /* synthetic */ hho c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public czbl(czbe czbeVar, czaj czajVar, hho hhoVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = czbeVar;
        this.b = czajVar;
        this.c = hhoVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((czbl) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        czaj czajVar;
        ffci.b(obj);
        cyxb cyxbVar = this.a.j;
        boolean z = false;
        if ((cyxbVar != null ? cyxbVar.c : null) != cyxc.c && ((czajVar = this.b) == czaj.b || czajVar == czaj.c)) {
            z = true;
        }
        hho hhoVar = this.c;
        hik hikVar = czbr.a;
        hhoVar.b(Boolean.valueOf(z));
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new czbl(this.a, this.b, this.c, ffguVar);
    }
}
