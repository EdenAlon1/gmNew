package defpackage;

import com.android.vcard.VCardBuilder;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eelm extends eeku implements Cloneable {
    public eeln a;

    public eelm() {
        super("X-Google-Event-Id");
    }

    @Override // defpackage.eeku
    public final String a() {
        eeln eelnVar = this.a;
        return eelnVar == null ? "" : eelnVar.a;
    }

    @Override // defpackage.eeku, defpackage.eeiw
    public final String c() {
        return this.c + ": " + this.a.a + VCardBuilder.VCARD_END_OF_LINE;
    }

    @Override // defpackage.eeku, defpackage.eeiw
    public final Object clone() {
        eelm eelmVar = new eelm();
        eeln eelnVar = this.a;
        if (eelnVar != null) {
            eelmVar.a = (eeln) eelnVar.clone();
        }
        return eelmVar;
    }

    @Override // defpackage.eeku
    public final eejd d() {
        return null;
    }

    @Override // defpackage.eeku
    public final boolean equals(Object obj) {
        if (obj instanceof eelm) {
            return this.a.equals(((eelm) obj).a);
        }
        return false;
    }

    @Override // defpackage.eeku
    public final int hashCode() {
        String str;
        eeln eelnVar = this.a;
        if (eelnVar == null || (str = eelnVar.a) == null) {
            return 11127650;
        }
        return str.hashCode();
    }
}
