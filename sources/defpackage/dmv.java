package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dmv extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dmx b;
    final /* synthetic */ dhy c;
    final /* synthetic */ ffjm d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmv(dmx dmxVar, dhy dhyVar, ffjm ffjmVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dmxVar;
        this.c = dhyVar;
        this.d = ffjmVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dmv) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            dmx dmxVar = this.b;
            dhy dhyVar = this.c;
            ffjm ffjmVar = this.d;
            this.a = 1;
            if (dmxVar.c.b(dmxVar.b, dhyVar, ffjmVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dmv(this.b, this.c, this.d, ffguVar);
    }
}
