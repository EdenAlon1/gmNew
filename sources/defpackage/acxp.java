package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acxp implements ajhy {
    private final ffbr a;
    private ajid b;

    public acxp(ffbr ffbrVar) {
        this.a = ffbrVar;
    }

    @Override // defpackage.ajhy
    public final elfl b() {
        if (((Optional) this.a.b()).isPresent()) {
            elfl a = ((acio) ((Optional) this.a.b()).get()).a();
            a.getClass();
            return a;
        }
        elfl e = elfo.e(false);
        e.getClass();
        return e;
    }

    @Override // defpackage.ajhy
    public final void c(ajid ajidVar, ViewGroup viewGroup) {
        viewGroup.getClass();
        this.b = ajidVar;
    }

    @Override // defpackage.ajhy
    public final void d() {
        ajid ajidVar = this.b;
        if (ajidVar != null) {
            ajidVar.b();
        }
    }

    @Override // defpackage.ajhy
    public final boolean e(Context context, ViewGroup viewGroup, boolean z) {
        ((acio) ((Optional) this.a.b()).get()).i();
        return true;
    }

    @Override // defpackage.ajhy
    public final int f() {
        return 17;
    }

    @Override // defpackage.ajhy
    public final /* synthetic */ int n() {
        return ajhx.a();
    }

    @Override // defpackage.ajhy
    public final /* synthetic */ void g() {
    }
}
