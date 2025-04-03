package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ejsd extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ffxx b;
    final /* synthetic */ fgjb c;
    final /* synthetic */ fflb d;
    final /* synthetic */ ffjn e;
    final /* synthetic */ ffji f;
    final /* synthetic */ List g;
    final /* synthetic */ ffxe h;
    private /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ejsd(ffxx ffxxVar, fgjb fgjbVar, fflb fflbVar, ffjn ffjnVar, ffji ffjiVar, List list, ffxe ffxeVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ffxxVar;
        this.c = fgjbVar;
        this.d = fflbVar;
        this.e = ffjnVar;
        this.f = ffjiVar;
        this.g = list;
        this.h = ffxeVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ejsd) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ffsk ffskVar = (ffsk) this.i;
            ffxx ffxxVar = this.b;
            ejsc ejscVar = new ejsc(ffskVar, this.c, this.d, this.e, this.f, this.g, this.h);
            this.a = 1;
            if (ffxxVar.a(ejscVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ejsd ejsdVar = new ejsd(this.b, this.c, this.d, this.e, this.f, this.g, this.h, ffguVar);
        ejsdVar.i = obj;
        return ejsdVar;
    }
}
