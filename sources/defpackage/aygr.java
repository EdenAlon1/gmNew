package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.conversation.draft.EditingData;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aygr implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        parcel.getClass();
        return new EditingData((MessageId) parcel.readParcelable(EditingData.class.getClassLoader()), parcel.readString(), (MessageId) parcel.readParcelable(EditingData.class.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new EditingData[i];
    }
}
