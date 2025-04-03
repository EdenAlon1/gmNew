package defpackage;

import com.google.android.apps.messaging.shared.datamodel.action.common.Action;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class bbdx extends bbdc {
    private static final cskc o = cskc.g("BugleDataModel", "BackgroundFailureRunnable");
    public final Exception n;

    public bbdx(bbcj bbcjVar, Action action, Exception exc, bbdd bbddVar, errl errlVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3) {
        super(bbcjVar, action, "Bugle.DataModel.ActionBreakdown.FailureExecution.Latency", 2785L, bbddVar, errlVar, ffbrVar, ffbrVar2, ffbrVar3);
        this.n = exc;
    }

    @Override // defpackage.bbdc
    public final void b() {
        Action action;
        ekzz f;
        try {
            action = this.f;
            f = eleg.f("BackgroundFailureRunnable#processBackgroundWorkFailure");
        } catch (Throwable th) {
            th = th;
            try {
                if (((areh) this.k.b()).a()) {
                    th = this.f.u(th);
                }
                if (((Boolean) b.e()).booleanValue()) {
                    o.o(String.valueOf(this.f) + ".processBackgroundWorkFailure threw", th);
                    axnw.d(this.n);
                } else {
                    csix.p(String.valueOf(this.f) + ".processBackgroundWorkFailure threw exception", th);
                }
            } finally {
                this.c.e(this.f, this.d);
            }
        }
        try {
            ekzz a = action.a();
            try {
                Object obj = action.fT().get();
                a.close();
                bbcd.c(action, 0, obj, false);
                f.close();
            } finally {
            }
        } finally {
        }
    }
}
