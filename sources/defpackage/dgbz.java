package defpackage;

import android.content.Context;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dgbz {
    public final Object a;

    public dgbz(Class cls, Context context, Parcelable parcelable) {
        try {
            this.a = cls.getDeclaredConstructor(Context.class, Parcelable.class).newInstance(context, parcelable);
        } catch (Exception e) {
            throw new dgbv(e);
        }
    }
}
