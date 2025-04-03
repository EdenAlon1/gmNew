package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.ims.rcsmigration.LegacyData;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkmh implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new LegacyData(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new LegacyData[i];
    }
}
