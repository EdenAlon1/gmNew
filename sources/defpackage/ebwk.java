package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Arrays;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ebwk implements ebwg {
    public static final String[] a;
    public final Context b;
    public final errl c;

    static {
        int i = digt.a;
        a = new String[]{"service_googleone"};
    }

    public ebwk(Context context, ExecutorService executorService) {
        this.b = context;
        this.c = errs.a(executorService);
    }

    @Override // defpackage.ebwg
    public final ListenableFuture a() {
        return elfr.h(new Callable() { // from class: ebwj
            @Override // java.util.concurrent.Callable
            public final Object call() {
                int i = dezv.a;
                return Arrays.asList(dfac.k(ebwk.this.b));
            }
        }, this.c);
    }
}
