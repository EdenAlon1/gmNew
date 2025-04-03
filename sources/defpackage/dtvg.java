package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class dtvg {
    protected final dtvj a;
    public final duap b;

    protected dtvg(dtvj dtvjVar, duap duapVar) {
        this.b = duapVar;
        this.a = dtvjVar;
    }

    public final int b() {
        ArrayList arrayList = new ArrayList();
        dtrc dtrcVar = (dtrc) this.a;
        dtve e = dtub.e(dtrcVar.d);
        dtxb a = dtwg.a();
        String str = dtrcVar.a;
        dtwf a2 = a.a(e, str, this.b);
        int a3 = e.a(str, this.b.b(dtzu.b(), arrayList), (String[]) arrayList.toArray(new String[0]), this.a);
        a2.a(a3 > 0);
        return a3;
    }
}
