package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class albu {
    public final albq a;

    public albu(albq albqVar) {
        this.a = albqVar;
    }

    public final void a(final Runnable runnable, final String str, Executor executor) {
        axos.a(new Runnable() { // from class: albt
            @Override // java.lang.Runnable
            public final void run() {
                albu albuVar = albu.this;
                albq albqVar = albuVar.a;
                String str2 = str;
                albqVar.b(str2);
                runnable.run();
                albuVar.a.n(str2);
            }
        }, executor);
    }
}
