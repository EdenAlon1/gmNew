package defpackage;

import android.content.Context;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kkd {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final void a(Context context, int i, SparseArray sparseArray, SparseArray sparseArray2) {
        char c;
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            kkb kkbVar = null;
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    int i2 = -1;
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                c = 4;
                                break;
                            }
                            c = 65535;
                            break;
                        case 80204913:
                            if (name.equals("State")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1382829617:
                            if (name.equals("StateSet")) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1657696882:
                            if (name.equals("layoutDescription")) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        default:
                            c = 65535;
                            break;
                    }
                    if (c != 2) {
                        if (c == 3) {
                            kkc kkcVar = new kkc(context, xml);
                            if (kkbVar != null) {
                                kkbVar.b.add(kkcVar);
                            }
                        } else if (c == 4) {
                            kkk kkkVar = new kkk();
                            int attributeCount = xml.getAttributeCount();
                            for (int i3 = 0; i3 < attributeCount; i3++) {
                                String attributeName = xml.getAttributeName(i3);
                                String attributeValue = xml.getAttributeValue(i3);
                                if (attributeName != null && attributeValue != null && "id".equals(attributeName)) {
                                    int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName()) : -1;
                                    if (identifier != -1) {
                                        i2 = identifier;
                                    } else if (attributeValue.length() > 1) {
                                        i2 = Integer.parseInt(attributeValue.substring(1));
                                    } else {
                                        Log.e("ConstraintLayoutStates", "error in parsing id");
                                    }
                                    kkkVar.k(context, xml);
                                    sparseArray2.put(i2, kkkVar);
                                }
                            }
                        }
                    } else {
                        kkb kkbVar2 = new kkb(context, xml);
                        sparseArray.put(kkbVar2.a, kkbVar2);
                        kkbVar = kkbVar2;
                    }
                }
            }
        } catch (IOException e) {
            Log.e("ConstraintLayoutStates", a.h(i, "Error parsing resource: "), e);
        } catch (XmlPullParserException e2) {
            Log.e("ConstraintLayoutStates", a.h(i, "Error parsing resource: "), e2);
        }
    }
}
