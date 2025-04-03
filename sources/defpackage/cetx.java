package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public abstract class cetx {
    public abstract cety a();

    public abstract void b(cevc cevcVar);

    public abstract void c(int i);

    public abstract void d(int i);

    public abstract void e(boolean z);

    public abstract void f(poa poaVar);

    public abstract void g(long j);

    public final cety h() {
        cety a = a();
        cetj cetjVar = (cetj) a;
        poj pojVar = cetjVar.a;
        if (!((Boolean) ((cfup) cety.l.get()).e()).booleanValue() || pojVar == null || poj.a.equals(pojVar) || cetjVar.b == cevc.WORKMANAGER_ONLY || ((Boolean) ((cfup) csgj.T.get()).e()).booleanValue() || ersy.a("bugle.enable_keep_alive_strategy_on_pwq_v2", "bugle")) {
            return a;
        }
        throw new IllegalArgumentException("constraints only work with work manager, use KeepAliveStrategy.WORKMANAGER_ONLY");
    }
}
