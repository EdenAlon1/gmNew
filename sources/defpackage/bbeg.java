package defpackage;

import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.action.execution.ActionExecutorImpl;
import com.google.common.util.concurrent.SettableFuture;
import j$.util.Optional;
import j$.util.concurrent.ThreadLocalRandom;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class bbeg extends bbdc {
    private static final cskc n = cskc.g("BugleDataModel", "ExecuteActionRunnable");
    private final SettableFuture o;

    public bbeg(bbcj bbcjVar, Action action, SettableFuture settableFuture, bbdd bbddVar, errl errlVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3) {
        super(bbcjVar, action, "Bugle.DataModel.ActionBreakdown.Execution.Latency", 2785L, bbddVar, errlVar, ffbrVar, ffbrVar2, ffbrVar3);
        this.o = settableFuture;
    }

    @Override // defpackage.bbdc
    public final void b() {
        bbdd bbddVar;
        ecda c;
        csjb c2 = n.c();
        c2.I("running action ");
        c2.v(this.f.getClass().getSimpleName());
        c2.r();
        ekzz f = eleg.f("ExecuteActionRunnable#runImpl");
        try {
            Optional of = cful.a(ThreadLocalRandom.current(), ActionExecutorImpl.a) ? Optional.of(((ActionExecutorImpl) this.c).e.d()) : Optional.empty();
            ecrh ecrhVar = ecrh.SUCCESS;
            bbcd.e(this.f, 2, 3);
            try {
                try {
                    try {
                        ekzz a = this.f.a();
                        try {
                            this.o.m(erqt.j(this.f.e()));
                            Object obj = this.o.get();
                            a.close();
                            bbcd.a(this.f, obj);
                            String c3 = this.f.c();
                            if (!TextUtils.isEmpty(c3)) {
                                this.c.h(c3, this.f.s);
                            }
                            this.c.e(this.f, this.d);
                            bbddVar = this.c;
                            c = ecda.c("ActionExecutionLatency_", this.f.w);
                        } catch (Throwable th) {
                            try {
                                a.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        bbcd.a(this.f, null);
                        String c4 = this.f.c();
                        if (!TextUtils.isEmpty(c4)) {
                            this.c.h(c4, this.f.s);
                        }
                        this.c.e(this.f, this.d);
                        this.c.g(of, ecda.c("ActionExecutionLatency_", this.f.w), ecrhVar);
                        throw th3;
                    }
                } catch (cotr e) {
                    ecrh ecrhVar2 = ecrh.ERROR;
                    if (!((areh) this.k.b()).a()) {
                        throw e;
                    }
                    ArrayList arrayList = this.f.x;
                    if (arrayList == null) {
                        throw e;
                    }
                    throw Action.o(arrayList, e);
                }
            } catch (Throwable th4) {
                th = th4;
                ecrhVar = ecrh.ERROR;
                if (th instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                if (!((Boolean) b.e()).booleanValue()) {
                    if (((areh) this.k.b()).a()) {
                        th = this.f.u(th);
                    }
                    this.o.setException(th);
                    csix.p(String.valueOf(this.f) + ".executeAction threw " + th.toString(), th);
                } else if (((arei) this.j.b()).a() && (th instanceof CancellationException)) {
                    n.s("future failed due to CancellationException", th);
                    this.o.setException(th);
                } else {
                    if (((areh) this.k.b()).a()) {
                        th = this.f.u(th);
                    }
                    n.o("Fatal Error in action", th);
                    axnw.d(th);
                }
                bbcd.a(this.f, null);
                String c5 = this.f.c();
                if (!TextUtils.isEmpty(c5)) {
                    this.c.h(c5, this.f.s);
                }
                this.c.e(this.f, this.d);
                bbddVar = this.c;
                c = ecda.c("ActionExecutionLatency_", this.f.w);
            }
            bbddVar.g(of, c, ecrhVar);
            f.close();
        } catch (Throwable th5) {
            try {
                f.close();
            } catch (Throwable th6) {
                th5.addSuppressed(th6);
            }
            throw th5;
        }
    }
}
