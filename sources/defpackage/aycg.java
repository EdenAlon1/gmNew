package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aycg extends ffhv implements ffjm {
    int a;
    final /* synthetic */ aych b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aycg(aych aychVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = aychVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aycg) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        try {
            if (this.a != 0) {
                ffci.b(obj);
            } else {
                ffci.b(obj);
                aycj aycjVar = (aycj) this.b.c.b();
                ayci ayciVar = ayci.b;
                this.a = 1;
                if (aycjVar.a(ayciVar, this) == ffhhVar) {
                    return ffhhVar;
                }
            }
        } catch (Exception e) {
            if (!((Boolean) axum.h.e()).booleanValue() || (((Boolean) axum.k.e()).booleanValue() && !(((Boolean) axum.k.e()).booleanValue() && axuv.a(e)))) {
                ((ensz) ((ensz) aych.a.j()).g(e)).q("Encountered an exception during sync. Throwing an exception.");
                throw e;
            }
            ((ensz) ((ensz) aych.a.e()).g(e)).q("Caught an exception during sync. Logging and skipping current sync");
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new aycg(this.b, ffguVar);
    }
}
