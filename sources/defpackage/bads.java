package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.EnsureConnectivityStabilizedAction;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class bads implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return ((EnsureConnectivityStabilizedAction.a) ctba.a(EnsureConnectivityStabilizedAction.a.class)).hH().c(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new EnsureConnectivityStabilizedAction[i];
    }
}
