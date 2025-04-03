package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.ui.mediaviewer.data.MediaViewerItem;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class dcux extends MediaViewerItem {
    public final Uri a;
    public final Uri b;
    public final String c;
    public final String d;
    public final String e;
    public final ConversationIdType f;
    public final ConversationId g;
    public final MessageIdType h;
    public final MessageId i;

    public dcux(Uri uri, Uri uri2, String str, String str2, String str3, ConversationIdType conversationIdType, ConversationId conversationId, MessageIdType messageIdType, MessageId messageId) {
        if (uri == null) {
            throw new NullPointerException("Null uri");
        }
        this.a = uri;
        this.b = uri2;
        if (str == null) {
            throw new NullPointerException("Null contentType");
        }
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = conversationIdType;
        this.g = conversationId;
        this.h = messageIdType;
        this.i = messageId;
    }

    @Override // com.google.android.apps.messaging.ui.mediaviewer.data.MediaViewerItem
    public final Uri a() {
        return this.b;
    }

    @Override // com.google.android.apps.messaging.ui.mediaviewer.data.MediaViewerItem
    public final Uri b() {
        return this.a;
    }

    @Override // com.google.android.apps.messaging.ui.mediaviewer.data.MediaViewerItem
    public final MessageId c() {
        return this.i;
    }

    @Override // com.google.android.apps.messaging.ui.mediaviewer.data.MediaViewerItem
    public final ConversationId d() {
        return this.g;
    }

    @Override // com.google.android.apps.messaging.ui.mediaviewer.data.MediaViewerItem
    public final ConversationIdType e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        Uri uri;
        String str;
        String str2;
        ConversationIdType conversationIdType;
        ConversationId conversationId;
        MessageIdType messageIdType;
        MessageId messageId;
        if (obj == this) {
            return true;
        }
        if (obj instanceof MediaViewerItem) {
            MediaViewerItem mediaViewerItem = (MediaViewerItem) obj;
            if (this.a.equals(mediaViewerItem.b()) && ((uri = this.b) != null ? uri.equals(mediaViewerItem.a()) : mediaViewerItem.a() == null) && this.c.equals(mediaViewerItem.h()) && ((str = this.d) != null ? str.equals(mediaViewerItem.j()) : mediaViewerItem.j() == null) && ((str2 = this.e) != null ? str2.equals(mediaViewerItem.i()) : mediaViewerItem.i() == null) && ((conversationIdType = this.f) != null ? conversationIdType.equals(mediaViewerItem.e()) : mediaViewerItem.e() == null) && ((conversationId = this.g) != null ? conversationId.equals(mediaViewerItem.d()) : mediaViewerItem.d() == null) && ((messageIdType = this.h) != null ? messageIdType.equals(mediaViewerItem.f()) : mediaViewerItem.f() == null) && ((messageId = this.i) != null ? messageId.equals(mediaViewerItem.c()) : mediaViewerItem.c() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.apps.messaging.ui.mediaviewer.data.MediaViewerItem
    public final MessageIdType f() {
        return this.h;
    }

    @Override // com.google.android.apps.messaging.ui.mediaviewer.data.MediaViewerItem
    public final dcva g() {
        return new dcuw(this);
    }

    @Override // com.google.android.apps.messaging.ui.mediaviewer.data.MediaViewerItem
    public final String h() {
        return this.c;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() ^ 1000003;
        Uri uri = this.b;
        int hashCode2 = ((((hashCode * 1000003) ^ (uri == null ? 0 : uri.hashCode())) * 1000003) ^ this.c.hashCode()) * 1000003;
        String str = this.d;
        int hashCode3 = (hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.e;
        int hashCode4 = (hashCode3 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        ConversationIdType conversationIdType = this.f;
        int hashCode5 = (hashCode4 ^ (conversationIdType == null ? 0 : conversationIdType.hashCode())) * 1000003;
        ConversationId conversationId = this.g;
        int hashCode6 = (hashCode5 ^ (conversationId == null ? 0 : conversationId.hashCode())) * 1000003;
        MessageIdType messageIdType = this.h;
        int hashCode7 = (hashCode6 ^ (messageIdType == null ? 0 : messageIdType.hashCode())) * 1000003;
        MessageId messageId = this.i;
        return hashCode7 ^ (messageId != null ? messageId.hashCode() : 0);
    }

    @Override // com.google.android.apps.messaging.ui.mediaviewer.data.MediaViewerItem
    public final String i() {
        return this.e;
    }

    @Override // com.google.android.apps.messaging.ui.mediaviewer.data.MediaViewerItem
    public final String j() {
        return this.d;
    }

    public final String toString() {
        MessageId messageId = this.i;
        MessageIdType messageIdType = this.h;
        ConversationId conversationId = this.g;
        ConversationIdType conversationIdType = this.f;
        Uri uri = this.b;
        return "MediaViewerItem{uri=" + this.a.toString() + ", originalUri=" + String.valueOf(uri) + ", contentType=" + this.c + ", title=" + this.d + ", subtitle=" + this.e + ", legacyConversationId=" + String.valueOf(conversationIdType) + ", conversationId=" + String.valueOf(conversationId) + ", legacyMessageId=" + String.valueOf(messageIdType) + ", messageId=" + String.valueOf(messageId) + "}";
    }
}
