package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.people.contactssync.model.BackupAndSyncOptInState;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhho implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        String str = null;
        String[] strArr = null;
        int i = 0;
        int[] iArr = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = dfxj.d(readInt);
            if (d == 1) {
                str = dfxj.t(parcel, readInt);
            } else if (d == 2) {
                iArr = dfxj.H(parcel, readInt);
            } else if (d == 4) {
                i = dfxj.f(parcel, readInt);
            } else if (d != 5) {
                dfxj.C(parcel, readInt);
            } else {
                strArr = dfxj.K(parcel, readInt);
            }
        }
        dfxj.B(parcel, h);
        return new BackupAndSyncOptInState(str, iArr, i, strArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new BackupAndSyncOptInState[i];
    }
}
