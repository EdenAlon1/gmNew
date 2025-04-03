package defpackage;

import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eiuj implements eiuk {
    private final eg a;
    private adg b;
    private adg c;
    private final ekki d;

    public eiuj(eg egVar, ekki ekkiVar) {
        this.a = egVar;
        this.d = ekkiVar;
    }

    @Override // defpackage.eiuk
    public final Intent a() {
        return this.a.getIntent();
    }

    @Override // defpackage.eiuk
    public final adg b() {
        return this.c;
    }

    @Override // defpackage.eiuk
    public final adg c() {
        return this.b;
    }

    @Override // defpackage.eiuk
    public final void d(adf adfVar, adf adfVar2) {
        this.b = this.a.v(new ael(), adfVar);
        this.c = this.a.v(new ael(), adfVar2);
    }

    @Override // defpackage.eiuk
    public final boolean e() {
        return true;
    }

    @Override // defpackage.eiuk
    public final boolean f() {
        return this.a.isFinishing();
    }

    @Override // defpackage.eiuk
    public final boolean g() {
        return this.d.a().ai();
    }
}
