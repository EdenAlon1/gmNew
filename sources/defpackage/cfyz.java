package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.concurrent.ThreadLocalRandom;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfyz implements cfyt, csiw {
    public static final entd d = entd.c("Bugle");
    public final ffbr e;
    public final ffbr f;
    public final ffbr g;
    public final ffbr h;
    private final errl i;
    private final String j = ".PHONE_SILENT_FEEDBACK";

    public cfyz(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, errl errlVar) {
        this.e = ffbrVar;
        this.f = ffbrVar2;
        this.h = ffbrVar3;
        this.g = ffbrVar4;
        this.i = errlVar;
    }

    private final elfl e(Throwable th, boolean z) {
        entd entdVar = d;
        ((ensz) ((ensz) ((ensz) entdVar.j()).g(th)).h("com/google/android/apps/messaging/shared/feedback/SilentFeedbackManagerImpl", "sendSilentFeedbackForAssert", (char) 133, "SilentFeedbackManagerImpl.java")).q("SilentFeedbackManager: Messages automatically detected an error.");
        if (((Boolean) cfyt.a.e()).booleanValue()) {
            return f(th);
        }
        ((ensz) ((ensz) entdVar.n().g(th)).h("com/google/android/apps/messaging/shared/feedback/SilentFeedbackManagerImpl", "sendSilentFeedbackForAssert", 136, "SilentFeedbackManagerImpl.java")).q("SilentFeedbackManager: Silent assert uploading disabled. Not reporting");
        return elfo.e(null);
    }

    private final elfl f(final Throwable th) {
        return elfo.h(new erog() { // from class: cfyy
            @Override // defpackage.erog
            public final ListenableFuture a() {
                cfyz cfyzVar = cfyz.this;
                boolean booleanValue = ((Boolean) cfyzVar.h.b()).booleanValue();
                Throwable th2 = th;
                if (!booleanValue) {
                    ((ensz) ((ensz) ((ensz) cfyz.d.h()).g(th2)).h("com/google/android/apps/messaging/shared/feedback/SilentFeedbackManagerImpl", "sendSilentFeedback", 'M', "SilentFeedbackManagerImpl.java")).q("SilentFeedbackManager: SilentFeedback is disabled. Not uploading");
                    return elfo.e(null);
                }
                ((ensz) ((ensz) ((ensz) cfyz.d.h()).g(th2)).h("com/google/android/apps/messaging/shared/feedback/SilentFeedbackManagerImpl", "sendSilentFeedback", 'G', "SilentFeedbackManagerImpl.java")).q("SilentFeedbackManager: Sending silent feedback");
                return elfo.e(null);
            }
        }, this.i);
    }

    @Override // defpackage.cfyt, defpackage.csiw
    public final elfl a(final Throwable th) {
        return e(th, false).i(new eroh() { // from class: cfyx
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                return cfyz.this.d(th);
            }
        }, erpp.a);
    }

    @Override // defpackage.cfyt
    public final elfl b(final Throwable th) {
        return f(th).i(new eroh() { // from class: cfyu
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                return cfyz.this.d(th);
            }
        }, erpp.a);
    }

    @Override // defpackage.cfyt
    public final void c(Throwable th) {
        if (cful.a(ThreadLocalRandom.current(), cful.r)) {
            e(th, true);
        } else {
            ((ensz) ((ensz) d.n().g(th)).h("com/google/android/apps/messaging/shared/feedback/SilentFeedbackManagerImpl", "onSlowCode", 157, "SilentFeedbackManagerImpl.java")).q("SilentFeedbackManager: Throttling reporting");
            elfo.e(null);
        }
    }

    public final elfl d(final Throwable th) {
        return b.b().i(new eroh() { // from class: cfyv
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                entd entdVar = cfyz.d;
                if (((Boolean) obj).booleanValue()) {
                    return cfyt.c.b();
                }
                ((ensz) ((ensz) cfyz.d.n().g(th)).h("com/google/android/apps/messaging/shared/feedback/SilentFeedbackManagerImpl", "postIssueNotification", 95, "SilentFeedbackManagerImpl.java")).q("SilentFeedbackManager: Issue notification is disabled. Not notifying");
                return elfo.e(null);
            }
        }, erpp.a).i(new eroh() { // from class: cfyw
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                Long l = (Long) obj;
                if (l == null) {
                    ((ensz) cfyz.d.n().h("com/google/android/apps/messaging/shared/feedback/SilentFeedbackManagerImpl", "postIssueNotification", 104, "SilentFeedbackManagerImpl.java")).q("SilentFeedbackManager: backoffTime is null. Not posting issue notification.");
                    return elfo.e(null);
                }
                Throwable th2 = th;
                cfyz cfyzVar = cfyz.this;
                if (!((ashp) cfyzVar.g.b()).a() || !(th2 instanceof ccwp)) {
                    return ((cins) cfyzVar.f.b()).Q(th2, l.longValue());
                }
                ((ensz) cfyz.d.n().h("com/google/android/apps/messaging/shared/feedback/SilentFeedbackManagerImpl", "postIssueNotification", 112, "SilentFeedbackManagerImpl.java")).q("SilentFeedbackManager: throwable is CmsBackupItemNotFoundException. Not posting issue notification.");
                return elfo.e(null);
            }
        }, this.i);
    }
}
