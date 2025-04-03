package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;

/* compiled from: PG */
/* loaded from: classes2.dex */
final /* synthetic */ class zrw extends ffkh implements ffjm {
    public zrw(Object obj) {
        super(2, obj, zrx.class, "onCacheEntryRemoved", "onCacheEntryRemoved(Lcom/google/android/apps/messaging/shared/api/messaging/MessageId;Lcom/google/android/apps/messaging/conversation2/messagelist/message/MessageUiDataCache$CacheValue;)V", 0);
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        MessageId messageId = (MessageId) obj;
        zru zruVar = (zru) obj2;
        messageId.getClass();
        zruVar.getClass();
        ((enrr) zrx.a.g().h("com/google/android/apps/messaging/conversation2/messagelist/message/MessageUiDataCache", "onCacheEntryRemoved", 122, "MessageUiDataCache.kt")).t("Canceling message scope. id = %s", messageId.a());
        ffsl.e(zruVar.c, null);
        return ffcu.a;
    }
}
