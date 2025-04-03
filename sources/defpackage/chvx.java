package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class chvx extends ffhv implements ffjm {
    int a;
    final /* synthetic */ chwa b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public chvx(chwa chwaVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = chwaVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((chvx) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            chwa chwaVar = this.b;
            this.a = 1;
            obj = chwaVar.b(this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        long longValue = ((Number) obj).longValue();
        eslm eslmVar = (eslm) esln.a.createBuilder();
        eslmVar.getClass();
        eslo.b(eslmVar);
        eslmVar.copyOnWrite();
        ((esln) eslmVar.instance).c = longValue;
        eslmVar.copyOnWrite();
        ((esln) eslmVar.instance).d = true;
        return eslo.a(eslmVar).toByteString();
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new chvx(this.b, ffguVar);
    }
}
