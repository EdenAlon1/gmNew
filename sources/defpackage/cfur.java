package defpackage;

import java.util.Comparator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cfur implements Comparator {
    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        return ((String) ((Map.Entry) obj).getKey()).compareToIgnoreCase((String) ((Map.Entry) obj2).getKey());
    }
}
