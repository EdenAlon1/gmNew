package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.ims.rcsservice.filetransfer.ResumeDownloadRequest;
import com.google.android.rcs.client.messaging.data.FileInformation;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkoe implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        dknl dknlVar = new dknl();
        int h = dfxj.h(parcel);
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = dfxj.d(readInt);
            if (d == 1) {
                dknlVar.d(dfxj.j(parcel, readInt));
            } else if (d == 2) {
                dknlVar.b(dfxj.t(parcel, readInt));
            } else if (d != 3) {
                dfxj.C(parcel, readInt);
            } else {
                dknlVar.c((FileInformation) dfxj.n(parcel, readInt, FileInformation.CREATOR));
            }
        }
        return dknlVar.a();
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ResumeDownloadRequest[i];
    }
}
