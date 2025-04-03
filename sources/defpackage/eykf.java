package defpackage;

import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.Collection;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eykf extends eyjz implements Set, j$.util.Set, fflg {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eykf(Collection collection) {
        super(collection);
        collection.getClass();
    }

    @Override // defpackage.eyjz, java.util.Collection, java.lang.Iterable, j$.util.Collection, j$.lang.a
    public final /* synthetic */ Spliterator spliterator() {
        Spliterator spliterator;
        spliterator = Spliterators.spliterator(this, 1);
        return spliterator;
    }
}
