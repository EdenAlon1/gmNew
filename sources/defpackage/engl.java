package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.EnumMap;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class engl extends enhf {
    private final transient EnumMap a;

    public engl(EnumMap enumMap) {
        this.a = enumMap;
        emxf.a(!enumMap.isEmpty());
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use EnumSerializedForm");
    }

    @Override // defpackage.enhf
    public final enqu a() {
        return new enmo(this.a.entrySet().iterator());
    }

    @Override // defpackage.enhk, java.util.Map
    public final boolean containsKey(Object obj) {
        return this.a.containsKey(obj);
    }

    @Override // defpackage.enhk, java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof engl) {
            obj = ((engl) obj).a;
        }
        return this.a.equals(obj);
    }

    @Override // defpackage.enhk, java.util.Map
    public final Object get(Object obj) {
        return this.a.get(obj);
    }

    @Override // defpackage.enhk
    public final enqu hG() {
        return enju.d(this.a.keySet().iterator());
    }

    @Override // defpackage.enhk
    public final boolean hH() {
        return false;
    }

    @Override // java.util.Map
    public final int size() {
        return this.a.size();
    }

    @Override // defpackage.enhf, defpackage.enhk
    public Object writeReplace() {
        return new engk(this.a);
    }
}
