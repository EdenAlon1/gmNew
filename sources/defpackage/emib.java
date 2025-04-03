package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emib {
    public final engw a;
    public final String b;

    public emib(emhg emhgVar) {
        this.b = emhgVar.d;
        int i = emhgVar.c;
        int i2 = engw.d;
        engr engrVar = new engr();
        Iterator<E> it = emhgVar.b.iterator();
        while (it.hasNext()) {
            engrVar.h(new emia((emhe) it.next()));
        }
        this.a = engrVar.g();
    }
}
