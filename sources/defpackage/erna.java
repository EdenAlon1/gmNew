package defpackage;

import java.io.Closeable;
import java.io.Flushable;
import java.io.Writer;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erna implements Closeable, Flushable {
    public static final /* synthetic */ int d = 0;
    public final Writer a;
    public final String b = "\n";
    public final ermz c;

    public erna(Writer writer, ermz ermzVar) {
        this.a = writer;
        this.c = ermzVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // java.io.Flushable
    public final void flush() {
        this.a.flush();
    }
}
