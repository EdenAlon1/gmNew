package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fzi extends ffkk implements ffji {
    final /* synthetic */ haw a;
    final /* synthetic */ hho b;
    final /* synthetic */ ffji c;
    final /* synthetic */ ham d;
    final /* synthetic */ Locale e;
    final /* synthetic */ fzq f;
    final /* synthetic */ hho g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fzi(haw hawVar, hho hhoVar, ffji ffjiVar, ham hamVar, Locale locale, fzq fzqVar, hho hhoVar2) {
        super(1);
        this.a = hawVar;
        this.b = hhoVar;
        this.c = ffjiVar;
        this.d = hamVar;
        this.e = locale;
        this.f = fzqVar;
        this.g = hhoVar2;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        jvu jvuVar = (jvu) obj;
        if (jvuVar.a().length() <= this.a.c.length()) {
            String a = jvuVar.a();
            int i = 0;
            while (true) {
                if (i >= a.length()) {
                    hho hhoVar = this.g;
                    int i2 = fzp.a;
                    hhoVar.b(jvuVar);
                    String obj2 = ffpc.x(jvuVar.a()).toString();
                    Long l = null;
                    if (obj2.length() != 0) {
                        int length = obj2.length();
                        String str = this.a.c;
                        if (length >= str.length()) {
                            hal d = this.d.d(obj2, str, this.e);
                            this.b.b(this.f.a(d, this.e));
                            ffji ffjiVar = this.c;
                            if (((CharSequence) this.b.a()).length() == 0 && d != null) {
                                l = Long.valueOf(d.c);
                            }
                            ffjiVar.invoke(l);
                        }
                    }
                    this.b.b("");
                    this.c.invoke(null);
                } else {
                    if (!Character.isDigit(a.charAt(i))) {
                        break;
                    }
                    i++;
                }
            }
        }
        return ffcu.a;
    }
}
