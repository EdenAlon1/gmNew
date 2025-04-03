package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.ims.rcsservice.filetransfer.FileDownloadRequest;
import com.google.android.rcs.client.messaging.data.FileInformation;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dknp implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        dknb dknbVar = new dknb();
        int h = dfxj.h(parcel);
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = dfxj.d(readInt);
            if (d == 1) {
                dknbVar.c(dfxj.j(parcel, readInt));
            } else if (d != 2) {
                dfxj.C(parcel, readInt);
            } else {
                dknbVar.b((FileInformation) dfxj.n(parcel, readInt, FileInformation.CREATOR));
            }
        }
        return dknbVar.a();
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new FileDownloadRequest[i];
    }
}
