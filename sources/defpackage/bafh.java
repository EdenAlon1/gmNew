package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.GenericWorkerQueueAction;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class bafh implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return ((GenericWorkerQueueAction.a) ctba.a(GenericWorkerQueueAction.a.class)).hN().c(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GenericWorkerQueueAction[i];
    }
}
