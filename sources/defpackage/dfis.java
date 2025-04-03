package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.proximity.AttestationVerifier;
import com.google.android.gms.auth.proximity.firstparty.SyncedCryptauthDevice;
import com.google.android.gms.auth.proximity.gencode.server.api.BeaconSeedEntity;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dfis implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        byte[] bArr = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        AttestationVerifier attestationVerifier = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        long j = 0;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch (dfxj.d(readInt)) {
                case 1:
                    bArr = dfxj.E(parcel, readInt);
                    break;
                case 2:
                    str = dfxj.t(parcel, readInt);
                    break;
                case 3:
                    str2 = dfxj.t(parcel, readInt);
                    break;
                case 4:
                    str3 = dfxj.t(parcel, readInt);
                    break;
                case 5:
                    z = dfxj.D(parcel, readInt);
                    break;
                case 6:
                    z2 = dfxj.D(parcel, readInt);
                    break;
                case 7:
                    j = dfxj.i(parcel, readInt);
                    break;
                case 8:
                    z3 = dfxj.D(parcel, readInt);
                    break;
                case 9:
                    str4 = dfxj.t(parcel, readInt);
                    break;
                case 10:
                    z4 = dfxj.D(parcel, readInt);
                    break;
                case 11:
                    z5 = dfxj.D(parcel, readInt);
                    break;
                case 12:
                    arrayList = dfxj.y(parcel, readInt);
                    break;
                case 13:
                    arrayList2 = dfxj.y(parcel, readInt);
                    break;
                case 14:
                    arrayList3 = dfxj.z(parcel, readInt, BeaconSeedEntity.CREATOR);
                    break;
                case 15:
                    attestationVerifier = (AttestationVerifier) dfxj.n(parcel, readInt, AttestationVerifier.CREATOR);
                    break;
                default:
                    dfxj.C(parcel, readInt);
                    break;
            }
        }
        dfxj.B(parcel, h);
        return new SyncedCryptauthDevice(bArr, str, str2, str3, z, z2, j, z3, str4, z4, z5, arrayList, arrayList2, arrayList3, attestationVerifier);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new SyncedCryptauthDevice[i];
    }
}
