package com.google.android.apps.messaging.shared.datamodel.action;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.UpdateConversationInteractiveTimestampAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import defpackage.bbad;
import defpackage.bbae;
import defpackage.bdgq;
import defpackage.dtuu;
import defpackage.ekzz;
import defpackage.eleg;
import defpackage.emxf;
import defpackage.emyl;
import defpackage.eogt;
import defpackage.ffbr;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class UpdateConversationInteractiveTimestampAction extends Action<Void> implements Parcelable {
    public static final Parcelable.Creator<Action<Void>> CREATOR = new bbad();
    public final ffbr a;
    private final dtuu b;

    /* compiled from: PG */
    public interface a {
        bbae it();
    }

    public UpdateConversationInteractiveTimestampAction(ffbr ffbrVar, dtuu dtuuVar, Parcel parcel) {
        super(parcel, eogt.UPDATE_CONVERSATION_INTERACTIVE_TIMESTAMP_ACTION);
        this.a = ffbrVar;
        this.b = dtuuVar;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final ekzz a() {
        return eleg.f("UpdateConversationInteractiveTimestampAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* bridge */ /* synthetic */ Object b() {
        final ConversationIdType b = bdgq.b(this.t.l("conversation_id"));
        emxf.b(!b.b(), "Can't update the last interactive event timestamp without a conversation id");
        final long d = this.t.d("interactive_timestamp_ms");
        this.b.c("UpdateConversationInteractiveTimestampAction#executeAction", new emyl() { // from class: bbac
            @Override // defpackage.emyl
            public final Object get() {
                bczy bczyVar = (bczy) UpdateConversationInteractiveTimestampAction.this.a.b();
                String[] strArr = bsom.a;
                bsoe bsoeVar = new bsoe();
                bsoeVar.ap("UpdateConversationInteractiveTimestampAction#executeAction)");
                int intValue = bsom.g().intValue();
                int intValue2 = bsom.g().intValue();
                if (intValue2 < 15000) {
                    dtub.w("last_interactive_event_timestamp", intValue2);
                }
                if (intValue >= 15000) {
                    bsoeVar.a.put("last_interactive_event_timestamp", Long.valueOf(d));
                }
                return Boolean.valueOf(bczyVar.ak(b, bsoeVar));
            }
        });
        return null;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.UpdateConversationInteractiveTimestamp.ExecuteAction.Latency";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        D(parcel, i);
    }

    public UpdateConversationInteractiveTimestampAction(ffbr ffbrVar, dtuu dtuuVar, ConversationIdType conversationIdType, long j) {
        super(eogt.UPDATE_CONVERSATION_INTERACTIVE_TIMESTAMP_ACTION);
        this.a = ffbrVar;
        this.b = dtuuVar;
        this.t.v("conversation_id", conversationIdType.a());
        this.t.s("interactive_timestamp_ms", j);
    }
}
