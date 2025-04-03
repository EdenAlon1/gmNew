package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fefk implements fegk {
    static final fefk a = new fefk();

    @Override // defpackage.fegk
    public final boolean C(int i, Parcel parcel) {
        if (i == 1 && parcel.readInt() > 0) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            try {
                fegy c = fegy.c();
                try {
                    c.a().writeInt(0);
                    readStrongBinder.transact(2, c.a(), null, 1);
                    c.close();
                } finally {
                }
            } catch (RemoteException e) {
                fefl.a.logp(Level.WARNING, "io.grpc.binder.internal.BinderServer$GoAwayHandler", "handleTransaction", "Couldn't reply to post-shutdown() SETUP_TRANSPORT.", (Throwable) e);
            }
        }
        return false;
    }
}
