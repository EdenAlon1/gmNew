package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djcs {
    private final Context a;
    private final Executor b;
    private final djgk c;
    private final djgj d;
    private final dlpw e;
    private final eikp f;
    private final errl g;
    private final ctvb h;
    private final dkgw i;
    private final eehz j;
    private final dipa k;
    private final djgy l;
    private final clpn m;
    private final errm n;

    public djcs(Context context, Executor executor, djgk djgkVar, djgj djgjVar, dlpw dlpwVar, eikp eikpVar, errl errlVar, ctvb ctvbVar, dkgw dkgwVar, eehz eehzVar, dipa dipaVar, djgy djgyVar, clpn clpnVar, errm errmVar) {
        this.a = context;
        this.b = executor;
        this.c = djgkVar;
        this.d = djgjVar;
        this.e = dlpwVar;
        this.f = eikpVar;
        this.g = errlVar;
        this.h = ctvbVar;
        this.i = dkgwVar;
        this.j = eehzVar;
        this.k = dipaVar;
        this.l = djgyVar;
        this.m = clpnVar;
        this.n = errmVar;
    }

    public final ListenableFuture a(djgb djgbVar) {
        this.c.getClass();
        djgj djgjVar = this.d;
        djgjVar.getClass();
        this.i.getClass();
        this.j.getClass();
        dlpw dlpwVar = this.e;
        return new djbp(djgbVar, this.a, this.b, djgjVar, dlpwVar, this.n, this.m).d.d();
    }
}
