package defpackage;

import java.io.File;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dgbw {
    public final File a;
    public final File b;
    private final dgbs c;

    public dgbw(dgbs dgbsVar, File file, File file2) {
        this.c = dgbsVar;
        this.a = file;
        this.b = file2;
    }

    public final File a() {
        return this.c.b;
    }

    public final File b() {
        return this.c.a;
    }

    public final boolean c() {
        return a().isFile() && this.a.isDirectory();
    }
}
