package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ffpg extends ffkk implements ffji {
    final /* synthetic */ String a = "    ";

    public ffpg() {
        super(1);
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str = (String) obj;
        str.getClass();
        if (!ffpc.J(str)) {
            return this.a.concat(str);
        }
        int length = str.length();
        String str2 = this.a;
        return length >= str2.length() ? str : str2;
    }
}
