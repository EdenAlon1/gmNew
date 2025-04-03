package defpackage;

import java.io.File;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffim implements ffnl {
    public final File a;

    public ffim(File file) {
        this.a = file;
    }

    @Override // defpackage.ffnl
    public final Iterator a() {
        return new ffik(this);
    }
}
