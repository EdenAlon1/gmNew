package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class eobs implements Iterable {
    public final Object a;
    public final Object b;

    public eobs(Object obj, Object obj2) {
        this.a = obj;
        obj2.getClass();
        this.b = obj2;
    }

    public abstract Object a();

    public abstract Object b();

    public abstract void c();

    @Override // java.lang.Iterable
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return new enjp(new Object[]{this.a, this.b});
    }
}
