package defpackage;

import android.app.Activity;
import android.os.BadParcelableException;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvst extends dwnh {
    private final dvrl b;
    private final dvss c;
    private final String d;
    private static final entd a = entd.c("GnpSdk");
    public static final Parcelable.Creator<dvst> CREATOR = new dvsr();

    public dvst(Parcel parcel) {
        this.d = parcel.readString();
        this.c = (dvss) b(parcel, dvss.class.getClassLoader(), dvss.class, dvss.UNKNOWN);
        this.b = (dvrl) b(parcel, dvrl.class.getClassLoader(), dvrl.class, null);
    }

    private static Object b(Parcel parcel, ClassLoader classLoader, Class cls, Object obj) {
        Object obj2;
        try {
            obj2 = kqq.b() ? parcel.readSerializable(classLoader, cls) : cls.cast(parcel.readSerializable());
        } catch (BadParcelableException | ClassCastException unused) {
            ((ensz) ((ensz) a.j()).h("com/google/android/libraries/internal/growth/growthkit/internal/ui/impl/gm/taptarget/FeatureHighlightViewFinder", "readSerializable", 91, "FeatureHighlightViewFinder.java")).t("Failed to read %s data from parcel", cls.getName());
            obj2 = null;
        }
        return obj2 != null ? obj2 : obj;
    }

    @Override // defpackage.dwnh
    public final View a(Activity activity, View view) {
        if (this.b == null) {
            return null;
        }
        int ordinal = this.c.ordinal();
        if (ordinal == 1) {
            return this.b.a(activity, view, this.d);
        }
        if (ordinal == 2) {
            return this.b.b(activity, view, this.d);
        }
        if (ordinal != 3) {
            return null;
        }
        dvrl dvrlVar = this.b;
        Integer.parseInt(this.d);
        return dvrlVar.d(activity);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.d);
        parcel.writeSerializable(this.c);
        parcel.writeSerializable(this.b);
    }

    public dvst(dvrl dvrlVar, evzr evzrVar) {
        this.b = dvrlVar;
        int i = evzrVar.c;
        int i2 = i != 0 ? i != 1 ? i != 10 ? i != 11 ? 0 : 3 : 2 : 1 : 4;
        if (i2 == 0) {
            throw null;
        }
        int i3 = i2 - 1;
        if (i3 == 0) {
            this.d = i == 1 ? (String) evzrVar.d : "";
            this.c = dvss.ID;
            return;
        }
        if (i3 == 1) {
            this.d = i == 10 ? (String) evzrVar.d : "";
            this.c = dvss.TAG;
        } else if (i3 != 2) {
            ((ensz) ((ensz) a.j()).h("com/google/android/libraries/internal/growth/growthkit/internal/ui/impl/gm/taptarget/FeatureHighlightViewFinder", "<init>", 58, "FeatureHighlightViewFinder.java")).q("No tap target element was specified.");
            this.d = "";
            this.c = dvss.UNKNOWN;
        } else {
            this.d = String.valueOf(i == 11 ? ((Integer) evzrVar.d).intValue() : 0);
            this.c = dvss.VE_ID;
        }
    }
}
