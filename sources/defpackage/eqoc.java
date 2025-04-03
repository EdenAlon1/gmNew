package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqoc {
    public static final /* synthetic */ eqoh a(eqof eqofVar) {
        eyfy build = eqofVar.build();
        build.getClass();
        return (eqoh) build;
    }

    public static final void b(eqoe eqoeVar, eqof eqofVar) {
        eqofVar.copyOnWrite();
        eqoh eqohVar = (eqoh) eqofVar.instance;
        eqoh eqohVar2 = eqoh.a;
        eqohVar.g = eqoeVar;
        eqohVar.b |= 4;
    }

    public static final void c(eyee eyeeVar, eqof eqofVar) {
        eqofVar.copyOnWrite();
        eqoh eqohVar = (eqoh) eqofVar.instance;
        eqoh eqohVar2 = eqoh.a;
        eqohVar.b |= 2;
        eqohVar.f = eyeeVar;
    }

    public static final void d(int i, eqof eqofVar) {
        eqofVar.copyOnWrite();
        eqoh eqohVar = (eqoh) eqofVar.instance;
        eqoh eqohVar2 = eqoh.a;
        eqohVar.e = i - 1;
        eqohVar.b |= 1;
    }
}
