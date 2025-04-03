package com.google.android.apps.messaging.shared.datamodel.action;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.common.ParticipantCoreColor;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import defpackage.bbak;
import defpackage.bbcg;
import defpackage.bbfj;
import defpackage.bczy;
import defpackage.ekzz;
import defpackage.eleg;
import defpackage.eogt;
import defpackage.ffbr;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class UpdateParticipantColorAction extends Action<Void> implements Parcelable {
    public static final Parcelable.Creator<Action<Void>> CREATOR = new bbak();
    private final ffbr a;

    /* compiled from: PG */
    public interface a {
        bbfj bc();
    }

    public UpdateParticipantColorAction(ffbr ffbrVar, Parcel parcel) {
        super(parcel, eogt.UPDATE_PARTICIPANT_COLOR_ACTION);
        this.a = ffbrVar;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final ekzz a() {
        return eleg.f("UpdateParticipantColorAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* bridge */ /* synthetic */ Object b() {
        bbcg bbcgVar = this.t;
        ((bczy) this.a.b()).X(bbcgVar.l("participantId"), (ParticipantCoreColor) bbcgVar.h(BusinessInfoDatabaseConstants.BusinessInfoTableConstants.Columns.COLOR));
        return null;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.UpdateParticipantColor.ExecuteAction.Latency";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        D(parcel, i);
    }

    public UpdateParticipantColorAction(ffbr ffbrVar, String str, ParticipantCoreColor participantCoreColor) {
        super(eogt.UPDATE_PARTICIPANT_COLOR_ACTION);
        this.a = ffbrVar;
        this.t.v("participantId", str);
        this.t.t(BusinessInfoDatabaseConstants.BusinessInfoTableConstants.Columns.COLOR, participantCoreColor);
    }
}
