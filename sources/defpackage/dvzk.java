package defpackage;

import android.util.Log;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dvzk {
    public final List c;
    public final SparseIntArray d;
    private final int g;
    public final erhm a = dvvx.a();
    public final List b = new ArrayList();
    public final List e = new ArrayList();
    public final SparseIntArray f = new SparseIntArray();

    public dvzk(int i, int i2) {
        this.g = i;
        this.c = new ArrayList(i2);
        this.d = new SparseIntArray(i2);
    }

    final dvxr a(dvxe dvxeVar, int i) {
        dvxeVar.g = this.g;
        if (i == -1) {
            i = -1;
        }
        List list = this.c;
        dvxq dvxqVar = dvxeVar.c;
        int size = list.size();
        int h = dvxeVar.h();
        dvxqVar.copyOnWrite();
        dvxr dvxrVar = (dvxr) dvxqVar.instance;
        dvxr dvxrVar2 = dvxr.a;
        int i2 = h - 1;
        if (h == 0) {
            throw null;
        }
        dvxrVar.e = i2;
        dvxrVar.b |= 2;
        erhm erhmVar = this.a;
        erhk erhkVar = ((dvxr) dvxeVar.c.instance).d;
        if (erhkVar == null) {
            erhkVar = erhk.a;
        }
        erhj erhjVar = (erhj) erhkVar.toBuilder();
        erhjVar.copyOnWrite();
        erhk erhkVar2 = (erhk) erhjVar.instance;
        erhmVar.getClass();
        erhkVar2.e = erhmVar;
        erhkVar2.b |= 2048;
        erhjVar.copyOnWrite();
        erhk erhkVar3 = (erhk) erhjVar.instance;
        erhkVar3.b |= 1;
        erhkVar3.c = size;
        erhk erhkVar4 = (erhk) erhjVar.build();
        dvxq dvxqVar2 = dvxeVar.c;
        dvxqVar2.copyOnWrite();
        dvxr dvxrVar3 = (dvxr) dvxqVar2.instance;
        erhkVar4.getClass();
        dvxrVar3.d = erhkVar4;
        dvxrVar3.b |= 1;
        dvzc dvzcVar = dvxeVar.e;
        if (!dvzcVar.a.isEmpty()) {
            if (Log.isLoggable("GIL", 2)) {
                Log.v("GIL", "ImpressionSet: ".concat(dvxeVar.toString()));
            }
            Iterator it = dvzcVar.a.iterator();
            while (it.hasNext()) {
                ((dvyz) it.next()).d();
            }
        }
        dvxr a = dvxeVar.a();
        this.c.add(a);
        this.d.append(size, i);
        return a;
    }

    final void b(dvzy dvzyVar) {
        if (dvzyVar.b == 1) {
            emxf.a(this.d.valueAt(dvzyVar.c()) == -1);
        }
        this.b.add(dvzyVar);
    }
}
