package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wod extends ffhv implements ffjm {
    int a;
    final /* synthetic */ woi b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wod(woi woiVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = woiVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((wod) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            woi woiVar = this.b;
            ffji ffjiVar = new ffji() { // from class: woc
                @Override // defpackage.ffji
                public final Object invoke(Object obj2) {
                    czuj builder = ((czuk) obj2).toBuilder();
                    builder.copyOnWrite();
                    czuk czukVar = (czuk) builder.instance;
                    czukVar.b |= 8;
                    czukVar.f = 0;
                    czuk build = builder.build();
                    build.getClass();
                    return build;
                }
            };
            this.a = 1;
            if (woiVar.c.d(ffjiVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new wod(this.b, ffguVar);
    }
}
