package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.account.demoaccount.SetUpDemoAccountRequest;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dfav implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        while (parcel.dataPosition() < h) {
            dfxj.C(parcel, parcel.readInt());
        }
        dfxj.B(parcel, h);
        return new SetUpDemoAccountRequest();
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new SetUpDemoAccountRequest[i];
    }
}
