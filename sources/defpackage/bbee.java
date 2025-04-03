package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.execution.DeferBackgroundWorkAction;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class bbee implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return ((DeferBackgroundWorkAction.a) ctba.a(DeferBackgroundWorkAction.a.class)).hD().c(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new DeferBackgroundWorkAction[i];
    }
}
