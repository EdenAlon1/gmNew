package com.google.android.apps.messaging.shared.datamodel.action;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import defpackage.bbaf;
import defpackage.bbes;
import defpackage.bczy;
import defpackage.bdgq;
import defpackage.bsoe;
import defpackage.bsom;
import defpackage.byyy;
import defpackage.cbgf;
import defpackage.cbvt;
import defpackage.csix;
import defpackage.dtub;
import defpackage.ekzz;
import defpackage.eleg;
import defpackage.eogt;
import defpackage.ffbr;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class UpdateConversationOptionsAction extends Action<Void> implements Parcelable {
    public static final Parcelable.Creator<Action<Void>> CREATOR = new bbaf();
    private final ffbr a;
    private final cbvt b;
    private final cbgf c;

    /* compiled from: PG */
    public interface a {
        bbes aR();
    }

    public UpdateConversationOptionsAction(ffbr ffbrVar, cbvt cbvtVar, cbgf cbgfVar, Parcel parcel) {
        super(parcel, eogt.UPDATE_CONVERSATION_OPTIONS_ACTION);
        this.a = ffbrVar;
        this.b = cbvtVar;
        this.c = cbgfVar;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final ekzz a() {
        return eleg.f("UpdateConversationOptionsAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* bridge */ /* synthetic */ Object b() {
        ConversationIdType b = bdgq.b(this.t.l("conversation_id"));
        bczy bczyVar = (bczy) this.a.b();
        String[] strArr = bsom.a;
        bsoe bsoeVar = new bsoe();
        bsoeVar.ap("putOptionValues");
        if (this.t.x("enable_notification")) {
            bsoeVar.a.put("notification_enabled", Boolean.valueOf(this.t.y("enable_notification")));
        }
        if (this.t.x("ringtone_uri")) {
            dtub.u(bsoeVar.a, "notification_sound_uri", this.t.l("ringtone_uri"));
        }
        if (this.t.x("enable_vibration")) {
            bsoeVar.a.put("notification_vibration", Boolean.valueOf(this.t.y("enable_vibration")));
        }
        if (this.t.x("send_mode")) {
            bsoeVar.V(this.t.a("send_mode"));
        }
        if (this.t.x("conv_name")) {
            String l = this.t.l("conv_name");
            bsoeVar.C(l);
            bsoeVar.D(TextUtils.isEmpty(l) ? byyy.NAME_IS_AUTOMATIC : byyy.NAME_IS_MANUAL);
        }
        bczyVar.ak(b, bsoeVar);
        if (this.t.x("conv_name")) {
            this.b.f(b, this.t.l("conv_name"));
        }
        this.c.d(b);
        return null;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.UpdateConversationOptions.ExecuteAction.Latency";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        D(parcel, i);
    }

    public UpdateConversationOptionsAction(ffbr ffbrVar, cbvt cbvtVar, cbgf cbgfVar, ConversationIdType conversationIdType, Boolean bool, String str, Boolean bool2, Integer num) {
        super(eogt.UPDATE_CONVERSATION_OPTIONS_ACTION);
        this.a = ffbrVar;
        this.b = cbvtVar;
        this.c = cbgfVar;
        csix.l(conversationIdType);
        this.t.v("conversation_id", conversationIdType.a());
        if (bool != null) {
            this.t.p("enable_notification", bool.booleanValue());
        }
        if (str != null) {
            this.t.v("ringtone_uri", str);
        }
        if (bool2 != null) {
            this.t.p("enable_vibration", bool2.booleanValue());
        }
        if (num != null) {
            this.t.r("send_mode", num.intValue());
        }
    }
}
