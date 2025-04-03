package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvzi {
    public final dvwi a;
    public final dvyk b;
    public final dvwa d;
    public final dvyz e = new dvzh(this);
    public int f = 0;
    public Runnable g = null;
    public final dvzl c = new dvzl();

    public dvzi(dvwi dvwiVar, dvyk dvykVar, dvwa dvwaVar) {
        this.a = dvwiVar;
        this.b = dvykVar;
        this.d = dvwaVar;
    }

    public final void a() {
        this.g = null;
        dvzl dvzlVar = this.c;
        if (dvzlVar.d.isEmpty() && dvzlVar.a.isEmpty() && dvzlVar.b.isEmpty() && dvzlVar.f.isEmpty()) {
            return;
        }
        ekzz f = eleg.f("GIL:AutoProcessBatch");
        try {
            this.a.c(new dvwh() { // from class: dvze
                /* JADX WARN: Multi-variable type inference failed */
                @Override // defpackage.dvwh
                public final List a() {
                    dvzi dvziVar = dvzi.this;
                    dvzl dvzlVar2 = dvziVar.c;
                    char c = 2;
                    int i = 1;
                    if (Log.isLoggable("GIL", 2)) {
                        Log.v("GIL", String.format(Locale.US, "AutoGIL Batch: inserts=%d; visibility=%d; removes=%d", Integer.valueOf(dvzlVar2.a.size()), Integer.valueOf(dvzlVar2.b.size()), Integer.valueOf(dvzlVar2.f.size())));
                    }
                    ekzz f2 = eleg.f("GIL:CreateInsertGrafts");
                    try {
                        for (dvxe dvxeVar : dvzlVar2.a) {
                            if (dvxeVar.g == -1) {
                                dvzlVar2.b(dvxeVar);
                            }
                        }
                        dvzlVar2.a.clear();
                        Iterator it = dvzlVar2.e.iterator();
                        while (it.hasNext()) {
                            ((dvxe) it.next()).g = -1;
                        }
                        dvzlVar2.e.clear();
                        f2.close();
                        ekzz f3 = eleg.f("GIL:CreateVisibilityGrafts");
                        try {
                            for (dvxe dvxeVar2 : dvzlVar2.b) {
                                emxf.p(dvxeVar2.f(), "Not impressed: %s", dvxeVar2);
                                int h = dvxeVar2.h();
                                dvxq dvxqVar = dvxeVar2.c;
                                int i2 = ((dvxr) dvxqVar.instance).e;
                                int b = epnz.b(i2);
                                if (b == 0) {
                                    b = 1;
                                }
                                if (b != h) {
                                    int b2 = epnz.b(i2);
                                    if (b2 == 0) {
                                        b2 = 1;
                                    }
                                    int i3 = b2 - 1;
                                    if (i3 == 2 || i3 == 4) {
                                        if (h == 2) {
                                            continue;
                                        } else {
                                            emxf.m(h != 1, "Repressed VE was visible.");
                                        }
                                    }
                                    dvxqVar.copyOnWrite();
                                    dvxr dvxrVar = (dvxr) dvxqVar.instance;
                                    int i4 = h - 1;
                                    if (h == 0) {
                                        throw null;
                                    }
                                    dvxrVar.e = i4;
                                    dvxrVar.b |= 2;
                                    ArrayList arrayList = new ArrayList();
                                    dvzd.a(dvxeVar2, arrayList);
                                    dvzk a = dvzlVar2.a(arrayList, 0);
                                    int b3 = epnz.b(((dvxr) arrayList.get(0)).e);
                                    if (b3 != 0 && b3 != 1) {
                                        a.b(new dvzy(3, arrayList, -1));
                                    }
                                    a.b(new dvzy(2, arrayList, a.e.size()));
                                    dvzj dvzjVar = new dvzj(a);
                                    erhk erhkVar = ((dvxr) dvxeVar2.c.instance).d;
                                    if (erhkVar == null) {
                                        erhkVar = erhk.a;
                                    }
                                    erhm erhmVar = erhkVar.e;
                                    if (erhmVar == null) {
                                        erhmVar = erhm.a;
                                    }
                                    if ((erhmVar.b & 2) != 0) {
                                        dvzjVar.b(dvxeVar2);
                                    }
                                }
                            }
                            dvzlVar2.b.clear();
                            f3.close();
                            if (!dvzlVar2.f.isEmpty()) {
                                f2 = eleg.f("GIL:CreateRemoveGrafts");
                                try {
                                    for (Map.Entry entry : dvzlVar2.f.entrySet()) {
                                        Collection<dvxr> collection = (Collection) entry.getValue();
                                        for (dvxr dvxrVar2 : collection) {
                                            dvxe dvxeVar3 = (dvxe) entry.getKey();
                                            int b4 = epnz.b(dvxrVar2.e);
                                            if (b4 != 0 && b4 != i) {
                                            }
                                            ArrayList arrayList2 = new ArrayList();
                                            dvxq dvxqVar2 = (dvxq) dvxrVar2.toBuilder();
                                            dvxqVar2.copyOnWrite();
                                            char c2 = c;
                                            dvxr dvxrVar3 = (dvxr) dvxqVar2.instance;
                                            dvxrVar3.e = i;
                                            dvxrVar3.b |= 2;
                                            arrayList2.add((dvxr) dvxqVar2.build());
                                            if (dvxeVar3 != null) {
                                                dvzd.a(dvxeVar3, arrayList2);
                                            }
                                            dvzlVar2.a(arrayList2, 0).b(new dvzy(3, arrayList2, -1));
                                            c = c2;
                                            i = 1;
                                        }
                                        char c3 = c;
                                        collection.clear();
                                        dvzlVar2.g = collection;
                                        c = c3;
                                        i = 1;
                                    }
                                    f2.close();
                                    dvzlVar2.f.clear();
                                } finally {
                                }
                            }
                            dvzl dvzlVar3 = dvziVar.c;
                            boolean z = dvzlVar3.i;
                            ekzz f4 = eleg.f("GIL:LogBatch");
                            try {
                                ArrayList arrayList3 = new ArrayList(dvzlVar3.d.size());
                                for (dvzk dvzkVar : dvzlVar3.d) {
                                    arrayList3.add(new dvzz(dvzkVar.a, dvzkVar.b, dvzkVar.c, dvzkVar.d, dvzkVar.e, dvzkVar.f));
                                }
                                dvzlVar3.d.clear();
                                dvzlVar3.c.clear();
                                f4.close();
                                return arrayList3;
                            } finally {
                            }
                        } finally {
                            try {
                                f3.close();
                                throw th;
                            } catch (Throwable th) {
                                th.addSuppressed(th);
                            }
                        }
                    } finally {
                        try {
                            f2.close();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                }
            });
            f.close();
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void b() {
        if (this.g != null) {
            return;
        }
        Runnable a = this.b.a(new Runnable() { // from class: dvzf
            @Override // java.lang.Runnable
            public final void run() {
                dvzi.this.a();
            }
        });
        this.g = a;
        int i = this.f;
        if (i > 0) {
            efbd.d(a, i);
        } else {
            efbd.e(a);
        }
    }
}
