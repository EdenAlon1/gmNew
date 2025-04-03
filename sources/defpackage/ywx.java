package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final /* synthetic */ class ywx extends ffkh implements ffji {
    public ywx(Object obj) {
        super(1, obj, ywz.class, "savePhoneNumber", "savePhoneNumber(Ljava/lang/String;)V", 0);
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str = (String) obj;
        str.getClass();
        ywz ywzVar = (ywz) this.g;
        if (str.length() != 0) {
            axol.k(ywzVar.b, null, new ywv(ywzVar, str, null), 3);
        }
        return ffcu.a;
    }
}
