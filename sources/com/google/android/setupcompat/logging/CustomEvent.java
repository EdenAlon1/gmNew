package com.google.android.setupcompat.logging;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.PersistableBundle;
import defpackage.eiob;
import defpackage.eioc;
import defpackage.eiol;
import defpackage.eiom;
import defpackage.eipo;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class CustomEvent implements Parcelable {
    public static final Parcelable.Creator<CustomEvent> CREATOR = new eiom();
    private final long a;
    private final MetricKey b;
    private final PersistableBundle c;
    private final PersistableBundle d;

    public CustomEvent(long j, MetricKey metricKey, PersistableBundle persistableBundle, PersistableBundle persistableBundle2) {
        eioc.a(j >= 0, "Timestamp cannot be negative.");
        eioc.c(metricKey, "MetricKey cannot be null.");
        eioc.c(persistableBundle, "Bundle cannot be null.");
        eioc.a(!persistableBundle.isEmpty(), "Bundle cannot be empty.");
        eioc.c(persistableBundle2, "piiValues cannot be null.");
        for (String str : persistableBundle.keySet()) {
            eiol.a(str, "bundle key", 3, 50);
            Object obj = persistableBundle.get(str);
            if (obj instanceof String) {
                eioc.a(((String) obj).length() <= 50, String.format("Maximum length of string value for key='%s' cannot exceed %s.", str, 50));
            }
        }
        this.a = j;
        this.b = metricKey;
        this.c = new PersistableBundle(persistableBundle);
        this.d = new PersistableBundle(persistableBundle2);
    }

    public static Bundle a(CustomEvent customEvent) {
        Bundle bundle = new Bundle();
        bundle.putInt("CustomEvent_version", 1);
        bundle.putLong("CustomEvent_timestamp", customEvent.a);
        bundle.putBundle("CustomEvent_metricKey", MetricKey.a(customEvent.b));
        bundle.putBundle("CustomEvent_bundleValues", eiob.a(new PersistableBundle(customEvent.c)));
        bundle.putBundle("CustomEvent_pii_bundleValues", eiob.a(customEvent.d));
        return bundle;
    }

    public static CustomEvent b(MetricKey metricKey, PersistableBundle persistableBundle) {
        eioc.a(Build.VERSION.SDK_INT >= 29, "The constructor only support on sdk Q or higher.");
        PersistableBundle persistableBundle2 = PersistableBundle.EMPTY;
        eioc.a(Build.VERSION.SDK_INT >= 29, "The constructor only support on sdk Q or higher");
        long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime());
        eiob.c(persistableBundle);
        eiob.c(persistableBundle2);
        return new CustomEvent(millis, metricKey, persistableBundle, persistableBundle2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomEvent)) {
            return false;
        }
        CustomEvent customEvent = (CustomEvent) obj;
        return this.a == customEvent.a && eipo.a(this.b, customEvent.b) && eiob.b(this.c, customEvent.c) && eiob.b(this.d, customEvent.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), this.b, this.c, this.d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeParcelable(this.b, i);
        parcel.writePersistableBundle(this.c);
        parcel.writePersistableBundle(this.d);
    }
}
