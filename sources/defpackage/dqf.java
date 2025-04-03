package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dqf extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ffwm b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqf(ffwm ffwmVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ffwmVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dqf) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffud ffudVar;
        Throwable th;
        ffhh ffhhVar = ffhh.a;
        if (this.a != 0) {
            ffudVar = (ffud) this.c;
            try {
                ffci.b(obj);
            } catch (Throwable th2) {
                th = th2;
                ffudVar.t(null);
                throw th;
            }
        } else {
            ffci.b(obj);
            ffud d = ffqy.d((ffsk) this.c, null, null, new dqe(null), 3);
            try {
                ffwm ffwmVar = this.b;
                this.c = d;
                this.a = 1;
                Object i = ffwmVar.i(this);
                if (i == ffhhVar) {
                    return ffhhVar;
                }
                ffudVar = d;
                obj = i;
            } catch (Throwable th3) {
                ffudVar = d;
                th = th3;
                ffudVar.t(null);
                throw th;
            }
        }
        dqb dqbVar = (dqb) obj;
        ffudVar.t(null);
        return dqbVar;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        dqf dqfVar = new dqf(this.b, ffguVar);
        dqfVar.c = obj;
        return dqfVar;
    }
}
