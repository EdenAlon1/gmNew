package defpackage;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;

/* compiled from: PG */
/* loaded from: classes.dex */
final /* synthetic */ class ptf extends ffkh implements ffjq {
    public static final ptf a = new ptf();

    public ptf() {
        super(6, ptg.class, "createSchedulers", "createSchedulers(Landroid/content/Context;Landroidx/work/Configuration;Landroidx/work/impl/utils/taskexecutor/TaskExecutor;Landroidx/work/impl/WorkDatabase;Landroidx/work/impl/constraints/trackers/Trackers;Landroidx/work/impl/Processor;)Ljava/util/List;", 1);
    }

    @Override // defpackage.ffjq
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        Context context = (Context) obj;
        pod podVar = (pod) obj2;
        qbc qbcVar = (qbc) obj3;
        WorkDatabase workDatabase = (WorkDatabase) obj4;
        pws pwsVar = (pws) obj5;
        prv prvVar = (prv) obj6;
        context.getClass();
        podVar.getClass();
        qbcVar.getClass();
        workDatabase.getClass();
        pwsVar.getClass();
        String str = psa.a;
        pux puxVar = new pux(context, workDatabase, podVar);
        qae.a(context, SystemJobService.class, true);
        ppt.c().a(psa.a, "Created SystemJobScheduler and enabled SystemJobService");
        return ffdx.g(puxVar, new pug(context, podVar, pwsVar, prvVar, new ptc(prvVar, qbcVar), qbcVar));
    }
}
