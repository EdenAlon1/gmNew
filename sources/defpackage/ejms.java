package defpackage;

import android.os.CancellationSignal;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejms extends ffhv implements ffjm {
    final /* synthetic */ ffji a;
    final /* synthetic */ CancellationSignal b;
    final /* synthetic */ ffuf c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ejms(ffgu ffguVar, ffji ffjiVar, CancellationSignal cancellationSignal, ffuf ffufVar) {
        super(2, ffguVar);
        this.a = ffjiVar;
        this.b = cancellationSignal;
        this.c = ffufVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ejms) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        engw engwVar = (engw) this.a.invoke(this.b);
        this.c.t(null);
        return engwVar;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ejms ejmsVar = new ejms(ffguVar, this.a, this.b, this.c);
        ejmsVar.d = obj;
        return ejmsVar;
    }
}
