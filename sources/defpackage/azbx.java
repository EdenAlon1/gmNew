package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class azbx extends ffhv implements ffjm {
    int a;
    final /* synthetic */ azcr b;
    final /* synthetic */ azcf c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public azbx(azcr azcrVar, azcf azcfVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = azcrVar;
        this.c = azcfVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((azbx) c((azcr) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ensk e = azcf.a.e();
            e.Y(ente.a, "BugleCME");
            ((enrr) e.h("com/google/android/apps/messaging/shared/core/destination/CachingDestinationManager$getDestination$2", "invokeSuspend", 52, "CachingDestinationManager.kt")).t("Cache miss fetching destination from token %s. Loading from database.", this.b);
            azci azciVar = (azci) this.c.c.b();
            Set b = fffi.b(this.b);
            this.a = 1;
            obj = azciVar.a(b, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        azch azchVar = (azch) ffdx.S((Iterable) obj);
        azcf azcfVar = this.c;
        azcfVar.b.d(azchVar.c, azchVar.a);
        return azchVar;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new azbx(this.b, this.c, ffguVar);
    }
}
