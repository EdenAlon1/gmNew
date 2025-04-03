package defpackage;

import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rpg implements rpq {
    private rpq a;
    private final rod b;

    public rpg(rod rodVar) {
        this.b = rodVar;
    }

    public final synchronized rpq a() {
        if (this.a == null) {
            rod rodVar = this.b;
            rpn rpnVar = new rpn(rodVar.a.b);
            eexg eexgVar = ((roc) rodVar.a).a;
            List singletonList = eexgVar != null ? Collections.singletonList(new eexf(eexgVar.a)) : null;
            if (singletonList != null) {
                ror rorVar = new ror(singletonList);
                rpnVar.a(new rpl(roq.a), new roq(rorVar));
                roo rooVar = new roo(rorVar);
                rpnVar.a(new rpl("GET /dumpapp".getBytes()), rooVar);
                rpnVar.a(new rpl("POST /dumpapp".getBytes()), rooVar);
            }
            this.a = rpnVar;
        }
        return this.a;
    }
}
