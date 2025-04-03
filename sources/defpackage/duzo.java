package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class duzo implements duyz {
    public final Context a;
    public volatile boolean b;
    public duxy c;
    public volatile duzi d;
    private volatile boolean e;
    private final AtomicReference f = new AtomicReference();
    private volatile SharedPreferences.Editor g;

    public duzo(Context context) {
        this.a = context;
    }

    @Override // defpackage.duyz
    public final SharedPreferences.Editor a() {
        return this.g;
    }

    @Override // defpackage.duyz
    public final void b(duzi duziVar) {
        this.d = duziVar;
        if (this.b) {
            d();
        }
    }

    public final SharedPreferences c(SharedPreferences sharedPreferences, boolean z) {
        this.e = z;
        SharedPreferences sharedPreferences2 = (SharedPreferences) this.f.getAndSet(sharedPreferences);
        this.g = sharedPreferences.edit();
        return sharedPreferences2;
    }

    public final void d() {
        duzi duziVar = this.d;
        if (duziVar != null) {
            duziVar.a();
        }
    }

    @Override // defpackage.emyl
    public final /* bridge */ /* synthetic */ Object get() {
        return (SharedPreferences) this.f.get();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
    }
}
