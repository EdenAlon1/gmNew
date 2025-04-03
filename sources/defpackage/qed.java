package defpackage;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qed implements qee, qeb {
    private final Path a = new Path();
    private final Path b = new Path();
    private final Path c = new Path();
    private final List d = new ArrayList();
    private final qiq e;

    public qed(qiq qiqVar) {
        this.e = qiqVar;
    }

    private final void a(Path.Op op) {
        this.b.reset();
        this.a.reset();
        int size = this.d.size();
        while (true) {
            size--;
            if (size <= 0) {
                break;
            }
            qee qeeVar = (qee) this.d.get(size);
            if (qeeVar instanceof qdv) {
                qdv qdvVar = (qdv) qeeVar;
                List j = qdvVar.j();
                int size2 = j.size();
                while (true) {
                    size2--;
                    if (size2 >= 0) {
                        Path i = ((qee) j.get(size2)).i();
                        i.transform(qdvVar.h());
                        this.b.addPath(i);
                    }
                }
            } else {
                this.b.addPath(qeeVar.i());
            }
        }
        qee qeeVar2 = (qee) this.d.get(0);
        if (qeeVar2 instanceof qdv) {
            qdv qdvVar2 = (qdv) qeeVar2;
            List j2 = qdvVar2.j();
            for (int i2 = 0; i2 < j2.size(); i2++) {
                Path i3 = ((qee) j2.get(i2)).i();
                i3.transform(qdvVar2.h());
                this.a.addPath(i3);
            }
        } else {
            this.a.set(qeeVar2.i());
        }
        this.c.op(this.a, this.b, op);
    }

    @Override // defpackage.qdu
    public final void f(List list, List list2) {
        for (int i = 0; i < this.d.size(); i++) {
            ((qee) this.d.get(i)).f(list, list2);
        }
    }

    @Override // defpackage.qdu
    public final String g() {
        throw null;
    }

    @Override // defpackage.qeb
    public final void h(ListIterator listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            qdu qduVar = (qdu) listIterator.previous();
            if (qduVar instanceof qee) {
                this.d.add((qee) qduVar);
                listIterator.remove();
            }
        }
    }

    @Override // defpackage.qee
    public final Path i() {
        this.c.reset();
        qiq qiqVar = this.e;
        if (!qiqVar.a) {
            int i = qiqVar.b;
            if (i == 0) {
                throw null;
            }
            int i2 = i - 1;
            if (i2 == 0) {
                for (int i3 = 0; i3 < this.d.size(); i3++) {
                    this.c.addPath(((qee) this.d.get(i3)).i());
                }
            } else if (i2 == 1) {
                a(Path.Op.UNION);
            } else if (i2 == 2) {
                a(Path.Op.REVERSE_DIFFERENCE);
            } else if (i2 == 3) {
                a(Path.Op.INTERSECT);
            } else if (i2 == 4) {
                a(Path.Op.XOR);
            }
        }
        return this.c;
    }
}
