package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gsh extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ftb b;
    final /* synthetic */ float c;
    final /* synthetic */ boolean d;
    final /* synthetic */ hho e;
    final /* synthetic */ hho f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gsh(ftb ftbVar, float f, boolean z, hho hhoVar, hho hhoVar2, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ftbVar;
        this.c = f;
        this.d = z;
        this.e = hhoVar;
        this.f = hhoVar2;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((gsh) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ftb ftbVar = this.b;
            float b = iak.b(guj.c(this.e));
            float c = iak.c(guj.c(this.e));
            float f = this.c;
            boolean z = this.d;
            long j = ((kaa) this.f.a()).a;
            daa daaVar = new daa((byte[]) null);
            this.a = 1;
            if (guj.h(ftbVar, b, c, f, z, j, daaVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new gsh(this.b, this.c, this.d, this.e, this.f, ffguVar);
    }
}
