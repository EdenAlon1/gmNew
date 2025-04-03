package defpackage;

import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qix implements qil {
    public final String a;
    public final List b;
    public final boolean c;

    public qix(String str, List list, boolean z) {
        this.a = str;
        this.b = list;
        this.c = z;
    }

    @Override // defpackage.qil
    public final qdu a(qdb qdbVar, qci qciVar, qje qjeVar) {
        return new qdv(qdbVar, qjeVar, this, qciVar);
    }

    public final String toString() {
        return "ShapeGroup{name='" + this.a + "' Shapes: " + Arrays.toString(this.b.toArray()) + "}";
    }
}
