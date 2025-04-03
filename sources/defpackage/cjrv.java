package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cjrv extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cjrw b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cjrv(cjrw cjrwVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cjrwVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cjrv) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            cjrw cjrwVar = this.b;
            ejoe n = ejoi.n(cjrz.class);
            n.g(new ejnx("PROFILES_CLEANUP_WORKER", poz.CANCEL_AND_REENQUEUE));
            Object b = cjrwVar.b.b();
            b.getClass();
            n.e(new ejnv(new ejnw(((Number) b).longValue(), TimeUnit.MINUTES), emux.a));
            ListenableFuture c = cjrwVar.a.c(n.h());
            this.a = 1;
            if (fgfz.c(c, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cjrv(this.b, ffguVar);
    }
}
