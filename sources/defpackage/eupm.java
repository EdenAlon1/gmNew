package defpackage;

import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eupm<T> {
    public final String a;
    public final Set b;
    public final Set c;
    public final int d;
    public final int e;
    public final eupr f;
    public final Set g;

    public eupm(String str, Set set, Set set2, int i, int i2, eupr euprVar, Set set3) {
        this.a = str;
        this.b = DesugarCollections.unmodifiableSet(set);
        this.c = DesugarCollections.unmodifiableSet(set2);
        this.d = i;
        this.e = i2;
        this.f = euprVar;
        this.g = DesugarCollections.unmodifiableSet(set3);
    }

    public static eupl a(euqq euqqVar) {
        return new eupl(euqqVar, new euqq[0]);
    }

    public static eupl b(Class cls) {
        return new eupl(cls, new Class[0]);
    }

    public static eupl c(Class cls) {
        eupl b = b(cls);
        b.b = 1;
        return b;
    }

    public static eupm d(final Object obj, Class cls) {
        eupl c = c(cls);
        c.c = new eupr() { // from class: eupj
            @Override // defpackage.eupr
            public final Object a(eupo eupoVar) {
                return obj;
            }
        };
        return c.a();
    }

    @SafeVarargs
    public static eupm e(final Object obj, Class cls, Class... clsArr) {
        eupl euplVar = new eupl(cls, clsArr);
        euplVar.c = new eupr() { // from class: eupk
            @Override // defpackage.eupr
            public final Object a(eupo eupoVar) {
                return obj;
            }
        };
        return euplVar.a();
    }

    public final boolean f() {
        return this.e == 0;
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.b.toArray()) + ">{" + this.d + ", type=" + this.e + ", deps=" + Arrays.toString(this.c.toArray()) + "}";
    }
}
