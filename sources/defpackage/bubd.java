package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bubd implements Supplier {
    final /* synthetic */ bube a;

    public bubd(bube bubeVar) {
        this.a = bubeVar;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        MessageIdType messageIdType = this.a.a;
        if (messageIdType == null || messageIdType.equals(bdhb.a)) {
            return null;
        }
        return Long.valueOf(bdhb.a(this.a.a));
    }
}
