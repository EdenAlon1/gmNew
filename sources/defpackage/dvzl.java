package defpackage;

import android.util.Log;
import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvzl {
    public final Set a = new LinkedHashSet();
    public final Set b = new LinkedHashSet();
    public final Map c = new HashMap();
    public final List d = new ArrayList();
    public final List e = new ArrayList();
    public final Map f = new HashMap();
    public Collection g = null;
    public final boolean h = true;
    public final boolean i;

    public dvzl() {
        enpd enpdVar = enpd.a;
        this.i = false;
    }

    private final dvzk d(dvxe dvxeVar) {
        dvzk dvzkVar = new dvzk(this.d.size(), this.a.size());
        dvxr a = dvzkVar.a(dvxeVar, -1);
        ArrayList arrayList = new ArrayList(1);
        dvzd.a(dvxeVar, arrayList);
        erhk erhkVar = a.d;
        if (erhkVar == null) {
            erhkVar = erhk.a;
        }
        dvzkVar.b(new dvzy(1, arrayList, erhkVar.c));
        this.d.add(dvzkVar);
        this.c.put(a, dvzkVar);
        return dvzkVar;
    }

    public final dvzk a(List list, int i) {
        dvxr dvxrVar = (dvxr) enjk.j(list);
        dvzk dvzkVar = (dvzk) this.c.get(dvxrVar);
        if (dvzkVar != null) {
            return dvzkVar;
        }
        dvzk dvzkVar2 = new dvzk(this.d.size(), i);
        this.d.add(dvzkVar2);
        this.c.put(dvxrVar, dvzkVar2);
        return dvzkVar2;
    }

    public final dvzk b(dvxe dvxeVar) {
        eyfw checkIsLite;
        String sb;
        int i = dvxeVar.g;
        if (i != -1) {
            if (i != -2) {
                return (dvzk) this.d.get(i);
            }
        } else {
            if (!dvxeVar.e()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(dvxeVar);
                sb2.append(" has no VE id, it may need to be re-instrumented if it has been reset.");
                dvzb dvzbVar = dvxeVar.f;
                if (dvzbVar instanceof dvxv) {
                    sb2.append("\n\tError occurred on CVE with associated View of type: ");
                    sb2.append(dvxv.b(dvxeVar).getClass().getSimpleName());
                } else {
                    sb2.append("\n\tError occurred on SyntheticNode");
                }
                Object d = dvzbVar.d();
                if (d != null) {
                    sb2.append("\n\t\tAncestry (leaf -> root):");
                }
                while (true) {
                    if (d != null) {
                        dvxe dvxeVar2 = (dvxe) d;
                        dvzb dvzbVar2 = dvxeVar2.f;
                        if (dvzbVar2 == null) {
                            sb2.append("\n\t\t\t<Found CVE with no Node attached. Ending traversal.>");
                            sb = sb2.toString();
                            break;
                        }
                        if (dvzbVar2 instanceof dvxv) {
                            sb2.append("\n\t\t\tView of type: ");
                            sb2.append(dvxv.b(dvxeVar2).getClass().getSimpleName());
                        } else {
                            sb2.append("\n\t\t\tSyntheticNode");
                        }
                        d = dvzbVar2.d();
                    } else {
                        sb = sb2.toString();
                        break;
                    }
                }
                throw new IllegalStateException(sb);
            }
            this.e.add(dvxeVar);
            dvzb dvzbVar3 = dvxeVar.f;
            if (dvzbVar3.p()) {
                return d(dvxeVar);
            }
            Object d2 = dvzbVar3.d();
            if (d2 == null) {
                dvxr a = dvxeVar.a();
                checkIsLite = eyfy.checkIsLite(dwcf.a);
                a.b(checkIsLite);
                if (a.r.o(checkIsLite.d)) {
                    return d(dvxeVar);
                }
                View b = dvxv.b(dvxeVar);
                while (b != null) {
                    if (!dvxv.q(b)) {
                        Object parent = b.getParent();
                        if (!(parent instanceof View)) {
                            break;
                        }
                        b = (View) parent;
                    } else {
                        Log.e("GIL", a.F(dvxeVar, "Unexpected visual element (", ") without parent detected. All visual elements except the root view must have a parent visual element. See also: go/gil-android/instrumentation#requirements."));
                        break;
                    }
                }
                if (Log.isLoggable("GIL", 2)) {
                    Log.v("GIL", a.F(dvxeVar, "Ignoring CVE (", ") outside of AutoLogger scope."));
                }
                dvxeVar.g = -2;
                return null;
            }
            dvxe dvxeVar3 = (dvxe) d2;
            if (dvxeVar3.g == -1 && dvxeVar3.f()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(null);
                dvzd.a(dvxeVar3, arrayList);
                emxf.l(arrayList.size() > 1);
                dvzk a2 = a(arrayList, this.a.size());
                dvxr a3 = a2.a(dvxeVar, -1);
                arrayList.set(0, a3);
                erhk erhkVar = a3.d;
                if (erhkVar == null) {
                    erhkVar = erhk.a;
                }
                a2.b(new dvzy(1, arrayList, erhkVar.c));
                return a2;
            }
            dvzk b2 = b(dvxeVar3);
            if (b2 != null) {
                erhk erhkVar2 = ((dvxr) dvxeVar3.c.instance).d;
                if (erhkVar2 == null) {
                    erhkVar2 = erhk.a;
                }
                b2.a(dvxeVar, erhkVar2.c);
                return b2;
            }
        }
        return null;
    }

    public final boolean c(dvxe dvxeVar, int i) {
        if (this.a.contains(dvxeVar)) {
            return false;
        }
        int b = epnz.b(((dvxr) dvxeVar.c.instance).e);
        if (b == 0) {
            b = 1;
        }
        if (b == i) {
            this.b.remove(dvxeVar);
            return false;
        }
        this.b.add(dvxeVar);
        return true;
    }
}
