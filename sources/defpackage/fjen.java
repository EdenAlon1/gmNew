package defpackage;

import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fjen implements fjbu {
    private static final fhgn a;
    private static final Charset b;
    private final evkn c;
    private final evlf d;

    static {
        Pattern pattern = fhgn.a;
        a = fhgm.a("application/json; charset=UTF-8");
        b = Charset.forName("UTF-8");
    }

    public fjen(evkn evknVar, evlf evlfVar) {
        this.c = evknVar;
        this.d = evlfVar;
    }

    @Override // defpackage.fjbu
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        fhmt fhmtVar = new fhmt();
        evpn d = this.c.d(new OutputStreamWriter(new fhms(fhmtVar), b));
        this.d.b(d, obj);
        d.close();
        return new fhgw(a, fhmtVar.t());
    }
}
