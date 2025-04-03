package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eeip extends eeiw {
    public eeiz a;
    public eeiu b;

    public final Optional a() {
        return Optional.ofNullable(this.b);
    }

    public final String b() {
        eeiu eeiuVar = this.b;
        if (eeiuVar == null) {
            return null;
        }
        return eeiuVar.a;
    }

    @Override // defpackage.eeiw
    public final String c() {
        String stringBuffer;
        eeiu eeiuVar = this.b;
        if (eeiuVar == null) {
            String a = this.a.a();
            return a == null ? "" : a;
        }
        if (eeiuVar.b == null) {
            stringBuffer = eeiuVar.a;
        } else {
            StringBuffer stringBuffer2 = new StringBuffer(eeiuVar.a);
            stringBuffer2.append(":");
            stringBuffer2.append(eeiuVar.b);
            stringBuffer = stringBuffer2.toString();
        }
        return stringBuffer + "@" + this.a.a();
    }

    @Override // defpackage.eeiw
    public final Object clone() {
        eeip eeipVar = new eeip();
        String b = b();
        if (b != null) {
            eeipVar.d(b);
        }
        eeipVar.a = this.a;
        return eeipVar;
    }

    public final void d(String str) {
        if (str == null) {
            return;
        }
        if (this.b == null) {
            this.b = new eeiu();
        }
        this.b.a(str);
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof eeip)) {
            return false;
        }
        eeip eeipVar = (eeip) obj;
        eeiz eeizVar = this.a;
        if (eeizVar == null && eeipVar.a != null) {
            return false;
        }
        if (eeizVar != null && !eeizVar.equals(eeipVar.a)) {
            return false;
        }
        eeiu eeiuVar = this.b;
        if (eeiuVar != null || eeipVar.b == null) {
            return eeiuVar == null || eeiuVar.equals(eeipVar.b);
        }
        return false;
    }

    public final int hashCode() {
        eeiz eeizVar = this.a;
        int hashCode = eeizVar != null ? eeizVar.hashCode() : 0;
        eeiu eeiuVar = this.b;
        return eeiuVar != null ? (hashCode * 37) + eeiuVar.hashCode() : hashCode;
    }
}
