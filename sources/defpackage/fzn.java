package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fzn extends ffkk implements ffix {
    final /* synthetic */ fzq a;
    final /* synthetic */ ham b;
    final /* synthetic */ haw c;
    final /* synthetic */ Locale d;
    final /* synthetic */ hho e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fzn(fzq fzqVar, ham hamVar, haw hawVar, Locale locale, hho hhoVar) {
        super(0);
        this.a = fzqVar;
        this.b = hamVar;
        this.c = hawVar;
        this.d = locale;
        this.e = hhoVar;
    }

    @Override // defpackage.ffix
    public final /* synthetic */ Object invoke() {
        String str;
        if (fzp.a(this.e).a().length() > 0) {
            fzq fzqVar = this.a;
            ham hamVar = this.b;
            String a = fzp.a(this.e).a();
            haw hawVar = this.c;
            str = fzqVar.a(hamVar.d(a, hawVar.c, this.d), this.d);
        } else {
            str = "";
        }
        return new hic(str, hla.a);
    }
}
