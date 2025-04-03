package com.google.android.ims.rcsservice.events;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dkmy;
import defpackage.dkna;
import defpackage.eyqr;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class Event implements Parcelable {
    public static final Parcelable.Creator<Event> CREATOR = new dkmy();
    public int g;
    public int h;
    public long i;
    public long j;

    public Event() {
        this.g = 0;
        this.h = 0;
        this.i = 0L;
        this.j = 0L;
    }

    public void a(Parcel parcel) {
        this.g = parcel.readInt();
        this.h = parcel.readInt();
        this.i = parcel.readLong();
        this.j = parcel.readLong();
    }

    protected void b(Parcel parcel) {
        parcel.writeString("+");
    }

    protected String c() {
        return "UNDEFINED";
    }

    protected String d() {
        return this.i == 0 ? "GENERIC" : "UNDEFINED";
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Event)) {
            return false;
        }
        Event event = (Event) obj;
        return event.h == this.h && event.i == this.i && event.g == this.g && event.j == this.j;
    }

    public final void f() {
        this.i = 0L;
        this.j = 0L;
    }

    public int hashCode() {
        return (((this.h ^ 1234) ^ this.g) ^ ((int) this.j)) ^ ((int) this.i);
    }

    public String toString() {
        String[] strArr = dkna.a;
        int i = this.g;
        return "JibeEvent [Category " + strArr[i] + " (" + i + "), Code " + c() + " (" + this.h + "), Source " + this.j + ", Info " + d() + " (" + this.i + ")]";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        b(parcel);
        parcel.writeInt(this.g);
        parcel.writeInt(this.h);
        parcel.writeLong(this.i);
        parcel.writeLong(this.j);
    }

    public Event(int i, long j, long j2) {
        this.h = i;
        this.j = j;
        this.i = j2;
        this.g = i / 10000;
    }

    public Event(Parcel parcel) {
        this.g = 0;
        this.h = 0;
        this.i = 0L;
        this.j = 0L;
        a(parcel);
    }

    public void e(eyqr eyqrVar) {
    }
}
