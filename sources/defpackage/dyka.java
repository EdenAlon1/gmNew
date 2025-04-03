package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Random;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyka {
    public final Random a = new Random();
    public int b = 3;
    public int c = 0;
    public ListenableFuture d;

    public final void a() {
        this.b = 3;
        this.c = 0;
        ListenableFuture listenableFuture = this.d;
        if (listenableFuture != null) {
            listenableFuture.cancel(true);
            this.d = null;
        }
    }
}
