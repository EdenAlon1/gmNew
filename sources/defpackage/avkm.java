package defpackage;

import java.util.Collection;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avkm {
    public final avkf a;
    private final avkc b;

    public avkm(avkc avkcVar, avkf avkfVar) {
        this.b = avkcVar;
        this.a = avkfVar;
    }

    public static final avkl d(awwf awwfVar, awui awuiVar) {
        return new avkl(awwfVar, engw.r(awuiVar), true);
    }

    public final avkl a(String str) {
        return new avkl(this.b.a(str, false));
    }

    public final avkl b(awwf awwfVar, Collection collection) {
        emxf.b(!collection.isEmpty(), "Group recipients is empty");
        int i = engw.d;
        engr engrVar = new engr();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            aoku aokuVar = (aoku) it.next();
            String h = aokuVar.h();
            if (h != null) {
                engrVar.h(this.b.f(aokuVar, h));
            }
        }
        return new avkl(awwfVar, engrVar.g(), false);
    }

    public final avkl c(String str, String str2, Collection collection) {
        return b(this.a.a(str, str2), collection);
    }
}
