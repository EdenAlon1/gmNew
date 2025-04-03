package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.WaitForRcsServiceConnectionAction;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class bbaw implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return ((WaitForRcsServiceConnectionAction.a) ctba.a(WaitForRcsServiceConnectionAction.a.class)).iw().c(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new WaitForRcsServiceConnectionAction[i];
    }
}
