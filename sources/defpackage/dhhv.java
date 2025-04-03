package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.people.contactssync.model.BackupSyncContactInfo;
import com.google.android.gms.people.contactssync.model.GetBackupSyncSuggestionResponse;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhhv implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        String str = null;
        int i = 0;
        BackupSyncContactInfo backupSyncContactInfo = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = dfxj.d(readInt);
            if (d == 1) {
                i = dfxj.f(parcel, readInt);
            } else if (d == 2) {
                str = dfxj.t(parcel, readInt);
            } else if (d != 3) {
                dfxj.C(parcel, readInt);
            } else {
                backupSyncContactInfo = (BackupSyncContactInfo) dfxj.n(parcel, readInt, BackupSyncContactInfo.CREATOR);
            }
        }
        dfxj.B(parcel, h);
        return new GetBackupSyncSuggestionResponse(i, str, backupSyncContactInfo);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GetBackupSyncSuggestionResponse[i];
    }
}
