package defpackage;

import androidx.work.WorkerParameters;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
@Deprecated
/* loaded from: classes6.dex */
public final class ayzc implements ejny {
    private static final enru c = enru.c("com/google/android/apps/messaging/shared/conversation/match/logging/DeprecatedConversationMatchingLoggerWorker");
    final ejoc a;
    final errl b;

    public ayzc(ejoc ejocVar, errl errlVar) {
        this.a = ejocVar;
        this.b = errlVar;
    }

    @Override // defpackage.ejok
    public final /* synthetic */ ListenableFuture a(WorkerParameters workerParameters) {
        return ejoj.a();
    }

    @Override // defpackage.ejny, defpackage.ejok
    public final ListenableFuture b(WorkerParameters workerParameters) {
        ((enrr) ((enrr) c.h()).h("com/google/android/apps/messaging/shared/conversation/match/logging/DeprecatedConversationMatchingLoggerWorker", "startWork", 43, "DeprecatedConversationMatchingLoggerWorker.java")).q("ConversationMatchingLogger is deprecated. Cancelling future work.");
        return elfl.g(this.a.b(workerParameters.a)).h(new emwl() { // from class: ayzb
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return new ppn();
            }
        }, this.b);
    }
}
