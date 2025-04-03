package defpackage;

import java.io.BufferedReader;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ffio implements ffnl {
    public final BufferedReader a;

    public ffio(BufferedReader bufferedReader) {
        this.a = bufferedReader;
    }

    @Override // defpackage.ffnl
    public final Iterator a() {
        return new ffin(this);
    }
}
