package defpackage;

import java.util.ArrayDeque;
import java.util.Deque;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejld {
    private final Deque a;
    private final emwl b;
    private final int c;

    public ejld(int i, emwl emwlVar) {
        emxf.b(true, "maxValues must be greater than zero. Were it equal to zero, the queue would unconditionally (and unhelpfully) preempt all added values.");
        this.c = i;
        this.b = emwlVar;
        this.a = new ArrayDeque(i);
    }

    public final void a() {
        while (true) {
            Object poll = this.a.poll();
            if (poll == null) {
                return;
            }
        }
    }

    public final boolean b() {
        return this.a.isEmpty();
    }

    public final boolean c(Object obj) {
        ArrayDeque arrayDeque = new ArrayDeque(this.a.size());
        while (this.a.peek() != null && this.a.peek() != obj) {
            arrayDeque.add(this.a.poll());
        }
        if (this.a.peek() != obj) {
            while (true) {
                Object pollLast = arrayDeque.pollLast();
                if (pollLast == null) {
                    return false;
                }
                this.a.addFirst(pollLast);
            }
        } else {
            this.a.poll();
            while (true) {
                Object poll = arrayDeque.poll();
                if (poll == null) {
                    return true;
                }
            }
        }
    }

    public final void d(Object obj) {
        ArrayDeque arrayDeque = new ArrayDeque(this.a.size());
        while (true) {
            Object poll = this.a.poll();
            if (poll == null) {
                break;
            } else if (arrayDeque.size() < this.c - 1) {
                arrayDeque.add(poll);
            }
        }
        while (true) {
            Object poll2 = arrayDeque.poll();
            if (poll2 == null) {
                this.a.add(obj);
                return;
            }
            this.a.add(poll2);
        }
    }
}
