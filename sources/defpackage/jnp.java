package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jnp extends ffkk implements ffji {
    public static final jnp a = new jnp();

    public jnp() {
        super(1);
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        if (ffkj.e(obj, false)) {
            return new iak(9205357640488583168L);
        }
        obj.getClass();
        List list = (List) obj;
        Object obj2 = list.get(0);
        Float f = obj2 != null ? (Float) obj2 : null;
        f.getClass();
        float floatValue = f.floatValue();
        Object obj3 = list.get(1);
        (obj3 != null ? (Float) obj3 : null).getClass();
        return new iak((Float.floatToRawIntBits(floatValue) << 32) | (Float.floatToRawIntBits(r1.floatValue()) & 4294967295L));
    }
}
