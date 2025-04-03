package defpackage;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eyih implements Iterator {
    private final ArrayDeque a;
    private eyeb b;

    public eyih(eyee eyeeVar) {
        if (!(eyeeVar instanceof eyij)) {
            this.a = null;
            this.b = (eyeb) eyeeVar;
            return;
        }
        eyij eyijVar = (eyij) eyeeVar;
        ArrayDeque arrayDeque = new ArrayDeque(eyijVar.g);
        this.a = arrayDeque;
        arrayDeque.push(eyijVar);
        this.b = b(eyijVar.e);
    }

    private final eyeb b(eyee eyeeVar) {
        while (eyeeVar instanceof eyij) {
            eyij eyijVar = (eyij) eyeeVar;
            this.a.push(eyijVar);
            int i = eyij.h;
            eyeeVar = eyijVar.e;
        }
        return (eyeb) eyeeVar;
    }

    @Override // java.util.Iterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final eyeb next() {
        eyeb eyebVar;
        eyeb eyebVar2 = this.b;
        if (eyebVar2 == null) {
            throw new NoSuchElementException();
        }
        do {
            ArrayDeque arrayDeque = this.a;
            eyebVar = null;
            if (arrayDeque == null || arrayDeque.isEmpty()) {
                break;
            }
            eyij eyijVar = (eyij) this.a.pop();
            int i = eyij.h;
            eyebVar = b(eyijVar.f);
        } while (eyebVar.H());
        this.b = eyebVar;
        return eyebVar2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b != null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
