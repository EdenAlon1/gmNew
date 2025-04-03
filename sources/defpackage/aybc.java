package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aybc extends ffhv implements ffjm {
    int a;
    final /* synthetic */ aybd b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aybc(aybd aybdVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = aybdVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aybc) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        try {
            if (this.a != 0) {
                ffci.b(obj);
            } else {
                ffci.b(obj);
                aybe aybeVar = (aybe) this.b.c.b();
                this.a = 1;
                if (aybeVar.a(2, this) == ffhhVar) {
                    return ffhhVar;
                }
            }
        } catch (Exception e) {
            if (!((Boolean) axum.h.e()).booleanValue() || (((Boolean) axum.k.e()).booleanValue() && !(((Boolean) axum.k.e()).booleanValue() && axuv.a(e)))) {
                ((ensz) ((ensz) aybd.a.j()).g(e)).q("Encountered an exception during sync. Throwing an exception.");
                throw e;
            }
            ((ensz) ((ensz) aybd.a.e()).g(e)).q("Caught an exception during sync. Logging and skipping current sync");
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new aybc(this.b, ffguVar);
    }
}
