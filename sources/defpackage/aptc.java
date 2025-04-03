package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.message.internal.CoreBugleMessageId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aptc {
    private final AtomicInteger a = new AtomicInteger(Integer.MIN_VALUE);

    public final CoreBugleMessageId a() {
        long incrementAndGet = this.a.incrementAndGet();
        emxf.l(incrementAndGet < 0);
        return new CoreBugleMessageId(new MessageIdType(incrementAndGet), -1L);
    }
}
