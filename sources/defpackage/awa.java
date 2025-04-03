package defpackage;

import android.media.ImageReader;
import android.util.LongSparseArray;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class awa implements bev, auf {
    public final Object a;
    public final bbt b;
    public int c;
    public boolean d;
    beu e;
    public final LongSparseArray f;
    private final beu g;
    private final bev h;
    private Executor i;
    private final LongSparseArray j;
    private int k;
    private final List l;
    private final List m;

    public awa(int i, int i2, int i3, int i4) {
        asr asrVar = new asr(ImageReader.newInstance(i, i2, i3, i4));
        this.a = new Object();
        this.b = new avz(this);
        this.c = 0;
        this.g = new beu() { // from class: avx
            @Override // defpackage.beu
            public final void a(bev bevVar) {
                awa awaVar = awa.this;
                synchronized (awaVar.a) {
                    awaVar.c++;
                }
                awaVar.l(bevVar);
            }
        };
        this.d = false;
        this.f = new LongSparseArray();
        this.j = new LongSparseArray();
        this.m = new ArrayList();
        this.h = asrVar;
        this.k = 0;
        this.l = new ArrayList(c());
    }

    @Override // defpackage.bev
    public final int a() {
        int a;
        synchronized (this.a) {
            a = this.h.a();
        }
        return a;
    }

    @Override // defpackage.bev
    public final int b() {
        int b;
        synchronized (this.a) {
            b = this.h.b();
        }
        return b;
    }

    @Override // defpackage.bev
    public final int c() {
        int c;
        synchronized (this.a) {
            c = this.h.c();
        }
        return c;
    }

    @Override // defpackage.bev
    public final int d() {
        int d;
        synchronized (this.a) {
            d = this.h.d();
        }
        return d;
    }

    @Override // defpackage.bev
    public final Surface e() {
        Surface e;
        synchronized (this.a) {
            e = this.h.e();
        }
        return e;
    }

    @Override // defpackage.bev
    public final avr f() {
        synchronized (this.a) {
            if (this.l.isEmpty()) {
                return null;
            }
            if (this.k >= this.l.size()) {
                throw new IllegalStateException("Maximum image number reached.");
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < this.l.size() - 1; i++) {
                if (!this.m.contains(this.l.get(i))) {
                    arrayList.add((avr) this.l.get(i));
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((avr) it.next()).close();
            }
            int size = this.l.size();
            List list = this.l;
            this.k = size;
            avr avrVar = (avr) list.get(size - 1);
            this.m.add(avrVar);
            return avrVar;
        }
    }

    @Override // defpackage.bev
    public final avr g() {
        synchronized (this.a) {
            if (this.l.isEmpty()) {
                return null;
            }
            if (this.k >= this.l.size()) {
                throw new IllegalStateException("Maximum image number reached.");
            }
            List list = this.l;
            int i = this.k;
            this.k = i + 1;
            avr avrVar = (avr) list.get(i);
            this.m.add(avrVar);
            return avrVar;
        }
    }

    @Override // defpackage.bev
    public final void h() {
        synchronized (this.a) {
            this.h.h();
            this.e = null;
            this.i = null;
            this.c = 0;
        }
    }

    @Override // defpackage.bev
    public final void i() {
        synchronized (this.a) {
            if (this.d) {
                return;
            }
            Iterator it = new ArrayList(this.l).iterator();
            while (it.hasNext()) {
                ((avr) it.next()).close();
            }
            this.l.clear();
            this.h.i();
            this.d = true;
        }
    }

    @Override // defpackage.bev
    public final void j(beu beuVar, Executor executor) {
        synchronized (this.a) {
            this.e = beuVar;
            ksw.h(executor);
            this.i = executor;
            this.h.j(this.g, executor);
        }
    }

    @Override // defpackage.auf
    public final void k(avr avrVar) {
        synchronized (this.a) {
            synchronized (this.a) {
                int indexOf = this.l.indexOf(avrVar);
                if (indexOf >= 0) {
                    this.l.remove(indexOf);
                    int i = this.k;
                    if (indexOf <= i) {
                        this.k = i - 1;
                    }
                }
                this.m.remove(avrVar);
                if (this.c > 0) {
                    l(this.h);
                }
            }
        }
    }

    final void l(bev bevVar) {
        avr avrVar;
        synchronized (this.a) {
            if (this.d) {
                return;
            }
            int size = this.j.size() + this.l.size();
            if (size >= bevVar.c()) {
                avw.a("MetadataImageReader", "Skip to acquire the next image because the acquired image count has reached the max images count.");
                return;
            }
            do {
                try {
                    avrVar = bevVar.g();
                    if (avrVar != null) {
                        this.c--;
                        this.j.put(avrVar.e().a(), avrVar);
                        m();
                        size++;
                    }
                } catch (IllegalStateException e) {
                    avw.b("MetadataImageReader", "Failed to acquire next image.", e);
                    avrVar = null;
                }
                if (avrVar == null || this.c <= 0) {
                    break;
                }
            } while (size < bevVar.c());
        }
    }

    public final void m() {
        Executor executor;
        synchronized (this.a) {
            int size = this.f.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                avm avmVar = (avm) this.f.valueAt(size);
                long a = avmVar.a();
                avr avrVar = (avr) this.j.get(a);
                if (avrVar != null) {
                    this.j.remove(a);
                    this.f.removeAt(size);
                    final beu beuVar = null;
                    awu awuVar = new awu(avrVar, null, avmVar);
                    synchronized (this.a) {
                        if (this.l.size() < c()) {
                            awuVar.g(this);
                            this.l.add(awuVar);
                            beuVar = this.e;
                            executor = this.i;
                        } else {
                            avw.a("TAG", "Maximum image number reached.");
                            awuVar.close();
                            executor = null;
                        }
                    }
                    if (beuVar != null) {
                        if (executor != null) {
                            executor.execute(new Runnable() { // from class: avy
                                @Override // java.lang.Runnable
                                public final void run() {
                                    beuVar.a(awa.this);
                                }
                            });
                        } else {
                            beuVar.a(this);
                        }
                    }
                }
            }
            synchronized (this.a) {
                if (this.j.size() != 0 && this.f.size() != 0) {
                    long keyAt = this.j.keyAt(0);
                    Long valueOf = Long.valueOf(keyAt);
                    long keyAt2 = this.f.keyAt(0);
                    Long valueOf2 = Long.valueOf(keyAt2);
                    ksw.a(!valueOf2.equals(valueOf));
                    valueOf2.getClass();
                    valueOf.getClass();
                    if (keyAt2 <= keyAt) {
                        int size2 = this.f.size();
                        while (true) {
                            size2--;
                            if (size2 < 0) {
                                break;
                            }
                            long keyAt3 = this.f.keyAt(size2);
                            valueOf.getClass();
                            if (keyAt3 < keyAt) {
                                this.f.removeAt(size2);
                            }
                        }
                    } else {
                        int size3 = this.j.size();
                        while (true) {
                            size3--;
                            if (size3 < 0) {
                                break;
                            }
                            long keyAt4 = this.j.keyAt(size3);
                            valueOf2.getClass();
                            if (keyAt4 < keyAt2) {
                                ((avr) this.j.valueAt(size3)).close();
                                this.j.removeAt(size3);
                            }
                        }
                    }
                }
            }
        }
    }
}
