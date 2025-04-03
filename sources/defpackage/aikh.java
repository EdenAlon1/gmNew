package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.navigation.targets.DirectSendResult;
import com.google.android.apps.messaging.navigation.targets.EditedMedia;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aikh implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        parcel.getClass();
        return new DirectSendResult.Add(parcel.readInt() == 0 ? null : EditedMedia.CREATOR.createFromParcel(parcel), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new DirectSendResult.Add[i];
    }
}
