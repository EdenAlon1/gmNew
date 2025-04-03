package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.TypedValue;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.lang.ref.WeakReference;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jie {
    public static final igq a(int i, hfd hfdVar, int i2) {
        TypedValue typedValue;
        boolean z;
        Context context = (Context) hfdVar.e(AndroidCompositionLocals_androidKt.b);
        Resources resources = (Resources) hfdVar.e(AndroidCompositionLocals_androidKt.c);
        jig jigVar = (jig) hfdVar.e(AndroidCompositionLocals_androidKt.e);
        synchronized (jigVar) {
            typedValue = (TypedValue) jigVar.a.a(i);
            z = true;
            if (typedValue == null) {
                typedValue = new TypedValue();
                resources.getValue(i, typedValue, true);
                cnw cnwVar = jigVar.a;
                int c = cnwVar.c(i);
                Object[] objArr = cnwVar.c;
                Object obj = objArr[c];
                cnwVar.b[c] = i;
                objArr[c] = typedValue;
            }
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && ffpc.N(charSequence, ".xml")) {
            hfdVar.v(-803162373);
            Resources.Theme theme = context.getTheme();
            int i3 = typedValue.changingConfigurations;
            jid jidVar = (jid) hfdVar.e(AndroidCompositionLocals_androidKt.d);
            jic jicVar = new jic(theme, i);
            WeakReference weakReference = (WeakReference) jidVar.a.get(jicVar);
            jib jibVar = weakReference != null ? (jib) weakReference.get() : null;
            if (jibVar == null) {
                XmlResourceParser xml = resources.getXml(i);
                iiq.b(xml);
                if (!ffkj.e(xml.getName(), "vector")) {
                    throw new IllegalArgumentException("Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG, WEBP");
                }
                jibVar = jij.a(theme, resources, xml, i3);
                jidVar.a.put(jicVar, new WeakReference(jibVar));
            }
            iil b = iim.b(jibVar.a, hfdVar);
            hfdVar.o();
            return b;
        }
        hfdVar.v(-803006939);
        Object theme2 = context.getTheme();
        boolean D = hfdVar.D(charSequence);
        if ((((i2 & 14) ^ 6) <= 4 || !hfdVar.B(i)) && (i2 & 6) != 4) {
            z = false;
        }
        boolean D2 = D | z | hfdVar.D(theme2);
        Object f = hfdVar.f();
        if (D2 || f == hfc.a) {
            try {
                f = jia.a(resources, i);
                hfdVar.y(f);
            } catch (Exception e) {
                Objects.toString(charSequence);
                throw new jih("Error attempting to load resource: ".concat(String.valueOf(charSequence)), e);
            }
        }
        igo igoVar = new igo((ich) f);
        hfdVar.o();
        return igoVar;
    }
}
