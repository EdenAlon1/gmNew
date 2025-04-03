package defpackage;

import com.android.vcard.VCardConstants;
import java.io.Reader;
import java.io.StreamTokenizer;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class crti {
    final /* synthetic */ crtk a;

    public crti(crtk crtkVar) {
        this.a = crtkVar;
    }

    public final void a(StreamTokenizer streamTokenizer, Reader reader, fgug fgugVar) {
        crtk.f(streamTokenizer, reader, -3);
        while (!emuz.e(VCardConstants.PROPERTY_END, streamTokenizer.sval)) {
            if (emuz.e(VCardConstants.PROPERTY_BEGIN, streamTokenizer.sval)) {
                this.a.c.a(streamTokenizer, reader, fgugVar);
            } else {
                this.a.e.a(streamTokenizer, reader, fgugVar);
            }
            crtk.c(streamTokenizer, reader);
        }
    }
}
