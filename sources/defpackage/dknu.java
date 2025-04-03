package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.ims.rcsservice.filetransfer.FileTransferResult;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dknu implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        FileTransferResult fileTransferResult = FileTransferResult.a;
        dknf dknfVar = new dknf();
        int h = dfxj.h(parcel);
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            if (dfxj.d(readInt) == 1) {
                dknfVar.b((dknw) eihh.b(parcel, readInt, dknw.class));
            } else {
                dfxj.C(parcel, readInt);
            }
        }
        return dknfVar.a();
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new FileTransferResult[i];
    }
}
