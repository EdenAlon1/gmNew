package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bucn implements Supplier {
    final /* synthetic */ buco a;

    public bucn(buco bucoVar) {
        this.a = bucoVar;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        MessageIdType messageIdType = this.a.d;
        if (messageIdType == null || messageIdType.equals(bdhb.a)) {
            return null;
        }
        return Long.valueOf(bdhb.a(this.a.d));
    }
}
