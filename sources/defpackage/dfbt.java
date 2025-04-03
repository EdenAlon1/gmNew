package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.credentials.CredentialPickerConfig;
import com.google.android.gms.auth.api.credentials.HintRequest;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dfbt implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        CredentialPickerConfig credentialPickerConfig = null;
        String[] strArr = null;
        String str = null;
        String str2 = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = dfxj.d(readInt);
            if (d != 1000) {
                switch (d) {
                    case 1:
                        credentialPickerConfig = (CredentialPickerConfig) dfxj.n(parcel, readInt, CredentialPickerConfig.CREATOR);
                        break;
                    case 2:
                        z = dfxj.D(parcel, readInt);
                        break;
                    case 3:
                        z2 = dfxj.D(parcel, readInt);
                        break;
                    case 4:
                        strArr = dfxj.K(parcel, readInt);
                        break;
                    case 5:
                        z3 = dfxj.D(parcel, readInt);
                        break;
                    case 6:
                        str = dfxj.t(parcel, readInt);
                        break;
                    case 7:
                        str2 = dfxj.t(parcel, readInt);
                        break;
                    default:
                        dfxj.C(parcel, readInt);
                        break;
                }
            } else {
                i = dfxj.f(parcel, readInt);
            }
        }
        dfxj.B(parcel, h);
        return new HintRequest(i, credentialPickerConfig, z, z2, strArr, z3, str, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new HintRequest[i];
    }
}
