package defpackage;

import java.util.ArrayDeque;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awbe {
    public static final awbi a(awai awaiVar, ArrayDeque arrayDeque, ArrayDeque arrayDeque2, boolean z) {
        if (z) {
            awaiVar.e.a.addAll(arrayDeque2);
        }
        return new awbi(awaiVar, arrayDeque, z);
    }

    public static final void b(awat awatVar, ArrayDeque arrayDeque, ArrayDeque arrayDeque2) {
        arrayDeque.add(awatVar);
        arrayDeque2.add(awatVar.a());
    }
}
