package defpackage;

import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nzw extends oaa {
    private final Class r;

    public nzw(Class cls) {
        super(cls, null);
        if (cls.isEnum()) {
            this.r = cls;
        } else {
            Objects.toString(cls);
            throw new IllegalArgumentException(cls.toString().concat(" is not an Enum type."));
        }
    }

    @Override // defpackage.oaa, defpackage.oab
    public final String e() {
        String name = this.r.getName();
        name.getClass();
        return name;
    }

    @Override // defpackage.oaa, defpackage.oab
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final Enum c(String str) {
        Object obj;
        str.getClass();
        Object[] enumConstants = this.r.getEnumConstants();
        enumConstants.getClass();
        int i = 0;
        while (true) {
            if (i >= enumConstants.length) {
                obj = null;
                break;
            }
            obj = enumConstants[i];
            if (ffpc.j(((Enum) obj).name(), str, true)) {
                break;
            }
            i++;
        }
        Enum r2 = (Enum) obj;
        if (r2 != null) {
            return r2;
        }
        throw new IllegalArgumentException("Enum value " + str + " not found for type " + this.r.getName() + '.');
    }
}
