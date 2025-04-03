package defpackage;

import java.util.Collection;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class enmm extends enfo {
    final /* synthetic */ Set a;

    public enmm(Set set) {
        this.a = set;
    }

    @Override // defpackage.enfd, java.util.Collection, java.util.Queue
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.enfd, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.enfo, defpackage.enfd
    protected final /* synthetic */ Collection b() {
        return this.a;
    }

    @Override // defpackage.enfo
    protected final Set c() {
        return this.a;
    }

    @Override // defpackage.enfd, defpackage.enfm
    protected final /* synthetic */ Object hC() {
        return this.a;
    }
}
