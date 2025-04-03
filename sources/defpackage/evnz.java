package defpackage;

import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evnz extends evlf {
    private final evkn a;
    private final evlf b;
    private final Type c;

    public evnz(evkn evknVar, evlf evlfVar, Type type) {
        this.a = evknVar;
        this.b = evlfVar;
        this.c = type;
    }

    @Override // defpackage.evlf
    public final Object a(evpl evplVar) {
        return this.b.a(evplVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.reflect.Type] */
    @Override // defpackage.evlf
    public final void b(evpn evpnVar, Object obj) {
        evlf c;
        ?? r0 = this.c;
        Class<?> cls = (obj == null || !((r0 instanceof Class) || (r0 instanceof TypeVariable))) ? r0 : obj.getClass();
        evlf evlfVar = this.b;
        if (cls != r0) {
            evlfVar = this.a.a(new evpj(cls));
            if (evlfVar instanceof evns) {
                evlf evlfVar2 = this.b;
                while ((evlfVar2 instanceof evnx) && (c = ((evnx) evlfVar2).c()) != evlfVar2) {
                    evlfVar2 = c;
                }
                if (!(evlfVar2 instanceof evns)) {
                    evlfVar = this.b;
                }
            }
        }
        evlfVar.b(evpnVar, obj);
    }
}
