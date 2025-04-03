package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class duyx implements duyz {
    private final duyw a;

    public duyx(Context context) {
        duyw duywVar = new duyw(context);
        this.a = duywVar;
        duywVar.c();
    }

    @Override // defpackage.duyz
    public final SharedPreferences.Editor a() {
        this.a.c();
        return this.a.b;
    }

    @Override // defpackage.duyz
    public final void b(duzi duziVar) {
        duziVar.a();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.a.b();
    }

    @Override // defpackage.emyl
    public final /* bridge */ /* synthetic */ Object get() {
        this.a.c();
        return this.a;
    }
}
