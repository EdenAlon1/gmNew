package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nzx extends oab {
    private final Class r;

    public nzx(Class cls) {
        super(true);
        if (!Parcelable.class.isAssignableFrom(cls)) {
            Objects.toString(cls);
            throw new IllegalArgumentException(cls.toString().concat(" does not implement Parcelable."));
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
        return (Parcelable[]) bundle.get(str);
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
        return ffkj.e(this.r, ((nzx) obj).r);
    }

    @Override // defpackage.oab
    public final /* bridge */ /* synthetic */ void f(Bundle bundle, String str, Object obj) {
        Parcelable[] parcelableArr = (Parcelable[]) obj;
        str.getClass();
        this.r.cast(parcelableArr);
        bundle.putParcelableArray(str, parcelableArr);
    }

    public final int hashCode() {
        return this.r.hashCode();
    }
}
