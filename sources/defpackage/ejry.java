package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejry extends ffhv implements ffjm {
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
    public ejry(ffgu ffguVar, ffxx ffxxVar, fgjb fgjbVar, fflb fflbVar, ffjn ffjnVar, ffji ffjiVar, List list, ffxe ffxeVar) {
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
        return ((ejry) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ffha ffhaVar = ((ffsk) this.i).hT().get(ffud.c);
            ffhaVar.getClass();
            ffxx ffxxVar = this.b;
            ejsb ejsbVar = new ejsb(this.c, this.d, this.e, this.f, this.g, (ffud) ffhaVar, this.h);
            this.a = 1;
            if (ffxxVar.a(ejsbVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ejry ejryVar = new ejry(ffguVar, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
        ejryVar.i = obj;
        return ejryVar;
    }
}
