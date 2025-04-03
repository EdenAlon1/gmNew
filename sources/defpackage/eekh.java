package defpackage;

import com.android.vcard.VCardBuilder;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eekh extends eeku implements Cloneable {
    protected eeki a;

    public eekh() {
        super("Call-Id");
    }

    @Override // defpackage.eeku
    public final String a() {
        eeki eekiVar = this.a;
        return eekiVar == null ? "" : eekiVar.c();
    }

    public final void b(String str) {
        this.a = new eeki(str);
    }

    @Override // defpackage.eeku, defpackage.eeiw
    public final String c() {
        return this.c + ": " + this.a.c() + VCardBuilder.VCARD_END_OF_LINE;
    }

    @Override // defpackage.eeku, defpackage.eeiw
    public final Object clone() {
        eekh eekhVar = new eekh();
        eeki eekiVar = this.a;
        if (eekiVar != null) {
            eekhVar.a = (eeki) eekiVar.clone();
        }
        return eekhVar;
    }

    @Override // defpackage.eeku
    public final eejd d() {
        return null;
    }

    @Override // defpackage.eeku
    public final boolean equals(Object obj) {
        if (obj instanceof eekh) {
            return this.a.equals(((eekh) obj).a);
        }
        return false;
    }

    @Override // defpackage.eeku
    public final int hashCode() {
        return 11127650;
    }
}
