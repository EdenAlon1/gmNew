package defpackage;

import com.android.vcard.VCardConstants;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class acpd implements acpg {
    private final acyu a;
    private final String b;

    public acpd(acyu acyuVar, String str) {
        this.a = acyuVar;
        this.b = str;
    }

    @Override // defpackage.acpg
    public final acyu a(Map map) {
        cskc cskcVar = acow.a;
        String e = acrz.e(new aclr(this.b));
        csjb c = acow.a.c();
        c.I("Loading Ditto Satellite");
        c.A(VCardConstants.PROPERTY_URL, e);
        c.r();
        this.a.e(e, map);
        return this.a;
    }

    @Override // defpackage.acpg
    public final void b() {
    }
}
