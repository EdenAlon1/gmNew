package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class eeit extends eeiw {
    protected String d;
    public String e;

    protected eeit() {
    }

    @Override // defpackage.eeiw
    public String c() {
        return this.d;
    }

    @Override // defpackage.eeiw
    public Object clone() {
        try {
            return new eeit(this.d);
        } catch (Exception e) {
            throw new RuntimeException(String.valueOf(e.getMessage()).concat(String.valueOf(this.d)));
        }
    }

    public String d() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof eeit)) {
            return false;
        }
        eeit eeitVar = (eeit) obj;
        return emxb.a(this.e, eeitVar.e) && emxb.a(this.d, eeitVar.d);
    }

    public void h(String str) {
        throw new UnsupportedOperationException("setMethod should be overridden");
    }

    public int hashCode() {
        int hashCode = !emxe.c(this.e) ? this.e.hashCode() : 0;
        return !emxe.c(this.d) ? (hashCode * 37) + this.d.hashCode() : hashCode;
    }

    public boolean l() {
        return this instanceof eeiq;
    }

    public String toString() {
        return c();
    }

    public eeit(String str) {
        try {
            this.d = str;
            this.e = str.substring(0, str.indexOf(":"));
        } catch (Exception unused) {
            throw new eeje("URI, Bad URI format");
        }
    }
}
