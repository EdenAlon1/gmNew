package defpackage;

import java.util.Set;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class envb implements enus {
    public final String a;
    public final Level b;
    public final boolean c;
    public final Set d;
    public final entz e;
    public final int f;
    private volatile envc g;

    public envb(int i, Level level, boolean z, Set set, entz entzVar) {
        this.a = "";
        this.f = 2;
        this.b = level;
        this.c = z;
        this.d = set;
        this.e = entzVar;
    }

    @Override // defpackage.enus
    public final ento a(String str) {
        envc envcVar;
        if (!this.c || !str.contains(".")) {
            return new envd(str, 2, this.b, this.d, this.e);
        }
        envc envcVar2 = this.g;
        if (envcVar2 != null) {
            return envcVar2;
        }
        synchronized (this) {
            envcVar = this.g;
            if (envcVar == null) {
                envc envcVar3 = new envc(null, 2, this.b, false, this.d, this.e);
                this.g = envcVar3;
                envcVar = envcVar3;
            }
        }
        return envcVar;
    }

    private envb() {
        this(2, Level.ALL, false, envd.a, envd.b);
    }
}
