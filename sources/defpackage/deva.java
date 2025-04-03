package defpackage;

import android.content.SharedPreferences;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class deva implements deve {
    final devc b;
    final String c;

    protected deva(devc devcVar, String str) {
        this.b = devcVar;
        this.c = str;
    }

    @Override // defpackage.deve
    public final String a() {
        return this.c;
    }

    protected abstract Object b(SharedPreferences sharedPreferences);

    protected abstract void c(SharedPreferences.Editor editor, Object obj);

    public Object d() {
        return b(this.b.a());
    }

    public final void e(Object obj) {
        SharedPreferences.Editor edit = this.b.a().edit();
        c(edit, obj);
        devc.b(edit);
    }
}
