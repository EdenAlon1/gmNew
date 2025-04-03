package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbwa implements ajhy {
    private final Optional a;
    private final ffbr b;
    private ajid c;
    private boolean d;

    public dbwa(Optional optional, ffbr ffbrVar) {
        this.a = optional;
        this.b = ffbrVar;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [bzme, java.lang.Object] */
    @Override // defpackage.ajhy
    public final elfl b() {
        this.a.isPresent();
        return this.a.get().e();
    }

    @Override // defpackage.ajhy
    public final void c(ajid ajidVar, ViewGroup viewGroup) {
        viewGroup.getClass();
        this.c = ajidVar;
    }

    @Override // defpackage.ajhy
    public final void d() {
        if (this.d) {
            this.d = false;
            ajid ajidVar = this.c;
            if (ajidVar != null) {
                ajidVar.b();
            }
        }
    }

    @Override // defpackage.ajhy
    public final boolean e(Context context, ViewGroup viewGroup, boolean z) {
        ((dbvq) this.b.b()).a(context, 3);
        this.d = true;
        return true;
    }

    @Override // defpackage.ajhy
    public final int f() {
        return 16;
    }

    @Override // defpackage.ajhy
    public final /* synthetic */ int n() {
        return ajhx.a();
    }

    @Override // defpackage.ajhy
    public final /* synthetic */ void g() {
    }
}
