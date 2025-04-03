package defpackage;

import com.google.android.gms.common.api.Status;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class edgh {
    private final qoo a;
    private final edjp b;

    public edgh(qoo qooVar, edjp edjpVar) {
        this.a = qooVar;
        this.b = edjpVar;
    }

    static /* synthetic */ void c(dhri dhriVar, qou qouVar) {
        try {
            dhriVar.c(edgb.b(qouVar));
        } catch (Error | RuntimeException e) {
            edti.b(e);
            throw e;
        }
    }

    public final dhre a(edgn edgnVar, final Class cls) {
        String b = edgnVar.b();
        Map c = edgnVar.c();
        dhqd a = edgnVar.a();
        final dhri dhriVar = a != null ? new dhri(a) : new dhri();
        final edgg edggVar = new edgg(b, new qoq() { // from class: edgd
            @Override // defpackage.qoq
            public final void a(Object obj) {
                edgh.this.b(cls, dhriVar, (JSONObject) obj);
            }
        }, new qop() { // from class: edge
            @Override // defpackage.qop
            public final void a(qou qouVar) {
                edgh.c(dhri.this, qouVar);
            }
        }, c);
        if (a != null) {
            a.a(new dhrb() { // from class: edgf
                @Override // defpackage.dhrb
                public final void a() {
                    qpl.this.e();
                }
            });
        }
        this.a.a(edggVar);
        return dhriVar.a;
    }

    public final /* synthetic */ void b(Class cls, dhri dhriVar, JSONObject jSONObject) {
        try {
            try {
                edjp edjpVar = this.b;
                try {
                    dhriVar.d((edgo) edjpVar.a.i(jSONObject.toString(), cls));
                } catch (evlb unused) {
                    throw new edgp(a.N(cls, "Could not convert JSON string to ", " due to syntax errors."));
                }
            } catch (edgp e) {
                dhriVar.c(new dfqu(new Status(8, e.getMessage())));
            }
        } catch (Error | RuntimeException e2) {
            edti.b(e2);
            throw e2;
        }
    }
}
