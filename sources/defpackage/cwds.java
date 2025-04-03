package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwds {
    public final cwis a;
    public final Object b;
    public final Map c;
    private final ffsk d;
    private final ffhd e;
    private final aqkp f;

    public cwds(ffsk ffskVar, ffhd ffhdVar, cwis cwisVar, aqkp aqkpVar) {
        ffskVar.getClass();
        ffhdVar.getClass();
        cwisVar.getClass();
        aqkpVar.getClass();
        this.d = ffskVar;
        this.e = ffhdVar;
        this.a = cwisVar;
        this.f = aqkpVar;
        this.b = new Object();
        this.c = new LinkedHashMap();
        axol.k(ffskVar, ffhdVar, new cwdr(this, null), 2);
    }

    public final cwdd a(aoku aokuVar) {
        Recipient f = this.f.f(aokuVar);
        elfl b = f.E(1).b();
        b.getClass();
        return new cwdd(f, b);
    }

    public final cwdd b(aoku aokuVar) {
        cwdd cwddVar;
        aokuVar.getClass();
        synchronized (this.b) {
            Map map = this.c;
            Object obj = map.get(aokuVar);
            if (obj == null) {
                obj = a(aokuVar);
                map.put(aokuVar, obj);
            }
            cwddVar = (cwdd) obj;
        }
        return cwddVar;
    }
}
