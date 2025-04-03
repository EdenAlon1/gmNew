package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.net.InetAddress;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eefd implements eeew {
    public static final /* synthetic */ int a = 0;
    private static final engw b;
    private static final Executor c;
    private final engw d;

    static {
        int i = engw.d;
        b = enou.a;
        c = erpp.a;
    }

    public eefd(eeew eeewVar, List list) {
        int i = engw.d;
        engr engrVar = new engr();
        engrVar.h(eeewVar);
        engrVar.j(list);
        this.d = engrVar.g();
    }

    @Override // defpackage.eeew
    public final ListenableFuture a(String str) {
        return d(str, InetAddress.class, 0);
    }

    @Override // defpackage.eeew
    public final ListenableFuture b(String str) {
        return d(str, fiyj.class, 0);
    }

    @Override // defpackage.eeew
    public final ListenableFuture c(String str) {
        return d(str, fizp.class, 0);
    }

    public final ListenableFuture d(final String str, final Class cls, final int i) {
        ListenableFuture f;
        if (i >= ((enou) this.d).c) {
            return erqt.i(b);
        }
        if (i > 0) {
            dkty.q("making fallback DNS query for target %s", str);
        }
        if (cls.equals(fiyj.class)) {
            f = erny.f(((eeew) this.d.get(i)).b(str), new emwl() { // from class: eeez
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    List list = (List) obj;
                    int i2 = eefd.a;
                    return list;
                }
            }, c);
        } else if (cls.equals(fizp.class)) {
            f = erny.f(((eeew) this.d.get(i)).c(str), new emwl() { // from class: eefa
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    List list = (List) obj;
                    int i2 = eefd.a;
                    return list;
                }
            }, c);
        } else {
            if (!cls.equals(InetAddress.class)) {
                throw new IllegalArgumentException("unexpected record classs: ".concat(String.valueOf(cls.getName())));
            }
            f = erny.f(((eeew) this.d.get(i)).a(str), new emwl() { // from class: eefb
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    List list = (List) obj;
                    int i2 = eefd.a;
                    return list;
                }
            }, c);
        }
        final ListenableFuture listenableFuture = f;
        return erny.g(erqc.o(listenableFuture), new eroh() { // from class: eefc
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                if (!((List) obj).isEmpty()) {
                    return listenableFuture;
                }
                int i2 = i;
                Class cls2 = cls;
                return eefd.this.d(str, cls2, i2 + 1);
            }
        }, c);
    }
}
