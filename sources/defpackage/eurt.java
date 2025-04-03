package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eurt implements Executor {
    public static final eurt a;
    private static final Handler b;
    private static final /* synthetic */ eurt[] c;

    static {
        eurt eurtVar = new eurt();
        a = eurtVar;
        c = new eurt[]{eurtVar};
        b = new Handler(Looper.getMainLooper());
    }

    private eurt() {
    }

    public static eurt[] values() {
        return (eurt[]) c.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        b.post(runnable);
    }
}
