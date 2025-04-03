package defpackage;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etit extends etgp {
    public final etiv a;
    public final eujt b;
    public final Integer c;

    private etit(etiv etivVar, eujt eujtVar, Integer num) {
        this.a = etivVar;
        this.b = eujtVar;
        this.c = num;
    }

    public static etit b(etiv etivVar, Integer num) {
        eujt b;
        etiu etiuVar = etiu.a;
        etiu etiuVar2 = etivVar.b;
        if (etiuVar2 == etiuVar) {
            if (num == null) {
                throw new GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
            }
            b = eujt.b(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
        } else {
            if (etiuVar2 != etiu.b) {
                throw new GeneralSecurityException("Unknown Variant: ".concat(etiuVar2.c));
            }
            if (num != null) {
                throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
            }
            b = eujt.b(new byte[0]);
        }
        return new etit(etivVar, b, num);
    }

    @Override // defpackage.etfs
    public final Integer a() {
        throw null;
    }
}
