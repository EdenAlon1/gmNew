package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awxh extends eyfq implements eyht {
    public awxh() {
        super(awxk.b);
    }

    public final void a(Iterable iterable) {
        copyOnWrite();
        awxk awxkVar = (awxk) this.instance;
        eygj eygjVar = awxk.a;
        awxkVar.b();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            awxkVar.s.h(((awxj) it.next()).e);
        }
    }

    public final void b(awuk awukVar) {
        copyOnWrite();
        awxk awxkVar = (awxk) this.instance;
        awul awulVar = (awul) awukVar.build();
        eygj eygjVar = awxk.a;
        awulVar.getClass();
        awxkVar.a();
        awxkVar.o.add(awulVar);
    }

    public final void c(awul awulVar) {
        copyOnWrite();
        awxk awxkVar = (awxk) this.instance;
        eygj eygjVar = awxk.a;
        awulVar.getClass();
        awxkVar.a();
        awxkVar.o.add(awulVar);
    }

    public final void d(awxj awxjVar) {
        copyOnWrite();
        awxk awxkVar = (awxk) this.instance;
        eygj eygjVar = awxk.a;
        awxjVar.getClass();
        awxkVar.b();
        awxkVar.s.h(awxjVar.e);
    }
}
