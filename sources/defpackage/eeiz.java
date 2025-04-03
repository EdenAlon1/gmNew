package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eeiz implements Cloneable {
    public eeix a;
    public int b;

    public eeiz() {
        this.a = null;
        this.b = -1;
    }

    public final String a() {
        String str;
        if (this.a == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        eeix eeixVar = this.a;
        if (eeixVar.b != 3 || eeix.a(eeixVar.a)) {
            str = eeixVar.a;
        } else {
            str = "[" + eeixVar.a + "]";
        }
        sb.append(str);
        if (this.b > 0) {
            sb.append(':');
            sb.append(this.b);
        }
        return sb.toString();
    }

    public final Object clone() {
        return new eeiz(this);
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof eeiz)) {
            return false;
        }
        eeiz eeizVar = (eeiz) obj;
        if (this.b != eeizVar.b) {
            return false;
        }
        eeix eeixVar = this.a;
        if (eeixVar != null || eeizVar.a == null) {
            return eeixVar == null || eeixVar.equals(eeizVar.a);
        }
        return false;
    }

    public final int hashCode() {
        int i = this.b * 37;
        eeix eeixVar = this.a;
        eeixVar.getClass();
        return i + eeixVar.hashCode();
    }

    public eeiz(eeiz eeizVar) {
        this.a = null;
        this.b = -1;
        this.a = eeizVar.a;
        this.b = eeizVar.b;
    }
}
