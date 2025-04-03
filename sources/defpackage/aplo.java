package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aplo extends ffhv implements ffjm {
    int a;
    final /* synthetic */ aplx b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aplo(aplx aplxVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = aplxVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aplo) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            aplx aplxVar = this.b;
            this.a = 1;
            if (aplxVar.f(this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new aplo(this.b, ffguVar);
    }
}
