package defpackage;

import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lcv {
    public final eyhs a;
    private final eyfc b;

    public lcv(eyhs eyhsVar, eyfc eyfcVar) {
        eyfcVar.getClass();
        this.a = eyhsVar;
        this.b = eyfcVar;
    }

    public final Object a(InputStream inputStream) {
        try {
            Object k = this.a.getParserForType().k(inputStream, this.b);
            k.getClass();
            return k;
        } catch (eygu e) {
            throw new laf(e);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lcv(eyhs eyhsVar) {
        this(eyhsVar, eyfc.a);
        eyfc eyfcVar = eyfc.a;
        eyib eyibVar = eyib.a;
    }
}
