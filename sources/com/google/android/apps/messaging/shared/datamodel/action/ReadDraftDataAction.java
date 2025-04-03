package com.google.android.apps.messaging.shared.datamodel.action;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import defpackage.baoz;
import defpackage.bbeu;
import defpackage.ekzz;
import defpackage.eleg;
import defpackage.eogt;

/* compiled from: PG */
@Deprecated
/* loaded from: classes6.dex */
public final class ReadDraftDataAction extends Action implements Parcelable {
    public static final Parcelable.Creator<Action> CREATOR = new baoz();

    /* compiled from: PG */
    public interface a {
        bbeu aT();
    }

    public ReadDraftDataAction(Parcel parcel) {
        super(parcel, eogt.READ_DRAFT_ACTION);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final ekzz a() {
        return eleg.f("ReadDraftDataAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* bridge */ /* synthetic */ Object b() {
        return null;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.ReadDraftData.ExecuteAction.Latency";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        D(parcel, i);
    }
}
