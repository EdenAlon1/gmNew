package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dum extends ffhu implements ffjm {
    int a;
    final /* synthetic */ duq b;
    final /* synthetic */ ffsk c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dum(duq duqVar, ffsk ffskVar, ffgu ffguVar) {
        super(ffguVar);
        this.b = duqVar;
        this.c = ffskVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dum) c((iju) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        try {
            try {
                if (this.a != 0) {
                    ffci.b(obj);
                } else {
                    ffci.b(obj);
                    iju ijuVar = (iju) this.d;
                    duq duqVar = this.b;
                    ffwm ffwmVar = duqVar.d;
                    ffji ffjiVar = duqVar.c;
                    this.a = 1;
                    if (dui.c(ijuVar, ffwmVar, ffjiVar, this) == ffhhVar) {
                        return ffhhVar;
                    }
                }
            } catch (CancellationException e) {
                if (!ffsl.g(this.c)) {
                    throw e;
                }
            }
            this.b.d.b(dtz.a);
            return ffcu.a;
        } catch (Throwable th) {
            this.b.d.b(dtz.a);
            throw th;
        }
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        dum dumVar = new dum(this.b, this.c, ffguVar);
        dumVar.d = obj;
        return dumVar;
    }
}
