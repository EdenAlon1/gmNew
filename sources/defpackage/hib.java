package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hib implements Parcelable.ClassLoaderCreator {
    @Override // android.os.Parcelable.ClassLoaderCreator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final hic createFromParcel(Parcel parcel, ClassLoader classLoader) {
        hke hkeVar;
        if (classLoader == null) {
            classLoader = getClass().getClassLoader();
        }
        Object readValue = parcel.readValue(classLoader);
        int readInt = parcel.readInt();
        if (readInt == 0) {
            hkeVar = hhs.a;
        } else if (readInt == 1) {
            hkeVar = hla.a;
        } else {
            if (readInt != 2) {
                throw new IllegalStateException(a.f(readInt, "Unsupported MutableState policy ", " was restored"));
            }
            hkeVar = hji.a;
        }
        return new hic(readValue, hkeVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return createFromParcel(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new hic[i];
    }
}
