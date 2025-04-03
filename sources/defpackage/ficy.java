package defpackage;

import java.security.PrivilegedAction;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ficy implements PrivilegedAction {
    final /* synthetic */ String a;

    public ficy(String str) {
        this.a = str;
    }

    @Override // java.security.PrivilegedAction
    public final Object run() {
        return System.getProperty(this.a);
    }
}
