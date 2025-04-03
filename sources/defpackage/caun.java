package defpackage;

import java.util.ArrayDeque;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class caun extends ThreadLocal {
    @Override // java.lang.ThreadLocal
    public final /* synthetic */ Object initialValue() {
        return new ArrayDeque();
    }
}
