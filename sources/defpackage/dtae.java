package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dtae extends dtaa {
    public dtad aX;

    public dtae(int i, dtab dtabVar) {
        super(Integer.valueOf(i), dtabVar);
    }

    public abstract dtan aT();

    public final dtad bR() {
        dtad dtadVar = this.aX;
        if (dtadVar != null) {
            return dtadVar;
        }
        toString();
        throw new IllegalStateException(toString().concat(" hasn't been bound to a search handler"));
    }

    protected final String bS() {
        Bundle bundle = this.m;
        if (bundle != null) {
            return bundle.getString("search");
        }
        return null;
    }

    @Override // defpackage.dtaa
    public final void gT() {
        dtan aT;
        dtal d;
        dtaa.bP(this);
        if (this.Q == null || (aT = aT()) == null || (d = aT.d()) == null) {
            return;
        }
        d.a();
    }
}
