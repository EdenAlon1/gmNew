package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.CheckActiveDesktopIsAliveAsyncAction;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class bacr implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return ((CheckActiveDesktopIsAliveAsyncAction.a) ctba.a(CheckActiveDesktopIsAliveAsyncAction.a.class)).aP().c(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new CheckActiveDesktopIsAliveAsyncAction[i];
    }
}
