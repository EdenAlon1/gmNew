package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class emyh {
    static final void a(int i, Set set) {
        set.add(Integer.valueOf(i));
    }

    static final void b(int i, int i2, Set set) {
        while (i <= i2) {
            set.add(Integer.valueOf(i));
            i++;
        }
    }

    static final void c(emyi emyiVar, Set set) {
        for (Integer num : emyiVar.b) {
            num.intValue();
            set.add(num);
        }
    }
}
