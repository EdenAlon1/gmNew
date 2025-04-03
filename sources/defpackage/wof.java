package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wof extends ffhv implements ffjm {
    int a;
    final /* synthetic */ woi b;
    final /* synthetic */ boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wof(woi woiVar, boolean z, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = woiVar;
        this.c = z;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((wof) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            woi woiVar = this.b;
            final boolean z = this.c;
            ffji ffjiVar = new ffji() { // from class: woe
                @Override // defpackage.ffji
                public final Object invoke(Object obj2) {
                    czuj builder = ((czuk) obj2).toBuilder();
                    builder.copyOnWrite();
                    czuk czukVar = (czuk) builder.instance;
                    czukVar.b |= 4;
                    czukVar.e = z;
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
        return new wof(this.b, this.c, ffguVar);
    }
}
