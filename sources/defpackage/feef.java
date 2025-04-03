package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.UserHandle;
import java.net.SocketAddress;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class feef extends SocketAddress {
    private static final long serialVersionUID = 0;
    public final Intent a;
    private final UserHandle b;

    protected feef(Intent intent) {
        boolean z = true;
        if (intent.getComponent() == null && intent.getPackage() == null) {
            z = false;
        }
        emxf.b(z, "'bindIntent' must be explicit. Specify either a package or ComponentName.");
        this.a = intent;
        this.b = null;
    }

    public static feef a(ComponentName componentName) {
        return new feef(new Intent("grpc.io.action.BIND").setComponent(componentName));
    }

    public static feef b(Context context) {
        return a(new ComponentName(context, context.getClass()));
    }

    public static feef c(String str, String str2) {
        return a(new ComponentName(str, str2));
    }

    public final String d() {
        return this.a.getPackage() != null ? this.a.getPackage() : this.a.getComponent().getPackageName();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof feef) {
            feef feefVar = (feef) obj;
            if (this.a.filterEquals(feefVar.a)) {
                UserHandle userHandle = feefVar.b;
                if (emxb.a(null, null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Intent intent = this.a;
        if (intent.getPackage() != null) {
            intent = intent.cloneFilter().setPackage(null);
        }
        return intent.filterHashCode();
    }

    public final String toString() {
        return "AndroidComponentAddress[" + this.a + "]";
    }
}
