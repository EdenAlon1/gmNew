package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehfd implements Comparable<ehfd>, Parcelable {
    public static final Parcelable.Creator<ehfd> CREATOR = new ehfc();
    public final Calendar a;
    final int b;
    final int c;
    public final int d;
    final int e;
    final long f;
    private String g;

    public ehfd(Calendar calendar) {
        calendar.set(5, 1);
        Calendar c = ehfo.c(calendar);
        this.a = c;
        this.b = c.get(2);
        this.c = c.get(1);
        this.d = c.getMaximum(7);
        this.e = c.getActualMaximum(5);
        this.f = c.getTimeInMillis();
    }

    static ehfd c(long j) {
        Calendar e = ehfo.e();
        e.setTimeInMillis(j);
        return new ehfd(e);
    }

    static ehfd d(int i, int i2) {
        Calendar e = ehfo.e();
        e.set(1, i);
        e.set(2, i2);
        return new ehfd(e);
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(ehfd ehfdVar) {
        return this.a.compareTo(ehfdVar.a);
    }

    final int b(ehfd ehfdVar) {
        if (!(this.a instanceof GregorianCalendar)) {
            throw new IllegalArgumentException("Only Gregorian calendars are supported.");
        }
        return ((ehfdVar.c - this.c) * 12) + (ehfdVar.b - this.b);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    final ehfd e(int i) {
        Calendar c = ehfo.c(this.a);
        c.add(2, i);
        return new ehfd(c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ehfd)) {
            return false;
        }
        ehfd ehfdVar = (ehfd) obj;
        return this.b == ehfdVar.b && this.c == ehfdVar.c;
    }

    final String f() {
        String format;
        if (this.g == null) {
            format = ehfo.b("yMMMM", Locale.getDefault()).format(new Date(this.a.getTimeInMillis()));
            this.g = format;
        }
        return this.g;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), Integer.valueOf(this.c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.c);
        parcel.writeInt(this.b);
    }
}
