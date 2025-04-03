package defpackage;

import android.net.Uri;
import android.os.Bundle;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.time.Duration;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes6.dex */
public interface bbfr extends bbck {
    Action a(MessageIdType messageIdType, String str, int i, int i2);

    Action b(int i, Uri uri, Bundle bundle);

    Action d(bdhg bdhgVar, int i, long j, long j2, Duration duration);

    Action e(bdhg bdhgVar, int i, Instant instant, eopq eopqVar, awyp awypVar);

    Action f(bdhg bdhgVar, awud awudVar, Instant instant, boolean z, eopq eopqVar, awyp awypVar, eqxi eqxiVar);

    Action g(bdgr bdgrVar, int i, int i2);

    Action h(MessageIdType messageIdType, Uri uri, int i, int i2, int i3, int i4, String str, Boolean bool);

    Action i(MessageIdType messageIdType, bdhg bdhgVar, Uri uri, Uri uri2, int i, int i2, int i3, int i4, eqxi eqxiVar, eopp eoppVar);
}
