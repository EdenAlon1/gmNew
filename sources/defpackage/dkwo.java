package defpackage;

import j$.util.Collection;
import j$.util.function.Consumer$CC;
import j$.util.stream.Stream;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import javax.xml.namespace.QName;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkwo {
    private final enhk a;
    private final enhk b;

    public dkwo(Set set) {
        final HashMap hashMap = new HashMap();
        final HashMap hashMap2 = new HashMap();
        Collection.EL.stream(set).forEach(new Consumer() { // from class: dkwl
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                final dkwb dkwbVar = (dkwb) obj;
                Stream stream = Collection.EL.stream(dkwbVar.b());
                final Map map = hashMap;
                stream.forEach(new Consumer() { // from class: dkwm
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj2) {
                        map.put((QName) obj2, dkwbVar);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                Stream stream2 = Collection.EL.stream(dkwbVar.c());
                final Map map2 = hashMap2;
                stream2.forEach(new Consumer() { // from class: dkwn
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj2) {
                        map2.put((Class) obj2, dkwbVar);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        this.a = enhk.j(hashMap);
        this.b = enhk.j(hashMap2);
    }

    public final Object a(Document document, QName qName, XmlPullParser xmlPullParser) {
        dkwb dkwbVar = (dkwb) this.a.get(new QName(xmlPullParser.getNamespace(), xmlPullParser.getName()));
        return dkwbVar == null ? dkwd.d(document, xmlPullParser) : dkwbVar.a(document, qName, xmlPullParser);
    }

    public final void b(Object obj, XmlSerializer xmlSerializer) {
        dkwb dkwbVar = (dkwb) this.b.get(obj.getClass());
        if (dkwbVar != null) {
            dkwbVar.d(obj, xmlSerializer);
        } else if (obj instanceof Element) {
            dkwd.f((Element) obj, xmlSerializer);
        } else if (obj instanceof dkwc) {
            ((dkwc) obj).c(xmlSerializer);
        }
    }
}
