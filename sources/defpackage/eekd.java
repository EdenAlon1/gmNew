package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class eekd extends eekz {
    public eeio a;

    public eekd(String str) {
        super(str);
    }

    @Override // defpackage.eeku
    public String a() {
        if (this.a == null) {
            throw new RuntimeException("No body!");
        }
        StringBuffer stringBuffer = new StringBuffer();
        if (this.a.c != 1) {
            stringBuffer.append("<");
        }
        stringBuffer.append(this.a.c());
        if (this.a.c != 1) {
            stringBuffer.append(">");
        }
        if (!this.e.h()) {
            stringBuffer.append(";");
            stringBuffer.append(this.e.c());
        }
        return stringBuffer.toString();
    }

    public void b(eeio eeioVar) {
        this.a = eeioVar;
    }

    @Override // defpackage.eeku, defpackage.eeiw
    public Object clone() {
        eekd eekdVar = new eekd(this.c);
        eeio eeioVar = this.a;
        if (eeioVar != null) {
            eekdVar.a = eeioVar;
        }
        eejd eejdVar = this.e;
        if (eejdVar != null) {
            eekdVar.e = eejdVar;
        }
        return eekdVar;
    }

    @Override // defpackage.eekz, defpackage.eeku
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof eekd)) {
            return false;
        }
        eekd eekdVar = (eekd) obj;
        eeio eeioVar = this.a;
        if (eeioVar == null && eekdVar.a != null) {
            return false;
        }
        if (eeioVar == null || eeioVar.equals(eekdVar.a)) {
            return super.equals(obj);
        }
        return false;
    }

    @Override // defpackage.eekz, defpackage.eeku
    public int hashCode() {
        int hashCode = super.hashCode();
        eeio eeioVar = this.a;
        return eeioVar != null ? (hashCode * 37) + eeioVar.hashCode() : hashCode;
    }

    public eekd(String str, eeio eeioVar) {
        super(str);
        this.a = eeioVar;
    }
}
