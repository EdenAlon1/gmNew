package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nxo implements Parcelable {
    public static final Parcelable.Creator<nxo> CREATOR = new nxn();
    public final String a;
    public final int b;
    private final Bundle c;
    private final Bundle d;

    public nxo(Parcel parcel) {
        String readString = parcel.readString();
        readString.getClass();
        this.a = readString;
        this.b = parcel.readInt();
        this.c = parcel.readBundle(getClass().getClassLoader());
        Bundle readBundle = parcel.readBundle(getClass().getClassLoader());
        readBundle.getClass();
        this.d = readBundle;
    }

    public final nxm a(Context context, nzh nzhVar, lkj lkjVar, nyk nykVar) {
        lkjVar.getClass();
        Bundle bundle = this.c;
        if (bundle != null) {
            bundle.setClassLoader(context.getClassLoader());
        } else {
            bundle = null;
        }
        return nxg.a(context, nzhVar, bundle, lkjVar, nykVar, this.a, this.d);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeInt(this.b);
        parcel.writeBundle(this.c);
        parcel.writeBundle(this.d);
    }

    public nxo(nxm nxmVar) {
        nxmVar.getClass();
        this.a = nxmVar.d;
        this.b = nxmVar.b.j;
        this.c = nxmVar.a();
        Bundle bundle = new Bundle();
        this.d = bundle;
        nxmVar.f.c(bundle);
    }
}
