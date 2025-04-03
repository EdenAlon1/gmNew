package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dic extends ffhv implements ffjm {
    Object a;
    Object b;
    Object c;
    int d;
    final /* synthetic */ dhy e;
    final /* synthetic */ dif f;
    final /* synthetic */ ffji g;
    private /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dic(dhy dhyVar, dif difVar, ffji ffjiVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.e = dhyVar;
        this.f = difVar;
        this.g = ffjiVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dic) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [fgjb, int] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        dif difVar;
        dia diaVar;
        ffji ffjiVar;
        fgjb fgjbVar;
        dif difVar2;
        Throwable th;
        fgjb fgjbVar2;
        ffhh ffhhVar = ffhh.a;
        ?? r1 = this.d;
        try {
            try {
                if (r1 == 0) {
                    ffci.b(obj);
                    ffsk ffskVar = (ffsk) this.h;
                    dhy dhyVar = this.e;
                    ffha ffhaVar = ffskVar.hT().get(ffud.c);
                    ffhaVar.getClass();
                    dia diaVar2 = new dia(dhyVar, (ffud) ffhaVar);
                    this.f.c(diaVar2);
                    difVar = this.f;
                    ffji ffjiVar2 = this.g;
                    this.h = diaVar2;
                    fgjb fgjbVar3 = difVar.b;
                    this.a = fgjbVar3;
                    this.b = ffjiVar2;
                    this.c = difVar;
                    this.d = 1;
                    if (fgjbVar3.a(null, this) != ffhhVar) {
                        diaVar = diaVar2;
                        ffjiVar = ffjiVar2;
                        fgjbVar = fgjbVar3;
                    }
                    return ffhhVar;
                }
                if (r1 != 1) {
                    difVar2 = (dif) this.b;
                    Object obj2 = this.a;
                    diaVar = (dia) this.h;
                    try {
                        ffci.b(obj);
                        fgjbVar2 = obj2;
                        dib.a(difVar2.a, diaVar);
                        fgjbVar2.b(null);
                        return obj;
                    } catch (Throwable th2) {
                        th = th2;
                        dib.a(difVar2.a, diaVar);
                        throw th;
                    }
                }
                Object obj3 = this.c;
                ffji ffjiVar3 = (ffji) this.b;
                Object obj4 = this.a;
                dia diaVar3 = (dia) this.h;
                ffci.b(obj);
                difVar = obj3;
                fgjbVar = obj4;
                ffjiVar = ffjiVar3;
                diaVar = diaVar3;
                this.h = diaVar;
                this.a = fgjbVar;
                this.b = difVar;
                this.c = null;
                this.d = 2;
                Object invoke = ffjiVar.invoke(this);
                if (invoke != ffhhVar) {
                    difVar2 = difVar;
                    obj = invoke;
                    fgjbVar2 = fgjbVar;
                    dib.a(difVar2.a, diaVar);
                    fgjbVar2.b(null);
                    return obj;
                }
                return ffhhVar;
            } catch (Throwable th3) {
                difVar2 = difVar;
                th = th3;
                dib.a(difVar2.a, diaVar);
                throw th;
            }
        } catch (Throwable th4) {
            r1.b(null);
            throw th4;
        }
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        dic dicVar = new dic(this.e, this.f, this.g, ffguVar);
        dicVar.h = obj;
        return dicVar;
    }
}
