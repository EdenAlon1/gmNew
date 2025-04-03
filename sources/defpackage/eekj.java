package defpackage;

import com.android.vcard.VCardBuilder;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eekj extends eeku implements Cloneable {
    public final String a;

    public eekj(String str) {
        super("X-Pidgey-Conference-Params");
        this.a = str;
    }

    @Override // defpackage.eeku
    public final String a() {
        String str = this.a;
        return str == null ? "" : str;
    }

    @Override // defpackage.eeku, defpackage.eeiw
    public final String c() {
        return this.c + ": " + this.a + VCardBuilder.VCARD_END_OF_LINE;
    }

    @Override // defpackage.eeku, defpackage.eeiw
    public final Object clone() {
        return new eekj(this.a);
    }

    @Override // defpackage.eeku
    public final eejd d() {
        return null;
    }

    @Override // defpackage.eeku
    public final boolean equals(Object obj) {
        if (obj instanceof eekj) {
            return this.a.equals(((eekj) obj).a);
        }
        return false;
    }

    @Override // defpackage.eeku
    public final int hashCode() {
        return 22227650;
    }
}
