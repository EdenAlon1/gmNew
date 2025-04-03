package defpackage;

import android.os.CancellationSignal;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ejmt extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ffhd b;
    final /* synthetic */ ffji c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ejmt(ffhd ffhdVar, ffji ffjiVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ffhdVar;
        this.c = ffjiVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ejmt) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        ffha ffhaVar = ((ffsk) this.d).hT().get(ffud.c);
        ffhaVar.getClass();
        ffuf ffufVar = new ffuf((ffud) ffhaVar);
        final CancellationSignal cancellationSignal = new CancellationSignal();
        ffufVar.hZ(new ffji() { // from class: ejmr
            @Override // defpackage.ffji
            public final Object invoke(Object obj2) {
                cancellationSignal.cancel();
                return ffcu.a;
            }
        });
        ffhd ffhdVar = this.b;
        ffji ffjiVar = this.c;
        ffhd a = ekxi.a(ffhdVar);
        ejms ejmsVar = new ejms(null, ffjiVar, cancellationSignal, ffufVar);
        this.a = 1;
        Object a2 = ffra.a(a, ejmsVar, this);
        return a2 == ffhhVar ? ffhhVar : a2;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ejmt ejmtVar = new ejmt(this.b, this.c, ffguVar);
        ejmtVar.d = obj;
        return ejmtVar;
    }
}
