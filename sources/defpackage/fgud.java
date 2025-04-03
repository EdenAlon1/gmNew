package defpackage;

import com.android.vcard.VCardConstants;
import java.io.Reader;
import java.io.StreamTokenizer;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fgud {
    final /* synthetic */ fguf a;

    public fgud(fguf fgufVar) {
        this.a = fgufVar;
    }

    public final void a(StreamTokenizer streamTokenizer, Reader reader, fgug fgugVar) {
        this.a.b(streamTokenizer, reader, -3);
        while (!VCardConstants.PROPERTY_END.equalsIgnoreCase(streamTokenizer.sval)) {
            if (VCardConstants.PROPERTY_BEGIN.equalsIgnoreCase(streamTokenizer.sval)) {
                this.a.c.a(streamTokenizer, reader, fgugVar);
            } else {
                this.a.e.a(streamTokenizer, reader, fgugVar);
            }
            this.a.a(streamTokenizer, reader);
        }
    }
}
