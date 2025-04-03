package defpackage;

import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes5.dex */
final class erqx {
    public static final erqx a;
    public static final Set b;
    private static final /* synthetic */ erqx[] c;

    static {
        erqx erqxVar = new erqx();
        a = erqxVar;
        c = new erqx[]{erqxVar};
        b = new CopyOnWriteArraySet();
    }

    private erqx() {
    }

    public static erqx[] values() {
        return (erqx[]) c.clone();
    }
}
