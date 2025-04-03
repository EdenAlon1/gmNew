package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fjdi extends fjdm {
    private final boolean a;

    public fjdi(boolean z) {
        this.a = z;
    }

    @Override // defpackage.fjdm
    public final void a(fjdr fjdrVar, Object obj) {
        if (obj == null) {
            return;
        }
        fjdrVar.d(obj.toString(), null, this.a);
    }
}
