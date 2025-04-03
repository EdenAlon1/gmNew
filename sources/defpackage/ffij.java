package defpackage;

import java.io.File;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ffij extends ffil {
    private boolean b;

    public ffij(File file) {
        super(file);
    }

    @Override // defpackage.ffil
    public final File a() {
        if (this.b) {
            return null;
        }
        this.b = true;
        return this.a;
    }
}
