package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dnf extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dni b;
    final /* synthetic */ ffjm c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnf(dni dniVar, ffjm ffjmVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dniVar;
        this.c = ffjmVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dnf) c((dnh) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        try {
            if (this.a != 0) {
                ffci.b(obj);
            } else {
                ffci.b(obj);
                dnh dnhVar = (dnh) this.d;
                this.b.c.b(true);
                ffjm ffjmVar = this.c;
                this.a = 1;
                if (ffjmVar.a(dnhVar, this) == ffhhVar) {
                    return ffhhVar;
                }
            }
            this.b.c.b(false);
            return ffcu.a;
        } catch (Throwable th) {
            this.b.c.b(false);
            throw th;
        }
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        dnf dnfVar = new dnf(this.b, this.c, ffguVar);
        dnfVar.d = obj;
        return dnfVar;
    }
}
