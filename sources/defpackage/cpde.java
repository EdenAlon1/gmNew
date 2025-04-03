package defpackage;

import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cpde {
    public final fazb a;

    public cpde(fazb fazbVar) {
        fazbVar.getClass();
        this.a = fazbVar;
    }

    public final boolean a(boolean z, int i, int i2) {
        if (!z) {
            return false;
        }
        cpbn a = ((cpbs) this.a.b()).a(i);
        if (TextUtils.isEmpty(a.j())) {
            return true;
        }
        int a2 = a.a();
        return a2 >= 0 && i2 > a2;
    }
}
