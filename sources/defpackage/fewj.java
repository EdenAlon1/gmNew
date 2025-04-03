package defpackage;

import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fewj {
    public static final ffxx a(fdxk fdxkVar, febs febsVar, fdxj fdxjVar, febo feboVar, fewc fewcVar) {
        return new fgcp(new fewi(fdxjVar, fdxkVar, febsVar, feboVar, fewcVar, null));
    }

    public static final Object b(fdxk fdxkVar, febs febsVar, Object obj, fdxj fdxjVar, febo feboVar, ffgu ffguVar) {
        if (febsVar.a == febr.UNARY) {
            return fgbj.f(fewp.a(a(fdxkVar, febsVar, fdxjVar, feboVar, new fewb(obj)), febsVar), ffguVar);
        }
        Objects.toString(febsVar);
        throw new IllegalArgumentException("Expected a unary RPC method, but got ".concat(febsVar.toString()));
    }
}
