package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.ims.rcsservice.ims.ImsEvent;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkol implements Parcelable.Creator {
    public static final ImsEvent a(Parcel parcel) {
        try {
            String readString = parcel.readString();
            if (!TextUtils.equals(readString, ImsEvent.class.getName()) && readString != null) {
                Constructor<?> constructor = Class.forName(readString).getConstructor(Parcel.class);
                if (constructor != null) {
                    return (ImsEvent) constructor.newInstance(parcel);
                }
                dkty.g("No constructor for Parcel found!", new Object[0]);
                throw new IllegalStateException("No constructor for Parcel found!");
            }
            return new ImsEvent(parcel);
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
            return new ImsEvent(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ImsEvent[i];
    }
}
