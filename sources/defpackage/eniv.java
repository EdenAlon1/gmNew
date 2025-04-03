package defpackage;

import java.util.AbstractMap;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eniv extends engw {
    final /* synthetic */ eniw a;

    public eniv(eniw eniwVar) {
        this.a = eniwVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return new AbstractMap.SimpleImmutableEntry(this.a.a.c.d.get(i), this.a.a.d.get(i));
    }

    @Override // defpackage.engi
    public final boolean l() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.a.size();
    }

    @Override // defpackage.engw, defpackage.engi
    public Object writeReplace() {
        return super.writeReplace();
    }
}
