package defpackage;

import android.app.job.JobScheduler;
import android.content.Context;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbpe {
    public final cqoh a;
    public final JobScheduler b;
    public final fgcq c;
    public final ffxx d;
    public final ffxx e;
    private final Context f;
    private final cfjc g;
    private final ffsk h;
    private final ffxx i;
    private final fgcq j;
    private final ffxx k;

    public dbpe(Context context, cqoh cqohVar, cfjc cfjcVar, ffsk ffskVar) {
        context.getClass();
        cqohVar.getClass();
        cfjcVar.getClass();
        ffskVar.getClass();
        this.f = context;
        this.a = cqohVar;
        this.g = cfjcVar;
        this.h = ffskVar;
        Object systemService = context.getSystemService("jobscheduler");
        systemService.getClass();
        this.b = (JobScheduler) systemService;
        cfba a = cfbf.a();
        a.z("PwqDebugUiDataService::workItemCounts");
        a.r();
        a.c(cfbf.c.f);
        a.n(new dtzr("COUNT(*)"), "count");
        a.v(cfbf.c.f);
        ffxx a2 = bqaa.a(a.b());
        int i = fgcz.a;
        dbou dbouVar = new dbou(new dbor(fgbn.a(a2, ffskVar, fgcy.a, 1)));
        this.i = dbouVar;
        fgcm fgcmVar = cfjcVar.d;
        cfiv cfivVar = new cfiv(null);
        int i2 = fgau.a;
        fgcq a3 = fgbn.a(new fgch(ffyy.a(new fgen(cfivVar, fgcmVar)), dbouVar, new dbon(null)), ffskVar, fgcy.a, 1);
        this.c = a3;
        String[] strArr = cfft.a;
        cffo cffoVar = new cffo(cfft.a);
        cffoVar.z("PwqDebugUiDataService::wqwmRowsQuery");
        cffoVar.r();
        fgcq a4 = fgbn.a(bqaa.a(cffoVar.b()), ffskVar, fgcy.a, 1);
        this.j = a4;
        long j = ffpw.a;
        dbpa dbpaVar = new dbpa(new dbox(new fgcp(new dbom(ffpy.d(5, ffpz.d), null)), this), this);
        this.k = dbpaVar;
        this.d = fgck.a(a3, a4, dbpaVar, new dboo(this, null));
        this.e = new fgbv(new ArrayList(), new dbpd(new fgcn(cfjcVar.e), this), new dbok(null));
    }
}
