package defpackage;

import java.io.IOException;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhku extends IOException {
    public final int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fhku(int i) {
        super("stream was reset: ".concat(fhjk.a(i)));
        Objects.toString(fhjk.a(i));
        this.a = i;
    }
}
