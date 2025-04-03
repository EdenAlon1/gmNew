package defpackage;

import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class azzv {
    public final StringBuilder a = new StringBuilder();
    public final HashSet b = new HashSet();

    private azzv() {
    }

    public static azzv a() {
        azzv azzvVar = (azzv) azzw.a.get();
        if (azzvVar == null) {
            azzvVar = new azzv();
            azzw.a.set(azzvVar);
        }
        azzvVar.b.clear();
        azzvVar.a.setLength(0);
        return azzvVar;
    }
}
