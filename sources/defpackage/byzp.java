package defpackage;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import java.util.List;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes7.dex */
public interface byzp {
    MessageCoreData a();

    MessageCoreData b(Parcel parcel);

    MessageCoreData c(MessagesTable.BindData bindData, List list);

    MessageCoreData d(String str, ConversationIdType conversationIdType, String str2, SelfIdentityId selfIdentityId, String str3, String str4, long j, long j2, boolean z, boolean z2, int i, String str5);

    MessageCoreData e(ConversationIdType conversationIdType, SelfIdentityId selfIdentityId, String str, awui awuiVar);

    MessageCoreData f(ConversationIdType conversationIdType, SelfIdentityId selfIdentityId, MessageCoreData messageCoreData);

    MessageCoreData g(ConversationIdType conversationIdType, SelfIdentityId selfIdentityId, String str, String str2, boolean z);

    MessageCoreData h(ConversationIdType conversationIdType, SelfIdentityId selfIdentityId, awui awuiVar, String str, String str2, UUID uuid);

    MessageCoreData i(ConversationIdType conversationIdType, SelfIdentityId selfIdentityId, String str);

    MessageCoreData j(int i, ConversationIdType conversationIdType, SelfIdentityId selfIdentityId);

    MessageCoreData k(String str, String str2, SelfIdentityId selfIdentityId, ConversationIdType conversationIdType, boolean z, int i, String str3, String str4, int i2, String str5, boolean z2, boolean z3, long j, int i3, long j2, long j3, long j4, String str6, byzi byziVar, long j5);

    MessageCoreData l(Uri uri, ConversationIdType conversationIdType, String str, SelfIdentityId selfIdentityId, String str2, String str3, long j, long j2, boolean z, boolean z2, long j3);

    MessageCoreData m(String str);

    MessageCoreData n(String str, String str2, SelfIdentityId selfIdentityId, ConversationIdType conversationIdType, int i, boolean z, boolean z2, long j, long j2, String str3);

    MessageCoreData o(int i, ConversationIdType conversationIdType, SelfIdentityId selfIdentityId, String str);

    MessageCoreData p(String str, SelfIdentityId selfIdentityId, ConversationIdType conversationIdType, int i, long j, String str2);

    MessageCoreData q(ConversationIdType conversationIdType, int i, long j);

    MessageCoreData r(ConversationIdType conversationIdType, String str, String str2, UUID uuid);

    MessageCoreData s(ConversationIdType conversationIdType, String str, UUID uuid);

    MessageCoreData t(String str, SelfIdentityId selfIdentityId, ConversationIdType conversationIdType, long j, long j2, String str2, bdgr bdgrVar);

    MessageCoreData u(String str, long j, long j2, bdhg bdhgVar, String str2, SelfIdentityId selfIdentityId, ConversationIdType conversationIdType, int i, boolean z, long j3, long j4, String str3, String str4);

    MessageCoreData w(SelfIdentityId selfIdentityId, ConversationIdType conversationIdType, int i, long j, cntb cntbVar, bdgr bdgrVar);

    MessageCoreData x(SelfIdentityId selfIdentityId, ConversationIdType conversationIdType, long j, String str, bdgr bdgrVar);

    MessageCoreData y(bdhg bdhgVar, String str, SelfIdentityId selfIdentityId, ConversationIdType conversationIdType, int i, int i2, String str2, boolean z, boolean z2, long j, long j2);
}
