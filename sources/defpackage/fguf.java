package defpackage;

import java.io.Reader;
import java.io.StreamTokenizer;
import java.text.MessageFormat;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fguf implements fgtx {
    public final Log a = LogFactory.getLog(fguf.class);
    public final fgtz b = new fgtz(this);
    public final fgua c = new fgua(this);
    public final fgud d = new fgud(this);
    public final fgue e = new fgue(this);
    public final fgub f = new fgub(this);
    public final fguc g = new fguc(this);

    public static final int d(StreamTokenizer streamTokenizer, Reader reader) {
        int lineno = streamTokenizer.lineno();
        if (streamTokenizer.ttype == 10) {
            lineno--;
        }
        return lineno + ((fguj) reader).a;
    }

    public static final int e(StreamTokenizer streamTokenizer, Reader reader) {
        int nextToken = streamTokenizer.nextToken();
        if (nextToken != -1) {
            return nextToken;
        }
        throw new fgui("Unexpected end of file", d(streamTokenizer, reader));
    }

    public final void a(StreamTokenizer streamTokenizer, Reader reader) {
        while (e(streamTokenizer, reader) == 10) {
            if (this.a.isTraceEnabled()) {
                this.a.trace("Absorbing extra whitespace..");
            }
        }
        if (this.a.isTraceEnabled()) {
            this.a.trace("Aborting: absorbing extra whitespace complete");
        }
    }

    public final void b(StreamTokenizer streamTokenizer, Reader reader, int i) {
        if (e(streamTokenizer, reader) != i) {
            throw new fgui(MessageFormat.format("Expected [{0}], read [{1}]", Integer.valueOf(i), Integer.valueOf(streamTokenizer.ttype)), d(streamTokenizer, reader));
        }
        if (this.a.isDebugEnabled()) {
            this.a.debug(a.f(i, "[", "]"));
        }
    }

    public final void c(StreamTokenizer streamTokenizer, Reader reader, String str, boolean z) {
        b(streamTokenizer, reader, -3);
        if (z) {
            if (!str.equalsIgnoreCase(streamTokenizer.sval)) {
                throw new fgui(MessageFormat.format("Expected [{0}], read [{1}]", str, streamTokenizer.sval), d(streamTokenizer, reader));
            }
        } else if (!str.equals(streamTokenizer.sval)) {
            throw new fgui(MessageFormat.format("Expected [{0}], read [{1}]", str, streamTokenizer.sval), d(streamTokenizer, reader));
        }
        if (this.a.isDebugEnabled()) {
            this.a.debug(a.a(str, "[", "]"));
        }
    }
}
