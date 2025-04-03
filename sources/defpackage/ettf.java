package defpackage;

import java.security.SecureRandom;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ettf extends ThreadLocal {
    @Override // java.lang.ThreadLocal
    protected final /* synthetic */ Object initialValue() {
        SecureRandom a = ettg.a();
        a.nextLong();
        return a;
    }
}
