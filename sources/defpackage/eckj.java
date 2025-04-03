package defpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class eckj {
    public final File a;
    public int b = 0;
    public boolean c = false;
    private final String d;
    private File e;

    public eckj(File file, String str) {
        this.a = file;
        this.d = str;
    }

    final int a() {
        if (c()) {
            return this.b;
        }
        return 0;
    }

    public final File b() {
        if (this.e == null) {
            this.e = new File(this.a, this.d.concat("_crash_counter_storage.pb"));
        }
        return this.e;
    }

    public final boolean c() {
        if (this.c) {
            return true;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(b());
            try {
                this.b = ((eckr) eyfy.parseFrom(eckr.a, fileInputStream, eyfc.a())).c;
                fileInputStream.close();
            } finally {
            }
        } catch (FileNotFoundException unused) {
            this.b = 0;
        } catch (IOException e) {
            ((enrr) ((enrr) ((enrr) ecdj.a.j()).g(e)).h("com/google/android/libraries/performance/primes/metrics/crash/CrashCounter", "maybeLoad", 'f', "CrashCounter.java")).q("failed to read counter from disk.");
            return false;
        }
        this.c = true;
        return true;
    }
}
