package defpackage;

import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uov extends txv<ampg> {
    private static final entd a = entd.c("BugleConversation");
    private final Runnable b;
    private final Consumer c;

    public uov(Runnable runnable, Consumer consumer) {
        super("ConversationDisableModeCallback");
        this.b = runnable;
        this.c = consumer;
    }

    @Override // defpackage.ejwd
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        ampg ampgVar = (ampg) obj;
        ((ensz) a.n().h("com/google/android/apps/messaging/conversation/input/disable/ConversationDisableModeCallback", "onNewData", 36, "ConversationDisableModeCallback.java")).t("ConversationDisableModeCallback#onNewData newMode %s", ampgVar);
        if (ampgVar == ampg.NONE) {
            this.b.run();
        } else {
            this.c.accept(ampgVar);
        }
    }
}
