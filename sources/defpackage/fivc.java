package defpackage;

import java.security.PrivilegedAction;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fivc implements PrivilegedAction {
    final /* synthetic */ String a;
    final /* synthetic */ fivd b;

    public fivc(fivd fivdVar, String str) {
        this.a = str;
        this.b = fivdVar;
    }

    @Override // java.security.PrivilegedAction
    public final /* bridge */ /* synthetic */ Object run() {
        ClassLoader classLoader = this.b.a;
        return classLoader != null ? classLoader.getResourceAsStream(this.a) : ClassLoader.getSystemResourceAsStream(this.a);
    }
}
