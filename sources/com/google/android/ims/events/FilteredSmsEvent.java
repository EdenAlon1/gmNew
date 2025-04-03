package com.google.android.ims.events;

import android.os.Parcel;
import com.google.android.ims.rcsservice.events.Event;
import defpackage.emxe;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class FilteredSmsEvent extends Event {
    private String a;
    private int b;
    private String c;

    public FilteredSmsEvent(Parcel parcel) {
        a(parcel);
    }

    @Override // com.google.android.ims.rcsservice.events.Event
    public final void a(Parcel parcel) {
        super.a(parcel);
        this.a = emxe.b(parcel.readString());
        this.b = parcel.readInt();
        this.c = emxe.b(parcel.readString());
    }

    @Override // com.google.android.ims.rcsservice.events.Event
    protected final void b(Parcel parcel) {
        parcel.writeString(getClass().getName());
    }

    @Override // com.google.android.ims.rcsservice.events.Event, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.a);
        parcel.writeInt(this.b);
        parcel.writeString(this.c);
    }

    public FilteredSmsEvent(String str, int i, String str2) {
        super(80001, 0L, 0L);
        this.a = str;
        this.b = i;
        this.c = str2;
    }
}
