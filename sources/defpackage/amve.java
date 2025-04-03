package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amve implements Comparator {
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Comparable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Comparable, java.lang.Object] */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        ffji ffjiVar = amvj.a;
        aoku g = ((ResolvedRecipient) obj).g();
        g.getClass();
        ?? invoke = ffjiVar.invoke(g);
        ffji ffjiVar2 = amvj.a;
        aoku g2 = ((ResolvedRecipient) obj2).g();
        g2.getClass();
        return ffgh.a(invoke, ffjiVar2.invoke(g2));
    }
}
