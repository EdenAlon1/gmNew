package defpackage;

import android.os.Binder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jdz {
    public static final /* synthetic */ int a = 0;
    private static final Class[] b = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};

    public static final boolean a(Object obj) {
        if (obj instanceof hso) {
            hso hsoVar = (hso) obj;
            if (hsoVar.f() != hhs.a && hsoVar.f() != hla.a && hsoVar.f() != hji.a) {
                return false;
            }
            Object a2 = hsoVar.a();
            if (a2 == null) {
                return true;
            }
            return a(a2);
        }
        if ((obj instanceof ffbv) && (obj instanceof Serializable)) {
            return false;
        }
        Class[] clsArr = b;
        for (int i = 0; i < 7; i++) {
            if (clsArr[i].isInstance(obj)) {
                return true;
            }
        }
        return false;
    }
}
