package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class alee {
    public static int a(MessageCoreData messageCoreData) {
        int d = messageCoreData.d();
        if (d == 0) {
            return 2;
        }
        if (d == 1 || d == 2) {
            return 3;
        }
        return (d == 3 || d == 4) ? 4 : 1;
    }
}
