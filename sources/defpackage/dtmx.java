package defpackage;

import java.util.List;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtmx extends dtna {
    final /* synthetic */ errm a;
    final /* synthetic */ ffbr b;

    public dtmx(errm errmVar, ffbr ffbrVar) {
        this.a = errmVar;
        this.b = ffbrVar;
    }

    @Override // defpackage.erqd, java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.a.execute(new dtmz(runnable, this.b));
    }

    @Override // defpackage.dtna, defpackage.erqi
    public final /* synthetic */ errl h() {
        return this.a;
    }

    @Override // defpackage.erqd, defpackage.enfm
    public final /* synthetic */ Object hC() {
        return this.a;
    }

    @Override // defpackage.erqi, defpackage.erqd
    public final /* synthetic */ ExecutorService i() {
        return this.a;
    }

    @Override // defpackage.dtna
    public final errm j() {
        return this.a;
    }

    @Override // defpackage.erqd, java.util.concurrent.ExecutorService
    public final void shutdown() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.erqd, java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.enfm
    public final String toString() {
        return "ExceptionHandling[" + super.toString() + "]";
    }
}
