package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.Xml;
import com.google.android.apps.messaging.R;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehpn {
    public int a;
    public ehow b;
    public int[][] c;
    public ehow[] d;

    public ehpn(Context context, int i) {
        int next;
        int depth;
        a();
        try {
            XmlResourceParser xml = context.getResources().getXml(i);
            try {
                AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        if (xml.getName().equals("selector")) {
                            Resources.Theme theme = context.getTheme();
                            int depth2 = xml.getDepth() + 1;
                            while (true) {
                                int next2 = xml.next();
                                if (next2 == 1 || ((depth = xml.getDepth()) < depth2 && next2 == 3)) {
                                    break;
                                }
                                if (next2 == 2 && depth <= depth2 && xml.getName().equals("item")) {
                                    TypedArray obtainAttributes = theme == null ? context.getResources().obtainAttributes(asAttributeSet, ehor.a) : theme.obtainStyledAttributes(asAttributeSet, ehor.a, 0, 0);
                                    ehow ehowVar = new ehow(ehow.b(context, obtainAttributes.getResourceId(0, 0), obtainAttributes.getResourceId(1, 0)));
                                    obtainAttributes.recycle();
                                    int attributeCount = asAttributeSet.getAttributeCount();
                                    int[] iArr = new int[attributeCount];
                                    int i2 = 0;
                                    for (int i3 = 0; i3 < attributeCount; i3++) {
                                        int attributeNameResource = asAttributeSet.getAttributeNameResource(i3);
                                        if (attributeNameResource != R.attr.shapeAppearance && attributeNameResource != R.attr.shapeAppearanceOverlay) {
                                            int i4 = i2 + 1;
                                            iArr[i2] = asAttributeSet.getAttributeBooleanValue(i3, false) ? attributeNameResource : -attributeNameResource;
                                            i2 = i4;
                                        }
                                    }
                                    int[] trimStateSet = StateSet.trimStateSet(iArr, i2);
                                    int i5 = this.a;
                                    if (i5 == 0 || trimStateSet.length == 0) {
                                        this.b = ehowVar;
                                    }
                                    int[][] iArr2 = this.c;
                                    if (i5 >= iArr2.length) {
                                        int i6 = i5 + 10;
                                        int[][] iArr3 = new int[i6][];
                                        System.arraycopy(iArr2, 0, iArr3, 0, i5);
                                        this.c = iArr3;
                                        ehow[] ehowVarArr = new ehow[i6];
                                        System.arraycopy(this.d, 0, ehowVarArr, 0, i5);
                                        this.d = ehowVarArr;
                                    }
                                    int[][] iArr4 = this.c;
                                    int i7 = this.a;
                                    iArr4[i7] = trimStateSet;
                                    this.d[i7] = ehowVar;
                                    this.a = i7 + 1;
                                }
                            }
                        }
                        if (xml != null) {
                            xml.close();
                            return;
                        }
                        return;
                    }
                } while (next != 1);
                throw new XmlPullParserException("No start tag found");
            } finally {
            }
        } catch (Resources.NotFoundException | IOException | XmlPullParserException unused) {
            a();
        }
    }

    private final void a() {
        this.b = new ehow();
        this.c = new int[10][];
        this.d = new ehow[10];
    }
}
