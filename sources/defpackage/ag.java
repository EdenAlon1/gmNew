package defpackage;

import j$.util.DesugarCollections;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Set;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
public final class ag {

    @Deprecated
    public final Set a;

    @Deprecated
    public final boolean b;

    @Deprecated
    public final int c;

    private ag(int i, Set set, boolean z) {
        this.c = i;
        this.a = set;
        this.b = z;
    }

    static ag a(String str) {
        int i;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (str.startsWith("integer")) {
            i = 1;
        } else {
            if (!str.startsWith("decimal")) {
                throw new IllegalArgumentException("Samples must start with 'integer' or 'decimal'");
            }
            i = 2;
        }
        boolean z = true;
        boolean z2 = false;
        for (String str2 : al.e.split(str.substring(7).trim())) {
            if (str2.equals("…") || str2.equals("...")) {
                z2 = true;
                z = false;
            } else {
                if (z2) {
                    throw new IllegalArgumentException("Can only have … at the end of samples: ".concat(String.valueOf(str2)));
                }
                String[] split = al.f.split(str2);
                int length = split.length;
                if (length == 1) {
                    ae aeVar = new ae(split[0]);
                    b(i, aeVar);
                    linkedHashSet.add(new af(aeVar, aeVar));
                } else {
                    if (length != 2) {
                        throw new IllegalArgumentException("Ill-formed number range: ".concat(String.valueOf(str2)));
                    }
                    ae aeVar2 = new ae(split[0]);
                    ae aeVar3 = new ae(split[1]);
                    b(i, aeVar2);
                    b(i, aeVar3);
                    linkedHashSet.add(new af(aeVar2, aeVar3));
                }
            }
        }
        return new ag(i, DesugarCollections.unmodifiableSet(linkedHashSet), z);
    }

    private static void b(int i, ae aeVar) {
        if ((i == 1) != (aeVar.b == 0)) {
            throw new IllegalArgumentException("Ill-formed number range: ".concat(aeVar.toString()));
        }
    }

    @Deprecated
    public final String toString() {
        StringBuilder sb = new StringBuilder("@");
        boolean z = true;
        sb.append((this.c != 1 ? "DECIMAL" : "INTEGER").toLowerCase(Locale.ENGLISH));
        for (af afVar : this.a) {
            if (!z) {
                sb.append(",");
            }
            sb.append(' ');
            sb.append(afVar);
            z = false;
        }
        if (!this.b) {
            sb.append(", …");
        }
        return sb.toString();
    }
}
