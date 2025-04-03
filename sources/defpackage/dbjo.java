package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dbjo extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dbjv b;
    final /* synthetic */ ffji c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dbjo(dbjv dbjvVar, ffji ffjiVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dbjvVar;
        this.c = ffjiVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dbjo) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        fgcm fgcmVar;
        Object c;
        ffhh ffhhVar = ffhh.a;
        try {
            if (this.a != 0) {
                ffci.b(obj);
            } else {
                ffci.b(obj);
                dbjv dbjvVar = this.b;
                do {
                    fgcmVar = dbjvVar.f;
                    c = fgcmVar.c();
                    ((Boolean) c).booleanValue();
                } while (!fgcmVar.g(c, true));
                ffji ffjiVar = this.c;
                this.a = 1;
                if (ffjiVar.invoke(this) == ffhhVar) {
                    return ffhhVar;
                }
            }
            this.b.a();
            return ffcu.a;
        } catch (Throwable th) {
            this.b.a();
            throw th;
        }
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dbjo(this.b, this.c, ffguVar);
    }
}
