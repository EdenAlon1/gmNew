package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ffqs extends ffuj {
    public ffte a;
    public final ffqn b = new ffqn(null, ffqo.a);
    final /* synthetic */ ffqu c;
    private final ffrf h;

    public ffqs(ffqu ffquVar, ffrf ffrfVar) {
        this.c = ffquVar;
        this.h = ffrfVar;
    }

    @Override // defpackage.ffuj
    public final void a(Throwable th) {
        if (th != null) {
            fgho J = ((ffrh) this.h).J(new ffrt(th), null);
            if (J != null) {
                this.h.a(J);
                ffqt ffqtVar = (ffqt) this.b.a;
                if (ffqtVar != null) {
                    ffqtVar.a();
                    return;
                }
                return;
            }
            return;
        }
        if (this.c.b.a() == 0) {
            ffrf ffrfVar = this.h;
            ffss[] ffssVarArr = this.c.a;
            ArrayList arrayList = new ArrayList(ffssVarArr.length);
            for (ffss ffssVar : ffssVarArr) {
                arrayList.add(ffssVar.d());
            }
            ffrfVar.w(arrayList);
        }
    }

    @Override // defpackage.ffuj
    public final boolean b() {
        return false;
    }
}
