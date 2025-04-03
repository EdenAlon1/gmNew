package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdxa {
    static ArrayList a;
    public Object b;

    private fdxa() {
    }

    public static synchronized fdxa a() {
        fdxa fdxaVar;
        synchronized (fdxa.class) {
            if (a == null) {
                a = new ArrayList();
            }
            fdxaVar = new fdxa();
            a.add(fdxaVar);
        }
        return fdxaVar;
    }
}
