package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gvg extends ffhv implements ffji {
    int a;
    final /* synthetic */ gvi b;
    final /* synthetic */ ffji c;
    final /* synthetic */ dhy d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gvg(gvi gviVar, ffji ffjiVar, dhy dhyVar, ffgu ffguVar) {
        super(1, ffguVar);
        this.b = gviVar;
        this.c = ffjiVar;
        this.d = dhyVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        try {
            if (this.a != 0) {
                ffci.b(obj);
            } else {
                ffci.b(obj);
                ffji ffjiVar = this.c;
                this.a = 1;
                if (ffjiVar.invoke(this) == ffhhVar) {
                    return ffhhVar;
                }
            }
            if (this.d != dhy.c) {
                this.b.b();
            }
            return ffcu.a;
        } finally {
            if (this.d != dhy.c) {
                this.b.b();
            }
        }
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new gvg(this.b, this.c, this.d, (ffgu) obj).b(ffcu.a);
    }
}
