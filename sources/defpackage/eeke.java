package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class eeke extends eekz {
    public String a;

    public eeke(String str) {
        super(str);
        this.e.b = ",";
        this.a = "Digest";
    }

    @Override // defpackage.eeku
    public final String a() {
        return this.a + " " + this.e.c();
    }

    @Override // defpackage.eeku, defpackage.eeiw
    public final Object clone() {
        try {
            eeke eekeVar = (eeke) getClass().newInstance();
            String str = this.a;
            if (str != null) {
                eekeVar.a = str;
            }
            eejd eejdVar = this.e;
            if (eejdVar != null) {
                eekeVar.e = (eejd) eejdVar.clone();
            }
            return eekeVar;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // defpackage.eekz, defpackage.eeku
    public final boolean equals(Object obj) {
        if (!(obj instanceof eeke)) {
            return false;
        }
        eeke eekeVar = (eeke) obj;
        return this.a.equalsIgnoreCase(eekeVar.a) && this.e.equals(eekeVar.e);
    }

    @Override // defpackage.eekz, defpackage.eeku
    public final int hashCode() {
        return 34765;
    }
}
