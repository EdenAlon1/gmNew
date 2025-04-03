package defpackage;

import java.io.Reader;
import java.io.StreamTokenizer;
import java.text.MessageFormat;
import java.text.ParseException;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fgue {
    final /* synthetic */ fguf a;

    public fgue(fguf fgufVar) {
        this.a = fgufVar;
    }

    public final void a(StreamTokenizer streamTokenizer, Reader reader, fgug fgugVar) {
        String str = streamTokenizer.sval;
        if (this.a.a.isDebugEnabled()) {
            this.a.a.debug(MessageFormat.format("Property [{0}]", str));
        }
        fgtv fgtvVar = (fgtv) fgugVar;
        fgtvVar.d.e = fgtvVar.b.a(str.toUpperCase());
        fguf fgufVar = this.a;
        while (true) {
            fgub fgubVar = fgufVar.f;
            fguf fgufVar2 = fgubVar.a;
            if (fguf.e(streamTokenizer, reader) != 59) {
                StringBuffer stringBuffer = new StringBuffer();
                streamTokenizer.ordinaryChar(34);
                int e = fguf.e(streamTokenizer, reader);
                while (e != 10) {
                    if (streamTokenizer.ttype == -3) {
                        stringBuffer.append(streamTokenizer.sval);
                    } else {
                        stringBuffer.append((char) streamTokenizer.ttype);
                    }
                    e = fguf.e(streamTokenizer, reader);
                }
                streamTokenizer.quoteChar(34);
                try {
                    String stringBuffer2 = stringBuffer.toString();
                    fgtw.b(((fgtv) fgugVar).d.e);
                    fgwo fgwoVar = ((fgtv) fgugVar).d.e;
                    if (fgwoVar instanceof fgve) {
                        fgwoVar.c(fhev.d(stringBuffer2));
                    } else {
                        fgwoVar.c(stringBuffer2);
                    }
                    fgtw.b(fgtvVar.d.e);
                    fgtw fgtwVar = fgtvVar.d;
                    fgtwVar.e = fhen.a(fgtwVar.e);
                    fgtw fgtwVar2 = fgtvVar.d;
                    fgut fgutVar = fgtwVar2.c;
                    if (fgutVar != null) {
                        fgut fgutVar2 = fgtwVar2.d;
                        if (fgutVar2 != null) {
                            fgutVar2.b.add(fgtwVar2.e);
                        } else {
                            fgutVar.b.add(fgtwVar2.e);
                        }
                    } else {
                        fgum fgumVar = fgtwVar2.b;
                        if (fgumVar != null) {
                            fgumVar.a.add(fgtwVar2.e);
                        }
                    }
                    fgtvVar.d.e = null;
                    return;
                } catch (ParseException e2) {
                    ParseException parseException = new ParseException("[" + str + "] " + e2.getMessage(), e2.getErrorOffset());
                    parseException.initCause(e2);
                    throw parseException;
                }
            }
            fguc fgucVar = fgubVar.a.g;
            fgucVar.a.b(streamTokenizer, reader, -3);
            String str2 = streamTokenizer.sval;
            if (fgucVar.a.a.isDebugEnabled()) {
                fgucVar.a.a.debug(a.a(str2, "Parameter [", "]"));
            }
            fgucVar.a.b(streamTokenizer, reader, 61);
            StringBuffer stringBuffer3 = new StringBuffer();
            fguf fgufVar3 = fgucVar.a;
            if (fguf.e(streamTokenizer, reader) == 34) {
                stringBuffer3.append('\"');
                stringBuffer3.append(streamTokenizer.sval);
                stringBuffer3.append('\"');
            } else if (streamTokenizer.sval != null) {
                stringBuffer3.append(streamTokenizer.sval);
                fguf fgufVar4 = fgucVar.a;
                int e3 = fguf.e(streamTokenizer, reader);
                while (e3 != 59 && e3 != 58 && e3 != 44) {
                    if (streamTokenizer.ttype == -3) {
                        stringBuffer3.append(streamTokenizer.sval);
                    } else {
                        stringBuffer3.append((char) streamTokenizer.ttype);
                    }
                    fguf fgufVar5 = fgucVar.a;
                    e3 = fguf.e(streamTokenizer, reader);
                }
                streamTokenizer.pushBack();
            } else if (streamTokenizer.sval == null) {
                streamTokenizer.pushBack();
            }
            try {
                String stringBuffer4 = stringBuffer3.toString();
                try {
                    fgtw.b(((fgtv) fgugVar).d.e);
                    ((fgtv) fgugVar).d.e.b.c(((fgtv) fgugVar).c.a(str2.toUpperCase(), fhev.b(stringBuffer4)));
                } catch (RuntimeException e4) {
                    if (!((fgtv) fgugVar).d.e.a.startsWith("X-")) {
                        throw e4;
                    }
                }
            } catch (ClassCastException e5) {
                throw new fgui("Error parsing parameter", fguf.d(streamTokenizer, reader), e5);
            }
        }
    }
}
