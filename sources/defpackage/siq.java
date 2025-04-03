package defpackage;

import android.speech.RecognitionSupport;
import android.speech.RecognitionSupportCallback;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class siq implements RecognitionSupportCallback {
    private final ffrf a;

    public siq(ffrf ffrfVar) {
        this.a = ffrfVar;
    }

    private static final Map a(List list, int i) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(ffmk.f(ffew.a(ffdx.n(list, 10)), 16));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Locale forLanguageTag = Locale.forLanguageTag((String) it.next());
            forLanguageTag.getClass();
            ffcf ffcfVar = new ffcf(forLanguageTag, new ardv(forLanguageTag, -1, i));
            linkedHashMap.put(ffcfVar.a, ffcfVar.b);
        }
        return linkedHashMap;
    }

    public final void onError(int i) {
        ((ensz) siz.a.j()).r("checkRecognitionSupport returned error %d, returning empty language pack details.", i);
        this.a.w(ffem.a);
    }

    public final void onSupportResult(RecognitionSupport recognitionSupport) {
        List supportedOnDeviceLanguages;
        List pendingOnDeviceLanguages;
        List installedOnDeviceLanguages;
        recognitionSupport.getClass();
        supportedOnDeviceLanguages = recognitionSupport.getSupportedOnDeviceLanguages();
        supportedOnDeviceLanguages.getClass();
        Map a = a(supportedOnDeviceLanguages, 4);
        pendingOnDeviceLanguages = recognitionSupport.getPendingOnDeviceLanguages();
        pendingOnDeviceLanguages.getClass();
        Map j = ffew.j(a, a(pendingOnDeviceLanguages, 3));
        installedOnDeviceLanguages = recognitionSupport.getInstalledOnDeviceLanguages();
        installedOnDeviceLanguages.getClass();
        this.a.w(ffew.j(j, a(installedOnDeviceLanguages, 2)));
    }
}
