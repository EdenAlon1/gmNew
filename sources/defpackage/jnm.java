package defpackage;

import android.util.Log;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jnm extends ffkk implements ffji {
    public static final jnm a = new jnm();

    public jnm() {
        super(1);
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        obj.getClass();
        String str = (String) obj;
        Locale forLanguageTag = Locale.forLanguageTag(str);
        if (ffkj.e(forLanguageTag.toLanguageTag(), "und")) {
            Log.e("Locale", a.a(str, "The language tag ", " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'."));
        }
        return new jwq(forLanguageTag);
    }
}
