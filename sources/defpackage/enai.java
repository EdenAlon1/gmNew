package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class enai<K, V> implements Serializable, emyz {
    private static final long serialVersionUID = 1;
    public final enbf a;

    public enai(enbf enbfVar) {
        this.a = enbfVar;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use ManualSerializationProxy");
    }

    @Override // defpackage.emyz
    public final Object b(Object obj) {
        obj.getClass();
        enbf enbfVar = this.a;
        int a = enbfVar.a(obj);
        return enbfVar.b(a).f(obj, a);
    }

    @Override // defpackage.emyz
    public final void c(Object obj) {
        this.a.remove(obj);
    }

    @Override // defpackage.emyz
    public final void d(Object obj, Object obj2) {
        this.a.put(obj, obj2);
    }

    Object writeReplace() {
        return new enaj(this.a);
    }
}
