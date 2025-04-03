package defpackage;

import java.io.IOException;
import java.io.InputStream;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkld extends DefaultHandler {
    private static final enhk a;
    private final XmlPullParser b = XmlPullParserFactory.newInstance().newPullParser();

    static {
        enhd enhdVar = new enhd();
        enhdVar.k("state", new dklc() { // from class: dkky
            @Override // defpackage.dklc
            public final void a(dkku dkkuVar, String str) {
                dkkuVar.a = str.equalsIgnoreCase("active");
            }
        });
        enhdVar.k("refresh", new dklc() { // from class: dkkz
            @Override // defpackage.dklc
            public final void a(dkku dkkuVar, String str) {
                dkkuVar.b = Long.parseLong(str);
            }
        });
        enhdVar.k("contenttype", new dklc() { // from class: dkla
            @Override // defpackage.dklc
            public final void a(dkku dkkuVar, String str) {
            }
        });
        enhdVar.k("lastactive", new dklc() { // from class: dklb
            @Override // defpackage.dklc
            public final void a(dkku dkkuVar, String str) {
                dkkuVar.a(str);
            }
        });
        a = enhdVar.c();
    }

    public final dkku a(InputStream inputStream) {
        dkku dkkuVar = new dkku();
        try {
            this.b.setInput(inputStream, "utf-8");
            this.b.nextTag();
            this.b.require(2, null, "isComposing");
            while (this.b.nextTag() == 2) {
                dklc dklcVar = (dklc) a.get(this.b.getName());
                if (dklcVar != null) {
                    dklcVar.a(dkkuVar, this.b.nextText());
                } else {
                    int i = 1;
                    while (i > 0) {
                        int next = this.b.next();
                        if (next == 3) {
                            i--;
                        } else if (next == 2) {
                            i++;
                        }
                    }
                }
            }
            this.b.require(3, null, "isComposing");
            return dkkuVar;
        } catch (XmlPullParserException e) {
            throw new IOException("Error while parsing notification message.", e);
        }
    }
}
