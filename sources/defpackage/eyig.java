package defpackage;

import java.util.ArrayDeque;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eyig {
    public static final void a(eyee eyeeVar, ArrayDeque arrayDeque) {
        if (!eyeeVar.h()) {
            if (!(eyeeVar instanceof eyij)) {
                throw new IllegalArgumentException("Has a new type of ByteString been created? Found ".concat(String.valueOf(String.valueOf(eyeeVar.getClass()))));
            }
            eyij eyijVar = (eyij) eyeeVar;
            int i = eyij.h;
            a(eyijVar.e, arrayDeque);
            a(eyijVar.f, arrayDeque);
            return;
        }
        int b = b(eyeeVar.d());
        int c = eyij.c(b + 1);
        if (arrayDeque.isEmpty() || ((eyee) arrayDeque.peek()).d() >= c) {
            arrayDeque.push(eyeeVar);
            return;
        }
        int c2 = eyij.c(b);
        eyee eyeeVar2 = (eyee) arrayDeque.pop();
        while (!arrayDeque.isEmpty() && ((eyee) arrayDeque.peek()).d() < c2) {
            eyeeVar2 = new eyij((eyee) arrayDeque.pop(), eyeeVar2);
        }
        eyij eyijVar2 = new eyij(eyeeVar2, eyeeVar);
        while (!arrayDeque.isEmpty()) {
            if (((eyee) arrayDeque.peek()).d() >= eyij.c(b(eyijVar2.d) + 1)) {
                break;
            } else {
                eyijVar2 = new eyij((eyee) arrayDeque.pop(), eyijVar2);
            }
        }
        arrayDeque.push(eyijVar2);
    }

    private static final int b(int i) {
        int binarySearch = Arrays.binarySearch(eyij.a, i);
        return binarySearch < 0 ? (-(binarySearch + 1)) - 1 : binarySearch;
    }
}
