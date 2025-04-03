package defpackage;

import com.google.android.apps.messaging.replies.snippet.RepliedToDataAdapter;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.concurrent.CancellationException;
import java.util.function.BiConsumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ajsb implements ejlr<MessageIdType, RepliedToDataAdapter> {
    private static final entd a = entd.c("BugleReplies");
    private final BiConsumer b;
    private final BiConsumer c;

    public ajsb(BiConsumer biConsumer, BiConsumer biConsumer2) {
        this.b = biConsumer;
        this.c = biConsumer2;
    }

    @Override // defpackage.ejlr
    public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
        MessageIdType messageIdType = (MessageIdType) obj;
        RepliedToDataAdapter repliedToDataAdapter = (RepliedToDataAdapter) obj2;
        messageIdType.getClass();
        repliedToDataAdapter.getClass();
        a.n().t("Loading replied-to data for message %s succeeded", messageIdType);
        this.b.accept(messageIdType, repliedToDataAdapter);
    }

    @Override // defpackage.ejlr
    public final /* bridge */ /* synthetic */ void m(Object obj, Throwable th) {
        MessageIdType messageIdType = (MessageIdType) obj;
        messageIdType.getClass();
        if (th instanceof CancellationException) {
            ((ensz) ((ensz) a.h()).g(th)).t("Loading replied-to data for message %s cancelled", messageIdType);
        } else if (th instanceof InterruptedException) {
            ((ensz) ((ensz) a.h()).g(th)).t("Loading replied-to data for message %s interrupted", messageIdType);
        } else {
            ((ensz) ((ensz) a.i()).g(th)).t("Loading replied-to data for message %s failed", messageIdType);
        }
        this.c.accept(messageIdType, th);
    }

    @Override // defpackage.ejlr
    public final /* synthetic */ void b(Object obj) {
    }
}
