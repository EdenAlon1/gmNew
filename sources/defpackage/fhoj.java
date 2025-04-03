package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhoj implements Cloneable, Serializable {
    private static final long serialVersionUID = 1;
    public final String a;
    public String b;
    public String c;
    public int d;
    private Class f = String.class;
    public List e = new ArrayList();

    public fhoj(String str, String str2, boolean z, String str3) {
        this.d = -1;
        if (str.length() == 1) {
            char charAt = str.charAt(0);
            if (!Character.isJavaIdentifierPart(charAt) && charAt != '?' && charAt != '@') {
                throw new IllegalArgumentException(a.H(charAt, "Illegal option name '", "'"));
            }
        } else {
            for (char c : str.toCharArray()) {
                if (!Character.isJavaIdentifierPart(c)) {
                    throw new IllegalArgumentException("The option '" + str + "' contains an illegal character : '" + c + "'");
                }
            }
        }
        this.a = str;
        this.b = str2;
        if (z) {
            this.d = 1;
        }
        this.c = str3;
    }

    public final boolean a() {
        return this.d > 0;
    }

    public final boolean b() {
        return this.b != null;
    }

    public final Object clone() {
        try {
            fhoj fhojVar = (fhoj) super.clone();
            fhojVar.e = new ArrayList(this.e);
            return fhojVar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("A CloneNotSupportedException was thrown: ".concat(String.valueOf(e.getMessage())));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            fhoj fhojVar = (fhoj) obj;
            if (this.a.equals(fhojVar.a)) {
                String str = this.b;
                return str == null ? fhojVar.b == null : str.equals(fhojVar.b);
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[ option: ");
        sb.append(this.a);
        if (this.b != null) {
            sb.append(" ");
            sb.append(this.b);
        }
        sb.append(" ");
        if (a()) {
            sb.append(" [ARG]");
        }
        sb.append(" :: ");
        sb.append(this.c);
        if (this.f != null) {
            sb.append(" :: ");
            sb.append(this.f);
        }
        sb.append(" ]");
        return sb.toString();
    }
}
