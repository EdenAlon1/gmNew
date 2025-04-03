package defpackage;

import android.accounts.Account;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dxbq {
    public static dxbq c(String str, emxc emxcVar) {
        int i = eodh.a;
        eodd f = eodf.a.f();
        f.l(str);
        if (emxcVar.g()) {
            f.l("|");
            f.l(dwxn.a((Account) emxcVar.c()));
        }
        return new dxbp(1, f.q().toString());
    }

    public abstract String a();

    public abstract int b();

    public final String toString() {
        return a();
    }
}
