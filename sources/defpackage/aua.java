package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aua {
    public static final aua a = new aua(0, 0);
    public static final aua b = new aua(1, 8);
    public static final aua c = new aua(3, 10);
    public static final aua d = new aua(4, 10);
    public static final aua e = new aua(5, 10);
    public static final aua f = new aua(6, 10);
    public static final aua g = new aua(6, 8);
    public final int h;
    public final int i;

    public aua(int i, int i2) {
        this.h = i;
        this.i = i2;
    }

    public final boolean a() {
        return b() && this.h != 1 && this.i == 10;
    }

    public final boolean b() {
        int i = this.h;
        return (i == 0 || i == 2 || this.i == 0) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aua) {
            aua auaVar = (aua) obj;
            if (this.h == auaVar.h && this.i == auaVar.i) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.h ^ 1000003) * 1000003) ^ this.i;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("DynamicRange@");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("{encoding=");
        switch (this.h) {
            case 0:
                str = "UNSPECIFIED";
                break;
            case 1:
                str = "SDR";
                break;
            case 2:
                str = "HDR_UNSPECIFIED";
                break;
            case 3:
                str = "HLG";
                break;
            case 4:
                str = "HDR10";
                break;
            case 5:
                str = "HDR10_PLUS";
                break;
            case 6:
                str = "DOLBY_VISION";
                break;
            default:
                str = "<Unknown>";
                break;
        }
        sb.append(str);
        sb.append(", bitDepth=");
        sb.append(this.i);
        sb.append("}");
        return sb.toString();
    }
}
