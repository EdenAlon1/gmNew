package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kju {
    static int a;
    final int c;
    public int d;
    final ArrayList b = new ArrayList();
    ArrayList e = null;
    private int f = -1;

    public kju(int i) {
        int i2 = a;
        a = i2 + 1;
        this.c = i2;
        this.d = i;
    }

    public final int a(kgz kgzVar, int i) {
        int o;
        int o2;
        if (this.b.size() == 0) {
            return 0;
        }
        ArrayList arrayList = this.b;
        kiv kivVar = (kiv) ((kiu) arrayList.get(0)).ae;
        kgzVar.k();
        kivVar.a(kgzVar, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ((kiu) arrayList.get(i2)).a(kgzVar, false);
        }
        if (i == 0 && kivVar.i > 0) {
            kir.a(kivVar, kgzVar, arrayList, 0);
        }
        if (i == 1 && kivVar.j > 0) {
            kir.a(kivVar, kgzVar, arrayList, 1);
        }
        try {
            kgzVar.j();
        } catch (Exception e) {
            System.err.println(e.toString() + "\n" + Arrays.toString(e.getStackTrace()).replace("[", "   at ").replace(",", "\n   at").replace("]", ""));
        }
        this.e = new ArrayList();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            this.e.add(new kjt((kiu) arrayList.get(i3)));
        }
        if (i == 0) {
            o = kgz.o(kivVar.T);
            o2 = kgz.o(kivVar.V);
            kgzVar.k();
        } else {
            o = kgz.o(kivVar.U);
            o2 = kgz.o(kivVar.W);
            kgzVar.k();
        }
        return o2 - o;
    }

    public final void b(ArrayList arrayList) {
        int size = this.b.size();
        if (this.f != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                kju kjuVar = (kju) arrayList.get(i);
                if (this.f == kjuVar.c) {
                    c(this.d, kjuVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public final void c(int i, kju kjuVar) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            kiu kiuVar = (kiu) arrayList.get(i2);
            kjuVar.d(kiuVar);
            if (i == 0) {
                kiuVar.ay = kjuVar.c;
            } else {
                kiuVar.az = kjuVar.c;
            }
        }
        this.f = kjuVar.c;
    }

    public final boolean d(kiu kiuVar) {
        if (this.b.contains(kiuVar)) {
            return false;
        }
        this.b.add(kiuVar);
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.d;
        sb.append(i == 0 ? "Horizontal" : i == 1 ? "Vertical" : "Both");
        sb.append(" [");
        sb.append(this.c);
        sb.append("] <");
        String sb2 = sb.toString();
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            sb2 = sb2 + " " + ((kiu) arrayList.get(i2)).as;
        }
        return sb2.concat(" >");
    }
}
