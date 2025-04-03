package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.authzen.gencode.server.api.BeaconSeedEntity;
import com.google.android.gms.auth.proximity.AttestationVerifier;
import com.google.android.gms.auth.proximity.RemoteDevice;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dfio implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        byte[] bArr = null;
        String str4 = null;
        ArrayList arrayList = null;
        String str5 = null;
        AttestationVerifier attestationVerifier = null;
        int i = 0;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = dfxj.d(readInt);
            if (d != 1000) {
                switch (d) {
                    case 1:
                        str = dfxj.t(parcel, readInt);
                        break;
                    case 2:
                        str2 = dfxj.t(parcel, readInt);
                        break;
                    case 3:
                        str3 = dfxj.t(parcel, readInt);
                        break;
                    case 4:
                        bArr = dfxj.E(parcel, readInt);
                        break;
                    case 5:
                        str4 = dfxj.t(parcel, readInt);
                        break;
                    case 6:
                        arrayList = dfxj.z(parcel, readInt, BeaconSeedEntity.CREATOR);
                        break;
                    case 7:
                        str5 = dfxj.t(parcel, readInt);
                        break;
                    case 8:
                        attestationVerifier = (AttestationVerifier) dfxj.n(parcel, readInt, AttestationVerifier.CREATOR);
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
        return new RemoteDevice(i, str, str2, str3, bArr, str4, arrayList, str5, attestationVerifier);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new RemoteDevice[i];
    }
}
