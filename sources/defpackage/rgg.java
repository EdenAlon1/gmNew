package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rgg {
    private final List a = new ArrayList();

    public final synchronized rge a(Class cls, Class cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return rgh.a;
        }
        for (rgf rgfVar : this.a) {
            if (rgfVar.a(cls, cls2)) {
                return rgfVar.c;
            }
        }
        throw new IllegalArgumentException(a.E(cls2, cls, "No transcoder registered to transcode from ", " to "));
    }

    public final synchronized List b(Class cls, Class cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        for (rgf rgfVar : this.a) {
            if (rgfVar.a(cls, cls2) && !arrayList.contains(rgfVar.b)) {
                arrayList.add(rgfVar.b);
            }
        }
        return arrayList;
    }

    public final synchronized void c(Class cls, Class cls2, rge rgeVar) {
        this.a.add(new rgf(cls, cls2, rgeVar));
    }
}
