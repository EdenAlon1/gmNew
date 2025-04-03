package defpackage;

import com.google.android.rcs.client.messaging.data.ContentType;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes5.dex */
abstract class eikk {
    static eikk d(ContentType contentType, Class cls, Supplier supplier) {
        if (contentType != null) {
            return new eijl(contentType, cls, supplier);
        }
        throw new NullPointerException("Null contentType");
    }

    public abstract ContentType a();

    public abstract Class b();

    public abstract Supplier c();

    final eiko e() {
        Object obj;
        obj = c().get();
        return (eiko) obj;
    }
}
