package defpackage;

import java.util.concurrent.Executor;
import java.util.function.BiConsumer;

/* compiled from: PG */
@Deprecated
/* loaded from: classes6.dex */
public final class alct extends alhh {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/analytics/compose/ComposeNavigationEventLogger");

    public alct(ffbr ffbrVar, alcs alcsVar, Executor executor) {
        super(ffbrVar, alcsVar, executor);
    }

    @Override // defpackage.alhh
    public final BiConsumer a() {
        throw new UnsupportedOperationException("ComposeNavigationEventLogger is not supported");
    }

    public final void b(epts eptsVar, eptu eptuVar, eptk eptkVar) {
        enrr enrrVar = (enrr) a.j();
        enrrVar.aa(ensy.MEDIUM);
        ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/analytics/compose/ComposeNavigationEventLogger", "deprecatedLogScreenClosed", 121, "ComposeNavigationEventLogger.java")).J("ComposeNavigationEventLogger.deprecatedLogScreenClosed 1 %s, %s, %s", eptsVar, eptuVar, Integer.valueOf(eptkVar.h));
    }

    public final void c(eptv eptvVar, eptk eptkVar) {
        enrr enrrVar = (enrr) a.j();
        enrrVar.aa(ensy.MEDIUM);
        ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/analytics/compose/ComposeNavigationEventLogger", "deprecatedLogScreenClosed", 143, "ComposeNavigationEventLogger.java")).B("ComposeNavigationEventLogger.deprecatedLogScreenClosed 3 %s, %s", eptvVar, eptkVar.h);
    }

    public final void d(epts eptsVar, eptu eptuVar, epto eptoVar, eptm eptmVar) {
        enrr enrrVar = (enrr) a.j();
        enrrVar.aa(ensy.MEDIUM);
        ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/analytics/compose/ComposeNavigationEventLogger", "deprecatedLogScreenOpened", 59, "ComposeNavigationEventLogger.java")).K("ComposeNavigationEventLogger.deprecatedLogScreenOpened 1 %s, %s, %s, %s", eptsVar, eptuVar, eptoVar, Integer.valueOf(eptmVar.r));
    }
}
