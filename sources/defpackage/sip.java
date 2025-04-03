package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sip extends BroadcastReceiver {
    public final ffrf a;
    private final ffsk b;

    public sip(ffsk ffskVar, ffrf ffrfVar) {
        this.b = ffskVar;
        this.a = ffrfVar;
    }

    public static final Map a(Bundle bundle, String str, int i) {
        try {
            byte[] byteArray = bundle.getByteArray(str);
            if (byteArray == null) {
                ((ensz) siz.a.j()).t("Null language pack data from %s", str);
                return ffem.a;
            }
            eygr<faqr> eygrVar = ((faqt) eyfy.parseFrom(faqt.a, byteArray, eyfc.a())).b;
            eygrVar.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap(ffmk.f(ffew.a(ffdx.n(eygrVar, 10)), 16));
            for (faqr faqrVar : eygrVar) {
                Locale forLanguageTag = Locale.forLanguageTag(faqrVar.b);
                forLanguageTag.getClass();
                ffcf ffcfVar = new ffcf(forLanguageTag, new ardv(forLanguageTag, faqrVar.c, i));
                linkedHashMap.put(ffcfVar.a, ffcfVar.b);
            }
            return linkedHashMap;
        } catch (eygu e) {
            ((ensz) ((ensz) siz.a.j()).g(e)).t("Invalid language pack data from %s", str);
            return ffem.a;
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        context.getClass();
        intent.getClass();
        axol.k(this.b, null, new sio(this, null), 3);
    }
}
