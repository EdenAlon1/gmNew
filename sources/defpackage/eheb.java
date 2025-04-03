package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eheb implements Parcelable {
    public static final Parcelable.Creator<eheb> CREATOR = new ehdy();
    public final ehfd a;
    public final ehfd b;
    public final ehea c;
    public final ehfd d;
    public final int e;
    public final int f;
    public final int g;

    public eheb(ehfd ehfdVar, ehfd ehfdVar2, ehea eheaVar, ehfd ehfdVar3, int i) {
        ehfdVar.getClass();
        ehfdVar2.getClass();
        eheaVar.getClass();
        this.a = ehfdVar;
        this.b = ehfdVar2;
        this.d = ehfdVar3;
        this.e = i;
        this.c = eheaVar;
        if (ehfdVar3 != null && ehfdVar.compareTo(ehfdVar3) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (ehfdVar3 != null && ehfdVar3.compareTo(ehfdVar2) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i < 0 || i > ehfo.e().getMaximum(7)) {
            throw new IllegalArgumentException("firstDayOfWeek is not valid");
        }
        this.g = ehfdVar.b(ehfdVar2) + 1;
        this.f = (ehfdVar2.c - ehfdVar.c) + 1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eheb)) {
            return false;
        }
        eheb ehebVar = (eheb) obj;
        return this.a.equals(ehebVar.a) && this.b.equals(ehebVar.b) && Objects.equals(this.d, ehebVar.d) && this.e == ehebVar.e && this.c.equals(ehebVar.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.d, Integer.valueOf(this.e), this.c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, 0);
        parcel.writeParcelable(this.b, 0);
        parcel.writeParcelable(this.d, 0);
        parcel.writeParcelable(this.c, 0);
        parcel.writeInt(this.e);
    }
}
