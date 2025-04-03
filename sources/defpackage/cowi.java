package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cowi {
    public static final cowj a(MessageCoreData messageCoreData) {
        messageCoreData.getClass();
        bdhg E = messageCoreData.E();
        if (E == null) {
            throw new IllegalStateException("Required value was null.");
        }
        String ay = messageCoreData.ay();
        if (ay == null) {
            throw new IllegalStateException("Required value was null.");
        }
        boolean cB = messageCoreData.cB();
        awui w = messageCoreData.w();
        w.getClass();
        return new cowj(E, ay, cB, w, messageCoreData.aa());
    }
}
