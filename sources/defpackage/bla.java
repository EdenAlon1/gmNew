package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bla implements ata {
    public final bbb a;
    public final bky b;
    public axy d;
    public final bcf f;
    private final bhl h;
    private axv l;
    private bpg m;
    private final atz n;
    private final atz o;
    private final aju q;
    public final List c = new ArrayList();
    private final List i = new ArrayList();
    public List e = Collections.EMPTY_LIST;
    public final Object g = new Object();
    private boolean j = true;
    private bdp k = null;
    private final blt p = new blt();

    public bla(bct bctVar, bba bbaVar, atz atzVar, atz atzVar2, aju ajuVar, bhl bhlVar) {
        this.f = bbaVar.b;
        this.a = new bbb(bctVar, bbaVar);
        this.n = atzVar;
        this.o = atzVar2;
        this.q = ajuVar;
        this.h = bhlVar;
        this.b = a(bbaVar, null);
    }

    public static bky a(bba bbaVar, bba bbaVar2) {
        return new bks(bbaVar.k() + "", ((bch) bbaVar.b).f);
    }

    private static List j(List list, Collection collection) {
        ArrayList arrayList = new ArrayList(list);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            axv axvVar = (axv) it.next();
            axvVar.O(null);
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                atd atdVar = (atd) it2.next();
                if (axvVar.S(atdVar.a)) {
                    ksw.d(axvVar.o == null, axvVar + " already has effect" + axvVar.o);
                    axvVar.O(atdVar);
                    arrayList.remove(atdVar);
                }
            }
        }
        return arrayList;
    }

    private final boolean k() {
        boolean z;
        synchronized (this.g) {
            z = this.f.b() != null;
        }
        return z;
    }

    private static boolean l(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            axv axvVar = (axv) it.next();
            if (axvVar instanceof avk) {
                bhh bhhVar = axvVar.k;
                if (bhhVar.s(beo.e)) {
                    Integer num = (Integer) bhhVar.l(beo.e);
                    ksw.h(num);
                    if (num.intValue() == 2) {
                        return true;
                    }
                } else {
                    continue;
                }
            }
        }
        return false;
    }

    private static boolean m(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            axv axvVar = (axv) it.next();
            if (axvVar != null) {
                if (!axvVar.k.s(bhh.x)) {
                    Objects.toString(axvVar);
                    Log.e("CameraUseCaseAdapter", axvVar.toString().concat(" UseCase does not have capture type."));
                } else if (axvVar.k.k() == bhj.VIDEO_CAPTURE) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.ata
    public final atc b() {
        throw null;
    }

    @Override // defpackage.ata
    public final ati c() {
        throw null;
    }

    public final List d() {
        ArrayList arrayList;
        synchronized (this.g) {
            arrayList = new ArrayList(this.c);
        }
        return arrayList;
    }

    public final void e() {
        synchronized (this.g) {
            if (!this.j) {
                if (!this.i.isEmpty()) {
                    this.a.B(this.f);
                }
                this.a.o(this.i);
                synchronized (this.g) {
                    bdp bdpVar = this.k;
                    if (bdpVar != null) {
                        this.a.b.p(bdpVar);
                    }
                }
                Iterator it = this.i.iterator();
                while (it.hasNext()) {
                    ((axv) it.next()).M();
                }
                this.j = true;
            }
        }
    }

    public final void f() {
        synchronized (this.g) {
            if (this.j) {
                this.a.s(new ArrayList(this.i));
                synchronized (this.g) {
                    bay bayVar = this.a.b;
                    this.k = bayVar.g();
                    bayVar.s();
                }
                this.j = false;
            }
        }
    }

    public final void g(Collection collection) {
        synchronized (this.g) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(this.c);
            linkedHashSet.removeAll(collection);
            i(linkedHashSet, false, false);
        }
    }

    public final void h(boolean z) {
        this.a.A(z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0149, code lost:
    
        if (r7 != false) goto L99;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v13, types: [bdp, bfz] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(java.util.Collection r32, boolean r33, boolean r34) {
        /*
            Method dump skipped, instructions count: 2300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bla.i(java.util.Collection, boolean, boolean):void");
    }
}
