package com.google.android.apps.messaging.shared.datamodel.action;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import defpackage.axou;
import defpackage.baui;
import defpackage.bauj;
import defpackage.baut;
import defpackage.bauu;
import defpackage.bdgq;
import defpackage.bdhb;
import defpackage.csjb;
import defpackage.cskc;
import defpackage.cttn;
import defpackage.ekzz;
import defpackage.eleg;
import defpackage.elfl;
import defpackage.elfo;
import defpackage.emwl;
import defpackage.eogt;
import defpackage.ffbr;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class RequestSmartSuggestionsAction extends Action<Void> {
    private final ffbr b;
    private final bauu c;
    private static final cskc a = cskc.g("Bugle", "RequestSmartSuggestionsAction");
    public static final Parcelable.Creator<Action<Void>> CREATOR = new baui();

    /* compiled from: PG */
    public interface a {
        bauj il();
    }

    public RequestSmartSuggestionsAction(bauu bauuVar, ffbr ffbrVar, Parcel parcel) {
        super(parcel, eogt.REQUEST_P2P_CONVERSATION_SUGGESTIONS_ACTION);
        this.c = bauuVar;
        this.b = ffbrVar;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final ekzz a() {
        return eleg.f("RequestSmartSuggestionsAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* bridge */ /* synthetic */ Object b() {
        w();
        return null;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.RequestP2pConversationSuggestions.ExecuteAction.Latency";
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final Bundle fR() {
        if (!((cttn) this.b.b()).b()) {
            a.n("Action was called even though debug smart replies are not enabled.");
            return null;
        }
        try {
            ConversationIdType b = bdgq.b(this.t.l("conversation_id"));
            MessageIdType b2 = bdhb.b(this.t.l("message_id"));
            int a2 = this.t.a("context_message_count");
            bauu bauuVar = this.c;
            bauuVar.a(bauuVar.b(b, b2, a2)).k(axou.a(new baut(bauuVar, b2)), bauuVar.e);
            return null;
        } catch (IllegalArgumentException | IllegalStateException e) {
            csjb a3 = a.a();
            a3.I("Problem requesting SmartReplies.");
            a3.A("reason", e.getMessage());
            a3.r();
            return null;
        }
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final elfl fS() {
        if (!((cttn) this.b.b()).b()) {
            a.n("Action was called even though debug smart replies are not enabled.");
            return elfo.e(null);
        }
        try {
            ConversationIdType b = bdgq.b(this.t.l("conversation_id"));
            String l = this.t.l("message_id");
            int a2 = this.t.a("context_message_count");
            final bauu bauuVar = this.c;
            final MessageIdType b2 = bdhb.b(l);
            return bauuVar.a(bauuVar.b(b, b2, a2)).h(new emwl() { // from class: baur
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    bauu.this.d((ctje) obj, b2);
                    return null;
                }
            }, bauuVar.e).e(Throwable.class, new emwl() { // from class: baus
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    csjb e = bauu.a.e();
                    e.I("Error in async p2p suggestions request");
                    e.I(MessageIdType.this);
                    e.s((Throwable) obj);
                    return null;
                }
            }, bauuVar.d);
        } catch (IllegalArgumentException | IllegalStateException e) {
            csjb a3 = a.a();
            a3.I("Problem requesting SmartReplies.");
            a3.A("reason", e.getMessage());
            a3.r();
            return elfo.e(null);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        D(parcel, i);
    }

    public RequestSmartSuggestionsAction(bauu bauuVar, ffbr ffbrVar, ConversationIdType conversationIdType, MessageIdType messageIdType, int i) {
        super(eogt.REQUEST_P2P_CONVERSATION_SUGGESTIONS_ACTION);
        this.c = bauuVar;
        this.b = ffbrVar;
        this.t.v("conversation_id", conversationIdType.a());
        this.t.r("context_message_count", i);
        this.t.v("message_id", messageIdType.b());
    }
}
