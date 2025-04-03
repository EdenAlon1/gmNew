package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class feej extends fdyy {
    public final fefg a;
    private final feqk b;

    public feej(feef feefVar, Context context, feek feekVar) {
        fefg fefgVar = new fefg();
        context.getClass();
        fefgVar.a = context;
        fefgVar.c = feekVar;
        this.a = fefgVar;
        this.b = new feqk(feefVar, feefVar.d(), fefgVar);
        h(60L, TimeUnit.SECONDS);
    }

    public static feej s(feef feefVar, Context context) {
        return new feej(feefVar, context, new feek());
    }

    @Override // defpackage.fdyx, defpackage.feaw
    public final feau a() {
        ferd ferdVar = this.b.e;
        ferdVar.getClass();
        this.a.b = ferdVar;
        return super.a();
    }

    @Override // defpackage.fdyy, defpackage.fdyx
    protected final feaw b() {
        return this.b;
    }

    @Override // defpackage.fdyy
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public final void h(long j, TimeUnit timeUnit) {
        emxf.m(true, "Idle timeouts are not supported when strict lifecycle management is enabled");
        super.h(j, timeUnit);
    }

    public final void u(Executor executor) {
        executor.getClass();
        this.a.d = executor;
    }

    public final void v(ScheduledExecutorService scheduledExecutorService) {
        scheduledExecutorService.getClass();
        this.a.e = new femo(scheduledExecutorService);
    }

    public final void w(feey feeyVar) {
        this.a.f = feeyVar;
    }

    public final void x(feei feeiVar) {
        this.a.g = feeiVar;
    }
}
