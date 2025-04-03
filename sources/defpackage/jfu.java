package defpackage;

import android.graphics.Rect;
import android.graphics.Region;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jfu {
    private static final iam a = new iam(0.0f, 0.0f, 10.0f, 10.0f);

    public static final View a(jck jckVar, int i) {
        Object obj;
        Iterator it = jckVar.b.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((iui) ((Map.Entry) obj).getKey()).d == i) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry != null) {
            return (kbs) entry.getValue();
        }
        return null;
    }

    public static final cmy b(jjy jjyVar) {
        jjw a2 = jjyVar.a();
        if (!a2.b.g() || !a2.b.e()) {
            cnw cnwVar = cmz.a;
            cnwVar.getClass();
            return cnwVar;
        }
        cnw cnwVar2 = new cnw(48);
        iam b = a2.b();
        h(new Region(Math.round(b.b), Math.round(b.c), Math.round(b.d), Math.round(b.e)), a2, cnwVar2, a2, new Region());
        return cnwVar2;
    }

    public static final jfr c(List list, int i) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((jfr) list.get(i2)).a == i) {
                return (jfr) list.get(i2);
            }
        }
        return null;
    }

    public static final jpg d(jjn jjnVar) {
        ffji ffjiVar;
        ArrayList arrayList = new ArrayList();
        jku jkuVar = jjl.a;
        jjb jjbVar = (jjb) jjo.a(jjnVar, jjl.a);
        if (jjbVar == null || (ffjiVar = (ffji) jjbVar.b) == null || !((Boolean) ffjiVar.invoke(arrayList)).booleanValue()) {
            return null;
        }
        return (jpg) arrayList.get(0);
    }

    public static final String e(int i) {
        if (jjj.a(i, 0)) {
            return "android.widget.Button";
        }
        if (jjj.a(i, 1)) {
            return "android.widget.CheckBox";
        }
        if (jjj.a(i, 3)) {
            return "android.widget.RadioButton";
        }
        if (jjj.a(i, 5)) {
            return "android.widget.ImageView";
        }
        if (jjj.a(i, 6)) {
            return "android.widget.Spinner";
        }
        if (jjj.a(i, 7)) {
            return "android.widget.NumberPicker";
        }
        return null;
    }

    public static final boolean f(jjw jjwVar) {
        iwi d = jjwVar.d();
        if (d != null && d.aw()) {
            return true;
        }
        jjn jjnVar = jjwVar.c;
        jku jkuVar = jkm.a;
        return jjnVar.f(jkm.o) || jjwVar.c.f(jkm.n);
    }

    public static final boolean g(jjw jjwVar) {
        if (f(jjwVar)) {
            return false;
        }
        jjn jjnVar = jjwVar.c;
        if (jjnVar.b) {
            return true;
        }
        cop copVar = jjnVar.a;
        Object[] objArr = copVar.b;
        Object[] objArr2 = copVar.c;
        long[] jArr = copVar.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = i - length;
                    int i3 = 0;
                    while (true) {
                        int i4 = 8 - ((~i2) >>> 31);
                        if (i3 < i4) {
                            if ((255 & j) < 128) {
                                int i5 = (i << 3) + i3;
                                Object obj = objArr[i5];
                                Object obj2 = objArr2[i5];
                                if (((jku) obj).c) {
                                    return true;
                                }
                            }
                            j >>= 8;
                            i3++;
                        } else if (i4 != 8) {
                            return false;
                        }
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return false;
    }

    private static final void h(Region region, jjw jjwVar, cnw cnwVar, jjw jjwVar2, Region region2) {
        isw iswVar;
        iam a2;
        iui iuiVar;
        boolean z = (jjwVar2.b.g() && jjwVar2.b.e()) ? false : true;
        if (!region.isEmpty() || jjwVar2.e == jjwVar.e) {
            if (!z || jjwVar2.d) {
                if (jjwVar2.c.b) {
                    iswVar = jjx.a(jjwVar2.b);
                    if (iswVar == null) {
                        iswVar = jjwVar2.a;
                    }
                } else {
                    iswVar = jjwVar2.a;
                }
                hvh C = iswVar.C();
                jjn jjnVar = jjwVar2.c;
                jku jkuVar = jjl.a;
                Object a3 = jjo.a(jjnVar, jjl.b);
                if (!C.p.z) {
                    a2 = iam.a;
                } else if (a3 != null) {
                    iwi e = isx.e(C, 8);
                    if (e.t()) {
                        ioc f = iod.f(e);
                        iah Z = e.Z();
                        long V = e.V(e.W());
                        int i = (int) (V >> 32);
                        Z.a = -Float.intBitsToFloat(i);
                        int i2 = (int) (V & 4294967295L);
                        Z.b = -Float.intBitsToFloat(i2);
                        Z.c = e.w() + Float.intBitsToFloat(i);
                        Z.d = e.v() + Float.intBitsToFloat(i2);
                        while (true) {
                            if (e == f) {
                                a2 = iai.a(Z);
                                break;
                            }
                            e.ar(Z, false, true);
                            if (Z.c()) {
                                a2 = iam.a;
                                break;
                            } else {
                                e = e.v;
                                e.getClass();
                            }
                        }
                    } else {
                        a2 = iam.a;
                    }
                } else {
                    a2 = iod.d(isx.e(C, 8));
                }
                int round = Math.round(a2.b);
                int round2 = Math.round(a2.c);
                int round3 = Math.round(a2.d);
                int round4 = Math.round(a2.e);
                region2.set(round, round2, round3, round4);
                int i3 = jjwVar2.e;
                if (i3 == jjwVar.e) {
                    i3 = -1;
                }
                if (!region2.op(region, Region.Op.INTERSECT)) {
                    if (jjwVar2.d) {
                        jjw g = jjwVar2.g();
                        iam b = (g == null || (iuiVar = g.b) == null || !iuiVar.g()) ? a : g.b();
                        cnwVar.f(i3, new jft(jjwVar2, new Rect(Math.round(b.b), Math.round(b.c), Math.round(b.d), Math.round(b.e))));
                        return;
                    } else {
                        if (i3 == -1) {
                            cnwVar.f(-1, new jft(jjwVar2, region2.getBounds()));
                            return;
                        }
                        return;
                    }
                }
                cnwVar.f(i3, new jft(jjwVar2, region2.getBounds()));
                List i4 = jjwVar2.i();
                for (int size = i4.size() - 1; size >= 0; size--) {
                    jjn e2 = ((jjw) i4.get(size)).e();
                    jku jkuVar2 = jkm.a;
                    if (!e2.f(jkm.y)) {
                        h(region, jjwVar, cnwVar, (jjw) i4.get(size), region2);
                    }
                }
                if (g(jjwVar2)) {
                    region.op(round, round2, round3, round4, Region.Op.DIFFERENCE);
                }
            }
        }
    }
}
