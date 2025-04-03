package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class ilu implements PointerInputEventHandler, ffke {
    private final /* synthetic */ ffjm a;

    public ilu(ffjm ffjmVar) {
        this.a = ffjmVar;
    }

    @Override // defpackage.ffke
    public final ffbv b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof PointerInputEventHandler) && (obj instanceof ffke)) {
            return ffkj.e(this.a, ((ffke) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final /* synthetic */ Object invoke(ild ildVar, ffgu ffguVar) {
        return this.a.a(ildVar, ffguVar);
    }
}
