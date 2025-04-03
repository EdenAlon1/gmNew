package defpackage;

import android.os.StrictMode;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvwi {
    public final errl a;
    public final dvwe b;
    private final ffbr c;
    private final Set d;
    private final Executor e;
    private volatile enhk f;

    public dvwi(errl errlVar, ffbr ffbrVar, Set set, dvwe dvweVar) {
        this.a = errlVar;
        this.c = ffbrVar;
        this.d = set;
        this.b = dvweVar;
        this.e = new ersb(errlVar);
        emxf.m(!set.isEmpty(), "No logging result handlers provided.");
    }

    public static ListenableFuture a(dvwl dvwlVar, dvwj dvwjVar) {
        try {
            return dvwjVar.a(dvwlVar);
        } catch (Throwable th) {
            return erqt.h(th);
        }
    }

    private final void d(ListenableFuture listenableFuture) {
        enqu listIterator = ((enpx) this.d).listIterator();
        while (listIterator.hasNext()) {
            erqt.r(listenableFuture, new dvwm(), erpp.a);
        }
    }

    public final List b(Class cls) {
        enhk enhkVar = this.f;
        if (enhkVar == null) {
            synchronized (this) {
                enhkVar = this.f;
                if (enhkVar == null) {
                    HashMap hashMap = new HashMap();
                    ArrayList arrayList = new ArrayList();
                    for (dvwj dvwjVar : (Set) this.c.b()) {
                        if (dvwjVar.b().isEmpty()) {
                            arrayList.add(dvwjVar);
                        } else {
                            enqu listIterator = ((enpx) dvwjVar.b()).listIterator();
                            while (listIterator.hasNext()) {
                                Class cls2 = (Class) listIterator.next();
                                List list = (List) hashMap.get(cls2);
                                if (list == null) {
                                    list = new ArrayList();
                                    hashMap.put(cls2, list);
                                }
                                list.add(dvwjVar);
                            }
                        }
                    }
                    hashMap.put(dvwk.class, arrayList);
                    enhkVar = enhk.j(hashMap);
                    this.f = enhkVar;
                }
            }
        }
        int i = engw.d;
        return (List) enhkVar.getOrDefault(cls, enou.a);
    }

    public final void c(dvwh dvwhVar) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).detectAll().build());
        try {
            try {
                final List a = dvwhVar.a();
                if (a != null) {
                    if (!a.isEmpty()) {
                        d(erny.g(erqt.m(eldl.m(new Callable() { // from class: dvwf
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                List<dvwk> list = a;
                                ArrayList arrayList = new ArrayList(list.size());
                                for (dvwk dvwkVar : list) {
                                    dvwi dvwiVar = dvwi.this;
                                    arrayList.add(new dvwl(dvwkVar, dvwiVar.b.a(dvwkVar)));
                                }
                                return arrayList;
                            }
                        }), this.e), eldl.d(new eroh() { // from class: dvwg
                            @Override // defpackage.eroh
                            public final ListenableFuture a(Object obj) {
                                List list = (List) obj;
                                int size = list.size();
                                ArrayList arrayList = new ArrayList(size + size);
                                Iterator it = list.iterator();
                                while (true) {
                                    dvwi dvwiVar = dvwi.this;
                                    if (!it.hasNext()) {
                                        return erqt.c(arrayList).a(new eroi(null), dvwiVar.a);
                                    }
                                    dvwl dvwlVar = (dvwl) it.next();
                                    try {
                                        List b = dvwiVar.b(dvwlVar.a.getClass());
                                        List b2 = dvwiVar.b(dvwk.class);
                                        ArrayList arrayList2 = new ArrayList(b.size() + b2.size());
                                        Iterator it2 = b.iterator();
                                        while (it2.hasNext()) {
                                            arrayList2.add(dvwi.a(dvwlVar, (dvwj) it2.next()));
                                        }
                                        Iterator it3 = b2.iterator();
                                        while (it3.hasNext()) {
                                            arrayList2.add(dvwi.a(dvwlVar, (dvwj) it3.next()));
                                        }
                                        arrayList.add(erny.f(erqt.e(arrayList2), new emwn(null), erpp.a));
                                        arrayList.add(dvwlVar.b);
                                    } catch (Throwable th) {
                                        arrayList.add(erqt.h(th));
                                    }
                                }
                            }
                        }), this.e));
                    }
                }
            } catch (Throwable th) {
                ListenableFuture h = erqt.h(th);
                erqt.h(th);
                d(h);
            }
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }
}
