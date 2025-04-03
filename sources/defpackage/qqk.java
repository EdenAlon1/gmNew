package defpackage;

import com.bumptech.glide.load.ImageHeaderParser;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qqk {
    public final ras a;
    public final rhp b;
    public final rhu c;
    public final rhw d;
    public final rgg e;
    public final rhs f = new rhs();
    public final rhr g = new rhr();
    public final kst h;
    private final qui i;
    private final rhq j;

    public qqk() {
        rkm rkmVar = new rkm(new ksv(20), new rkj(), new rkk());
        this.h = rkmVar;
        this.a = new ras(rkmVar);
        this.b = new rhp();
        this.c = new rhu();
        this.d = new rhw();
        this.i = new qui();
        this.e = new rgg();
        this.j = new rhq();
        List asList = Arrays.asList("Animation", "Bitmap", "BitmapDrawable");
        ArrayList arrayList = new ArrayList(asList.size());
        arrayList.add("legacy_prepend_all");
        Iterator it = asList.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        arrayList.add("legacy_append");
        this.c.d(arrayList);
    }

    public final quf a(Object obj) {
        return this.i.a(obj);
    }

    public final List b() {
        List a = this.j.a();
        if (a.isEmpty()) {
            throw new qqg();
        }
        return a;
    }

    public final List c(Object obj) {
        List b = this.a.b(obj.getClass());
        if (b.isEmpty()) {
            throw new qqh(obj);
        }
        int size = b.size();
        List list = Collections.EMPTY_LIST;
        boolean z = true;
        for (int i = 0; i < size; i++) {
            rao raoVar = (rao) b.get(i);
            if (raoVar.b(obj)) {
                if (z) {
                    list = new ArrayList(size - i);
                }
                list.add(raoVar);
                z = false;
            }
        }
        if (list.isEmpty()) {
            throw new qqh(obj, b);
        }
        return list;
    }

    public final void d(Class cls, qta qtaVar) {
        this.b.b(cls, qtaVar);
    }

    public final void e(Class cls, qtx qtxVar) {
        this.d.b(cls, qtxVar);
    }

    public final void f(Class cls, Class cls2, qtw qtwVar) {
        h("legacy_append", cls, cls2, qtwVar);
    }

    public final void g(Class cls, Class cls2, rap rapVar) {
        this.a.c(cls, cls2, rapVar);
    }

    public final void h(String str, Class cls, Class cls2, qtw qtwVar) {
        this.c.c(str, qtwVar, cls, cls2);
    }

    public final void i(Class cls, Class cls2, qtw qtwVar) {
        this.c.e(qtwVar, cls, cls2);
    }

    public final void j(Class cls, Class cls2, rap rapVar) {
        this.a.d(cls, cls2, rapVar);
    }

    public final void k(ImageHeaderParser imageHeaderParser) {
        this.j.b(imageHeaderParser);
    }

    public final void l(que queVar) {
        this.i.b(queVar);
    }

    public final void m(Class cls, Class cls2, rge rgeVar) {
        this.e.c(cls, cls2, rgeVar);
    }
}
