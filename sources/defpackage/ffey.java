package defpackage;

import androidx.car.app.model.Alert;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes6.dex */
public class ffey extends ffex {
    public static final int a(int i) {
        return i >= 0 ? i < 3 ? i + 1 : i >= 1073741824 ? Alert.DURATION_SHOW_INDEFINITELY : (int) ((i / 0.75f) + 1.0f) : i;
    }

    public static final Map b(Map map) {
        map.getClass();
        return ((ffga) map).e();
    }

    public static final Map c(ffcf ffcfVar) {
        Map singletonMap = Collections.singletonMap(ffcfVar.a, ffcfVar.b);
        singletonMap.getClass();
        return singletonMap;
    }

    public static final Map d(Map map) {
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map singletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        singletonMap.getClass();
        return singletonMap;
    }
}
