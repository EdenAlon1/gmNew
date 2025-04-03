package defpackage;

import androidx.car.app.model.Alert;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fgfo extends fgct implements fgdj {
    public fgfo(int i) {
        super(1, Alert.DURATION_SHOW_INDEFINITELY, 2);
        h(Integer.valueOf(i));
    }

    @Override // defpackage.fgdj
    public final /* bridge */ /* synthetic */ Object c() {
        Integer valueOf;
        synchronized (this) {
            valueOf = Integer.valueOf(((Number) i()).intValue());
        }
        return valueOf;
    }

    public final void p(int i) {
        synchronized (this) {
            h(Integer.valueOf(((Number) i()).intValue() + i));
        }
    }
}
