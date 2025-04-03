package com.google.android.apps.messaging.shared.datamodel.action;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import defpackage.bbbi;
import defpackage.bbev;
import defpackage.ekzz;
import defpackage.eleg;
import defpackage.eogt;

/* compiled from: PG */
@Deprecated
/* loaded from: classes6.dex */
public final class WriteDraftMessageAction extends Action<String> implements Parcelable {
    public static final Parcelable.Creator<Action<String>> CREATOR = new bbbi();

    /* compiled from: PG */
    public interface a {
        bbev aU();
    }

    public WriteDraftMessageAction(Parcel parcel) {
        super(parcel, eogt.WRITE_DRAFT_MESSAGE_ACTION);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final ekzz a() {
        return eleg.f("WriteDraftMessageAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* bridge */ /* synthetic */ Object b() {
        return null;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.WriteDraftMessage.ExecuteAction.Latency";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        D(parcel, i);
    }
}
