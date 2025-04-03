package defpackage;

import java.util.ArrayList;
import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes.dex */
public class kia extends khs implements kii {
    protected final kie al;
    public final ArrayList am;
    public final int an;

    public kia(kie kieVar, int i) {
        super(kieVar);
        this.am = new ArrayList();
        this.al = kieVar;
        this.an = i;
    }

    @Override // defpackage.khs, defpackage.kib
    public final kiu b() {
        return x();
    }

    public kiz x() {
        return null;
    }

    public final void y() {
        super.e();
    }

    public final void z(Object... objArr) {
        Collections.addAll(this.am, objArr);
    }

    @Override // defpackage.khs, defpackage.kib
    public void e() {
    }
}
