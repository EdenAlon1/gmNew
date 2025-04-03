package com.google.android.apps.messaging.shared.datamodel.action;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import defpackage.awqj;
import defpackage.axnw;
import defpackage.baep;
import defpackage.baeq;
import defpackage.bczy;
import defpackage.cskc;
import defpackage.ekzz;
import defpackage.eleg;
import defpackage.eogt;
import defpackage.erpp;
import defpackage.ffbr;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ForwardIncomingTypingIndicatorToTachyonAction extends Action<Void> {
    private final ffbr b;
    private final awqj c;
    private static final cskc a = cskc.g("BugleNetwork", "ForwardIncomingTypingIndicatorToTachyonAction");
    public static final Parcelable.Creator<Action<Void>> CREATOR = new baep();

    /* compiled from: PG */
    public interface a {
        baeq hM();
    }

    public ForwardIncomingTypingIndicatorToTachyonAction(ffbr ffbrVar, long j, String str, boolean z, awqj awqjVar) {
        super(eogt.FORWARD_INCOMING_TYPING_INDICATOR_TO_TACHYON_ACTION);
        this.b = ffbrVar;
        this.t.s("chat_session_id_key", j);
        if (str != null) {
            this.t.v("user_id_key", str);
        }
        this.t.p("typing_active_key", z);
        this.c = awqjVar;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final ekzz a() {
        return eleg.f("ForwardIncomingTypingIndicatorToTachyonAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* synthetic */ Object b() {
        ekzz f = eleg.f("ForwardIncomingTypingIndicatorToTachyonAction.executeAction");
        try {
            ConversationIdType q = ((bczy) this.b.b()).q(this.t.d("chat_session_id_key"));
            if (q.b()) {
                a.r("Couldn't find conversation id.");
            } else {
                String l = this.t.l("user_id_key");
                if (l != null) {
                    this.c.a(q, l, this.t.y("typing_active_key")).k(axnw.b(), erpp.a);
                }
            }
            f.close();
            return null;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.ForwardIncomingTypingIndicatorToTachyon.ExecuteAction.Latency";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        D(parcel, i);
    }

    public ForwardIncomingTypingIndicatorToTachyonAction(ffbr ffbrVar, awqj awqjVar, Parcel parcel) {
        super(parcel, eogt.FORWARD_INCOMING_TYPING_INDICATOR_TO_TACHYON_ACTION);
        this.b = ffbrVar;
        this.c = awqjVar;
    }
}
