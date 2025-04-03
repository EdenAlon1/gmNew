package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class deuk implements Parcelable {
    public static final Parcelable.Creator<deuk> CREATOR = new deuj();
    public int a;
    public int b;

    public deuk() {
    }

    public final void a() {
        this.a = -1;
    }

    public final boolean b(int i) {
        int i2 = this.a;
        return i2 >= 0 && i2 < i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "SavedState{mAnchorPosition=" + this.a + ", mAnchorOffset=" + this.b + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
    }

    public deuk(deuk deukVar) {
        this.a = deukVar.a;
        this.b = deukVar.b;
    }

    public deuk(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readInt();
    }
}
