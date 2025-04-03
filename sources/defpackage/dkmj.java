package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.ims.rcsmigration.LegacyToken;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkmj implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new LegacyToken(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new LegacyToken[i];
    }
}
