package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cgx {
    public static final int a(knr knrVar) {
        if (knrVar == null) {
            return 0;
        }
        String str = knrVar.d;
        return str != null ? str.hashCode() : Objects.hash(knrVar.a, knrVar.c, Boolean.valueOf(knrVar.e), Boolean.valueOf(knrVar.f));
    }

    public static final boolean b(knr knrVar, knr knrVar2) {
        if (knrVar == null && knrVar2 == null) {
            return true;
        }
        if (knrVar == null || knrVar2 == null) {
            return false;
        }
        String str = knrVar.d;
        String str2 = knrVar2.d;
        if (str == null && str2 == null) {
            return ffkj.e(Objects.toString(knrVar.a), Objects.toString(knrVar2.a)) && ffkj.e(knrVar.c, knrVar2.c) && knrVar.e == knrVar2.e && knrVar.f == knrVar2.f;
        }
        return ffkj.e(str, str2);
    }
}
