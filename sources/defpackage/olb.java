package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class olb extends CancellationException {
    public final olh a;

    public olb(olh olhVar) {
        super("Cancelled isolated runner");
        this.a = olhVar;
    }
}
