package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class emya implements Iterable {
    final /* synthetic */ CharSequence a;
    final /* synthetic */ emye b;

    public emya(emye emyeVar, CharSequence charSequence) {
        this.a = charSequence;
        this.b = emyeVar;
    }

    @Override // java.lang.Iterable
    public final Iterator<String> iterator() {
        return this.b.h(this.a);
    }

    public final String toString() {
        emww emwwVar = new emww(", ");
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        emwwVar.i(sb, this);
        sb.append(']');
        return sb.toString();
    }
}
