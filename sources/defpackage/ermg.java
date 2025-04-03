package defpackage;

import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ermg extends ermh {
    public static final /* synthetic */ int a = 0;

    static {
        Pattern.compile("[+-]?(?:NaN|Infinity|(?:\\d+#(?:\\.\\d*#)?|\\.\\d+#)(?:[eE][+-]?\\d+#)?[fFdD]?|0[xX](?:[0-9a-fA-F]+#(?:\\.[0-9a-fA-F]*#)?|\\.[0-9a-fA-F]+#)[pP][+-]?\\d+#[fFdD]?)".replace("#", "+"));
    }

    public static double a(double... dArr) {
        emxf.a(true);
        double d = dArr[0];
        for (int i = 1; i < 3; i++) {
            d = Math.max(d, dArr[i]);
        }
        return d;
    }
}
