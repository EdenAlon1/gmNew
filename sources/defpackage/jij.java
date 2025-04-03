package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.TypedValue;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jij {
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.jib a(android.content.res.Resources.Theme r37, android.content.res.Resources r38, android.content.res.XmlResourceParser r39, int r40) {
        /*
            Method dump skipped, instructions count: 754
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jij.a(android.content.res.Resources$Theme, android.content.res.Resources, android.content.res.XmlResourceParser, int):jib");
    }

    public static final igz b(int i, hfd hfdVar) {
        Context context = (Context) hfdVar.e(AndroidCompositionLocals_androidKt.b);
        Resources resources = (Resources) hfdVar.e(AndroidCompositionLocals_androidKt.c);
        Resources.Theme theme = context.getTheme();
        Object configuration = resources.getConfiguration();
        boolean D = hfdVar.D(configuration) | hfdVar.B(i) | hfdVar.D(resources) | hfdVar.D(theme);
        Object f = hfdVar.f();
        if (D || f == hfc.a) {
            TypedValue typedValue = new TypedValue();
            resources.getValue(i, typedValue, true);
            XmlResourceParser xml = resources.getXml(i);
            iiq.b(xml);
            f = a(theme, resources, xml, typedValue.changingConfigurations).a;
            hfdVar.y(f);
        }
        return (igz) f;
    }
}
