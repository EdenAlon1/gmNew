package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.fido.BrowserOptions;
import com.google.android.gms.auth.api.identity.ChromeOptions;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dfcc implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        byte[] bArr = null;
        String str = null;
        ChromeOptions chromeOptions = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = dfxj.d(readInt);
            if (d == 2) {
                str = dfxj.t(parcel, readInt);
            } else if (d == 3) {
                bArr = dfxj.E(parcel, readInt);
            } else if (d != 4) {
                dfxj.C(parcel, readInt);
            } else {
                chromeOptions = (ChromeOptions) dfxj.n(parcel, readInt, ChromeOptions.CREATOR);
            }
        }
        dfxj.B(parcel, h);
        return new BrowserOptions(str, bArr != null ? eyee.x(bArr) : null, chromeOptions);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new BrowserOptions[i];
    }
}
