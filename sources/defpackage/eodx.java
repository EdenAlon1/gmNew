package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eodx {
    public static final enip a = enip.v("applet", "base", "embed", "math", "meta", "object", "svg", "template");
    private static final enip b = new enpx("script");
    private static final enip c = new enpx("style");
    private static final enip d = enip.v("area", "br", "col", "hr", "img", "input", "link", "param", "source", "track", "wbr");
    private static final enip e;
    private static final enip f;

    static {
        new enpx("input");
        new enpx("form");
        new enpx("script");
        enip.r("button", "input");
        enip.r("button", "input");
        e = enip.r("a", "area");
        f = enip.v("alternate", "author", "bookmark", "canonical", "cite", "help", "icon", "license", "next", "prefetch", "dns-prefetch", "prerender", "preconnect", "preload", "prev", "search", "subresource");
        new enpx("form");
        new enpx("input");
        enip.r("input", "textarea");
        enip.u("audio", "img", "input", "source", "video");
        new enpx("iframe");
    }

    public static final eodw a(String str, Map map, List list) {
        StringBuilder sb = new StringBuilder("<a");
        for (Map.Entry entry : map.entrySet()) {
            sb.append(" ");
            sb.append((String) entry.getKey());
            sb.append("=\"");
            sb.append(eodu.a((String) entry.getValue()));
            sb.append("\"");
        }
        boolean contains = d.contains("a");
        sb.append(">");
        if (!contains) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                sb.append((String) it.next());
            }
            sb.append("</a>");
        }
        return new eodw(sb.toString());
    }

    public static final void b(String str, String str2, List list) {
        Iterator it = Arrays.asList(eody.a(str)).iterator();
        emxf.p(!d.contains("a"), "Element \"%s\" is a void element and so cannot have content.", "a");
        emxf.p(!b.contains("a"), "Element \"%s\" requires SafeScript contents, not SafeHTML or text.", "a");
        emxf.p(true ^ c.contains("a"), "Element \"%s\" requires SafeStyleSheet contents, not SafeHTML or text.", "a");
        while (it.hasNext()) {
            list.add(((eodw) it.next()).a);
        }
    }

    public static final void c(eodz eodzVar, String str, Map map) {
        enip enipVar = e;
        if (!enipVar.contains("a")) {
            throw new IllegalArgumentException("Attribute \"href\" with a SafeUrl value can only be used by one of the following elements: ".concat(String.valueOf(String.valueOf(enipVar))));
        }
        String str2 = eodzVar.b;
        int i = eodu.a;
        map.put("href", evsa.a(str2));
    }
}
