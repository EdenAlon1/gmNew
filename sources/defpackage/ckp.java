package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ckp implements Parcelable {
    public static final Parcelable.Creator<ckp> CREATOR = new cko();
    private final Bundle a;

    public ckp(Bundle bundle) {
        this.a = bundle;
    }

    public final Object a() {
        int i = cku.a;
        boolean isLoggable = Log.isLoggable("CarApp.Bun", 3);
        Bundle bundle = this.a;
        if (isLoggable) {
            Log.d("CarApp.Bun", "Unbundling ".concat(cku.c(bundle.getInt("tag_class_type"))));
        }
        return cku.b(bundle, cks.a());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.a);
    }

    public ckp(Object obj) {
        String e = cku.e(obj.getClass());
        if (Log.isLoggable("CarApp.Bun", 3)) {
            Log.d("CarApp.Bun", "Bundling ".concat(String.valueOf(e)));
        }
        this.a = cku.a(obj, e, cks.a());
    }
}
