package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvvz {
    public final String a;
    public final int b;

    public dvvz(int i, String str) {
        this.b = i;
        this.a = str;
    }

    public static dvvz a(String str) {
        str.getClass();
        return new dvvz(1, str);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dvvz) {
            dvvz dvvzVar = (dvvz) obj;
            if (dvvzVar.b - 1 == this.b - 1 && emxb.a(dvvzVar.a, this.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        return (this.b - 1) + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
