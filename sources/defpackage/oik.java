package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class oik implements oko {
    public static final oik a = new oik(ogl.a);
    public final List b;
    public int c;
    public int d;
    public int e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public oik(ogl oglVar) {
        this(oglVar.c, oglVar.d, oglVar.e);
        oglVar.getClass();
    }

    private static final int j(List list) {
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((oll) it.next()).c.size();
        }
        return i;
    }

    @Override // defpackage.oko
    public final int a() {
        return this.c;
    }

    public final int b() {
        int[] iArr = ((oll) ffdx.K(this.b)).b;
        int i = iArr[0];
        int z = ffdo.z(iArr);
        if (z > 0) {
            int i2 = 1;
            while (true) {
                int i3 = iArr[i2];
                if (i > i3) {
                    i = i3;
                }
                if (i2 == z) {
                    break;
                }
                i2++;
            }
        }
        Integer.valueOf(i).getClass();
        return i;
    }

    public final int c() {
        int[] iArr = ((oll) ffdx.P(this.b)).b;
        int i = iArr[0];
        int z = ffdo.z(iArr);
        if (z > 0) {
            int i2 = 1;
            while (true) {
                int i3 = iArr[i2];
                if (i < i3) {
                    i = i3;
                }
                if (i2 == z) {
                    break;
                }
                i2++;
            }
        }
        Integer.valueOf(i).getClass();
        return i;
    }

    @Override // defpackage.oko
    public final int d() {
        return this.e;
    }

    @Override // defpackage.oko
    public final int e() {
        return this.d;
    }

    @Override // defpackage.oko
    public final int f() {
        return this.d + this.c + this.e;
    }

    public final ojo g(ogo ogoVar) {
        ogoVar.getClass();
        if (!(ogoVar instanceof ogl)) {
            if (!(ogoVar instanceof ogj)) {
                throw new IllegalStateException("Paging received an event to process StaticList or LoadStateUpdate while\nprocessing Inserts and Drops. If you see this exception, it is most\nlikely a bug in the library. Please file a bug so we can fix it at:\nhttps://issuetracker.google.com/issues/new?component=413106");
            }
            ogj ogjVar = (ogj) ogoVar;
            ffmj ffmjVar = new ffmj(ogjVar.b, ogjVar.c);
            Iterator it = this.b.iterator();
            int i = 0;
            while (it.hasNext()) {
                oll ollVar = (oll) it.next();
                int[] iArr = ollVar.b;
                int i2 = 0;
                while (true) {
                    if (i2 > 0) {
                        break;
                    }
                    if (ffmjVar.e(iArr[i2])) {
                        i += ollVar.c.size();
                        it.remove();
                        break;
                    }
                    i2++;
                }
            }
            int i3 = this.c - i;
            this.c = i3;
            if (ogjVar.a == ofz.b) {
                int i4 = this.d;
                int i5 = ogjVar.d;
                this.d = i5;
                return new ojl(i, i5, i4);
            }
            int i6 = this.e;
            int i7 = ogjVar.d;
            this.e = i7;
            return new ojk(this.d + i3, i, i7, i6);
        }
        ogl oglVar = (ogl) ogoVar;
        List list = oglVar.c;
        ofz ofzVar = oglVar.b;
        int j = j(list);
        int ordinal = ofzVar.ordinal();
        if (ordinal == 0) {
            throw new IllegalStateException("Paging received a refresh event in the middle of an actively loading generation\nof PagingData. If you see this exception, it is most likely a bug in the library.\nPlease file a bug so we can fix it at:\nhttps://issuetracker.google.com/issues/new?component=413106");
        }
        if (ordinal == 1) {
            int i8 = this.d;
            this.b.addAll(0, oglVar.c);
            this.c += j;
            this.d = oglVar.d;
            List list2 = oglVar.c;
            ArrayList arrayList = new ArrayList();
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                ffdx.w(arrayList, ((oll) it2.next()).c);
            }
            return new ojm(arrayList, this.d, i8);
        }
        if (ordinal != 2) {
            throw new ffcd();
        }
        int i9 = this.e;
        int i10 = this.c;
        List list3 = this.b;
        list3.addAll(list3.size(), oglVar.c);
        this.c += j;
        this.e = oglVar.e;
        int i11 = this.d + i10;
        List list4 = oglVar.c;
        ArrayList arrayList2 = new ArrayList();
        Iterator it3 = list4.iterator();
        while (it3.hasNext()) {
            ffdx.w(arrayList2, ((oll) it3.next()).c);
        }
        return new ojj(i11, arrayList2, this.e, i9);
    }

    public final oln h(int i) {
        int i2 = 0;
        int i3 = i - this.d;
        while (i3 >= ((oll) this.b.get(i2)).c.size() && i2 < ffdx.e(this.b)) {
            i3 -= ((oll) this.b.get(i2)).c.size();
            i2++;
        }
        oll ollVar = (oll) this.b.get(i2);
        int i4 = i - this.d;
        int f = ((f() - i) - this.e) - 1;
        int b = b();
        int c = c();
        int i5 = ollVar.d;
        List list = ollVar.e;
        return new oln(i5, i3, i4, f, b, c);
    }

    @Override // defpackage.oko
    public final Object i(int i) {
        int size = this.b.size();
        int i2 = 0;
        while (i2 < size) {
            int size2 = ((oll) this.b.get(i2)).c.size();
            if (size2 > i) {
                break;
            }
            i2++;
            i -= size2;
        }
        return ((oll) this.b.get(i2)).c.get(i);
    }

    public final String toString() {
        int i = this.c;
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(i(i2));
        }
        return "[(" + this.d + " placeholders), " + ffdx.aA(arrayList, null, null, null, null, 63) + ", (" + this.e + " placeholders)]";
    }

    public oik(List list, int i, int i2) {
        list.getClass();
        this.b = ffdx.am(list);
        this.c = j(list);
        this.d = i;
        this.e = i2;
    }
}
