package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.googlehelp.internal.common.OverflowMenuItem;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dgos implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        String str = null;
        int i = 0;
        Intent intent = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = dfxj.d(readInt);
            if (d == 2) {
                i = dfxj.f(parcel, readInt);
            } else if (d == 3) {
                str = dfxj.t(parcel, readInt);
            } else if (d != 4) {
                dfxj.C(parcel, readInt);
            } else {
                intent = (Intent) dfxj.n(parcel, readInt, Intent.CREATOR);
            }
        }
        dfxj.B(parcel, h);
        return new OverflowMenuItem(i, str, intent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new OverflowMenuItem[i];
    }
}
