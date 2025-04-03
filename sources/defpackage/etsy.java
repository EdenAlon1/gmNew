package defpackage;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etsy {
    public final Map a;
    public final Map b;

    public etsy(etsw etswVar) {
        this.a = new HashMap(etswVar.a);
        this.b = new HashMap(etswVar.b);
    }

    public final Class a(Class cls) {
        if (this.b.containsKey(cls)) {
            return ((ettc) this.b.get(cls)).a();
        }
        throw new GeneralSecurityException(a.b(cls, "No input primitive class for ", " available"));
    }

    public final Object b(etfs etfsVar, Class cls) {
        etsx etsxVar = new etsx(etfsVar.getClass(), cls);
        if (this.a.containsKey(etsxVar)) {
            return ((etsv) this.a.get(etsxVar)).a(etfsVar);
        }
        throw new GeneralSecurityException(a.b(etsxVar, "No PrimitiveConstructor for ", " available"));
    }

    public final Object c(ettb ettbVar, Class cls) {
        if (!this.b.containsKey(cls)) {
            throw new GeneralSecurityException("No wrapper found for ".concat(cls.toString()));
        }
        ettc ettcVar = (ettc) this.b.get(cls);
        if (ettbVar.b.equals(ettcVar.a()) && ettcVar.a().equals(ettbVar.b)) {
            return ettcVar.c(ettbVar);
        }
        throw new GeneralSecurityException("Input primitive type of the wrapper doesn't match the type of primitives in the provided PrimitiveSet");
    }
}
