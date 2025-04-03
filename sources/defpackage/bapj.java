package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.ReceiveMmsMessageAction;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class bapj implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return ((ReceiveMmsMessageAction.a) ctba.a(ReceiveMmsMessageAction.a.class)).ig().c(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ReceiveMmsMessageAction[i];
    }
}
