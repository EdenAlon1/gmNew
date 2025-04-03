package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class osg {
    public final otb a;
    public final our b;
    public final Map c;
    public final ReentrantLock d;
    public final ffix e;
    public final ffix f;
    public final orx g;
    public osi h;
    public final Object i;
    private final Map j;
    private final Map k;
    private final String[] l;

    public osg(otb otbVar, Map map, Map map2, String... strArr) {
        this.a = otbVar;
        this.j = map;
        this.k = map2;
        this.l = strArr;
        our ourVar = new our(otbVar, map, map2, strArr, otbVar.k, new osd(this));
        this.b = ourVar;
        this.c = new LinkedHashMap();
        this.d = new ReentrantLock();
        this.e = new ffix() { // from class: ory
            @Override // defpackage.ffix
            public final Object invoke() {
                return ffcu.a;
            }
        };
        this.f = new ffix() { // from class: orz
            @Override // defpackage.ffix
            public final Object invoke() {
                return ffcu.a;
            }
        };
        this.g = new orx(otbVar);
        this.i = new Object();
        ourVar.e = new ffix() { // from class: osa
            @Override // defpackage.ffix
            public final Object invoke() {
                osg osgVar = osg.this;
                boolean z = true;
                if (osgVar.a.r() && !osgVar.a.t()) {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        };
    }

    public final Object a(ffgu ffguVar) {
        Object e;
        return ((!this.a.r() || this.a.t()) && (e = this.b.e(ffguVar)) == ffhh.a) ? e : ffcu.a;
    }

    public final void b() {
        this.b.g(this.e, this.f);
    }
}
