package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdxz {
    public static final fdxz a = new fdxz(new fdxv(), fdxw.a);
    public final ConcurrentMap b = new ConcurrentHashMap();

    public fdxz(fdxy... fdxyVarArr) {
        for (fdxy fdxyVar : fdxyVarArr) {
            this.b.put(fdxyVar.c(), fdxyVar);
        }
    }

    public static fdxz a() {
        return new fdxz(new fdxy[0]);
    }
}
