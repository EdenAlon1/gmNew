package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class oee {
    public int a;
    public int b;
    public final ffdn c = new ffdn();
    public final ogh d = new ogh();
    public boolean e;

    public final List a() {
        if (!this.e) {
            return ffel.a;
        }
        ArrayList arrayList = new ArrayList();
        ogh oghVar = this.d;
        ffdn ffdnVar = this.c;
        ofy b = oghVar.b();
        if (ffdnVar.isEmpty()) {
            arrayList.add(new ogm(b));
            return arrayList;
        }
        ffdn ffdnVar2 = this.c;
        ogl oglVar = ogl.a;
        arrayList.add(new ogl(ofz.a, ffdx.ak(ffdnVar2), this.a, this.b, b));
        return arrayList;
    }
}
