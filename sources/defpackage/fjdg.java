package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fjdg extends fjdm {
    private final String a;
    private final boolean b;

    public fjdg(String str, boolean z) {
        str.getClass();
        this.a = str;
        this.b = z;
    }

    @Override // defpackage.fjdm
    public final void a(fjdr fjdrVar, Object obj) {
        String obj2;
        if (obj == null || (obj2 = obj.toString()) == null) {
            return;
        }
        fjdrVar.d(this.a, obj2, this.b);
    }
}
