package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjxb extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cjxc b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cjxb(cjxc cjxcVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cjxcVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cjxb) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            cjxc cjxcVar = this.b;
            ejoe n = ejoi.n(cjxe.class);
            n.g(new ejnx("PROFILES_FULL_REFRESH_WORKER", poz.UPDATE));
            Object b = cjxcVar.c.b();
            b.getClass();
            ejnw ejnwVar = new ejnw(((Number) b).longValue(), TimeUnit.MINUTES);
            Object b2 = cjxcVar.d.b();
            b2.getClass();
            n.e(ejof.c(ejnwVar, new ejnw(((Number) b2).longValue(), TimeUnit.MINUTES)));
            ListenableFuture a = cjxcVar.b.a(n.h());
            this.a = 1;
            if (fgfz.c(a, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cjxb(this.b, ffguVar);
    }
}
