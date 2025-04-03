package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aosc {
    final /* synthetic */ aosg a;
    private final engw b;
    private final engw c;

    public aosc(aosg aosgVar, engw engwVar, engw engwVar2) {
        this.a = aosgVar;
        this.b = engwVar;
        this.c = engwVar2;
    }

    private final void a(StringBuilder sb, engw engwVar, int i) {
        sb.append('\n');
        sb.append(this.a.a.getString(i));
        int size = engwVar.size();
        if (size != 0) {
            if (size != 1) {
                sb.append(ffdx.aA(engwVar, "\n  ", "\n  ", null, null, 60));
            } else {
                sb.append(ffdx.T(engwVar));
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        a(sb, this.b, R.string.received_label);
        a(sb, this.c, R.string.read_by_label);
        return sb.toString();
    }
}
