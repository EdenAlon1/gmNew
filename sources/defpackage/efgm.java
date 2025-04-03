package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efgm implements effs {
    public final Context a;
    public final String b;
    public final Set c;
    public SharedPreferences d;
    private final Executor e;
    private final emyl f;
    private final efgi g;

    public efgm(efgj efgjVar) {
        this.a = efgjVar.a;
        this.e = efgjVar.b;
        this.b = efgjVar.c;
        this.c = efgjVar.d;
        this.g = efgjVar.f;
        this.f = efgjVar.e;
    }

    public static efgj d(Context context, Executor executor) {
        return new efgj(context.getApplicationContext(), executor);
    }

    @Override // defpackage.effs
    public final ListenableFuture a() {
        return ((Boolean) this.f.get()).booleanValue() ? erre.a : erqt.m(new Callable() { // from class: efgf
            @Override // java.util.concurrent.Callable
            public final Object call() {
                efgm efgmVar = efgm.this;
                Set<String> set = efgmVar.c;
                if (set == null) {
                    set = efgmVar.d.getAll().keySet();
                }
                SharedPreferences.Editor edit = efgmVar.d.edit();
                Iterator<String> it = set.iterator();
                while (it.hasNext()) {
                    edit.remove(it.next());
                }
                if (edit.commit()) {
                    return null;
                }
                throw new IOException("Failed to remove migrated SharedPreferences keys: ".concat(String.valueOf(efgmVar.b)));
            }
        }, this.e);
    }

    @Override // defpackage.effs
    public final ListenableFuture b(eyhs eyhsVar) {
        return erqt.i(this.g.a.a(new efgl(this.d, this.c), eyhsVar));
    }

    @Override // defpackage.effs
    public final ListenableFuture c() {
        return erqt.m(new Callable() { // from class: efgg
            @Override // java.util.concurrent.Callable
            public final Object call() {
                efgm efgmVar = efgm.this;
                efgmVar.d = efgmVar.a.getSharedPreferences(efgmVar.b, 0);
                Set set = efgmVar.c;
                if (set == null) {
                    return Boolean.valueOf(!efgmVar.d.getAll().isEmpty());
                }
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    if (efgmVar.d.contains((String) it.next())) {
                        return true;
                    }
                }
                return false;
            }
        }, this.e);
    }
}
