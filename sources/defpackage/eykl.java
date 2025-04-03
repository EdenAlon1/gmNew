package defpackage;

import java.io.Serializable;
import java.util.Comparator;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eykl implements Comparator, Serializable {
    public static final eykl a;
    private static final /* synthetic */ eykl[] b;

    static {
        eykl eyklVar = new eykl();
        a = eyklVar;
        b = new eykl[]{eyklVar};
    }

    private eykl() {
    }

    public static final int a(eyja eyjaVar, eyja eyjaVar2) {
        eykm.j(eyjaVar);
        eykm.j(eyjaVar2);
        int compare = Long.compare(eyjaVar.b, eyjaVar2.b);
        return compare != 0 ? compare : Integer.compare(eyjaVar.c, eyjaVar2.c);
    }

    public static eykl[] values() {
        return (eykl[]) b.clone();
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        return a((eyja) obj, (eyja) obj2);
    }
}
