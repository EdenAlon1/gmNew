package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gta extends ffkk implements ffji {
    final /* synthetic */ gul a;
    final /* synthetic */ hho b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gta(gul gulVar, hho hhoVar) {
        super(1);
        this.a = gulVar;
        this.b = hhoVar;
    }

    @Override // defpackage.ffji
    public final /* synthetic */ Object invoke(Object obj) {
        int unicodeChar = ((iix) obj).a.getUnicodeChar();
        if (unicodeChar >= 48 && unicodeChar < 58 && jpm.e(guj.f(this.b).c) == 2 && guj.f(this.b).a().length() == 2) {
            this.a.j(1);
        }
        return false;
    }
}
