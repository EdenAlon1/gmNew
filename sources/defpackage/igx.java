package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class igx {
    private final String a;
    private final float b;
    private final float c;
    private final float d;
    private final float e;
    private final long f;
    private final int g;
    private final boolean h;
    private final ArrayList i;
    private final igw j;
    private boolean k;

    public /* synthetic */ igx(String str, float f, float f2, float f3, float f4, long j, int i, boolean z, int i2) {
        long j2 = (i2 & 32) != 0 ? ibw.h : j;
        int i3 = (i2 & 64) != 0 ? 5 : i;
        str = 1 == (i2 & 1) ? "" : str;
        boolean z2 = (i2 & 128) == 0;
        this.a = str;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = j2;
        this.g = i3;
        this.h = z2 & z;
        ArrayList arrayList = new ArrayList();
        this.i = arrayList;
        igw igwVar = new igw(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, 1023);
        this.j = igwVar;
        arrayList.add(igwVar);
    }

    private final igw f() {
        return (igw) this.i.get(r0.size() - 1);
    }

    private final void g() {
        if (this.k) {
            imn.c("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
        }
    }

    private static final iih h(igw igwVar) {
        return new iih(igwVar.a, igwVar.b, igwVar.c, igwVar.d, igwVar.e, igwVar.f, igwVar.g, igwVar.h, igwVar.i, igwVar.j);
    }

    public final igz a() {
        int i;
        g();
        while (this.i.size() > 1) {
            d();
        }
        String str = this.a;
        float f = this.b;
        float f2 = this.c;
        float f3 = this.d;
        float f4 = this.e;
        igw igwVar = this.j;
        long j = this.f;
        int i2 = this.g;
        boolean z = this.h;
        iih h = h(igwVar);
        synchronized (igz.c) {
            i = igz.b;
            igz.b = i + 1;
        }
        igz igzVar = new igz(str, f, f2, f3, f4, h, j, i2, z, i);
        this.k = true;
        return igzVar;
    }

    public final void b(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List list) {
        g();
        this.i.add(new igw(str, f, f2, f3, f4, f5, f6, f7, list, 512));
    }

    public final void c(List list, int i, String str, ibq ibqVar, float f, ibq ibqVar2, float f2, float f3, int i2, int i3, float f4, float f5, float f6, float f7) {
        g();
        f().j.add(new iin(str, list, i, ibqVar, f, ibqVar2, f2, f3, i2, i3, f4, f5, f6, f7));
    }

    public final void d() {
        g();
        f().j.add(h((igw) this.i.remove(r0.size() - 1)));
    }
}
