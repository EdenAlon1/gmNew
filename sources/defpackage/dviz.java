package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dviz extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dvja b;
    final /* synthetic */ eagt c;
    final /* synthetic */ exyl d;
    final /* synthetic */ exrt e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dviz(dvja dvjaVar, eagt eagtVar, exyl exylVar, exrt exrtVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dvjaVar;
        this.c = eagtVar;
        this.d = exylVar;
        this.e = exrtVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dviz) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            dvja dvjaVar = this.b;
            eagt eagtVar = this.c;
            exyl exylVar = this.d;
            exrt exrtVar = this.e;
            this.a = 1;
            if (dvjaVar.a.a(eagtVar, exylVar, exrtVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dviz(this.b, this.c, this.d, this.e, ffguVar);
    }
}
