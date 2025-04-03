package defpackage;

import android.util.Log;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qzu implements qud {
    private final File a;
    private final qzv b;
    private Object c;

    public qzu(File file, qzv qzvVar) {
        this.a = file;
        this.b = qzvVar;
    }

    @Override // defpackage.qud
    public final Class a() {
        return this.b.a();
    }

    @Override // defpackage.qud
    public final void e() {
        Object obj = this.c;
        if (obj != null) {
            try {
                this.b.c(obj);
            } catch (IOException unused) {
            }
        }
    }

    @Override // defpackage.qud
    public final qsy eV() {
        return qsy.LOCAL;
    }

    @Override // defpackage.qud
    public final void g(qqe qqeVar, quc qucVar) {
        try {
            Object b = this.b.b(this.a);
            this.c = b;
            qucVar.c(b);
        } catch (FileNotFoundException e) {
            if (Log.isLoggable("FileLoader", 3)) {
                Log.d("FileLoader", "Failed to open file", e);
            }
            qucVar.f(e);
        }
    }

    @Override // defpackage.qud
    public final void d() {
    }
}
