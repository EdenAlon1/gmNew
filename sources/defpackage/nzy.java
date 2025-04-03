package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nzy extends oab {
    private final Class r;

    public nzy(Class cls) {
        super(true);
        if (Parcelable.class.isAssignableFrom(cls) || Serializable.class.isAssignableFrom(cls)) {
            this.r = cls;
        } else {
            Objects.toString(cls);
            throw new IllegalArgumentException(cls.toString().concat(" does not implement Parcelable or Serializable."));
        }
    }

    @Override // defpackage.oab
    public final Object b(Bundle bundle, String str) {
        str.getClass();
        return bundle.get(str);
    }

    @Override // defpackage.oab
    public final Object c(String str) {
        str.getClass();
        throw new UnsupportedOperationException("Parcelables don't support default values.");
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
        return ffkj.e(this.r, ((nzy) obj).r);
    }

    @Override // defpackage.oab
    public final void f(Bundle bundle, String str, Object obj) {
        str.getClass();
        this.r.cast(obj);
        if (obj == null || (obj instanceof Parcelable)) {
            bundle.putParcelable(str, (Parcelable) obj);
        } else if (obj instanceof Serializable) {
            bundle.putSerializable(str, (Serializable) obj);
        }
    }

    public final int hashCode() {
        return this.r.hashCode();
    }
}
