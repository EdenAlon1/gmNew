package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjcf {
    public final Context a;
    public final cjck b;
    public final cjat c;
    public final ffbr d;
    public final cuxh e;
    public final ffbr f;

    public cjcf(Context context, cjck cjckVar, cjat cjatVar, ffbr ffbrVar, cuxh cuxhVar, ffbr ffbrVar2) {
        this.a = context;
        this.b = cjckVar;
        this.c = cjatVar;
        this.d = ffbrVar;
        this.e = cuxhVar;
        this.f = ffbrVar2;
    }

    public static String a(bcyk bcykVar, cjay cjayVar) {
        return bcykVar.X() ? bcykVar.t() : emxe.b(((cixx) cjayVar).a);
    }

    public final boolean b(bcyk bcykVar, engw engwVar, cjay cjayVar) {
        if (!ctid.b && !ctid.f(this.a)) {
            boolean z = engwVar.size() == 1 && bcykVar.N() == ((bcse) enjk.j(engwVar)).i();
            cixx cixxVar = (cixx) cjayVar;
            String str = cixxVar.d;
            if (str != null && cixxVar.c != null && ((le.n(str) || le.A(cixxVar.d)) && z)) {
                return true;
            }
        }
        return false;
    }
}
