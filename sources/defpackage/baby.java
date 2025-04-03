package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class baby extends bakx {
    private final Uri a;
    private final Context b;
    private final MessageIdType c;
    private final ConversationIdType d;
    private final boolean e;
    private final bdfy f;
    private final MessageCoreData g;
    private final int h;
    private final long i;
    private final ParticipantsTable.BindData j;
    private final boolean k;

    public baby(Uri uri, Context context, MessageIdType messageIdType, ConversationIdType conversationIdType, boolean z, bdfy bdfyVar, MessageCoreData messageCoreData, int i, long j, ParticipantsTable.BindData bindData, boolean z2) {
        this.a = uri;
        this.b = context;
        this.c = messageIdType;
        this.d = conversationIdType;
        this.e = z;
        this.f = bdfyVar;
        this.g = messageCoreData;
        this.h = i;
        this.i = j;
        this.j = bindData;
        this.k = z2;
    }

    @Override // defpackage.bakx
    public final int a() {
        return this.h;
    }

    @Override // defpackage.bakx
    public final long b() {
        return this.i;
    }

    @Override // defpackage.bakx
    public final Context c() {
        return this.b;
    }

    @Override // defpackage.bakx
    public final Uri d() {
        return this.a;
    }

    @Override // defpackage.bakx
    public final MessageCoreData e() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        bdfy bdfyVar;
        MessageCoreData messageCoreData;
        ParticipantsTable.BindData bindData;
        if (obj == this) {
            return true;
        }
        if (obj instanceof bakx) {
            bakx bakxVar = (bakx) obj;
            Uri uri = this.a;
            if (uri != null ? uri.equals(bakxVar.d()) : bakxVar.d() == null) {
                if (this.b.equals(bakxVar.c()) && this.c.equals(bakxVar.h()) && this.d.equals(bakxVar.g()) && this.e == bakxVar.k() && ((bdfyVar = this.f) != null ? bdfyVar.equals(bakxVar.f()) : bakxVar.f() == null) && ((messageCoreData = this.g) != null ? messageCoreData.equals(bakxVar.e()) : bakxVar.e() == null) && this.h == bakxVar.a() && this.i == bakxVar.b() && ((bindData = this.j) != null ? bindData.equals(bakxVar.i()) : bakxVar.i() == null) && this.k == bakxVar.j()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.bakx
    public final bdfy f() {
        return this.f;
    }

    @Override // defpackage.bakx
    public final ConversationIdType g() {
        return this.d;
    }

    @Override // defpackage.bakx
    public final MessageIdType h() {
        return this.c;
    }

    public final int hashCode() {
        Uri uri = this.a;
        int hashCode = ((((((((((uri == null ? 0 : uri.hashCode()) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ (true != this.e ? 1237 : 1231)) * 1000003;
        bdfy bdfyVar = this.f;
        int hashCode2 = (hashCode ^ (bdfyVar == null ? 0 : bdfyVar.hashCode())) * 1000003;
        MessageCoreData messageCoreData = this.g;
        int hashCode3 = (((hashCode2 ^ (messageCoreData == null ? 0 : messageCoreData.hashCode())) * 1000003) ^ this.h) * 1000003;
        long j = this.i;
        int i = (hashCode3 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        ParticipantsTable.BindData bindData = this.j;
        return ((i ^ (bindData != null ? bindData.hashCode() : 0)) * 1000003) ^ (true == this.k ? 1231 : 1237);
    }

    @Override // defpackage.bakx
    public final ParticipantsTable.BindData i() {
        return this.j;
    }

    @Override // defpackage.bakx
    public final boolean j() {
        return this.k;
    }

    @Override // defpackage.bakx
    public final boolean k() {
        return this.e;
    }

    public final String toString() {
        ParticipantsTable.BindData bindData = this.j;
        MessageCoreData messageCoreData = this.g;
        bdfy bdfyVar = this.f;
        ConversationIdType conversationIdType = this.d;
        MessageIdType messageIdType = this.c;
        Context context = this.b;
        return "ResultValues{mmsUri=" + String.valueOf(this.a) + ", context=" + context.toString() + ", messageId=" + messageIdType.toString() + ", notificationConversationId=" + conversationIdType.toString() + ", isMessageInFocusedConversation=" + this.e + ", createConversationResult=" + String.valueOf(bdfyVar) + ", message=" + String.valueOf(messageCoreData) + ", subId=" + this.h + ", timestamp=" + this.i + ", senderData=" + String.valueOf(bindData) + ", isAllowedByParents=" + this.k + "}";
    }
}
