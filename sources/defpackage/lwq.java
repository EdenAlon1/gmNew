package defpackage;

import android.graphics.BitmapFactory;
import java.util.concurrent.Executors;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lwq implements ltm {
    public static final /* synthetic */ int d = 0;
    public final errl a;
    public final lwm b;
    public final BitmapFactory.Options c;

    static {
        emys.a(new emyl() { // from class: lwo
            @Override // defpackage.emyl
            public final Object get() {
                int i = lwq.d;
                return errs.a(Executors.newSingleThreadExecutor());
            }
        });
    }

    public lwq(errl errlVar, lwm lwmVar, BitmapFactory.Options options) {
        this.a = errlVar;
        this.b = lwmVar;
        this.c = options;
    }
}
