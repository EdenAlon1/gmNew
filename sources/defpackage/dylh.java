package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dylh {
    private final errl a = dyia.b().a;

    public static final boolean a(int i) {
        switch (i) {
            case 1:
                return fdpk.a.get().g();
            case 2:
            case 3:
            case 4:
            case 5:
            case 8:
            case 9:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 17:
            case 18:
            case 19:
            case 23:
            case 24:
                return true;
            case 6:
            case 10:
            case 16:
            case 20:
            case 21:
            case 22:
            default:
                return false;
            case 7:
                return fdql.k();
            case 25:
                return fdql.a.get().p();
        }
    }

    public final ListenableFuture b(final int i) {
        return i != 10 ? erqt.m(new Callable() { // from class: dylg
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Boolean.valueOf(dylh.a(i));
            }
        }, this.a) : erqt.i(true);
    }
}
