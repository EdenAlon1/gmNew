package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmhu {
    public final String a;
    public final String b;
    public final ffix c;

    public dmhu(String str, String str2, ffix ffixVar) {
        str.getClass();
        ffixVar.getClass();
        this.a = str;
        this.b = str2;
        this.c = ffixVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dmhu)) {
            return false;
        }
        dmhu dmhuVar = (dmhu) obj;
        return ffkj.e(this.a, dmhuVar.a) && ffkj.e(this.b, dmhuVar.b) && ffkj.e(this.c, dmhuVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "Mode(label=" + this.a + ", contentDescription=" + this.b + ", onSelected=" + this.c + ")";
    }
}
