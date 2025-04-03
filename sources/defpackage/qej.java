package defpackage;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qej implements qee, qem {
    private final boolean b;
    private final qdb c;
    private final qfe d;
    private boolean e;
    private final Path a = new Path();
    private final qdt f = new qdt();

    public qej(qdb qdbVar, qje qjeVar, qiy qiyVar) {
        this.b = qiyVar.b;
        this.c = qdbVar;
        qfe a = qiyVar.a.a();
        this.d = a;
        qjeVar.k(a);
        a.h(this);
    }

    @Override // defpackage.qem
    public final void d() {
        this.e = false;
        this.c.invalidateSelf();
    }

    @Override // defpackage.qdu
    public final void f(List list, List list2) {
        ArrayList arrayList = null;
        for (int i = 0; i < list.size(); i++) {
            qdu qduVar = (qdu) list.get(i);
            if (qduVar instanceof qel) {
                qel qelVar = (qel) qduVar;
                if (qelVar.e == 1) {
                    this.f.a(qelVar);
                    qelVar.a(this);
                }
            }
            if (qduVar instanceof qei) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add((qei) qduVar);
            }
        }
        this.d.e = arrayList;
    }

    @Override // defpackage.qdu
    public final String g() {
        throw null;
    }

    @Override // defpackage.qee
    public final Path i() {
        if (!this.e) {
            this.a.reset();
            if (this.b) {
                this.e = true;
                return this.a;
            }
            Path path = (Path) this.d.e();
            if (path != null) {
                this.a.set(path);
                this.a.setFillType(Path.FillType.EVEN_ODD);
                this.f.b(this.a);
                this.e = true;
                return this.a;
            }
        }
        return this.a;
    }
}
