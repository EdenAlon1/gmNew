package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.UpdateMessagePartSizeAction;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class bbai implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return ((UpdateMessagePartSizeAction.a) ctba.a(UpdateMessagePartSizeAction.a.class)).iu().c(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new UpdateMessagePartSizeAction[i];
    }
}
