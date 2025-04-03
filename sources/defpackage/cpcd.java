package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cpcd implements cpcc {
    private final ffbr a;

    public cpcd(ffbr ffbrVar) {
        ffbrVar.getClass();
        this.a = ffbrVar;
    }

    @Override // defpackage.cpcc
    public final Bundle a(int i) {
        Bundle bundle = new Bundle();
        int a = cpax.a();
        if (a != Integer.MIN_VALUE) {
            bundle.putAll(((cpby) this.a.b()).b(i, a));
        }
        return bundle;
    }
}
