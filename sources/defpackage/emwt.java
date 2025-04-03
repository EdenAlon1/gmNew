package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emwt extends emww {
    final /* synthetic */ emww a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public emwt(emww emwwVar, emww emwwVar2) {
        super(emwwVar2);
        this.a = emwwVar;
    }

    @Override // defpackage.emww
    public final String b(Iterable iterable) {
        return e(iterable.iterator());
    }

    @Override // defpackage.emww
    public final void c(Appendable appendable, Iterator it) {
        it.getClass();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (next != null) {
                appendable.append(this.a.a(next));
                break;
            }
        }
        while (it.hasNext()) {
            Object next2 = it.next();
            if (next2 != null) {
                appendable.append(this.a.c);
                appendable.append(this.a.a(next2));
            }
        }
    }
}
