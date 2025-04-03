package defpackage;

import java.util.Collections;
import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enwo {
    public static final Comparator a = new enwh();
    public static final enwo b = new enwo(new enwm(Collections.EMPTY_LIST));
    public final enwm c;

    private enwo(enwm enwmVar) {
        this.c = enwmVar;
    }

    public final enwo a(enwo enwoVar) {
        return enwoVar.b() ? this : b() ? enwoVar : new enwo(new enwm(this.c, enwoVar.c));
    }

    public final boolean b() {
        return this.c.isEmpty();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof enwo) && ((enwo) obj).c.equals(this.c);
    }

    public final int hashCode() {
        return ~this.c.hashCode();
    }

    public final String toString() {
        return this.c.toString();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public enwo(String str, Object obj) {
        this(new enwm(str, obj));
        enxb.c(str);
    }
}
