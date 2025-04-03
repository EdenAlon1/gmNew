package defpackage;

import android.os.Parcel;
import android.os.Process;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes.dex */
final class opl {
    static int a() {
        try {
            Parcel obtain = Parcel.obtain();
            Process.myUserHandle().writeToParcel(obtain, 0);
            obtain.setDataPosition(0);
            return obtain.readInt();
        } catch (Throwable unused) {
            Log.d("ProfileInstaller", "Error when reading current user id. Selected default user id `0`.");
            return 0;
        }
    }
}
