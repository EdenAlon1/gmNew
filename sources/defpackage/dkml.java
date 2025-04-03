package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.ims.rcsmigration.UndeliveredMessage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkml implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new UndeliveredMessage(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new UndeliveredMessage[i];
    }
}
