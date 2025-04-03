package defpackage;

import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.RequestSmartSuggestionsAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class bauj implements bbck {
    private final ffbr a;
    private final ffbr b;

    public bauj(ffbr ffbrVar, ffbr ffbrVar2) {
        ffbrVar.getClass();
        this.a = ffbrVar;
        ffbrVar2.getClass();
        this.b = ffbrVar2;
    }

    public final /* bridge */ /* synthetic */ Action a(ConversationIdType conversationIdType, MessageIdType messageIdType, int i) {
        bauu bauuVar = (bauu) this.a.b();
        bauuVar.getClass();
        conversationIdType.getClass();
        messageIdType.getClass();
        return new RequestSmartSuggestionsAction(bauuVar, this.b, conversationIdType, messageIdType, i);
    }

    @Override // defpackage.bbck
    public final /* bridge */ /* synthetic */ Action c(Parcel parcel) {
        bauu bauuVar = (bauu) this.a.b();
        bauuVar.getClass();
        parcel.getClass();
        return new RequestSmartSuggestionsAction(bauuVar, this.b, parcel);
    }
}
