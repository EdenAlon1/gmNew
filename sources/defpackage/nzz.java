package defpackage;

import android.os.Bundle;
import java.io.Serializable;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nzz extends oab {
    private final Class r;

    public nzz(Class cls) {
        super(true);
        if (!Serializable.class.isAssignableFrom(cls)) {
            Objects.toString(cls);
            throw new IllegalArgumentException(cls.toString().concat(" does not implement Serializable."));
        }
        try {
            Class<?> cls2 = Class.forName("[L" + cls.getName() + ';');
            cls2.getClass();
            this.r = cls2;
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // defpackage.oab
    public final /* bridge */ /* synthetic */ Object b(Bundle bundle, String str) {
        str.getClass();
        return (Serializable[]) bundle.get(str);
    }

    @Override // defpackage.oab
    public final /* bridge */ /* synthetic */ Object c(String str) {
        str.getClass();
        throw new UnsupportedOperationException("Arrays don't support default values.");
    }

    @Override // defpackage.oab
    public final String e() {
        String name = this.r.getName();
        name.getClass();
        return name;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !ffkj.e(getClass(), obj.getClass())) {
            return false;
        }
        return ffkj.e(this.r, ((nzz) obj).r);
    }

    @Override // defpackage.oab
    public final /* bridge */ /* synthetic */ void f(Bundle bundle, String str, Object obj) {
        Object obj2 = (Serializable[]) obj;
        str.getClass();
        this.r.cast(obj2);
        bundle.putSerializable(str, (Serializable) obj2);
    }

    public final int hashCode() {
        return this.r.hashCode();
    }
}
