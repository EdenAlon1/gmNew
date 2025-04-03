package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class enjg extends enfc {
    final /* synthetic */ Iterable a;
    final /* synthetic */ emwl b;

    public enjg(Iterable iterable, emwl emwlVar) {
        this.a = iterable;
        this.b = emwlVar;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return enju.j(this.a.iterator(), this.b);
    }
}
