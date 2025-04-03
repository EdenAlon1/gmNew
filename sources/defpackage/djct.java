package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djct {
    static final diyy a = diyv.b("enable_receive_message_producer_module_2");
    private final Context b;
    private final Executor c;
    private final djgk d;
    private final dlpw e;
    private final eikp f;
    private final errl g;
    private final ctvb h;
    private final dkgw i;
    private final eehz j;
    private final dipa k;
    private final djgy l;
    private final djcs m;
    private final djcq n;
    private final djhc o;
    private final clpn p;
    private final errm q;

    public djct(Context context, Executor executor, djgk djgkVar, dlpw dlpwVar, eikp eikpVar, errl errlVar, ctvb ctvbVar, dkgw dkgwVar, eehz eehzVar, dipa dipaVar, djgy djgyVar, djcs djcsVar, djcq djcqVar, djhc djhcVar, clpn clpnVar, errm errmVar) {
        this.b = context;
        this.c = executor;
        this.d = djgkVar;
        this.e = dlpwVar;
        this.f = eikpVar;
        this.g = errlVar;
        this.h = ctvbVar;
        this.i = dkgwVar;
        this.j = eehzVar;
        this.k = dipaVar;
        this.l = djgyVar;
        this.m = djcsVar;
        this.n = djcqVar;
        this.o = djhcVar;
        this.p = clpnVar;
        this.q = errmVar;
    }

    public final ListenableFuture a(djeb djebVar) {
        djgk djgkVar = this.d;
        djgkVar.getClass();
        dkgw dkgwVar = this.i;
        dkgwVar.getClass();
        eehz eehzVar = this.j;
        eehzVar.getClass();
        djcs djcsVar = this.m;
        djcsVar.getClass();
        djhc djhcVar = this.o;
        djhcVar.getClass();
        djbr djbrVar = new djbr(djebVar, this.b, this.c, djgkVar, this.e, this.f, this.g, this.h, dkgwVar, eehzVar, this.k, djcsVar, this.n, djhcVar, this.q, this.p);
        return ((Boolean) a.a()).booleanValue() ? djbrVar.P.d() : djbrVar.f.d();
    }
}
