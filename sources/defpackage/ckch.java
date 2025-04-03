package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.ims.rcsservice.group.GroupInfo;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes8.dex */
public interface ckch {
    long a(long j);

    @Deprecated
    Uri b(MessageCoreData messageCoreData, cgtf cgtfVar, List list, long j, String str, int i);

    cpbd c(cpxu cpxuVar, String str, String str2);

    cpxu d(long j, GroupInfo groupInfo);

    cpxu e(cpay cpayVar);

    elfl f(MessageCoreData messageCoreData, cgtf cgtfVar, List list, long j, String str, int i);

    elfl g(MessageCoreData messageCoreData, Uri uri, String str);

    elfl h(MessageCoreData messageCoreData, Uri uri, String str);

    elfl i(MessageCoreData messageCoreData, Uri uri, String str);

    elfl j(MessageCoreData messageCoreData, Uri uri, String str);

    elfl k(MessageCoreData messageCoreData, Uri uri, String str);

    elfl l(MessageCoreData messageCoreData, long j, aoku aokuVar, String str, int i);

    @Deprecated
    elfl m(MessageCoreData messageCoreData, Uri uri, String str, int i);
}
