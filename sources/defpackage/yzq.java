package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class yzq extends ffhv implements ffjo {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    /* synthetic */ boolean c;
    final /* synthetic */ yzt d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yzq(yzt yztVar, ffgu ffguVar) {
        super(4, ffguVar);
        this.d = yztVar;
    }

    @Override // defpackage.ffjo
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean booleanValue = ((Boolean) obj3).booleanValue();
        yzq yzqVar = new yzq(this.d, (ffgu) obj4);
        yzqVar.a = (alxj) obj;
        yzqVar.b = (cnpk) obj2;
        yzqVar.c = booleanValue;
        return yzqVar.b(ffcu.a);
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [alxj, java.lang.Object] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ?? r5 = this.a;
        Object obj2 = this.b;
        boolean z = this.c;
        if (!r5.l() || r5.b() != alxi.ONE_ON_ONE || obj2 != cnpk.d || z) {
            return null;
        }
        ensk h = yzt.a.h();
        h.Y(ente.a, "BugleSatellite");
        ((enrr) h.h("com/google/android/apps/messaging/conversation2/bottomcontent/stickytoolstone/satellite/SatelliteStickyToolstoneAdapterImpl$flow$1", "invokeSuspend", 77, "SatelliteStickyToolstoneAdapterImpl.kt")).q("Showing sticky toolstone for manual satellite connection.");
        return (doqo) this.d.f.a();
    }
}
