package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ewxm implements Parcelable {
    public static final Parcelable.Creator<ewxm> CREATOR = new ewxl();
    private final String a;
    private final String b;
    private final float c;
    private final float d;

    public ewxm(String str, String str2, float f, float f2) {
        this.a = str;
        this.b = str2;
        this.c = f;
        this.d = f2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Bundle bundle = new Bundle();
        bundle.putString("textclassifier.extras.BroaderUserInterest.MID", this.a);
        bundle.putString("textclassifier.extras.BroaderUserInterest.NAME", this.b);
        bundle.putFloat("textclassifier.extras.BroaderUserInterest.IMPORTANCE", this.c);
        bundle.putFloat("textclassifier.extras.BroaderUserInterest.CONFIDENCE", this.d);
        bundle.writeToParcel(parcel, i);
    }

    public ewxm(Parcel parcel) {
        Bundle bundle = new Bundle();
        bundle.readFromParcel(parcel);
        this.a = bundle.getString("textclassifier.extras.BroaderUserInterest.MID");
        this.b = bundle.getString("textclassifier.extras.BroaderUserInterest.NAME");
        this.c = bundle.getFloat("textclassifier.extras.BroaderUserInterest.IMPORTANCE");
        this.d = bundle.getFloat("textclassifier.extras.BroaderUserInterest.CONFIDENCE");
    }
}
