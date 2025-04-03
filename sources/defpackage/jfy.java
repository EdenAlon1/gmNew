package defpackage;

import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jfy implements Comparator {
    public static final jfy a = new jfy();

    private jfy() {
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        ffcf ffcfVar = (ffcf) obj;
        ffcf ffcfVar2 = (ffcf) obj2;
        int compare = Float.compare(((iam) ffcfVar.a).c, ((iam) ffcfVar2.a).c);
        return compare != 0 ? compare : Float.compare(((iam) ffcfVar.a).e, ((iam) ffcfVar2.a).e);
    }
}
