package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mvo {
    public static final mvo a = new mvo(new lrv[0]);
    public final int b;
    public final engw c;
    private int d;

    static {
        lvf.N(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public mvo(lrv... lrvVarArr) {
        this.c = engw.p(lrvVarArr);
        this.b = lrvVarArr.length;
        int i = 0;
        while (i < ((enou) this.c).c) {
            int i2 = i + 1;
            int i3 = i2;
            while (true) {
                engw engwVar = this.c;
                if (i3 < ((enou) engwVar).c) {
                    if (((lrv) engwVar.get(i)).equals(this.c.get(i3))) {
                        luj.d("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                    }
                    i3++;
                }
            }
            i = i2;
        }
    }

    public final int a(lrv lrvVar) {
        int indexOf = this.c.indexOf(lrvVar);
        if (indexOf >= 0) {
            return indexOf;
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final lrv b(int i) {
        return (lrv) this.c.get(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            mvo mvoVar = (mvo) obj;
            if (this.b == mvoVar.b && enkr.h(this.c, mvoVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.d;
        if (i != 0) {
            return i;
        }
        int hashCode = this.c.hashCode();
        this.d = hashCode;
        return hashCode;
    }
}
