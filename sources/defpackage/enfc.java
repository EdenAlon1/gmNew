package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class enfc implements Iterable {
    private final emxc a;

    protected enfc() {
        this.a = emux.a;
    }

    public static enfc b(Iterable iterable, Iterable iterable2) {
        Iterable[] iterableArr = {iterable, iterable2};
        for (int i = 0; i < 2; i++) {
            iterableArr[i].getClass();
        }
        return new enfb(iterableArr);
    }

    public static enfc d(Iterable iterable) {
        return iterable instanceof enfc ? (enfc) iterable : new enex(iterable, iterable);
    }

    public static enfc e(Object[] objArr) {
        return d(Arrays.asList(objArr));
    }

    public final emxc a(emxg emxgVar) {
        return enjk.c(h(), emxgVar);
    }

    public final enfc c(emxg emxgVar) {
        return d(enjk.d(h(), emxgVar));
    }

    public final enfc f(emwl emwlVar) {
        return d(enjk.f(h(), emwlVar));
    }

    public final engw g() {
        return engw.j(h());
    }

    public final Iterable h() {
        return (Iterable) this.a.e(this);
    }

    public final String toString() {
        return enjk.n(h());
    }

    public enfc(Iterable iterable) {
        this.a = emxc.j(iterable);
    }
}
