package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ojv {
    private final olh a;
    public final ffhd b;
    public olm c;
    public oik d;
    public final ogg e;
    public final CopyOnWriteArrayList f;
    public volatile boolean g;
    public volatile int h;
    public final fgcm i;
    public final fgdj j;
    public final fgcl k;
    public ogq l;

    public ojv(ffhd ffhdVar, ojf ojfVar) {
        oik oikVar;
        ogl a;
        ffhdVar.getClass();
        this.b = ffhdVar;
        this.c = new ojq();
        oik oikVar2 = oik.a;
        ogl a2 = ojfVar != null ? ojfVar.a() : null;
        if (a2 != null) {
            oikVar = new oik(a2);
        } else {
            oikVar = oik.a;
            oikVar.getClass();
        }
        this.d = oikVar;
        ogg oggVar = new ogg();
        if (ojfVar != null && (a = ojfVar.a()) != null) {
            oggVar.c(a.f);
        }
        this.e = oggVar;
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.f = copyOnWriteArrayList;
        this.a = new olh(null);
        this.i = fgdm.a(false);
        this.j = oggVar.c;
        this.k = fgcu.d(0, 64, 2);
        copyOnWriteArrayList.add(new ojp(this));
    }

    public abstract Object a(ojo ojoVar, ffgu ffguVar);

    public final off b() {
        oik oikVar = this.d;
        int i = oikVar.d;
        int i2 = oikVar.e;
        List list = oikVar.b;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ffdx.w(arrayList, ((oll) it.next()).c);
        }
        return new off(i, i2, arrayList);
    }

    public final Object c(ojf ojfVar, ffgu ffguVar) {
        Object a = this.a.a(new ojt(this, ojfVar, null), ffguVar);
        return a == ffhh.a ? a : ffcu.a;
    }

    public final Object d(int i) {
        fgcm fgcmVar;
        Object c;
        Object c2;
        do {
            fgcmVar = this.i;
            c = fgcmVar.c();
            ((Boolean) c).booleanValue();
        } while (!fgcmVar.g(c, true));
        this.g = true;
        this.h = i;
        if (oka.a(2)) {
            oka.b(2, "Accessing item index[" + i + ']');
        }
        ogq ogqVar = this.l;
        if (ogqVar != null) {
            ogqVar.a(this.d.h(i));
        }
        oik oikVar = this.d;
        if (i < 0 || i >= oikVar.f()) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size: " + oikVar.f());
        }
        int i2 = i - oikVar.d;
        Object obj = null;
        if (i2 >= 0 && i2 < oikVar.c) {
            obj = oikVar.i(i2);
        }
        fgcm fgcmVar2 = this.i;
        do {
            c2 = fgcmVar2.c();
            ((Boolean) c2).booleanValue();
        } while (!fgcmVar2.g(c2, false));
        return obj;
    }

    public final void e() {
        if (oka.a(3)) {
            oka.b(3, "Refresh signal received");
        }
        this.c.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(java.util.List r6, int r7, int r8, boolean r9, defpackage.ofy r10, defpackage.ogq r11, defpackage.ffgu r12) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ojv.g(java.util.List, int, int, boolean, ofy, ogq, ffgu):java.lang.Object");
    }
}
