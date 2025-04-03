package defpackage;

import android.content.res.Resources;
import com.google.android.apps.messaging.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jan {
    public static final /* synthetic */ int a = 0;
    private static final Comparator[] b;
    private static final ffjm c;

    static {
        Comparator[] comparatorArr = new Comparator[2];
        int i = 0;
        while (i < 2) {
            comparatorArr[i] = new jam(new jal(i == 0 ? jfq.a : jez.a, iui.c));
            i++;
        }
        b = comparatorArr;
        c = jai.a;
    }

    public static final iui a(iui iuiVar, ffji ffjiVar) {
        for (iui u = iuiVar.u(); u != null; u = u.u()) {
            if (((Boolean) ffjiVar.invoke(u)).booleanValue()) {
                return u;
            }
        }
        return null;
    }

    public static final jlm b(jjw jjwVar) {
        jku jkuVar = jkm.a;
        jlm jlmVar = (jlm) jjo.a(jjwVar.c, jkm.C);
        List list = (List) jjo.a(jjwVar.c, jkm.z);
        return jlmVar == null ? list != null ? (jlm) ffdx.M(list) : null : jlmVar;
    }

    public static final String c(jjw jjwVar, Resources resources) {
        Collection collection;
        CharSequence charSequence;
        jku jkuVar = jkm.a;
        Object a2 = jjo.a(jjwVar.c, jkm.b);
        jlc jlcVar = (jlc) jjo.a(jjwVar.c, jkm.G);
        jjj jjjVar = (jjj) jjo.a(jjwVar.c, jkm.w);
        Object obj = null;
        if (jlcVar != null) {
            int ordinal = jlcVar.ordinal();
            if (ordinal == 0) {
                if (jjjVar != null) {
                    if (jjj.a(jjjVar.a, 2) && a2 == null) {
                        a2 = resources.getString(R.string.state_on);
                    }
                }
                jjjVar = null;
            } else if (ordinal == 1) {
                if (jjjVar != null) {
                    if (jjj.a(jjjVar.a, 2) && a2 == null) {
                        a2 = resources.getString(R.string.state_off);
                    }
                }
                jjjVar = null;
            } else if (ordinal == 2 && a2 == null) {
                a2 = resources.getString(R.string.indeterminate);
            }
        }
        Boolean bool = (Boolean) jjo.a(jjwVar.c, jkm.F);
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            if ((jjjVar == null || !jjj.a(jjjVar.a, 4)) && a2 == null) {
                a2 = booleanValue ? resources.getString(R.string.selected) : resources.getString(R.string.not_selected);
            }
        }
        jji jjiVar = (jji) jjo.a(jjwVar.c, jkm.c);
        if (jjiVar != null) {
            if (jjiVar != jji.a) {
                if (a2 == null) {
                    ffmf ffmfVar = jjiVar.c;
                    float floatValue = ((Number) ffmfVar.b()).floatValue() - ((Number) ffmfVar.c()).floatValue() == 0.0f ? 0.0f : (jjiVar.b - ((Number) ffmfVar.c()).floatValue()) / (((Number) ffmfVar.b()).floatValue() - ((Number) ffmfVar.c()).floatValue());
                    if (floatValue < 0.0f) {
                        floatValue = 0.0f;
                    }
                    if (floatValue > 1.0f) {
                        floatValue = 1.0f;
                    }
                    a2 = resources.getString(R.string.template_percent, Integer.valueOf(floatValue == 0.0f ? 0 : floatValue == 1.0f ? 100 : ffmk.i(Math.round(floatValue * 100.0f), 1, 99)));
                }
            } else if (a2 == null) {
                a2 = resources.getString(R.string.in_progress);
            }
        }
        if (jjwVar.c.f(jkm.C)) {
            jjn e = jjwVar.f().e();
            Collection collection2 = (Collection) jjo.a(e, jkm.a);
            if ((collection2 == null || collection2.isEmpty()) && (((collection = (Collection) jjo.a(e, jkm.z)) == null || collection.isEmpty()) && ((charSequence = (CharSequence) jjo.a(e, jkm.C)) == null || charSequence.length() == 0))) {
                obj = resources.getString(R.string.state_empty);
            }
        } else {
            obj = a2;
        }
        return (String) obj;
    }

    public static final List d(boolean z, List list, cmy cmyVar, Resources resources) {
        int i;
        cnw cnwVar = cmz.a;
        cnw cnwVar2 = new cnw((byte[]) null);
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            i((jjw) list.get(i2), arrayList, cnwVar2, cmyVar, resources);
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size() / 2);
        int e = ffdx.e(arrayList);
        if (e >= 0) {
            int i3 = 0;
            while (true) {
                jjw jjwVar = (jjw) arrayList.get(i3);
                if (i3 != 0) {
                    float f = jjwVar.c().c;
                    float f2 = jjwVar.c().e;
                    int e2 = ffdx.e(arrayList2);
                    if (e2 >= 0) {
                        int i4 = 0;
                        while (true) {
                            iam iamVar = (iam) ((ffcf) arrayList2.get(i4)).a;
                            float f3 = iamVar.c;
                            float f4 = iamVar.e;
                            if (f < f2 && f3 < f4 && Math.max(f, f3) < Math.min(f2, iamVar.e)) {
                                i = 0;
                                arrayList2.set(i4, new ffcf(new iam(Math.max(iamVar.b, 0.0f), Math.max(iamVar.c, f), Math.min(iamVar.d, Float.POSITIVE_INFINITY), Math.min(iamVar.e, f2)), ((ffcf) arrayList2.get(i4)).b));
                                ((List) ((ffcf) arrayList2.get(i4)).b).add(jjwVar);
                                break;
                            }
                            i = 0;
                            if (i4 == e2) {
                                break;
                            }
                            i4++;
                        }
                    } else {
                        i = 0;
                    }
                } else {
                    i = 0;
                    i3 = 0;
                }
                iam c2 = jjwVar.c();
                jjw[] jjwVarArr = new jjw[1];
                jjwVarArr[i] = jjwVar;
                arrayList2.add(new ffcf(c2, ffdx.i(jjwVarArr)));
                if (i3 == e) {
                    break;
                }
                i3++;
            }
        } else {
            i = 0;
        }
        ffdx.q(arrayList2, jfy.a);
        ArrayList arrayList3 = new ArrayList();
        Comparator comparator = b[!z ? 1 : 0];
        int size2 = arrayList2.size();
        for (int i5 = i; i5 < size2; i5++) {
            ffcf ffcfVar = (ffcf) arrayList2.get(i5);
            ffdx.q((List) ffcfVar.b, comparator);
            arrayList3.addAll((Collection) ffcfVar.b);
        }
        final ffjm ffjmVar = c;
        ffdx.q(arrayList3, new Comparator() { // from class: jaf
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int i6 = jan.a;
                return ((Number) ffjm.this.a(obj, obj2)).intValue();
            }
        });
        int i6 = i;
        while (i6 <= ffdx.e(arrayList3)) {
            List list2 = (List) cnwVar2.a(((jjw) arrayList3.get(i6)).e);
            if (list2 != null) {
                if (h((jjw) arrayList3.get(i6), resources)) {
                    i6++;
                } else {
                    arrayList3.remove(i6);
                }
                arrayList3.addAll(i6, list2);
                i6 += list2.size();
            } else {
                i6++;
            }
        }
        return arrayList3;
    }

    public static final boolean e(jjw jjwVar) {
        jjn e = jjwVar.e();
        jku jkuVar = jkm.a;
        return !e.f(jkm.i);
    }

    public static final boolean f(jjw jjwVar) {
        jku jkuVar = jkm.a;
        jlc jlcVar = (jlc) jjo.a(jjwVar.c, jkm.G);
        jjj jjjVar = (jjj) jjo.a(jjwVar.c, jkm.w);
        Boolean bool = (Boolean) jjo.a(jjwVar.c, jkm.F);
        boolean z = jlcVar != null;
        if (bool != null) {
            bool.booleanValue();
            if (jjjVar == null || !jjj.a(jjjVar.a, 4)) {
                return true;
            }
        }
        return z;
    }

    public static final boolean g(jjw jjwVar) {
        return jjwVar.b.t == kah.b;
    }

    public static final boolean h(jjw jjwVar, Resources resources) {
        jku jkuVar = jkm.a;
        List list = (List) jjo.a(jjwVar.c, jkm.a);
        boolean z = ((list != null ? (String) ffdx.M(list) : null) == null && b(jjwVar) == null && c(jjwVar, resources) == null && !f(jjwVar)) ? false : true;
        if (jfu.f(jjwVar)) {
            return false;
        }
        if (jjwVar.c.b) {
            return true;
        }
        return jjwVar.j() && z;
    }

    private static final void i(jjw jjwVar, ArrayList arrayList, cnw cnwVar, cmy cmyVar, Resources resources) {
        boolean g = g(jjwVar);
        jku jkuVar = jkm.a;
        boolean booleanValue = ((Boolean) jjwVar.c.c(jkm.m, jak.a)).booleanValue();
        if (booleanValue || h(jjwVar, resources)) {
            if (cmyVar.b(jjwVar.e)) {
                arrayList.add(jjwVar);
            }
            if (booleanValue) {
                cnwVar.f(jjwVar.e, d(g, jjwVar.h(), cmyVar, resources));
                return;
            }
        }
        List h = jjwVar.h();
        int size = h.size();
        for (int i = 0; i < size; i++) {
            i((jjw) h.get(i), arrayList, cnwVar, cmyVar, resources);
        }
    }
}
