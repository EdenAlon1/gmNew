package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.people.contactssync.model.BackupAndSyncOptInOptions;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhhn implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = dfxj.d(readInt);
            if (d == 1) {
                z = dfxj.D(parcel, readInt);
            } else if (d == 2) {
                z2 = dfxj.D(parcel, readInt);
            } else if (d != 3) {
                dfxj.C(parcel, readInt);
            } else {
                z3 = dfxj.D(parcel, readInt);
            }
        }
        dfxj.B(parcel, h);
        return new BackupAndSyncOptInOptions(z, z2, z3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new BackupAndSyncOptInOptions[i];
    }
}
