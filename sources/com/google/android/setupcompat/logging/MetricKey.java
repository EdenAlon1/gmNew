package com.google.android.setupcompat.logging;

import android.app.Activity;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.eioc;
import defpackage.eiol;
import defpackage.eion;
import defpackage.eipo;
import java.util.Arrays;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class MetricKey implements Parcelable {
    public static final Parcelable.Creator<MetricKey> CREATOR = new eion();
    private static final Pattern a = Pattern.compile("^[a-zA-Z][a-zA-Z0-9_]+");
    private final String b;
    private final String c;

    static {
        Pattern.compile("^([a-z]+[.])+[A-Z][a-zA-Z0-9]+");
        Pattern.compile("^[a-zA-Z][a-zA-Z0-9_]+");
    }

    public MetricKey(String str, String str2) {
        this.b = str;
        this.c = str2;
    }

    public static Bundle a(MetricKey metricKey) {
        eioc.c(metricKey, "MetricKey cannot be null.");
        Bundle bundle = new Bundle();
        bundle.putInt("MetricKey_version", 1);
        bundle.putString("MetricKey_name", metricKey.b);
        bundle.putString("MetricKey_screenName", metricKey.c);
        return bundle;
    }

    public static MetricKey b(String str, Activity activity) {
        String className = activity.getComponentName().getClassName();
        eiol.a(str, "MetricKey.name", 5, 30);
        eioc.a(a.matcher(str).matches(), "Invalid MetricKey, only alpha numeric characters are allowed.");
        return new MetricKey(str, className);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MetricKey)) {
            return false;
        }
        MetricKey metricKey = (MetricKey) obj;
        return eipo.a(this.b, metricKey.b) && eipo.a(this.c, metricKey.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }
}
