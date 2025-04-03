package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aegu extends ffhv implements ffjm {
    int a;
    final /* synthetic */ aegv b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aegu(ffgu ffguVar, aegv aegvVar) {
        super(2, ffguVar);
        this.b = aegvVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aegu) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        if (this.a != 0) {
            ffci.b(obj);
        } else {
            ffci.b(obj);
            aegv aegvVar = this.b;
            this.a = 1;
            obj = aegvVar.a.c(this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        aegq aegqVar = (aegq) obj;
        if ((aegqVar.b & 1) != 0) {
            return new Integer(aegqVar.c);
        }
        this.b.b(0);
        return new Integer(0);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        aegu aeguVar = new aegu(ffguVar, this.b);
        aeguVar.c = obj;
        return aeguVar;
    }
}
