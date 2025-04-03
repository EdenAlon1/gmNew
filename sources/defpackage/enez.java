package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enez extends enfc {
    final /* synthetic */ Iterable a;

    public enez(Iterable iterable) {
        this.a = iterable;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new enjq(enju.j(this.a.iterator(), new emwl() { // from class: eney
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return ((Iterable) obj).iterator();
            }
        }));
    }
}
