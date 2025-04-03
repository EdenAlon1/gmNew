package defpackage;

import com.google.android.apps.messaging.replies.snippet.RepliedToDataAdapter;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.concurrent.CancellationException;
import java.util.function.BiConsumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ajtl implements ejlr<MessageIdType, RepliedToDataAdapter> {
    public final ajql a;
    private final ffsk b;
    private final BiConsumer c;

    public ajtl(ffsk ffskVar, ajql ajqlVar, BiConsumer biConsumer) {
        this.b = ffskVar;
        this.a = ajqlVar;
        this.c = biConsumer;
    }

    @Override // defpackage.ejlr
    public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
        MessageIdType messageIdType = (MessageIdType) obj;
        RepliedToDataAdapter repliedToDataAdapter = (RepliedToDataAdapter) obj2;
        messageIdType.getClass();
        repliedToDataAdapter.getClass();
        ajti.a.n().t("Loading replied-to data for message %s succeeded", messageIdType);
        this.c.accept(messageIdType, repliedToDataAdapter);
        axol.k(this.b, null, new ajtk(this, messageIdType, null), 3);
    }

    @Override // defpackage.ejlr
    public final /* bridge */ /* synthetic */ void m(Object obj, Throwable th) {
        MessageIdType messageIdType = (MessageIdType) obj;
        messageIdType.getClass();
        if (th instanceof CancellationException) {
            ((ensz) ((ensz) ajti.a.h()).g(th)).t("Loading replied-to data for message %s cancelled", messageIdType);
        } else if (th instanceof InterruptedException) {
            ((ensz) ((ensz) ajti.a.h()).g(th)).t("Loading replied-to data for message %s interrupted", messageIdType);
        } else {
            ((ensz) ((ensz) ajti.a.i()).g(th)).t("Loading replied-to data for message %s failed", messageIdType);
        }
        axol.k(this.b, null, new ajtj(this, messageIdType, null), 3);
    }

    @Override // defpackage.ejlr
    public final /* synthetic */ void b(Object obj) {
    }
}
