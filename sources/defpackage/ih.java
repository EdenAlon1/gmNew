package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ih {
    public static Object a(Bundle bundle, String str, Class cls) {
        Object parcelable;
        if (Build.VERSION.SDK_INT >= 34) {
            parcelable = bundle.getParcelable(str, cls);
            return parcelable;
        }
        Parcelable parcelable2 = bundle.getParcelable(str);
        if (cls.isInstance(parcelable2)) {
            return parcelable2;
        }
        return null;
    }

    public static ArrayList b(Bundle bundle, String str, Class cls) {
        ArrayList parcelableArrayList;
        if (Build.VERSION.SDK_INT < 34) {
            return bundle.getParcelableArrayList(str);
        }
        parcelableArrayList = bundle.getParcelableArrayList(str, cls);
        return parcelableArrayList;
    }
}
