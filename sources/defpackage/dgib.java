package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Pair;
import com.google.android.gms.feedback.FeedbackOptions;
import java.security.SecureRandom;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dgib {
    public static Bundle a(List list) {
        if (list == null) {
            return null;
        }
        int size = list.size();
        Bundle bundle = new Bundle(size);
        for (int i = 0; i < size; i++) {
            Pair pair = (Pair) list.get(i);
            bundle.putString((String) pair.first, (String) pair.second);
        }
        return bundle;
    }

    @Deprecated
    public static String b() {
        return System.currentTimeMillis() + "-" + Math.abs(new SecureRandom().nextLong());
    }

    public static void c(Bundle bundle) {
        if (!((Boolean) dgid.c.a()).booleanValue() || bundle == null) {
            return;
        }
        Parcel obtain = Parcel.obtain();
        obtain.writeBundle(bundle);
        int dataSize = obtain.dataSize();
        obtain.recycle();
        if (dataSize <= ((Integer) dgid.b.a()).intValue()) {
            return;
        }
        throw new IllegalStateException("Max allowed bundle size of " + dgid.b.a().toString() + " exceeded, you are passing in a bundle of " + dataSize + " size.");
    }

    public static void d(FeedbackOptions feedbackOptions) {
        if (((Boolean) dgid.c.a()).booleanValue()) {
            Parcel obtain = Parcel.obtain();
            dghr.a(feedbackOptions, obtain, 0);
            int dataSize = obtain.dataSize();
            obtain.recycle();
            if (dataSize <= ((Integer) dgid.b.a()).intValue()) {
                return;
            }
            throw new IllegalStateException("Max allowed feedback options size of " + dgid.b.a().toString() + " exceeded, you are passing in feedback options of " + dataSize + " size.");
        }
    }

    public static void e(Context context, dghd dghdVar, long j) {
        f(new dghz(context, dghdVar, j));
        f(new dgia(context, dghdVar, j));
    }

    private static void f(Runnable runnable) {
        Thread thread = new Thread(runnable, "Feedback");
        thread.setPriority(4);
        thread.start();
    }
}
