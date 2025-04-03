package defpackage;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mue extends msn {
    private static final lqw d;
    private final mtn[] e;
    private final List f;
    private final lru[] g;
    private final ArrayList h;
    private int i = -1;
    private long[][] j;
    private muc k;

    static {
        lql lqlVar = new lql();
        lqlVar.b("MergingMediaSource");
        d = lqlVar.a();
    }

    public mue(mtn... mtnVarArr) {
        this.e = mtnVarArr;
        this.h = new ArrayList(Arrays.asList(mtnVarArr));
        this.f = new ArrayList(mtnVarArr.length);
        int i = 0;
        while (true) {
            int length = mtnVarArr.length;
            if (i >= length) {
                this.g = new lru[length];
                this.j = new long[0][];
                new HashMap();
                endr.c(8, "expectedKeys");
                new enne().b().a();
                return;
            }
            this.f.add(new ArrayList());
            i++;
        }
    }

    @Override // defpackage.mtn
    public final lqw F() {
        mtn[] mtnVarArr = this.e;
        return mtnVarArr.length > 0 ? mtnVarArr[0].F() : d;
    }

    @Override // defpackage.msn, defpackage.msa
    protected final void k(lxp lxpVar) {
        super.k(lxpVar);
        int i = 0;
        while (true) {
            mtn[] mtnVarArr = this.e;
            if (i >= mtnVarArr.length) {
                return;
            }
            z(Integer.valueOf(i), mtnVarArr[i]);
            i++;
        }
    }

    @Override // defpackage.msn, defpackage.msa
    protected final void n() {
        super.n();
        Arrays.fill(this.g, (Object) null);
        this.i = -1;
        this.k = null;
        this.h.clear();
        Collections.addAll(this.h, this.e);
    }

    @Override // defpackage.msa, defpackage.mtn
    public final void q(lqw lqwVar) {
        this.e[0].q(lqwVar);
    }

    @Override // defpackage.msn, defpackage.mtn
    public final void t() {
        muc mucVar = this.k;
        if (mucVar != null) {
            throw mucVar;
        }
        super.t();
    }

    @Override // defpackage.mtn
    public final void v(mtj mtjVar) {
        mub mubVar = (mub) mtjVar;
        for (int i = 0; i < this.e.length; i++) {
            List list = (List) this.f.get(i);
            int i2 = 0;
            while (true) {
                if (i2 >= list.size()) {
                    break;
                }
                if (((mud) list.get(i2)).b.equals(mtjVar)) {
                    list.remove(i2);
                    break;
                }
                i2++;
            }
            mtn mtnVar = this.e[i];
            mtj mtjVar2 = mubVar.a[i];
            if (mtjVar2 instanceof mvl) {
                mtjVar2 = ((mvl) mtjVar2).a;
            }
            mtnVar.v(mtjVar2);
        }
    }

    @Override // defpackage.mtn
    public final mtj w(mtl mtlVar, mxt mxtVar, long j) {
        lru[] lruVarArr = this.g;
        int length = this.e.length;
        mtj[] mtjVarArr = new mtj[length];
        int a = lruVarArr[0].a(mtlVar.a);
        for (int i = 0; i < length; i++) {
            mtl a2 = mtlVar.a(this.g[i].f(a));
            mtjVarArr[i] = this.e[i].w(a2, mxtVar, j - this.j[a][i]);
            ((List) this.f.get(i)).add(new mud(a2, mtjVarArr[i]));
        }
        return new mub(this.j[a], mtjVarArr);
    }

    @Override // defpackage.msn
    protected final /* bridge */ /* synthetic */ mtl x(Object obj, mtl mtlVar) {
        List list = (List) this.f.get(((Integer) obj).intValue());
        for (int i = 0; i < list.size(); i++) {
            if (((mud) list.get(i)).a.equals(mtlVar)) {
                return ((mud) ((List) this.f.get(0)).get(i)).a;
            }
        }
        return null;
    }

    @Override // defpackage.msn
    protected final /* bridge */ /* synthetic */ void y(Object obj, mtn mtnVar, lru lruVar) {
        int i;
        if (this.k != null) {
            return;
        }
        if (this.i == -1) {
            i = lruVar.b();
            this.i = i;
        } else {
            int b = lruVar.b();
            int i2 = this.i;
            if (b != i2) {
                this.k = new muc();
                return;
            }
            i = i2;
        }
        if (this.j.length == 0) {
            this.j = (long[][]) Array.newInstance((Class<?>) Long.TYPE, i, this.g.length);
        }
        this.h.remove(mtnVar);
        this.g[((Integer) obj).intValue()] = lruVar;
        if (this.h.isEmpty()) {
            l(this.g[0]);
        }
    }
}
