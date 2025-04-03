package defpackage;

import android.graphics.Shader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iiq {
    public static final ibq a(kpb kpbVar) {
        if (!kpbVar.d()) {
            return null;
        }
        Shader shader = kpbVar.a;
        return shader != null ? new ibr(shader) : new idl(iby.c(kpbVar.b));
    }

    public static final void b(XmlPullParser xmlPullParser) {
        int next = xmlPullParser.next();
        while (next != 2) {
            if (next == 1) {
                throw new XmlPullParserException("No start tag found");
            }
            next = xmlPullParser.next();
        }
    }
}
