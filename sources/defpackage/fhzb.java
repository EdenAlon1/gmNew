package defpackage;

import androidx.car.app.model.Alert;
import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fhzb implements Serializable, Cloneable {
    private static final long serialVersionUID = 1;
    public fhzz a;
    public final int b;
    public int c;
    public int d;
    public boolean e = false;
    public boolean f = false;

    public fhzb(int i) {
        this.b = i;
    }

    final int a() {
        return (!this.e || this.f) ? Alert.DURATION_SHOW_INDEFINITELY : this.c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final fhzb clone() {
        fhzb fhzbVar = new fhzb(this.b);
        fhzbVar.a = this.a;
        fhzbVar.c = this.c;
        fhzbVar.d = this.d;
        fhzbVar.e = this.e;
        fhzbVar.f = this.f;
        return fhzbVar;
    }
}
