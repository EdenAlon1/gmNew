package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.PauseRcsFileTransferAction;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class bajb implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return ((PauseRcsFileTransferAction.a) ctba.a(PauseRcsFileTransferAction.a.class)).hV().c(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new PauseRcsFileTransferAction[i];
    }
}
