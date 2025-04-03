package com.google.android.apps.messaging.conversation2.bottomcontent.composerow.draft.attachment;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.doxr;
import defpackage.doxs;
import defpackage.drlo;
import defpackage.drlx;
import defpackage.ffkj;
import defpackage.xwf;
import defpackage.xwg;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class RichLocation implements doxs {
    private static final drlx f;
    public final String a;
    public final double b;
    public final double c;
    public final drlx d;
    public final Uri e;
    private final doxr g;

    /* compiled from: PG */
    public interface Source extends doxr<RichLocation> {

        /* compiled from: PG */
        public static final class LocationPicker implements Source {
            public static final LocationPicker a = new LocationPicker();
            public static final Parcelable.Creator<LocationPicker> CREATOR = new xwg();

            private LocationPicker() {
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeInt(1);
            }
        }
    }

    static {
        drlx a = drlo.a("application/vnd.gsma.rcspushlocation+xml");
        a.getClass();
        f = a;
    }

    public /* synthetic */ RichLocation(String str, double d, double d2) {
        Source.LocationPicker locationPicker = Source.LocationPicker.a;
        this.a = str;
        this.b = d;
        this.c = d2;
        this.g = locationPicker;
        this.d = f;
        Uri uri = Uri.EMPTY;
        uri.getClass();
        this.e = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RichLocation)) {
            return false;
        }
        RichLocation richLocation = (RichLocation) obj;
        return ffkj.e(this.a, richLocation.a) && Double.compare(this.b, richLocation.b) == 0 && Double.compare(this.c, richLocation.c) == 0 && ffkj.e(this.g, richLocation.g);
    }

    @Override // defpackage.doxs
    public final doxr fm() {
        return this.g;
    }

    @Override // defpackage.doxx
    public final Object fn() {
        return this.a;
    }

    @Override // defpackage.doxs
    public final /* synthetic */ String fo() {
        return toString();
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + xwf.a(this.b)) * 31) + xwf.a(this.c)) * 31) + this.g.hashCode();
    }

    public final String toString() {
        return "RichLocation(locationUrl=" + this.a + ", latitude=" + this.b + ", longitude=" + this.c + ", source=" + this.g + ")";
    }
}
