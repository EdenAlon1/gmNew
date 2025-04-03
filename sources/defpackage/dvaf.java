package defpackage;

import java.util.ArrayDeque;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dvaf extends ThreadLocal {
    @Override // java.lang.ThreadLocal
    protected final /* synthetic */ Object initialValue() {
        return new ArrayDeque();
    }
}
