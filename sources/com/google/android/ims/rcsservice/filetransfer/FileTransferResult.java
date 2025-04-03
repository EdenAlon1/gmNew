package com.google.android.ims.rcsservice.filetransfer;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dfxk;
import defpackage.dknf;
import defpackage.dknu;
import defpackage.dknw;
import defpackage.eihh;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class FileTransferResult implements Parcelable {
    public static final Parcelable.Creator<FileTransferResult> CREATOR;
    public static final FileTransferResult a;
    public static final FileTransferResult b;

    static {
        dknf dknfVar = new dknf();
        dknfVar.b(dknw.OK);
        a = dknfVar.a();
        dknf dknfVar2 = new dknf();
        dknfVar2.b(dknw.FAILED);
        b = dknfVar2.a();
        CREATOR = new dknu();
    }

    public abstract dknw a();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = dfxk.a(parcel);
        eihh.c(parcel, 1, a());
        dfxk.c(parcel, a2);
    }
}
