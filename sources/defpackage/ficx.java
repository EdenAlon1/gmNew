package defpackage;

import java.security.PrivilegedAction;
import java.security.Security;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ficx implements PrivilegedAction {
    final /* synthetic */ String a;

    public ficx(String str) {
        this.a = str;
    }

    @Override // java.security.PrivilegedAction
    public final Object run() {
        return Security.getProperty(this.a);
    }
}
