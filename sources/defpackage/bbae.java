package defpackage;

import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.UpdateConversationInteractiveTimestampAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class bbae implements bbck {
    private final ffbr a;
    private final ffbr b;

    public bbae(ffbr ffbrVar, ffbr ffbrVar2) {
        ffbrVar.getClass();
        this.a = ffbrVar;
        ffbrVar2.getClass();
        this.b = ffbrVar2;
    }

    public final /* bridge */ /* synthetic */ Action a(ConversationIdType conversationIdType, long j) {
        dtuu dtuuVar = (dtuu) this.b.b();
        dtuuVar.getClass();
        conversationIdType.getClass();
        return new UpdateConversationInteractiveTimestampAction(this.a, dtuuVar, conversationIdType, j);
    }

    @Override // defpackage.bbck
    public final /* bridge */ /* synthetic */ Action c(Parcel parcel) {
        dtuu dtuuVar = (dtuu) this.b.b();
        dtuuVar.getClass();
        parcel.getClass();
        return new UpdateConversationInteractiveTimestampAction(this.a, dtuuVar, parcel);
    }
}
