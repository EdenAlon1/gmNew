package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class alrm {
    static eooi a(MessageCoreData messageCoreData, int i) {
        int i2 = i - 1;
        return (i2 == 2 || i2 == 3) ? eooi.INCOMING : messageCoreData.y().j();
    }
}
