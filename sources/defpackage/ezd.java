package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ezd extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ffji b;
    final /* synthetic */ ezf c;
    final /* synthetic */ jbu d;
    final /* synthetic */ fai e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ezd(jbu jbuVar, ffji ffjiVar, ezf ezfVar, fai faiVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.d = jbuVar;
        this.b = ffjiVar;
        this.c = ezfVar;
        this.e = faiVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ezd) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        try {
            if (this.a == 0) {
                ffci.b(obj);
                ffsk ffskVar = (ffsk) this.f;
                Object invoke = fan.a.invoke(this.d.a);
                jbu jbuVar = this.d;
                fag fagVar = (fag) invoke;
                fas fasVar = new fas(jbuVar.a, new ezc(this.e), fagVar);
                if (eyx.a) {
                    ffqy.d(ffskVar, null, null, new ezb(this.c, fagVar, null), 3);
                }
                ffji ffjiVar = this.b;
                if (ffjiVar != null) {
                    ffjiVar.invoke(fasVar);
                }
                this.c.a = fasVar;
                jbu jbuVar2 = this.d;
                this.a = 1;
                if (jbuVar2.a(fasVar, this) == ffhhVar) {
                    return ffhhVar;
                }
            } else {
                ffci.b(obj);
            }
            throw new ffbx();
        } catch (Throwable th) {
            this.c.a = null;
            throw th;
        }
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ezd ezdVar = new ezd(this.d, this.b, this.c, this.e, ffguVar);
        ezdVar.f = obj;
        return ezdVar;
    }
}
