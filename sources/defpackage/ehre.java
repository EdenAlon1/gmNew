package defpackage;

import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehre {
    final WeakReference a;
    public int b;
    boolean c;

    public ehre(int i, ehqq ehqqVar) {
        this.a = new WeakReference(ehqqVar);
        this.b = i;
    }

    final boolean a(ehqq ehqqVar) {
        return ehqqVar != null && this.a.get() == ehqqVar;
    }
}
