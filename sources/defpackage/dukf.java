package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dukf implements Parcelable {
    public static final Parcelable.Creator<dukf> CREATOR = new duke();
    private long a;
    private long b;

    public dukf() {
        this.a = -1L;
        this.b = -1L;
    }

    public final long a() {
        if (d()) {
            return this.b - this.a;
        }
        return -1L;
    }

    public final void b() {
        if (!e()) {
            Log.e("HatsLibQuestionMetrics", "Question was marked as answered but was never marked as shown.");
        } else if (d()) {
            Log.d("HatsLibQuestionMetrics", "Question was already marked as answered.");
        } else {
            this.b = SystemClock.elapsedRealtime();
        }
    }

    public final void c() {
        if (e()) {
            return;
        }
        this.a = SystemClock.elapsedRealtime();
    }

    public final boolean d() {
        return this.b >= 0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean e() {
        return this.a >= 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeLong(this.b);
    }

    public dukf(Parcel parcel) {
        this.a = parcel.readLong();
        this.b = parcel.readLong();
    }
}
