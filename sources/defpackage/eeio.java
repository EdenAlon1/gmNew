package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eeio extends eeiw {
    public String a;
    public eeit b;
    public int c = 1;

    public final int a() {
        eeit eeitVar = this.b;
        if (!(eeitVar instanceof eeiq)) {
            throw new IllegalArgumentException("address is not a SipURI");
        }
        eeiz a = ((eeiq) eeitVar).a();
        if (a != null) {
            return a.b;
        }
        throw new IllegalArgumentException("SipURI does not have host port.");
    }

    @Override // defpackage.eeiw
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final eeio clone() {
        eeio eeioVar = new eeio();
        eeioVar.c = this.c;
        String str = this.a;
        if (str != null) {
            eeioVar.a = str;
        }
        eeit eeitVar = this.b;
        if (eeitVar != null) {
            eeioVar.b = (eeit) eeitVar.clone();
        }
        return eeioVar;
    }

    @Override // defpackage.eeiw
    public final String c() {
        if (this.c == 3) {
            return "*";
        }
        StringBuffer stringBuffer = new StringBuffer();
        if (this.a != null) {
            stringBuffer.append("\"");
            stringBuffer.append(this.a);
            stringBuffer.append("\" ");
        }
        if (this.b != null) {
            if (this.c == 1 || this.a != null) {
                stringBuffer.append("<");
            }
            stringBuffer.append(this.b.c());
            if (this.c == 1 || this.a != null) {
                stringBuffer.append(">");
            }
        }
        return stringBuffer.toString();
    }

    public final void d(String str) {
        this.a = str;
        this.c = 1;
    }

    public final void e(String str) {
        this.b.h(str);
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof eeio)) {
            return false;
        }
        eeio eeioVar = (eeio) obj;
        if (this.c != eeioVar.c) {
            return false;
        }
        eeit eeitVar = this.b;
        if (eeitVar != null || eeioVar.b == null) {
            return eeitVar == null || eeitVar.equals(eeioVar.b);
        }
        return false;
    }

    public final int hashCode() {
        int i = this.c;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        eeit eeitVar = this.b;
        return eeitVar != null ? (i2 * 37) + eeitVar.hashCode() : i2;
    }
}
