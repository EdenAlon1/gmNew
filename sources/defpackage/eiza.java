package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eiza {
    private final ffbr a;
    private final Executor b;

    public eiza(ffbr ffbrVar, Executor executor) {
        this.b = executor;
        this.a = ffbrVar;
    }

    public final enhk a() {
        Set<eiym> set = (Set) this.a.b();
        enhd enhdVar = new enhd();
        for (eiym eiymVar : set) {
            emxf.b(!eiymVar.b().isEmpty(), "AccountProvider's account type cannot be an empty string.");
            enhdVar.k(eiymVar.b(), eiymVar.a());
        }
        return enhdVar.c();
    }

    public final ListenableFuture b(final List list) {
        return erqt.c(list).a(eldl.m(new Callable() { // from class: eiyy
            @Override // java.util.concurrent.Callable
            public final Object call() {
                int i = engw.d;
                engr engrVar = new engr();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    engrVar.j((Iterable) erqt.q((ListenableFuture) it.next()));
                }
                return engrVar.g();
            }
        }), this.b);
    }

    public final ListenableFuture c(final String str, final eiyl eiylVar) {
        return erny.f(eiylVar.a(), eldl.a(new emwl() { // from class: eiyz
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                engw engwVar = (engw) obj;
                int size = engwVar.size();
                for (int i = 0; i < size; i++) {
                    eiyl eiylVar2 = eiylVar;
                    String str2 = str;
                    eixz eixzVar = (eixz) engwVar.get(i);
                    emxf.s(str2.equals(eixzVar.k), "AccountProvider %s provides account(s) of different type from the declared one. Declared type: %s provided type: %s", eiylVar2, str2, eixzVar.k);
                }
                return engwVar;
            }
        }), this.b);
    }
}
