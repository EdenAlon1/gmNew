package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnmk implements dndt {
    public final String a;
    public final String b;
    public final ffix c;
    public final ffji d;
    public final dnmj e;
    public final int f;

    public dnmk(String str, String str2, ffix ffixVar, ffji ffjiVar, int i, dnmj dnmjVar) {
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = ffixVar;
        this.d = ffjiVar;
        this.f = i;
        this.e = dnmjVar;
    }

    public static /* synthetic */ dnmk a(dnmk dnmkVar, String str, ffix ffixVar, ffji ffjiVar, int i) {
        String str2 = (i & 1) != 0 ? dnmkVar.a : null;
        if ((i & 2) != 0) {
            str = dnmkVar.b;
        }
        String str3 = str;
        if ((i & 4) != 0) {
            ffixVar = dnmkVar.c;
        }
        ffix ffixVar2 = ffixVar;
        if ((i & 8) != 0) {
            ffjiVar = dnmkVar.d;
        }
        ffji ffjiVar2 = ffjiVar;
        int i2 = dnmkVar.f;
        dnmj dnmjVar = dnmkVar.e;
        str2.getClass();
        str3.getClass();
        ffjiVar2.getClass();
        return new dnmk(str2, str3, ffixVar2, ffjiVar2, i2, dnmjVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dnmk)) {
            return false;
        }
        dnmk dnmkVar = (dnmk) obj;
        return ffkj.e(this.a, dnmkVar.a) && ffkj.e(this.b, dnmkVar.b) && ffkj.e(this.c, dnmkVar.c) && ffkj.e(this.d, dnmkVar.d) && this.f == dnmkVar.f && ffkj.e(this.e, dnmkVar.e);
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        ffix ffixVar = this.c;
        return (((((((hashCode * 31) + (ffixVar == null ? 0 : ffixVar.hashCode())) * 31) + this.d.hashCode()) * 31) + this.f) * 31) + this.e.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextFieldListItemUiData(hint=");
        sb.append(this.a);
        sb.append(", text=");
        sb.append(this.b);
        sb.append(", onTextCleared=");
        sb.append(this.c);
        sb.append(", onTextChange=");
        sb.append(this.d);
        sb.append(", keyboardType=");
        sb.append((Object) (this.f != 1 ? "TEXT" : "PHONE"));
        sb.append(", flags=");
        sb.append(this.e);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ dnmk(String str, String str2, ffix ffixVar, ffji ffjiVar, dnmj dnmjVar) {
        this(str, str2, ffixVar, ffjiVar, 2, dnmjVar);
    }
}
