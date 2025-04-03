package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fjda extends fjdm {
    private final String a;

    public fjda(String str) {
        str.getClass();
        this.a = str;
    }

    @Override // defpackage.fjdm
    public final void a(fjdr fjdrVar, Object obj) {
        String obj2;
        if (obj == null || (obj2 = obj.toString()) == null) {
            return;
        }
        fjdrVar.b(this.a, obj2);
    }
}
