package defpackage;

import android.hardware.camera2.params.InputConfiguration;
import android.util.Range;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bgj extends bgb {
    private final blv j = new blv();
    private boolean k = true;
    private boolean l = false;
    public final List i = new ArrayList();

    public final bgk a() {
        if (!this.k) {
            throw new IllegalArgumentException("Unsupported session configuration combination");
        }
        ArrayList arrayList = new ArrayList(this.a);
        if (this.j.a) {
            Collections.sort(arrayList, new Comparator() { // from class: blu
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return blv.a(((bgh) obj).c()) - blv.a(((bgh) obj2).c());
                }
            });
        }
        return new bgk(arrayList, new ArrayList(this.c), new ArrayList(this.d), new ArrayList(this.e), this.b.b(), !this.i.isEmpty() ? new bge() { // from class: bgi
            @Override // defpackage.bge
            public final void a(bgk bgkVar) {
                Iterator it = bgj.this.i.iterator();
                while (it.hasNext()) {
                    ((bge) it.next()).a(bgkVar);
                }
            }
        } : null, this.g, this.h);
    }

    public final void b(bgk bgkVar) {
        bdk bdkVar = bgkVar.g;
        int i = bdkVar.f;
        if (i != -1) {
            this.l = true;
            bdi bdiVar = this.b;
            bdiVar.b = bgk.a(i, bdiVar.b);
        }
        Range d = bdkVar.d();
        if (!d.equals(bgr.g)) {
            if (this.b.a().equals(bgr.g)) {
                this.b.j(d);
            } else if (!this.b.a().equals(d)) {
                this.k = false;
                avw.a("ValidatingBuilder", "Different ExpectedFrameRateRange values");
            }
        }
        int b = bdkVar.b();
        if (b != 0) {
            this.b.l(b);
        }
        int c = bdkVar.c();
        if (c != 0) {
            this.b.m(c);
        }
        this.b.e.b.putAll(bgkVar.g.j.b);
        this.c.addAll(bgkVar.c);
        this.d.addAll(bgkVar.d);
        this.b.c(bgkVar.e());
        this.e.addAll(bgkVar.e);
        bge bgeVar = bgkVar.f;
        if (bgeVar != null) {
            this.i.add(bgeVar);
        }
        InputConfiguration inputConfiguration = bgkVar.h;
        if (inputConfiguration != null) {
            this.g = inputConfiguration;
        }
        this.a.addAll(bgkVar.a);
        bdi bdiVar2 = this.b;
        bdiVar2.a.addAll(bdkVar.e());
        ArrayList arrayList = new ArrayList();
        for (bgh bghVar : this.a) {
            arrayList.add(bghVar.c());
            Iterator it = bghVar.d().iterator();
            while (it.hasNext()) {
                arrayList.add((bdy) it.next());
            }
        }
        if (!arrayList.containsAll(this.b.a)) {
            avw.a("ValidatingBuilder", "Invalid configuration due to capture request surfaces are not a subset of surfaces");
            this.k = false;
        }
        bgh bghVar2 = bgkVar.b;
        if (bghVar2 != null) {
            bgh bghVar3 = this.h;
            if (bghVar3 == bghVar2 || bghVar3 == null) {
                this.h = bghVar2;
            } else {
                avw.a("ValidatingBuilder", "Invalid configuration due to that two different postview output configs are set");
                this.k = false;
            }
        }
        this.b.f(bdkVar.e);
    }

    public final boolean c() {
        return this.l && this.k;
    }
}
