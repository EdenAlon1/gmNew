package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emep extends ffhv implements ffjm {
    int a;
    final /* synthetic */ emge b;
    final /* synthetic */ emeq c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public emep(emge emgeVar, emeq emeqVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = emgeVar;
        this.c = emeqVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((emep) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            emge emgeVar = this.b;
            emeo emeoVar = new emeo(this.c);
            this.a = 1;
            if (emgeVar.t.a(emeoVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        throw new ffbx();
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new emep(this.b, this.c, ffguVar);
    }
}
