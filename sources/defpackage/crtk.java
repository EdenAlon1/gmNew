package defpackage;

import java.io.Reader;
import java.io.StreamTokenizer;
import java.text.MessageFormat;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class crtk implements fgtx {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/util/calendar/VCalendarParser");
    public final crtf b = new crtf(this);
    public final crtg c = new crtg(this);
    public final crti d = new crti(this);
    public final crtj e = new crtj(this);
    public final crth f = new crth(this);

    public static int a(StreamTokenizer streamTokenizer, Reader reader) {
        int lineno = streamTokenizer.lineno();
        if (streamTokenizer.ttype == 10) {
            lineno--;
        }
        return lineno + ((fguj) reader).a;
    }

    public static int b(StreamTokenizer streamTokenizer, Reader reader) {
        int nextToken = streamTokenizer.nextToken();
        if (nextToken != -1) {
            return nextToken;
        }
        throw new fgui("Unexpected end of file", a(streamTokenizer, reader));
    }

    public static void c(StreamTokenizer streamTokenizer, Reader reader) {
        while (b(streamTokenizer, reader) == 10) {
        }
    }

    public static void d(StreamTokenizer streamTokenizer, StringBuilder sb) {
        if (streamTokenizer.ttype == -3) {
            sb.append(streamTokenizer.sval);
        } else {
            sb.append((char) streamTokenizer.ttype);
        }
    }

    public static void e(StreamTokenizer streamTokenizer, Reader reader, String str, boolean z) {
        f(streamTokenizer, reader, -3);
        if (!(z ? emuz.e(str, streamTokenizer.sval) : str.equals(streamTokenizer.sval))) {
            throw new fgui(MessageFormat.format("Expected [{0}], read [{1}]", Integer.valueOf(str), streamTokenizer.sval), a(streamTokenizer, reader));
        }
    }

    public static void f(StreamTokenizer streamTokenizer, Reader reader, int i) {
        if (b(streamTokenizer, reader) != i) {
            throw new fgui(MessageFormat.format("Expected [{0}], read [{1}]", Integer.valueOf(i), Integer.valueOf(streamTokenizer.ttype)), a(streamTokenizer, reader));
        }
    }
}
