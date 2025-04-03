package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class die extends ffhv implements ffjm {
    Object a;
    Object b;
    Object c;
    Object d;
    int e;
    final /* synthetic */ dhy f;
    final /* synthetic */ dif g;
    final /* synthetic */ ffjm h;
    final /* synthetic */ Object i;
    private /* synthetic */ Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public die(dhy dhyVar, dif difVar, ffjm ffjmVar, Object obj, ffgu ffguVar) {
        super(2, ffguVar);
        this.f = dhyVar;
        this.g = difVar;
        this.h = ffjmVar;
        this.i = obj;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((die) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [fgjb, int] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        dif difVar;
        Object obj2;
        dia diaVar;
        ffjm ffjmVar;
        fgjb fgjbVar;
        dif difVar2;
        Throwable th;
        fgjb fgjbVar2;
        ffhh ffhhVar = ffhh.a;
        ?? r1 = this.e;
        try {
            try {
                if (r1 == 0) {
                    ffci.b(obj);
                    ffsk ffskVar = (ffsk) this.j;
                    dhy dhyVar = this.f;
                    ffha ffhaVar = ffskVar.hT().get(ffud.c);
                    ffhaVar.getClass();
                    dia diaVar2 = new dia(dhyVar, (ffud) ffhaVar);
                    this.g.c(diaVar2);
                    difVar = this.g;
                    ffjm ffjmVar2 = this.h;
                    obj2 = this.i;
                    this.j = diaVar2;
                    fgjb fgjbVar3 = difVar.b;
                    this.a = fgjbVar3;
                    this.b = ffjmVar2;
                    this.c = obj2;
                    this.d = difVar;
                    this.e = 1;
                    if (fgjbVar3.a(null, this) != ffhhVar) {
                        diaVar = diaVar2;
                        ffjmVar = ffjmVar2;
                        fgjbVar = fgjbVar3;
                    }
                    return ffhhVar;
                }
                if (r1 != 1) {
                    difVar2 = (dif) this.b;
                    Object obj3 = this.a;
                    diaVar = (dia) this.j;
                    try {
                        ffci.b(obj);
                        fgjbVar2 = obj3;
                        did.a(difVar2.a, diaVar);
                        fgjbVar2.b(null);
                        return obj;
                    } catch (Throwable th2) {
                        th = th2;
                        did.a(difVar2.a, diaVar);
                        throw th;
                    }
                }
                Object obj4 = this.d;
                Object obj5 = this.c;
                ffjmVar = (ffjm) this.b;
                Object obj6 = this.a;
                dia diaVar3 = (dia) this.j;
                ffci.b(obj);
                difVar = obj4;
                fgjbVar = obj6;
                obj2 = obj5;
                diaVar = diaVar3;
                this.j = diaVar;
                this.a = fgjbVar;
                this.b = difVar;
                this.c = null;
                this.d = null;
                this.e = 2;
                Object a = ffjmVar.a(obj2, this);
                if (a != ffhhVar) {
                    difVar2 = difVar;
                    obj = a;
                    fgjbVar2 = fgjbVar;
                    did.a(difVar2.a, diaVar);
                    fgjbVar2.b(null);
                    return obj;
                }
                return ffhhVar;
            } catch (Throwable th3) {
                difVar2 = difVar;
                th = th3;
                did.a(difVar2.a, diaVar);
                throw th;
            }
        } catch (Throwable th4) {
            r1.b(null);
            throw th4;
        }
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        die dieVar = new die(this.f, this.g, this.h, this.i, ffguVar);
        dieVar.j = obj;
        return dieVar;
    }
}
