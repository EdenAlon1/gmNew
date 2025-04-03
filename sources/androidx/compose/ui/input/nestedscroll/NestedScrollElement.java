package androidx.compose.ui.input.nestedscroll;

import defpackage.ffkj;
import defpackage.hvh;
import defpackage.ijf;
import defpackage.ijj;
import defpackage.ijo;
import defpackage.ivp;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class NestedScrollElement extends ivp<ijo> {
    private final ijf a;
    private final ijj b;

    public NestedScrollElement(ijf ijfVar, ijj ijjVar) {
        this.a = ijfVar;
        this.b = ijjVar;
    }

    @Override // defpackage.ivp
    public final /* bridge */ /* synthetic */ hvh d() {
        return new ijo(this.a, this.b);
    }

    @Override // defpackage.ivp
    public final /* bridge */ /* synthetic */ void e(hvh hvhVar) {
        ijo ijoVar = (ijo) hvhVar;
        ijoVar.a = this.a;
        ijoVar.h();
        ijj ijjVar = this.b;
        if (ijjVar == null) {
            ijoVar.b = new ijj();
        } else if (!ffkj.e(ijjVar, ijoVar.b)) {
            ijoVar.b = ijjVar;
        }
        if (ijoVar.z) {
            ijoVar.i();
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof NestedScrollElement)) {
            return false;
        }
        NestedScrollElement nestedScrollElement = (NestedScrollElement) obj;
        return ffkj.e(nestedScrollElement.a, this.a) && ffkj.e(nestedScrollElement.b, this.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ijj ijjVar = this.b;
        return hashCode + (ijjVar != null ? ijjVar.hashCode() : 0);
    }
}
