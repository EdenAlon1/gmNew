package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class alzw implements alzt {
    public final String a;
    private final ctyx b;
    private final boolean c;
    private final Object d;
    private final Object e;

    public alzw(ctyx ctyxVar, String str, boolean z, Object obj, Object obj2) {
        this.b = ctyxVar;
        this.a = str;
        this.c = z;
        this.d = obj;
        this.e = obj2;
    }

    @Override // defpackage.alzt
    public final Object a() {
        return this.b.q(this.a, this.c) ? this.d : this.e;
    }

    @Override // defpackage.alzt
    public final boolean b(Object obj) {
        if (Objects.equals(a(), obj)) {
            return false;
        }
        this.b.h(this.a, Objects.equals(obj, this.d));
        return true;
    }
}
