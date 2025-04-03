package defpackage;

import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evnr extends evnt {
    final /* synthetic */ boolean a;
    final /* synthetic */ Method b;
    final /* synthetic */ evlf c;
    final /* synthetic */ evlf d;
    final /* synthetic */ boolean e;
    final /* synthetic */ boolean f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public evnr(String str, Field field, boolean z, Method method, evlf evlfVar, evlf evlfVar2, boolean z2, boolean z3) {
        super(str, field);
        this.a = z;
        this.b = method;
        this.c = evlfVar;
        this.d = evlfVar2;
        this.e = z2;
        this.f = z3;
    }

    @Override // defpackage.evnt
    public final void a(evpl evplVar, int i, Object[] objArr) {
        Object a = this.d.a(evplVar);
        if (a != null || !this.e) {
            objArr[i] = a;
            return;
        }
        throw new evkx("null is not allowed as value for record component '" + this.i + "' of primitive type; at path " + evplVar.e());
    }

    @Override // defpackage.evnt
    public final void b(evpl evplVar, Object obj) {
        Object a = this.d.a(evplVar);
        if (a == null && this.e) {
            return;
        }
        if (this.a) {
            ReflectiveTypeAdapterFactory.b(obj, this.h);
        } else if (this.f) {
            throw new evku("Cannot set value of 'static final' ".concat(evpf.e(this.h, false)));
        }
        this.h.set(obj, a);
    }

    @Override // defpackage.evnt
    public final void c(evpn evpnVar, Object obj) {
        Object obj2;
        if (this.a) {
            Method method = this.b;
            if (method == null) {
                ReflectiveTypeAdapterFactory.b(obj, this.h);
            } else {
                ReflectiveTypeAdapterFactory.b(obj, method);
            }
        }
        Method method2 = this.b;
        if (method2 != null) {
            try {
                obj2 = method2.invoke(obj, new Object[0]);
            } catch (InvocationTargetException e) {
                throw new evku(a.a(evpf.e(this.b, false), "Accessor ", " threw exception"), e.getCause());
            }
        } else {
            obj2 = this.h.get(obj);
        }
        if (obj2 == obj) {
            return;
        }
        evpnVar.i(this.g);
        this.c.b(evpnVar, obj2);
    }
}
