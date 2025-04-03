package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qpz extends ContextWrapper {
    static final qqt a = new qpr();
    public final qxd b;
    public final ris c;
    public final List d;
    public final Map e;
    public final qwe f;
    public final qqb g;
    public final int h;
    private final rjz i;
    private final qps j;
    private rig k;

    public qpz(Context context, qxd qxdVar, rjz rjzVar, ris risVar, qps qpsVar, Map map, List list, qwe qweVar, qqb qqbVar) {
        super(context.getApplicationContext());
        this.b = qxdVar;
        this.c = risVar;
        this.j = qpsVar;
        this.d = list;
        this.e = map;
        this.f = qweVar;
        this.g = qqbVar;
        this.h = 4;
        this.i = new rjy(rjzVar);
    }

    public final qqk a() {
        return (qqk) this.i.a();
    }

    public final synchronized rig b() {
        if (this.k == null) {
            rig a2 = this.j.a();
            a2.aj();
            this.k = a2;
        }
        return this.k;
    }
}
