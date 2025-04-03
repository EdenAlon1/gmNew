package defpackage;

import com.google.android.apps.messaging.R;
import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class exay implements Comparator {
    private static final int a(exby exbyVar, exby exbyVar2) {
        return exbyVar.c() - exbyVar2.c();
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        exby exbyVar = (exby) obj;
        exby exbyVar2 = (exby) obj2;
        if (exbyVar.b() == R.id.smartAction) {
            return exbyVar2.b() != R.id.smartAction ? -1 : 0;
        }
        if (exbyVar2.b() == R.id.smartAction) {
            return 1;
        }
        if (exbyVar.k()) {
            if (exbyVar2.k()) {
                return a(exbyVar, exbyVar2);
            }
            return -1;
        }
        if (exbyVar2.k()) {
            return 1;
        }
        if (exbyVar.l()) {
            if (exbyVar2.l()) {
                return a(exbyVar, exbyVar2);
            }
            return 1;
        }
        if (exbyVar2.l()) {
            return -1;
        }
        return a(exbyVar, exbyVar2);
    }
}
