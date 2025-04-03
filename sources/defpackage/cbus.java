package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final /* synthetic */ class cbus {
    public static long a(MessageCoreData messageCoreData, buxr buxrVar, cskc cskcVar) {
        long o = messageCoreData.o();
        try {
            return buxrVar.c();
        } catch (RuntimeException e) {
            cskcVar.s("receivedTimestamp not in builder, using existing receivedTimestamp", e);
            return o;
        }
    }
}
