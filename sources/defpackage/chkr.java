package defpackage;

import androidx.car.app.model.Alert;
import j$.util.Map;
import java.util.Comparator;
import java.util.Map;
import org.chromium.net.CronetProvider;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class chkr implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Map map = chks.a;
        String name = ((CronetProvider) obj).getName();
        name.getClass();
        Integer valueOf = Integer.valueOf(Alert.DURATION_SHOW_INDEFINITELY);
        Integer num = (Integer) Map.EL.getOrDefault(map, name, valueOf);
        java.util.Map map2 = chks.a;
        String name2 = ((CronetProvider) obj2).getName();
        name2.getClass();
        return ffgh.a(num, (Integer) Map.EL.getOrDefault(map2, name2, valueOf));
    }
}
