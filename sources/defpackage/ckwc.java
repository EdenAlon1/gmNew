package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckwc implements ffeo {
    final /* synthetic */ Iterable a;

    public ckwc(Iterable iterable) {
        this.a = iterable;
    }

    @Override // defpackage.ffeo
    public final Object a(Object obj) {
        return (ckvf) obj;
    }

    @Override // defpackage.ffeo
    public final Iterator b() {
        return this.a.iterator();
    }
}
