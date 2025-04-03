package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dyuj {
    /* JADX WARN: Multi-variable type inference failed */
    public static engw d(List list) {
        int i = engw.d;
        engr engrVar = new engr();
        enqv it = ((engw) list).iterator();
        while (it.hasNext()) {
            dyuj dyujVar = (dyuj) it.next();
            if (dyujVar.b() == 1) {
                engrVar.h(dyujVar.a());
            }
        }
        return engrVar.g();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static engw e(List list) {
        int i = engw.d;
        engr engrVar = new engr();
        enqv it = ((engw) list).iterator();
        while (it.hasNext()) {
            dyuj dyujVar = (dyuj) it.next();
            if (dyujVar.b() == 2) {
                engrVar.h(dyujVar.c());
            }
        }
        return engrVar.g();
    }

    public abstract dzhm a();

    public abstract int b();

    public abstract Object c();
}
