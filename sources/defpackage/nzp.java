package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import org.whispersystems.curve25519.Curve25519;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nzp {
    private static final ThreadLocal a = new ThreadLocal();
    private final Context b;
    private final oal c;

    public nzp(Context context, oal oalVar) {
        oalVar.getClass();
        this.b = context;
        this.c = oalVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x0134, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException("Every <deepLink> must include at least one of app:uri, app:action, or app:mimeType");
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x027e, code lost:
    
        return r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final defpackage.nzh b(android.content.res.Resources r18, android.content.res.XmlResourceParser r19, android.util.AttributeSet r20, int r21) {
        /*
            Method dump skipped, instructions count: 639
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nzp.b(android.content.res.Resources, android.content.res.XmlResourceParser, android.util.AttributeSet, int):nzh");
    }

    private static final nxe c(TypedArray typedArray, Resources resources, int i) {
        oab oabVar;
        Object obj;
        oab oabVar2;
        int i2;
        int[] iArr = oat.a;
        boolean z = false;
        boolean z2 = typedArray.getBoolean(3, false);
        ThreadLocal threadLocal = a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        String string = typedArray.getString(2);
        if (string != null) {
            oab oabVar3 = oab.a;
            String resourcePackageName = resources.getResourcePackageName(i);
            if (string.startsWith(Curve25519.JAVA)) {
                try {
                    oabVar = nzv.a("j$" + string.substring(4), resourcePackageName);
                } catch (RuntimeException e) {
                    if (!(e.getCause() instanceof ClassNotFoundException)) {
                        throw e;
                    }
                }
            }
            oabVar = nzv.a(string, resourcePackageName);
        } else {
            oabVar = null;
        }
        if (!typedArray.getValue(1, typedValue)) {
            obj = null;
        } else if (oabVar == oab.b) {
            if (typedValue.resourceId != 0) {
                i2 = typedValue.resourceId;
            } else {
                if (typedValue.type != 16 || typedValue.data != 0) {
                    throw new XmlPullParserException("unsupported value '" + ((Object) typedValue.string) + "' for " + oabVar.e() + ". Must be a reference to a resource.");
                }
                i2 = 0;
            }
            obj = Integer.valueOf(i2);
        } else if (typedValue.resourceId != 0) {
            if (oabVar != null) {
                throw new XmlPullParserException("unsupported value '" + ((Object) typedValue.string) + "' for " + oabVar.e() + ". You must use a \"reference\" type to reference other resources.");
            }
            oabVar = oab.b;
            obj = Integer.valueOf(typedValue.resourceId);
        } else if (oabVar == oab.n) {
            obj = typedArray.getString(1);
        } else {
            int i3 = typedValue.type;
            if (i3 == 3) {
                String obj2 = typedValue.string.toString();
                if (oabVar == null) {
                    obj2.getClass();
                    try {
                        try {
                            try {
                                try {
                                    oab.a.c(obj2);
                                    oabVar2 = oab.a;
                                } catch (IllegalArgumentException unused) {
                                    oabVar2 = oab.n;
                                }
                            } catch (IllegalArgumentException unused2) {
                                oab.h.c(obj2);
                                oabVar2 = oab.h;
                            }
                        } catch (IllegalArgumentException unused3) {
                            oab.k.c(obj2);
                            oabVar2 = oab.k;
                        }
                    } catch (IllegalArgumentException unused4) {
                        oab.e.c(obj2);
                        oabVar2 = oab.e;
                    }
                    oabVar = oabVar2;
                }
                obj = oabVar.c(obj2);
            } else if (i3 == 4) {
                oabVar = nzo.a(typedValue, oabVar, oab.h, string, "float");
                obj = Float.valueOf(typedValue.getFloat());
            } else if (i3 == 5) {
                oabVar = nzo.a(typedValue, oabVar, oab.a, string, "dimension");
                obj = Integer.valueOf((int) typedValue.getDimension(resources.getDisplayMetrics()));
            } else if (i3 == 18) {
                oabVar = nzo.a(typedValue, oabVar, oab.k, string, "boolean");
                obj = Boolean.valueOf(typedValue.data != 0);
            } else {
                if (typedValue.type < 16 || typedValue.type > 31) {
                    throw new XmlPullParserException("unsupported argument type " + typedValue.type);
                }
                oab oabVar4 = oab.h;
                if (oabVar == oabVar4) {
                    oabVar = nzo.a(typedValue, oabVar, oabVar4, string, "float");
                    obj = Float.valueOf(typedValue.data);
                } else {
                    oabVar = nzo.a(typedValue, oabVar, oab.a, string, "integer");
                    obj = Integer.valueOf(typedValue.data);
                }
            }
        }
        if (obj != null) {
            z = true;
        } else {
            obj = null;
        }
        oab oabVar5 = oabVar != null ? oabVar : null;
        if (oabVar5 == null) {
            oab oabVar6 = oab.a;
            if (obj instanceof Integer) {
                oabVar5 = oab.a;
            } else if (obj instanceof int[]) {
                oabVar5 = oab.c;
            } else if (obj instanceof Long) {
                oabVar5 = oab.e;
            } else if (obj instanceof long[]) {
                oabVar5 = oab.f;
            } else if (obj instanceof Float) {
                oabVar5 = oab.h;
            } else if (obj instanceof float[]) {
                oabVar5 = oab.i;
            } else if (obj instanceof Boolean) {
                oabVar5 = oab.k;
            } else if (obj instanceof boolean[]) {
                oabVar5 = oab.l;
            } else {
                boolean z3 = obj instanceof String;
                oabVar5 = oab.n;
            }
        }
        return new nxe(oabVar5, z2, obj, z);
    }

    public final nzl a(int i) {
        int next;
        Resources resources = this.b.getResources();
        XmlResourceParser xml = resources.getXml(i);
        xml.getClass();
        AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
        do {
            try {
                try {
                    next = xml.next();
                    if (next == 2) {
                        String name = xml.getName();
                        resources.getClass();
                        asAttributeSet.getClass();
                        nzh b = b(resources, xml, asAttributeSet, i);
                        if (b instanceof nzl) {
                            return (nzl) b;
                        }
                        throw new IllegalArgumentException(a.a(name, "Root element <", "> did not inflate into a NavGraph"));
                    }
                } catch (Exception e) {
                    throw new RuntimeException("Exception inflating " + resources.getResourceName(i) + " line " + xml.getLineNumber(), e);
                }
            } finally {
                xml.close();
            }
        } while (next != 1);
        throw new XmlPullParserException("No start tag found");
    }
}
