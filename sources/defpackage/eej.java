package defpackage;

import androidx.car.app.model.Alert;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class eej implements ejv {
    private final ejq a;
    public final long l;
    public final edr m;

    public eej(long j, boolean z, edr edrVar, ejq ejqVar) {
        this.m = edrVar;
        this.a = ejqVar;
        this.l = jzl.k(0, z ? jzk.b(j) : Integer.MAX_VALUE, z ? Alert.DURATION_SHOW_INDEFINITELY : jzk.a(j), 5);
    }

    public abstract eei a(int i, Object obj, Object obj2, List list, long j);

    public final eei b(int i, long j) {
        ejq ejqVar = this.a;
        edr edrVar = this.m;
        return a(i, edrVar.d(i), edrVar.c(i), ejqVar.a(i, j), j);
    }

    @Override // defpackage.ejv
    public final /* synthetic */ ejs c(int i, int i2, int i3, long j) {
        return b(i, j);
    }

    public final elp e() {
        return this.m.c;
    }
}
