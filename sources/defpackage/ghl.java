package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ghl extends ffhv implements ffjm {
    int a;
    final /* synthetic */ gmk b;
    final /* synthetic */ float c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ghl(gmk gmkVar, float f, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = gmkVar;
        this.c = f;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ghl) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            gmk gmkVar = this.b;
            float f = this.c;
            this.a = 1;
            if (gmkVar.h(f, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ghl(this.b, this.c, ffguVar);
    }
}
