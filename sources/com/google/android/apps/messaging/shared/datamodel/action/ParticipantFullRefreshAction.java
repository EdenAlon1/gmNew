package com.google.android.apps.messaging.shared.datamodel.action;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import defpackage.baiu;
import defpackage.baiv;
import defpackage.cbeq;
import defpackage.ekzz;
import defpackage.eleg;
import defpackage.eogt;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ParticipantFullRefreshAction extends Action<Void> {
    public static final Parcelable.Creator<Action<Void>> CREATOR = new baiu();
    private final cbeq a;

    /* compiled from: PG */
    public interface a {
        baiv hU();
    }

    public ParticipantFullRefreshAction(cbeq cbeqVar) {
        super(eogt.PARTICIPANT_FULL_REFRESH_ACTION);
        this.a = cbeqVar;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final ekzz a() {
        return eleg.f("ParticipantFullRefreshAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* bridge */ /* synthetic */ Object b() {
        w();
        return null;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.ParticipantFullRefreshAction.ExecuteAction.Latency";
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final Bundle fR() {
        this.a.a();
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        D(parcel, i);
    }

    public ParticipantFullRefreshAction(cbeq cbeqVar, Parcel parcel) {
        super(parcel, eogt.PARTICIPANT_FULL_REFRESH_ACTION);
        this.a = cbeqVar;
    }
}
