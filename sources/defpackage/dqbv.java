package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dqbv implements ffjm {
    final /* synthetic */ ffix a;

    public dqbv(ffix ffixVar) {
        this.a = ffixVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            dqbw.c(this.a, hfdVar, 0);
        }
        return ffcu.a;
    }
}
