package defpackage;

import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nzo {
    public static final oab a(TypedValue typedValue, oab oabVar, oab oabVar2, String str, String str2) {
        if (oabVar == null || oabVar == oabVar2) {
            return oabVar == null ? oabVar2 : oabVar;
        }
        throw new XmlPullParserException("Type is " + str + " but found " + str2 + ": " + typedValue.data);
    }
}
