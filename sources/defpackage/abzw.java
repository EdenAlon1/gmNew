package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.Spanned;
import com.google.android.apps.messaging.datadonation.redact.RedactedSpan;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class abzw implements Comparable<abzw>, Parcelable {
    public static final Parcelable.Creator<abzw> CREATOR = new abzv();
    public final long a;
    public final Spanned b;
    public Spanned c;
    abwy d;
    public boolean e;

    public abzw(Parcel parcel) {
        abwx abwxVar;
        this.b = RedactedSpan.a(parcel);
        this.c = RedactedSpan.a(parcel);
        this.a = parcel.readLong();
        int i = 0;
        this.e = parcel.readByte() != 0;
        int[] iArr = new int[3];
        parcel.readIntArray(iArr);
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        if (i2 != 0) {
            i = i2;
        } else if (i3 == 0) {
            if (i4 == 0) {
                abwxVar = null;
                this.d = abwxVar;
            }
            i3 = 0;
        }
        abwxVar = new abwx(i, i3, i4);
        this.d = abwxVar;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(abzw abzwVar) {
        return Long.compare(abzwVar.a, this.a);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        RedactedSpan.c(parcel, this.b);
        RedactedSpan.c(parcel, this.c);
        parcel.writeLong(this.a);
        parcel.writeByte(this.e ? (byte) 1 : (byte) 0);
        abwy abwyVar = this.d;
        if (abwyVar == null) {
            parcel.writeIntArray(new int[]{0, 0, 0});
        } else {
            abwx abwxVar = (abwx) abwyVar;
            parcel.writeIntArray(new int[]{abwxVar.a, abwxVar.b, abwxVar.c});
        }
    }

    public abzw(abwh abwhVar) {
        Spanned b = abwhVar.b();
        this.b = b;
        this.c = b;
        this.a = abwhVar.a();
        this.d = null;
        this.e = true;
    }
}
