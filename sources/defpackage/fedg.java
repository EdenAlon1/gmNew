package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fedg {
    public final String a;
    public final Collection b;

    public fedg(fedf fedfVar) {
        String str = fedfVar.a;
        this.a = str;
        List<febs> list = fedfVar.b;
        HashSet hashSet = new HashSet(list.size());
        for (febs febsVar : list) {
            febsVar.getClass();
            String str2 = febsVar.c;
            emxf.i(str.equals(str2), "service names %s != %s", str2, str);
            emxf.f(hashSet.add(febsVar.b), "duplicate name %s", febsVar.b);
        }
        this.b = DesugarCollections.unmodifiableList(new ArrayList(fedfVar.b));
    }

    public final String toString() {
        emwz b = emxa.b(this);
        b.b("name", this.a);
        b.b("schemaDescriptor", null);
        b.b("methods", this.b);
        b.c();
        return b.toString();
    }
}
