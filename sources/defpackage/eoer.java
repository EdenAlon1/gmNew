package defpackage;

import java.io.Reader;
import java.nio.CharBuffer;
import java.util.ArrayDeque;
import java.util.Queue;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eoer {
    public final Readable a;
    public final Reader b;
    public final CharBuffer c;
    public final char[] d;
    public final Queue e;
    public final eoep f;

    public eoer(Readable readable) {
        CharBuffer allocate = CharBuffer.allocate(2048);
        this.c = allocate;
        this.d = allocate.array();
        this.e = new ArrayDeque();
        this.f = new eoeq(this);
        this.a = readable;
        this.b = (Reader) readable;
    }
}
