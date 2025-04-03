package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bro {
    public final List a;
    public final bqy b;

    public bro(List list, bqy bqyVar) {
        boolean z = true;
        if (list.isEmpty() && bqyVar == bqy.c) {
            z = false;
        }
        ksw.b(z, "No preferred quality and fallback strategy.");
        this.a = DesugarCollections.unmodifiableList(new ArrayList(list));
        this.b = bqyVar;
    }

    public static bro a(List list, bqy bqyVar) {
        ksw.i(list, "qualities cannot be null");
        ksw.b(!list.isEmpty(), "qualities cannot be empty");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            brk brkVar = (brk) it.next();
            boolean d = brk.d(brkVar);
            Objects.toString(brkVar);
            ksw.b(d, "qualities contain invalid quality: ".concat(String.valueOf(brkVar)));
        }
        return new bro(list, bqyVar);
    }

    public final String toString() {
        return "QualitySelector{preferredQualities=" + this.a + ", fallbackStrategy=" + this.b + "}";
    }
}
