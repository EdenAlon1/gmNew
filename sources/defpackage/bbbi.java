package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.WriteDraftMessageAction;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class bbbi implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return ((WriteDraftMessageAction.a) ctba.a(WriteDraftMessageAction.a.class)).aU().c(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new WriteDraftMessageAction[i];
    }
}
