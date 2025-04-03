package defpackage;

import android.content.Intent;
import com.google.android.gms.auth.UserRecoverableAuthException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekho {
    public static Throwable a(Throwable th) {
        if (th instanceof dubu) {
            throw null;
        }
        if (th instanceof dubq) {
            String message = th.getMessage();
            Intent intent = ((dubq) th).a;
            return new UserRecoverableAuthException(message, intent != null ? new Intent(intent) : null);
        }
        if (th instanceof dubv) {
            th.getMessage();
            throw null;
        }
        if (!(th instanceof dubt)) {
            return th;
        }
        return new dfqc(0);
    }
}
