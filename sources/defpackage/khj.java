package defpackage;

import j$.util.Objects;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public class khj extends khk {
    public ArrayList a;

    public khj(char[] cArr) {
        super(cArr);
        this.a = new ArrayList();
    }

    public final float a(int i) {
        khk h = h(i);
        if (h != null) {
            return h.t();
        }
        throw new khp(a.h(i, "no float at index "), this);
    }

    public final float b(String str) {
        khk i = i(str);
        i.getClass();
        return i.t();
    }

    public final int c(int i) {
        khk h = h(i);
        if (h != null) {
            return h.u();
        }
        throw new khp(a.h(i, "no int at index "), this);
    }

    public final int d() {
        return this.a.size();
    }

    public final khi e(String str) {
        khk k = k(str);
        if (k instanceof khi) {
            return (khi) k;
        }
        return null;
    }

    @Override // defpackage.khk
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof khj) {
            return this.a.equals(((khj) obj).a);
        }
        return false;
    }

    @Override // defpackage.khk
    /* renamed from: f, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public khj clone() {
        khj khjVar = (khj) super.clone();
        ArrayList arrayList = new ArrayList(this.a.size());
        ArrayList arrayList2 = this.a;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            khk clone = ((khk) arrayList2.get(i)).clone();
            clone.d = khjVar;
            arrayList.add(clone);
        }
        khjVar.a = arrayList;
        return khjVar;
    }

    public final khk h(int i) {
        if (i < 0 || i >= this.a.size()) {
            throw new khp(a.h(i, "no element at index "), this);
        }
        return (khk) this.a.get(i);
    }

    @Override // defpackage.khk
    public final int hashCode() {
        return Objects.hash(this.a, Integer.valueOf(super.hashCode()));
    }

    public final khk i(String str) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            khl khlVar = (khl) ((khk) arrayList.get(i));
            i++;
            if (khlVar.v().equals(str)) {
                return khlVar.A();
            }
        }
        throw new khp(a.a(str, "no element for key <", ">"), this);
    }

    public final khk j(int i) {
        if (i < this.a.size()) {
            return (khk) this.a.get(i);
        }
        return null;
    }

    public final khk k(String str) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            khl khlVar = (khl) ((khk) arrayList.get(i));
            i++;
            if (khlVar.v().equals(str)) {
                return khlVar.A();
            }
        }
        return null;
    }

    public final kho l(String str) {
        khk k = k(str);
        if (k instanceof kho) {
            return (kho) k;
        }
        return null;
    }

    public final String m(int i) {
        khk h = h(i);
        if (h instanceof khq) {
            return h.v();
        }
        throw new khp(a.h(i, "no string at index "), this);
    }

    public final String n(String str) {
        khk i = i(str);
        if (i instanceof khq) {
            return i.v();
        }
        throw new khp("no string found for key <" + str + ">, found [" + (i != null ? i.w() : null) + "] : " + i, this);
    }

    public final String o(String str) {
        khk k = k(str);
        if (k instanceof khq) {
            return k.v();
        }
        return null;
    }

    public final ArrayList p() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.a;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            khk khkVar = (khk) arrayList2.get(i);
            if (khkVar instanceof khl) {
                arrayList.add(((khl) khkVar).v());
            }
        }
        return arrayList;
    }

    public final void q(khk khkVar) {
        this.a.add(khkVar);
    }

    public final void r(String str, khk khkVar) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            khl khlVar = (khl) ((khk) arrayList.get(i));
            i++;
            if (khlVar.v().equals(str)) {
                khlVar.B(khkVar);
                return;
            }
        }
        khl khlVar2 = new khl(str.toCharArray());
        khlVar2.z();
        khlVar2.x(str.length() - 1);
        khlVar2.B(khkVar);
        this.a.add(khlVar2);
    }

    public final boolean s(String str) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            khk khkVar = (khk) arrayList.get(i);
            if ((khkVar instanceof khl) && ((khl) khkVar).v().equals(str)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.khk
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            khk khkVar = (khk) arrayList.get(i);
            if (sb.length() > 0) {
                sb.append("; ");
            }
            sb.append(khkVar);
        }
        return super.toString() + " = <" + ((Object) sb) + " >";
    }
}
