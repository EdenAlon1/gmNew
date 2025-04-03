package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.GeneralPurposeRichCardLayoutInfo;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kit {
    public int b;
    public boolean c;
    public final kiu d;
    public kit e;
    public khe h;
    public final int i;
    public HashSet a = null;
    public int f = 0;
    int g = Integer.MIN_VALUE;

    public kit(kiu kiuVar, int i) {
        this.d = kiuVar;
        this.i = i;
    }

    public final int a() {
        if (this.c) {
            return this.b;
        }
        return 0;
    }

    public final int b() {
        kit kitVar;
        if (this.d.ar == 8) {
            return 0;
        }
        int i = this.g;
        return (i == Integer.MIN_VALUE || (kitVar = this.e) == null || kitVar.d.ar != 8) ? this.f : i;
    }

    public final kit c() {
        int i = this.i - 1;
        if (i == 1) {
            return this.d.V;
        }
        if (i == 2) {
            return this.d.W;
        }
        if (i == 3) {
            return this.d.T;
        }
        if (i != 4) {
            return null;
        }
        return this.d.U;
    }

    public final void d(int i, ArrayList arrayList, kju kjuVar) {
        HashSet hashSet = this.a;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                kjn.a(((kit) it.next()).d, i, arrayList, kjuVar);
            }
        }
    }

    public final void e() {
        HashSet hashSet;
        kit kitVar = this.e;
        if (kitVar != null && (hashSet = kitVar.a) != null) {
            hashSet.remove(this);
            if (this.e.a.size() == 0) {
                this.e.a = null;
            }
        }
        this.a = null;
        this.e = null;
        this.f = 0;
        this.g = Integer.MIN_VALUE;
        this.c = false;
        this.b = 0;
    }

    public final void f(int i) {
        this.b = i;
        this.c = true;
    }

    public final void g(int i) {
        if (j()) {
            this.g = i;
        }
    }

    public final boolean h() {
        HashSet hashSet = this.a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((kit) it.next()).c().j()) {
                return true;
            }
        }
        return false;
    }

    public final boolean i() {
        HashSet hashSet = this.a;
        return hashSet != null && hashSet.size() > 0;
    }

    public final boolean j() {
        return this.e != null;
    }

    public final boolean k(kit kitVar) {
        if (kitVar == null) {
            return false;
        }
        int i = this.i;
        int i2 = kitVar.i;
        if (i2 == i) {
            return i != 6 || (kitVar.d.P && this.d.P);
        }
        int i3 = 9;
        int i4 = 4;
        int i5 = 2;
        switch (i - 1) {
            case 1:
            case 3:
                i3 = 8;
                break;
            case 2:
            case 4:
                i5 = 3;
                i4 = 5;
                break;
            case 5:
                return (i2 == 2 || i2 == 4) ? false : true;
            case 6:
                return (i2 == 6 || i2 == 8 || i2 == 9) ? false : true;
            default:
                return false;
        }
        boolean z = i2 == i5 || i2 == i4;
        return kitVar.d instanceof kiy ? z || i2 == i3 : z;
    }

    public final void l(kit kitVar, int i) {
        n(kitVar, i, Integer.MIN_VALUE, false);
    }

    public final void m() {
        khe kheVar = this.h;
        if (kheVar == null) {
            this.h = new khe(1);
        } else {
            kheVar.c();
        }
    }

    public final void n(kit kitVar, int i, int i2, boolean z) {
        if (kitVar == null) {
            e();
            return;
        }
        if (z || k(kitVar)) {
            this.e = kitVar;
            if (kitVar.a == null) {
                kitVar.a = new HashSet();
            }
            HashSet hashSet = this.e.a;
            if (hashSet != null) {
                hashSet.add(this);
            }
            this.f = i;
            this.g = i2;
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.d.as);
        sb.append(":");
        switch (this.i) {
            case 2:
                str = GeneralPurposeRichCardLayoutInfo.IMAGE_ALIGNMENT_LEFT;
                break;
            case 3:
                str = "TOP";
                break;
            case 4:
                str = GeneralPurposeRichCardLayoutInfo.IMAGE_ALIGNMENT_RIGHT;
                break;
            case 5:
                str = "BOTTOM";
                break;
            case 6:
                str = "BASELINE";
                break;
            case 7:
                str = "CENTER";
                break;
            case 8:
                str = "CENTER_X";
                break;
            default:
                str = "CENTER_Y";
                break;
        }
        sb.append(str);
        return sb.toString();
    }
}
