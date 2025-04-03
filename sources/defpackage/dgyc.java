package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.DetectedActivity;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dgyc implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        ArrayList arrayList = null;
        Bundle bundle = null;
        int i = 0;
        long j = 0;
        long j2 = 0;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = dfxj.d(readInt);
            if (d == 1) {
                arrayList = dfxj.z(parcel, readInt, DetectedActivity.CREATOR);
            } else if (d == 2) {
                j = dfxj.i(parcel, readInt);
            } else if (d == 3) {
                j2 = dfxj.i(parcel, readInt);
            } else if (d == 4) {
                i = dfxj.f(parcel, readInt);
            } else if (d != 5) {
                dfxj.C(parcel, readInt);
            } else {
                bundle = dfxj.k(parcel, readInt);
            }
        }
        dfxj.B(parcel, h);
        return new ActivityRecognitionResult(arrayList, j, j2, i, bundle);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ActivityRecognitionResult[i];
    }
}
