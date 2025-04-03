package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import java.util.concurrent.Executor;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class fegu {
    public static final Logger a = Logger.getLogger(fegu.class.getName());
    public static final fegq c = new Object() { // from class: fegq
    };
    protected final IBinder b;

    protected fegu(IBinder iBinder) {
        this.b = iBinder;
    }

    public static fegu b(IBinder iBinder, Executor executor) {
        return iBinder instanceof Binder ? new fegs(iBinder, executor) : new fegt(iBinder);
    }

    public abstract void a(int i, fegy fegyVar);

    protected final boolean c(int i, Parcel parcel) {
        try {
            return this.b.transact(i, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
